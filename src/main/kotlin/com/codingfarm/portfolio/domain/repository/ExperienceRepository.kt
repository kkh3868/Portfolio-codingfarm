package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>