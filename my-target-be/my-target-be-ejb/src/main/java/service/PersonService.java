package service;

import annotation.DefaultInterceptor;
import converter.PersonConverter;
import dao.PersonDao;
import dto.PersonDto;
import exceptions.BeException;


import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@DefaultInterceptor
public class PersonService extends BaseService<PersonDao> implements PersonServiceLocal {

    @Inject
    private PersonDao personDao;

    @Override
    public PersonDto getPersonByCod(final Optional<String> cod) throws BeException {
        return converter(personDao.getPersonByCForPi((cod.orElse("")).toUpperCase()), PersonConverter.toPersonDto);
    }
}
