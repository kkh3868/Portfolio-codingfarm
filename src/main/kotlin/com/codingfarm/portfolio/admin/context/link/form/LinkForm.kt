package com.codingfarm.portfolio.admin.context.link.form

import com.codingfarm.portfolio.domain.entity.Link
import jakarta.validation.constraints.NotBlank

class LinkForm(
    @field:NotBlank(message="필수값입니다.")
    val name:String,

    @field:NotBlank(message="필수값입니다.")
    val content:String,

    val isActive:Boolean

) {
    fun toEntity(): Link {
        return Link(
            content = this.content,
            name = this.name,
            isActive = this.isActive
        )
    }

    fun toEntity(id:Long): Link {
        val link = this.toEntity()
        link.id = id

        return link
    }
}