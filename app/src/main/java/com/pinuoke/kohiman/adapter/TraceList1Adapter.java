package com.pinuoke.kohiman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.model.CustomerDetailsModel;
import com.pinuoke.kohiman.model.LogModel;

import java.util.ArrayList;
import java.util.List;

public class TraceList1Adapter extends BaseAdapter {
    private Context context;
    private List<LogModel.DataBeanX.ListBean.DataBean> traceList = new ArrayList<>();
    private static final int TYPE_TOP = 0x0000;
    private static final int TYPE_NORMAL = 0x0001;

    public TraceList1Adapter(Context context) {
        this.context = context;
    }

    public void setData(List<LogModel.DataBeanX.ListBean.DataBean> traceList) {
        this.traceList = traceList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return traceList.size();
    }

    @Override
    public LogModel.DataBeanX.ListBean.DataBean getItem(int position) {
        return traceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_trace, parent, false);
            holder.tvAcceptTime = (TextView) convertView.findViewById(R.id.tvAcceptTime);
            holder.tvAcceptStation = (TextView) convertView.findViewById(R.id.tvAcceptStation);
            holder.tvTopLine = (TextView) convertView.findViewById(R.id.tvTopLine);
            holder.tvStatus = (TextView) convertView.findViewById(R.id.tvStatus);
            holder.tvDot = (TextView) convertView.findViewById(R.id.tvDot);
            convertView.setTag(holder);
        }
        if (getItemViewType(position) == TYPE_TOP) {
            // ??????????????????????????????
            holder.tvTopLine.setVisibility(View.INVISIBLE);
            // ??????????????????
            holder.tvStatus.setTextColor(0xff111111);
            holder.tvAcceptTime.setTextColor(0xff111111);
            holder.tvAcceptStation.setTextColor(0xff888888);
            holder.tvDot.setBackgroundResource(R.mipmap.icon_jl_dqzt);
        } else if (getItemViewType(position) == TYPE_NORMAL) {
            holder.tvTopLine.setVisibility(View.VISIBLE);
            holder.tvStatus.setTextColor(0xffA5A5A5);
            holder.tvAcceptTime.setTextColor(0xffA5A5A5);
            holder.tvAcceptStation.setTextColor(0xffA5A5A5);
            holder.tvDot.setBackgroundResource(R.mipmap.icon_jl_grey);
        }

//        holder.tvStatus.setText(traceList.get(position).getStatus());
        holder.tvAcceptTime.setText(traceList.get(position).getTime());
        holder.tvAcceptStation.setText(traceList.get(position).getText()+"???"+traceList.get(position).getContent());
        return convertView;
    }

    @Override
    public int getItemViewType(int id) {
        if (id == 0) {
            return TYPE_TOP;
        }
        return TYPE_NORMAL;
    }

    static class ViewHolder {
        public TextView tvAcceptTime, tvAcceptStation;
        public TextView tvTopLine, tvDot,tvStatus;
    }
}