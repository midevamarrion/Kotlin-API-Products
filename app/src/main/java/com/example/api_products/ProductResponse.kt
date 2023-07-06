package com.example.api_products

data class ProductResponse(
    var products:List<Products>,
    var total:Int,
    var skip:Int,
    var limit:Int
)

