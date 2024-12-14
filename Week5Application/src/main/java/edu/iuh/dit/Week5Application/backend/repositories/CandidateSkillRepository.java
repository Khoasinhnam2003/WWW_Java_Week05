package edu.iuh.dit.Week5Application.backend.repositories;

import edu.iuh.dit.Week5Application.backend.models.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Long> {
    // Tìm kiếm danh sách id kỹ năng theo id ứng viên
    @Query("SELECT cs.skill.id FROM CandidateSkill cs WHERE cs.can.id = :candidateId")
    List<Long> findSkillIdsByCandidateId(@Param("candidateId") Long candidateId);
}
