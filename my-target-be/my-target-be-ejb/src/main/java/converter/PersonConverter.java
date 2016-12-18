package converter;

import dto.PersonDto;
import entity.Person;

/**
 * Created by simon on 18/12/16.
 */
public class PersonConverter {
    public static SuperConverter<Person, PersonDto> toPersonDto =
            e -> {
                PersonDto dto = new PersonDto();
                dto.setPersonK(e.getPersonK());
                dto.setDesPerson(e.getDesPerson());
                dto.setFiscalCode(e.getFiscalCode());
                dto.setpIva(e.getpIva());
                dto.setFlgAgent(e.getFlgAgent());
                dto.setRole(RoleConverter.toRoleDto.apply(e.getRole()));
                dto.setPersonParent(e.getPersonParent().isPresent()
                        ? personParent(e.getPersonParent().get())
                        : null);
                return dto;
            };

            private static PersonDto personParent(Person person){
                return toPersonDto.apply(person);
            }
}
