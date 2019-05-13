package com.oblac.quarkus.service;

import com.oblac.quarkus.domain.Person;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Simple application scoped bean.
 */
@Traced
@ApplicationScoped
public class PersonService {
	private Set<Person> persons = Collections.synchronizedSet(new LinkedHashSet<>());

	public Set<Person> get() {
		return persons;
	}

	public void add(Person person) {
		persons.add(person);
	}
}
