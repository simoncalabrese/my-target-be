package converter;

import dto.RoleDto;
import entity.Role;

/**
 * Created by simon on 18/12/16.
 */
public class RoleConverter {

    public static SuperConverter<Role, RoleDto> toRoleDto =
            e -> {
                RoleDto dto = new RoleDto();
                dto.setRoleK(e.getRoleK());
                dto.setCodRole(e.getCodRole());
                dto.setDesRole(e.getDesRole());
                return dto;
            };
}
