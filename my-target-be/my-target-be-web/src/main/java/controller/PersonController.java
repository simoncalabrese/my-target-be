package controller;

import annotation.DefaultInterceptor;
import dto.PersonDto;
import service.PersonServiceLocal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@DefaultInterceptor
public class PersonController {

    @EJB
    private PersonServiceLocal personService;

    public PersonDto getPersonByCod(final String string){
        return personService.getPersonByCod(Optional.ofNullable(string));
    }


}
