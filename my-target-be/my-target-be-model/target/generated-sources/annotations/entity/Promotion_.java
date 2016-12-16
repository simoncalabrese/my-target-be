package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Promotion.class)
public abstract class Promotion_ {

	public static volatile SingularAttribute<Promotion, String> codPromotion;
	public static volatile SingularAttribute<Promotion, Boolean> flgGold;
	public static volatile SingularAttribute<Promotion, Integer> promotionK;
	public static volatile SingularAttribute<Promotion, String> desPromotion;
	public static volatile SingularAttribute<Promotion, PaymentType> paymentType;

}

