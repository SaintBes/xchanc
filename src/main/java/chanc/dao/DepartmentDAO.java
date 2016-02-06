package chanc.dao;

import chanc.domain.Department;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface DepartmentDAO {

    Department createDepartment(Department department);
    Department readDociument(int departmentId);
    void uppdateDepartment(Department department);
    void deleteDepartment(Department department);
    List<Department> findAllDepartments();
}
