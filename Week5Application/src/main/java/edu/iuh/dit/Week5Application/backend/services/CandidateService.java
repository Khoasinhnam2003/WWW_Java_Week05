package edu.iuh.dit.Week5Application.backend.services;

import edu.iuh.dit.Week5Application.backend.models.Candidate;
import edu.iuh.dit.Week5Application.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    public Candidate login(String email) {
        return candidateRepository.findByEmail(email);
    }

    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public Candidate findById(Long id) {
        return candidateRepository.findById(id).orElse(null);
    }
}
