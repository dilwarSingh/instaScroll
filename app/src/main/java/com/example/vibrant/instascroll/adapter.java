package com.example.vibrant.instascroll;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vibrant on 3/31/2018.
 */

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {

    int x = 0;


    public adapter(int x) {
        this.x = x;
    }

    @Override
    public adapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(adapter.viewHolder holder, int position) {
        holder.tv.setText("position " + position);
    }

    @Override
    public int getItemCount() {
        return x;
    }


    class viewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public viewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textView);
        }
    }
}
