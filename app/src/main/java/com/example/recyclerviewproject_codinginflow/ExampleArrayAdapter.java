package com.example.recyclerviewproject_codinginflow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleArrayAdapter extends RecyclerView.Adapter<ExampleArrayAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleList;

    public ExampleArrayAdapter(ArrayList<ExampleItem> mExampleList) {
        this.mExampleList = mExampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);
        holder.imageView.setImageResource(currentItem.getImageView());
        holder.textview.setText(currentItem.getTextview());
        holder.textview2.setText(currentItem.getTextview2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textview;
        private TextView textview2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textview = itemView.findViewById(R.id.textview);
            textview2 = itemView.findViewById(R.id.textview2);
        }
    }
}
