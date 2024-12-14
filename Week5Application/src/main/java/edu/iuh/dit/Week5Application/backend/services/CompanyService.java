package edu.iuh.dit.Week5Application.backend.services;

import edu.iuh.dit.Week5Application.backend.models.Company;
import edu.iuh.dit.Week5Application.backend.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    public Company login(String email) {
        return companyRepository.findByEmail(email);
    }
    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
