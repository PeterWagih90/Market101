package com.omar.retail_64;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductRvAdapter extends RecyclerView.Adapter<ProductRvAdapter.ProductViewHolder> {

    private List<ProductModel> productsList;
    private Context context;

    public ProductRvAdapter(List<ProductModel> productsList, Context context) {
        this.productsList = productsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.products_rv_item, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        ProductModel productModel = productsList.get(position);
        holder.title.setText(productModel.getTitle());
        holder.details.setText(productModel.getDetails());
        holder.price.setText(productModel.getPrice());
        // glide is a library for image loading and caching
        Glide.with(context).load(productModel.getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView details;
        TextView price;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.product_iv);
            title = itemView.findViewById(R.id.title_tv);
            details = itemView.findViewById(R.id.details_tv);
            price = itemView.findViewById(R.id.price_tv);
        }
    }
}
