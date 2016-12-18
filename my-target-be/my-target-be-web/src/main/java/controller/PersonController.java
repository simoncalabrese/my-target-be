package controller;

import dto.PersonDto;
import exceptions.BeException;
import service.PersonServiceLocal;

import javax.ejb.EJB;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
public class PersonController {

    @Inject
    private PersonServiceLocal personService;

    public PersonDto getPersonByCod(final String string) throws BeException {
        return personService.getPersonByCod(Optional.ofNullable(string));
    }

    public static void main(String[] rgs) throws BeException {
        PersonController p = new PersonController();
        p.getPersonByCod("CLB");
    }
}
