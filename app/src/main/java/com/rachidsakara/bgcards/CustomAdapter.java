package com.rachidsakara.bgcards;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Touchiba-Pro on 13/10/2017.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private Context context;
    private List<DataItem> my_data;

    public CustomAdapter(Context context, List<DataItem> my_data) {
        this.context = context;
        this.my_data = my_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.postedImg.setImageResource(my_data.get(position).getImage_posted());
        holder.avatar.setImageResource(my_data.get(position).getAvatar());
        holder.name.setText(my_data.get(position).getName());
        holder.BirthDay.setText(my_data.get(position).getBirth_day());
        holder.description.setText(my_data.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public ImageView avatar;
        public ImageView postedImg;
        public TextView name;
        public TextView BirthDay;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            avatar = (ImageView) itemView.findViewById(R.id.avatar);
            postedImg = (ImageView) itemView.findViewById(R.id.posted_image);
            name = (TextView) itemView.findViewById(R.id.name);
            BirthDay = (TextView) itemView.findViewById(R.id.birthDay);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }
}

