package com.example.ahmed_amr.newsapplication;

public class News {

    News(String category, String type, String title, String webLink ,String date ,String name)
    {
        Category = category;
        Type = type;
        Title = title;
        WebLink = webLink;
        Date =date;
        Name =name;
    }

    private String Category;
    private String Type;
    private String Title;
    private String WebLink;
    private String Name;

    public String getDate() {
        return Date;
    }

    private  String Date;

    public String getCategory() {
        return Category;
    }

    public String getType() {
        return Type;
    }

    public String getTitle() {
        return Title;
    }

    public String getWebLink() {
        return WebLink;
    }

    public String getName() {
        return Name;
    }
}
