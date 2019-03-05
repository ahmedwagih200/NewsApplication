package com.example.ahmed_amr.newsapplication;


import android.content.AsyncTaskLoader;

import android.content.Context;

import java.util.ArrayList;


public class News_Loader extends AsyncTaskLoader <ArrayList<News>>{




    private String Url;

    public News_Loader(Context context, String url) {
        super(context);
        Url = url;
    }

    @Override
   protected void onStartLoading() {
       forceLoad();
    }

    @Override
    public ArrayList<News> loadInBackground() {
        if (Url == null) {
            return null;
        }

        ArrayList<News> news = QueryUtils.fetchNewsData(Url);
        return news;
    }
}
