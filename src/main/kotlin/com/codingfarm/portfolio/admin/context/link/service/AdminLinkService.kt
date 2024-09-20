package com.codingfarm.portfolio.admin.context.link.service

import com.codingfarm.portfolio.admin.data.TableDTO
import com.codingfarm.portfolio.domain.entity.Link
import com.codingfarm.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {
    fun getLinkTable():TableDTO{
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo,entities)
    }
}