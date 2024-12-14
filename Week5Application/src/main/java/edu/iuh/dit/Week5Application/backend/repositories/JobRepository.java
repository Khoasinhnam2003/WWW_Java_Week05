package edu.iuh.dit.Week5Application.backend.repositories;

import edu.iuh.dit.Week5Application.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findJobByJobName(String jobName);

    List<Job> findByIdIn(List<Long> jobIds);

    @Query("SELECT j FROM Job j " +
            "JOIN FETCH JobSkill js ON js.job.id = j.id " +
            "JOIN FETCH Skill s ON js.skill.id = s.id " +
            "WHERE j.company.id = :companyId")
    List<Job> findJobsByCompanyWithSkills(@Param("companyId") Long companyId);

    // Liệt kê danh sách công việc cùng với danh sách kỹ năng của công việc đó
    // Chỉ những công việc có ít nhất 1 kỹ năng
    @Query("SELECT j FROM Job j JOIN FETCH j.jobSkills js JOIN FETCH js.skill s")
    List<Job> findAllJobsWithSkills();

    //    Liệt kê danh sách công việc cùng với danh sách kỹ năng của công việc đó theo tên công việc
    @Query("SELECT j FROM Job j JOIN FETCH j.jobSkills js JOIN FETCH js.skill s WHERE lower(j.jobName) LIKE lower(CONCAT('%', :jobName, '%'))")
    List<Job> findAllJobsWithSkillsByName(String jobName);
}
