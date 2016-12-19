package service;

import dto.PersonDto;

import javax.ejb.Local;
import java.util.Optional;

/**
 * Created by simon on 18/12/16.
 */
@Local
public interface PersonServiceLocal {
    PersonDto getPersonByCod(final Optional<String> cod);
}
