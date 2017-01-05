package dao;

import entity.Person;
import entity.Person_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PersonDao extends BaseDaoImp<Person> {

    public Person getPersonByCForPi(final String codForSearch){
        CriteriaBuilder cb = getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(getEntityType());
        Root<Person> root = query.from(getEntityType());
        query.select(root);
        query.where(
                cb.or(
                        cb.equal(root.get(Person_.fiscalCode), codForSearch),
                        cb.equal(root.get(Person_.pIva), codForSearch)
                ));
        return getSingleResult(query);
    }

    public List<Person> getPersons(){
        CriteriaBuilder cb = getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.select(root);
        return getResultList(query);
    }

}
