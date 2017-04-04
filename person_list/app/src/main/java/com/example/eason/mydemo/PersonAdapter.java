package com.example.eason.mydemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, int resource, List<Person> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        final Person p = getItem(position);

        // 创建布局
        View onePersonView = LayoutInflater.from(getContext()).inflate(R.layout.person_item, parent, false);

        // 获取ImageView和TextView
        ImageView imageView = (ImageView) onePersonView.findViewById(R.id.person_small_imageView);
        TextView textView = (TextView) onePersonView.findViewById(R.id.person_name_textView);

        // 根据老师数据设置ImageView和TextView的展现
        imageView.setImageResource(p.getImageId());
        textView.setText(p.getName());

        onePersonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PersonDetailActivity.class);
                intent.putExtra("person_image", p.getImageId());
                intent.putExtra("person_desc", p.getDesc());
                getContext().startActivity(intent);
            }
        });

        return onePersonView;
    }
}
