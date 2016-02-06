package chanc.dao;

import chanc.domain.Department;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Department createDepartment(Department department) {
        sessionFactory.getCurrentSession().save(department);
        return (Department) sessionFactory.getCurrentSession().get(Department.class, department.getDepId());
    }

    @Override
    public Department readDepartment(int departmentId) {
        return (Department) sessionFactory.getCurrentSession().get(Department.class, departmentId);
    }

    @Override
    public void uppdateDepartment(Department department) {
        sessionFactory.getCurrentSession().update(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        sessionFactory.getCurrentSession().delete(department);
    }

    @Override
    public List<Department> findAllDepartments() {
        return sessionFactory.getCurrentSession().createCriteria(Department.class).list();
    }
}