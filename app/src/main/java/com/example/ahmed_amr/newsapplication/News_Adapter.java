package com.example.ahmed_amr.newsapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class News_Adapter extends ArrayAdapter<News>{

   public News_Adapter(Activity context, ArrayList<News> news)
    {
        super(context,0,news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        News currentNew = getItem(position);

        TextView Category = listItemView.findViewById(R.id.Category);
        Category.setText(currentNew.getCategory());

        TextView Type = listItemView.findViewById(R.id.type);
        Type.setText(currentNew.getType());

        TextView Title = listItemView.findViewById(R.id.Title);
        Title.setText(currentNew.getTitle());

        TextView Date = listItemView.findViewById(R.id.date);
        String date = currentNew.getDate();
        String[] str = date.split("T");
        Date.setText(str[0]);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentNew.getName());

        return listItemView ;
    }
}
