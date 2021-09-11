package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder>{
    private ArrayList<categoryRVModal>categoryRVModals;
    private Context context;
    private CategorClickInterface_categorClickInterface;

    public CategoryRVAdapter(ArrayList<categoryRVModal> categoryRVModals, Context context,)CategorClickInterface_categorClickInterface {
        this.categoryRVModals = categoryRVModals;
        this.context = context;
        this.categorClickInterface = categoryClickInterface;
    }

    @NonNull
    @Override
    public CategoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View_view= LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_rv_item,parent,false);
        return_new CategoryRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CategoryRVAdapter.ViewHolder holder, int position) {
       CategoryRVModal categoryRVModal = categoryRVModals.get(position);
       holder.categoryTV.setText(categoryRVModals.getCategory());
        Picasso.get().load(categoryRVModal.getCategoryImageUrl()).into(holder.categoryIV);




    }

    @Override
    public int getItemCount() {

        return categoryRVModals.size();
    }
    public interface categoryClickInterface{
        void oncategoryClick(int position);
    }

    public class ViewHolder extends_RecyclerView.ViewHolder{
        private TextView categoryTV;
        private ImageView categoryIV;
      public ViewHolder(@NonNull View_itemView){
            super(itemView);
            categoryTV=itemView.findViewById(R.id.idTVCategory);
            categoryIV=itemView.findViewById(R.id.idIVCategory);
        }

    }


}

































































































































































































































































































































































































































