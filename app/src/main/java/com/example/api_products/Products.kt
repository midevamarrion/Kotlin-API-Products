package com.example.api_products

data class Products(
    var id:Int,
    var title:String,
    var description:String,
    var price:Double,
    var rating:Double,
    var stock:Int,
    var category:String,
    var thumbnail:String
)
