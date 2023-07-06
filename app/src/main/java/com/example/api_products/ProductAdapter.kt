package com.example.api_products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.api_products.databinding.ProductListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ProductAdapter(private var productList: List<Products>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            ProductListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    fun updateProducts(newProducts: List<Products>) {
        productList=newProducts
        notifyDataSetChanged()
    }

    inner class ProductViewHolder(private val binding: ProductListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Products) {
            binding.apply {
                tvId.text=product.id.toString()
                tvTitle.text=product.title
                tvDescription.text=product.description
                tvPrice.text=product.price.toString()
                tvRating.text=product.rating.toString()
                tvStock.text=product.stock.toString()



                Picasso.get()
                    .load(product.thumbnail)
                    .resize(250,250)
                    .centerCrop()
                    .transform(CropCircleTransformation())
                    .into(binding.ivProduct)
            }

        }
    }
}
