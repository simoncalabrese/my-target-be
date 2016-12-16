package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> desPerson;
	public static volatile SingularAttribute<Person, String> pIva;
	public static volatile SingularAttribute<Person, String> password;
	public static volatile SingularAttribute<Person, Role> role;
	public static volatile SingularAttribute<Person, Boolean> flgAgent;
	public static volatile SingularAttribute<Person, String> fiscalCode;
	public static volatile SingularAttribute<Person, Integer> personK;
	public static volatile SingularAttribute<Person, Person> personParent;
	public static volatile SingularAttribute<Person, String> userName;

}

