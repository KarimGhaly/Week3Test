package com.example.admin.week3test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 9/15/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    Context context;
    List<Cars> carsList;

    public RVAdapter(List<Cars> carsList) {
        this.carsList = carsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        for(Cars C:carsList)
        {
            holder.txtModel.setText(C.getModel());
            holder.txtYear.setText(String.valueOf(C.getYear()));
            holder.txtType.setText(C.getType());
        }

    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtModel;
        TextView txtType;
        TextView txtYear;

        public ViewHolder(View itemView) {
            super(itemView);
            txtModel = (TextView) itemView.findViewById(R.id.txtModel);
            txtType = (TextView) itemView.findViewById(R.id.txtType);
            txtYear = (TextView) itemView.findViewById(R.id.txtYear);
        }
    }
}
