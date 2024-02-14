package by.javaguru.spring.service;

import by.javaguru.spring.database.model.Company;
import by.javaguru.spring.database.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Optional<Company> findCompanyById(Integer id) {
        return companyRepository.findCompanyById(id);
    }
}
