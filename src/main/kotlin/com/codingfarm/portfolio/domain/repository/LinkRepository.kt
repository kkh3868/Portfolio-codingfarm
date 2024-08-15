package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>