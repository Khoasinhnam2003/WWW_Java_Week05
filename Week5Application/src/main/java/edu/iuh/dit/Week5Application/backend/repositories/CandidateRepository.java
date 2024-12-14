package edu.iuh.dit.Week5Application.backend.repositories;

import edu.iuh.dit.Week5Application.backend.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Candidate findByEmail(String email);
}
