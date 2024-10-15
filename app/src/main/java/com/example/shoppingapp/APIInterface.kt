package com.example.shoppingapp

import MyData
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("products")
    fun getProductdata() : Call<MyData>
}