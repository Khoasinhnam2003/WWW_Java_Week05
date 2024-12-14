package edu.iuh.dit.Week5Application.backend.repositories;

import edu.iuh.dit.Week5Application.backend.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobSkillRepository extends JpaRepository<JobSkill, Long> {
    // Tìm kiếm danh sách id công việc theo danh sách id kỹ năng
    @Query("SELECT js.job.id FROM JobSkill js WHERE js.skill.id IN :skillIds")
    List<Long> findJobIdsBySkillIds(@Param("skillIds") List<Long> skillIds);

    // Tìm kiếm danh sách id kỹ năng theo id công việc
    @Query("SELECT js.skill.id FROM JobSkill js WHERE js.job.id = :jobId")
    List<Long> findSkillIdsByJobId(@Param("jobId") Long jobId);
}
