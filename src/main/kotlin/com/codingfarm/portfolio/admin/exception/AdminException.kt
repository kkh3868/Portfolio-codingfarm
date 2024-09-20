package com.codingfarm.portfolio.admin.exception

import org.springframework.http.HttpStatus
import java.lang.RuntimeException

abstract class AdminException(
    httpStatus: HttpStatus,
    message: String,
) :RuntimeException(message){
    val httpStatus: HttpStatus = httpStatus
}