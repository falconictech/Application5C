package com.example.application5c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myviewholder> {


    Context context;
    int[] images;
    String[] countryList;


    public CustomAdapter(Context applicationContext, int[] images, String[] countryList) {

        context= applicationContext;
        this.images=images;
        this.countryList=countryList;


    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false);

        return new myviewholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.name.setText(countryList[position]);
        holder.img.setImageResource(images[position]);







    }

    @Override
    public int getItemCount() {
        return countryList.length;
    }


    public class myviewholder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView img;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            //first   lakldkasl
            name= itemView.findViewById(R.id.item_txt);
            img= itemView.findViewById(R.id.item_img);


            //first commm

        }


    }


}
