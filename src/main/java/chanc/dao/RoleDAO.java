package chanc.dao;

import chanc.domain.Role;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface RoleDAO {

    Role createRole(Role role);
    Role readDociument(int roleId);
    void uppdateRole(Role role);
    void deleteRole(Role role);
    List<Role> findAllRoles();
}
