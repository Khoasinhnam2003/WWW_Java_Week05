package edu.iuh.dit.Week5Application.backend.services;

import edu.iuh.dit.Week5Application.backend.models.Skill;
import edu.iuh.dit.Week5Application.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    public List<Skill> getAll() {
        return skillRepository.findAll();
    }
}
