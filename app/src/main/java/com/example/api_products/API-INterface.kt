package com.example.api_products

import retrofit2.Call
import retrofit2.http.GET

interface `API-INterface` {
    @GET("/product")
    fun getProducts(): Call<ProductResponse>


}