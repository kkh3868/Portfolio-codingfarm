package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*
interface ProjectRepository : JpaRepository<Project, Long> {
    fun findAllByIsActive(isActive: Boolean): List<Project>
    override fun findById(id: Long): Optional<Project>
}