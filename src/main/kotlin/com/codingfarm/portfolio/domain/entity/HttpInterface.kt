package com.codingfarm.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest
import java.net.CacheRequest

@Entity
class HttpInterface(httpServeletRequest: HttpServletRequest) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null

    var cookies: String? = httpServeletRequest.cookies
        ?.map{ "${it.name}:${it.value}"}
        ?.toString()

    var referer: String? = httpServeletRequest.getHeader("referer")

    var localAddr: String? = httpServeletRequest.localAddr

    var remoteAddr: String? = httpServeletRequest.remoteAddr

    var remoteHost: String? = httpServeletRequest.remoteHost

    var requestURI: String? = httpServeletRequest.requestURI

    var userAgent: String? = httpServeletRequest.getHeader("user-agent")
}