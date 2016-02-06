package chanc.service;

import chanc.domain.Company;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
public interface CompanyService {

    Company createCompany(Company company);
    Company readCompany(int companyId);
    void uppdateCompany(Company company);
    void deleteCompany(Company company);
    List<Company> findAllCompanys();
}
