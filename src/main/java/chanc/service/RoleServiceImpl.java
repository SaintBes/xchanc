package chanc.service;

import chanc.dao.RoleDAO;
import chanc.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDAO roleDAO;

    @Override
    public Role createRole(Role role) {
        return roleDAO.createRole(role);
    }

    @Override
    @Transactional(readOnly = true)
    public Role readRole(int roleId) {
        return roleDAO.readRole(roleId);
    }

    @Override
    public void uppdateRole(Role role) {
        roleDAO.uppdateRole(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleDAO.deleteRole(role);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> findAllRoles() {
        return roleDAO.findAllRoles();
    }
}
