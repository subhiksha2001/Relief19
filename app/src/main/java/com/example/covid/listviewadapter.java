package com.example.covid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class listviewadapter extends ArrayAdapter<String> {
    int groupid;
    String[] item_list;
    String[] it;
    ArrayList<String> desc;
    Context context;
    public listviewadapter(Context context, int vg, int id,String[] item_list,String it[]){
        super(context,vg,id, item_list);
        this.context=context;
        groupid=vg;
        this.item_list=item_list;
        this.it=it;

    }
    static class ViewHolder {
        public TextView textview;
        public Button button;

    }
    public View getView(final int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        int count=0;
        // Inflate the list_item.xml file if convertView is null
        if(rowView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView= inflater.inflate(groupid, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.textview= rowView.findViewById(R.id.txt);
            viewHolder.button= (Button) rowView.findViewById(R.id.bt);
            rowView.setTag(viewHolder);

        }
        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.textview.setText(item_list[position]);
        holder.button.setText(it[position]);
        final String s="tel:"+it[position];
        holder.button.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent calli = new Intent(Intent.ACTION_DIAL);
                                                 calli.setData(Uri.parse(s));
                                                 context.startActivity(calli);
                                             }
                                         }
        );
        return rowView;
    }


}
