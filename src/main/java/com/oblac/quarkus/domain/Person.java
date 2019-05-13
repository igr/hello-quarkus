package com.oblac.quarkus.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Person {

	@Getter @Setter
	private String name;
	@Getter @Setter
	private String surname;
	@Getter @Setter
	private String nick;

}
