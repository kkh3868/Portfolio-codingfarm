package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Link
import com.codingfarm.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>{
    fun findAllByIsActive(isActive: Boolean) : List<Project>
}