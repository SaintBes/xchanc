package chanc.service;

import chanc.dao.EmployeeDAO;
import chanc.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDAO.createEmployee(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public Employee readEmployee(int employeeId) {
        return employeeDAO.readEmployee(employeeId);
    }

    @Override
    public void uppdateEmployee(Employee employee) {
        employeeDAO.uppdateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }
}
