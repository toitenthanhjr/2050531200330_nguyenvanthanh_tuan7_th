package com.example.ktgk;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauThuBongDaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CauThuBongDa> BaiHatList;

    public CauThuBongDaAdapter(Context context, int layout, List<CauThuBongDa> baiHatList) {
        this.context = context;
        this.layout = layout;
        BaiHatList = baiHatList;
    }

    @Override
    public int getCount() {
        return BaiHatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen;
        TextView txtMoTa;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }


        CauThuBongDa baiHat = BaiHatList.get(position);
        holder.txtTen.setText(baiHat.getTen());
        holder.txtMoTa.setText(baiHat.getMoTa());
        holder.imgHinh.setImageResource(baiHat.getHinh());

        return view;
    }
}

