package service;

import annotation.DefaultInterceptor;
import converter.PersonConverter;
import dao.PersonDao;
import dto.PersonDto;

import javax.ejb.*;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@Stateless(name = "PersonService", mappedName = "PersonService")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PersonService extends BaseService<PersonDao> implements PersonServiceLocal {

    @Inject
    private PersonDao personDao;


    @Override
    protected PersonDao getDao() {
        return personDao;
    }

    @Override
    public PersonDto getPersonByCod(final Optional<String> cod) {
        return converter(getDao().getPersonByCForPi((cod.orElse("")).toUpperCase()), PersonConverter.toPersonDto);
    }
}
