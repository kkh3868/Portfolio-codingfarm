package com.codingfarm.portfolio.admin.context.skill.service

import com.codingfarm.portfolio.admin.data.TableDTO
import com.codingfarm.portfolio.domain.entity.Skill
import com.codingfarm.portfolio.domain.repository.ProjectSkillRepository
import org.springframework.stereotype.Service

@Service
class AdminSkillService(
    private val skillRepository: ProjectSkillRepository
) {
    fun getSkillTable(): TableDTO{
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}