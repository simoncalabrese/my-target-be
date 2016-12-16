package entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PersonPostation.class)
public abstract class PersonPostation_ {

	public static volatile SingularAttribute<PersonPostation, LocalDate> dtAssign;
	public static volatile SingularAttribute<PersonPostation, Person> person;
	public static volatile SingularAttribute<PersonPostation, Postation> postation;
	public static volatile SingularAttribute<PersonPostation, Integer> personPostationK;

}

