package com.wonderfulme.recyclerviewexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private List<Integer> mRecyclerViewItems;

    public SimpleAdapter(List<Integer> mRecyclerViewItems) {
        this.mRecyclerViewItems = mRecyclerViewItems;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_simple_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(mRecyclerViewItems.get(position));
    }


    @Override
    public int getItemCount() { return mRecyclerViewItems.size();}

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        ViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_item);
        }

        void bindData(Integer numberToShow) {
            mTextView.setText(String.valueOf(numberToShow));
        }
    }
}
