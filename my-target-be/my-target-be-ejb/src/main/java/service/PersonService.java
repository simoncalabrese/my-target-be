package service;

import annotation.DefaultInterceptor;
import converter.PersonConverter;
import dao.PersonDao;
import dto.PersonDto;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@EJB(beanInterface = PersonServiceLocal.class, name = "PersonService")
@LocalBean
@DefaultInterceptor
public class PersonService extends BaseService<PersonDao> implements PersonServiceLocal {

    @Inject
    private PersonDao personDao;

    @Override
    public PersonDto getPersonByCod(final Optional<String> cod) {
        return converter(personDao.getPersonByCForPi((cod.orElse("")).toUpperCase()), PersonConverter.toPersonDto);
    }

    public static void main(String[] rgs) {
        PersonService p = new PersonService();
        p.getPersonByCod(Optional.ofNullable("CLBSMN94L05H793R"));
    }
}
