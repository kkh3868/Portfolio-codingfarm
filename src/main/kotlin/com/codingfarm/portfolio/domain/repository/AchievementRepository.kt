package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>{
    fun findAllByIsActive(isActive: Boolean) : List<Achievement>
}