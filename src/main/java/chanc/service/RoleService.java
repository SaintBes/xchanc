package chanc.service;

import chanc.domain.Role;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface RoleService {

    Role createRole(Role role);
    Role readRole(int roleId);
    void uppdateRole(Role role);
    void deleteRole(Role role);
    List<Role> findAllRoles();
}
