package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>