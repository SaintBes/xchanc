package chanc.service;

import chanc.dao.DepartmentDAO;
import chanc.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDAO departmentDAO;

    @Override
    public Department createDepartment(Department department) {
        return departmentDAO.createDepartment(department);
    }

    @Override
    @Transactional(readOnly = true)
    public Department readDepartment(int departmentId) {
        return departmentDAO.readDepartment(departmentId);
    }

    @Override
    public void uppdateDepartment(Department department) {
        departmentDAO.uppdateDepartment(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentDAO.deleteDepartment(department);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Department> findAllDepartments() {
        return departmentDAO.findAllDepartments();
    }
}
