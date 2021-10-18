package com.example.recyclerviewproject_codinginflow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<ExampleItem> exampleItems = new ArrayList<>();
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_camera_24, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_campaign_24, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_baseline_chat_24, "Line 5", "Line 6"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ExampleArrayAdapter(exampleItems));

    }
}