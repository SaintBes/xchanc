package chanc.dao;

import chanc.domain.Employee;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface EmployeeDAO {
    
    Employee createEmployee(Employee employee);
    Employee readEmployee(int employeeId);
    void uppdateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    List<Employee> findAllEmployees();
}
