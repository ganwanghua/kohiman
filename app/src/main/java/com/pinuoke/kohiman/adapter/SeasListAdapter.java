package com.pinuoke.kohiman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dd.ShadowLayout;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.model.SeasListModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SeasListAdapter extends BaseAdapter<SeasListModel.DataBeanX.ListBean.DataBean, SeasListAdapter.VH> {

    public SeasListAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_sea_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvName.setText(mDatas.get(position).getName());
        holder.tvTime.setText(mDatas.get(position).getCreate_time());
        holder.tvLocation.setText(mDatas.get(position).getAddress());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mDatas.get(position).getPhone().length(); i++) {
            char c = mDatas.get(position).getPhone().charAt(i);
            if (i >= 3 && i <= 6) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        holder.tvPhone.setText(sb.toString());
        if (mDatas.get(position).getTagList() != null && mDatas.get(position).getTagList().size() > 0) {
            holder.tvTag.setVisibility(View.VISIBLE);
            holder.tvTag.setText(mDatas.get(position).getTagList().get(0).getName());
        } else {
            holder.tvTag.setVisibility(View.GONE);
        }

        holder.tvGet.setOnClickListener(v -> {
            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemViewClick(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_tag)
        TextView tvTag;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.iv_location)
        ImageView ivLocation;
        @BindView(R.id.tv_location)
        TextView tvLocation;
        @BindView(R.id.ll_location)
        LinearLayout llLocation;
        @BindView(R.id.iv_phone)
        ImageView ivPhone;
        @BindView(R.id.tv_phone)
        TextView tvPhone;
        @BindView(R.id.tv_get)
        TextView tvGet;
        @BindView(R.id.fab)
        ShadowLayout fab;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
