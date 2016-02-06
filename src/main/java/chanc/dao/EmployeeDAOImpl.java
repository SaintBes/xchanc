package chanc.dao;

import chanc.domain.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Employee createEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employee.getEmployeeId());
    }

    @Override
    public Employee readEmployee(int employeeId) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
    }

    @Override
    public void uppdateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }
}
