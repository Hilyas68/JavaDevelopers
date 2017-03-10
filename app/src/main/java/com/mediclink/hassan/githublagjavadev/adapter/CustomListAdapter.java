package com.mediclink.hassan.githublagjavadev.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.mediclink.hassan.githublagjavadev.Model.JavaDev;
import com.mediclink.hassan.githublagjavadev.R;
import com.mediclink.hassan.githublagjavadev.app.AppController;

import java.util.List;

/**
 * Created by hassan on 3/10/2017.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<JavaDev> javaDevListItem;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<JavaDev> javaDevListItem) {
        this.activity = activity;
        this.javaDevListItem = javaDevListItem;
    }

    @Override
    public int getCount() {
        return javaDevListItem.size();
    }

    @Override
    public Object getItem(int location) {
        return javaDevListItem.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView avatar = (NetworkImageView) convertView
                .findViewById(R.id.avatar);
        TextView title = (TextView) convertView.findViewById(R.id.username);

        JavaDev m = javaDevListItem.get(position);

        // Avatar image
        avatar.setImageUrl(m.getAvatarlUrl(), imageLoader);

        // username
        title.setText(m.getUsername());

        return convertView;
    }

}