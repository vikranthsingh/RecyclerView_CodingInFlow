package com.example.recyclerviewproject_codinginflow;

public class ExampleItem {
    private int imageView;
    private String textview;
    private String textview2;

    public ExampleItem(int imageView, String textview, String textview2) {
        this.imageView = imageView;
        this.textview = textview;
        this.textview2 = textview2;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTextview() {
        return textview;
    }

    public String getTextview2() {
        return textview2;
    }
}
