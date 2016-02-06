package chanc.service;

import chanc.domain.Department;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface DepartmentService {

    Department createDepartment(Department department);
    Department readDepartment(int departmentId);
    void uppdateDepartment(Department department);
    void deleteDepartment(Department department);
    List<Department> findAllDepartments();
}
