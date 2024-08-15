package com.codingfarm.portfolio.domain.repository

import com.codingfarm.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>