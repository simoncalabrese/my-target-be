package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile ListAttribute<Role, Person> persons;
	public static volatile SingularAttribute<Role, String> codRole;
	public static volatile SingularAttribute<Role, String> desRole;
	public static volatile SingularAttribute<Role, Integer> roleK;

}

