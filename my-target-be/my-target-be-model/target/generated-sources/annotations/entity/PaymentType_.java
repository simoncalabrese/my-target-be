package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentType.class)
public abstract class PaymentType_ {

	public static volatile ListAttribute<PaymentType, Promotion> promotions;
	public static volatile SingularAttribute<PaymentType, Integer> paymentTypeK;
	public static volatile SingularAttribute<PaymentType, String> desPaymentType;
	public static volatile SingularAttribute<PaymentType, String> codPaymentType;

}

