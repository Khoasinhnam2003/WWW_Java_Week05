package edu.iuh.dit.Week5Application.backend.repositories;

import edu.iuh.dit.Week5Application.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    @Query("SELECT s FROM Skill s WHERE s.id IN (SELECT js.skill.id FROM JobSkill js WHERE js.job.id = :jobId)")
    List<Skill> findSkillsByJobId(@Param("jobId") Long jobId);
}
