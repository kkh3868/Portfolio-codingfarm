package com.codingfarm.portfolio.presentation.dto

import com.codingfarm.portfolio.domain.entity.Introduction

data class IntroductionDTO (
    val content: String,
){
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}