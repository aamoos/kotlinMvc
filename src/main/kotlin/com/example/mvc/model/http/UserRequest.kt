package com.example.mvc.model.http

data class UserRequest(
    val name:String?=null,
    val age:Int?=null,
    val email:String?=null,
    val address:String?=null
)
