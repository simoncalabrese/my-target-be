package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Structure.class)
public abstract class Structure_ {

	public static volatile SingularAttribute<Structure, Integer> structureK;
	public static volatile SingularAttribute<Structure, String> codStructure;
	public static volatile SingularAttribute<Structure, String> desStructure;
	public static volatile SingularAttribute<Structure, Structure> structureParent;
	public static volatile ListAttribute<Structure, Postation> postations;

}

