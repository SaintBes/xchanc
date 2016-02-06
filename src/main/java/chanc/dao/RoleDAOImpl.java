package chanc.dao;

import chanc.domain.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Role createRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
        return (Role) sessionFactory.getCurrentSession().get(Role.class, role.getId());
    }

    @Override
    public Role readDociument(int roleId) {
        return (Role) sessionFactory.getCurrentSession().get(Role.class, roleId);
    }

    @Override
    public void uppdateRole(Role role) {
        sessionFactory.getCurrentSession().update(role);
    }

    @Override
    public void deleteRole(Role role) {
        sessionFactory.getCurrentSession().delete(role);
    }

    @Override
    public List<Role> findAllRoles() {
        return sessionFactory.getCurrentSession().createCriteria(Role.class).list();
    }
}