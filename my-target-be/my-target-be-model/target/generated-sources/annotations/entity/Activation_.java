package entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Activation.class)
public abstract class Activation_ {

	public static volatile SingularAttribute<Activation, Integer> activationK;
	public static volatile SingularAttribute<Activation, String> codCompass;
	public static volatile SingularAttribute<Activation, Person> person;
	public static volatile SingularAttribute<Activation, LocalDate> dtRif;
	public static volatile SingularAttribute<Activation, Postation> postation;
	public static volatile SingularAttribute<Activation, Boolean> flgCompass;
	public static volatile SingularAttribute<Activation, PaymentType> paymentType;

}

