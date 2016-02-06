package chanc.service;

import chanc.dao.CompanyDAO;
import chanc.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyDAO companyDAO;

    @Override
    public Company createCompany(Company company) {
        return companyDAO.createCompany(company);
    }

    @Override
    @Transactional(readOnly = true)
    public Company readCompany(int companyId) {
        return companyDAO.readCompany(companyId);
    }

    @Override
    public void uppdateCompany(Company company) {
        companyDAO.uppdateCompany(company);
    }

    @Override
    public void deleteCompany(Company company) {
        companyDAO.deleteCompany(company);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Company> findAllCompanys() {
        return companyDAO.findAllCompanys();
    }
}
