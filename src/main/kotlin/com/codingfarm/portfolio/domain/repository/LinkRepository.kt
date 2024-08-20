package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Introduction
import com.codingfarm.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>{
    fun findAllByIsActive(isActive: Boolean) : List<Link>
}