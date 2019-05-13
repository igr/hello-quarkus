package com.oblac.quarkus.rest;

import com.oblac.quarkus.domain.Person;
import com.oblac.quarkus.service.PersonService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.Set;

/**
 * Collection of persons, stored in memory.
 */
@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonsCollection {

	private static Logger log = Logger.getLogger(PersonsCollection.class);

	@Inject
	private PersonService personService;

	@GET
	public Set<Person> list() {
		return new HashSet<>(personService.get());
	}

	@POST
	public Person add(Person person) {
		log.info("Saving person: " + person);
		personService.add(person);
		return person;
	}

}
