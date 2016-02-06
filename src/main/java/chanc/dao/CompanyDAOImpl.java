package chanc.dao;

import chanc.domain.Company;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admssa on 06.02.2016.
 */
@Repository
public class CompanyDAOImpl implements CompanyDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Company createCompany(Company company) {
        sessionFactory.getCurrentSession().save(company);
        return (Company) sessionFactory.getCurrentSession().get(Company.class, company.getCompanyId());
    }

    @Override
    public Company readDociument(int companyId) {
        return (Company) sessionFactory.getCurrentSession().get(Company.class, companyId);
    }

    @Override
    public void uppdateCompany(Company company) {
        sessionFactory.getCurrentSession().update(company);
    }

    @Override
    public void deleteCompany(Company company) {
        sessionFactory.getCurrentSession().delete(company);
    }

    @Override
    public List<Company> findAllCompanys() {
        return sessionFactory.getCurrentSession().createCriteria(Company.class).list();
    }
}
