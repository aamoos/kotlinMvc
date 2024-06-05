package com.example.mvc.model.http

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class UserRequest(
    val name:String?=null,
    val age:Int?=null,
    val email:String?=null,
    val address:String?=null,
    val phoneNumber:String?=null    //phone_number
)
