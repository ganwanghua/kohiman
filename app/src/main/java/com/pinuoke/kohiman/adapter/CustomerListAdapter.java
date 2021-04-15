package com.pinuoke.kohiman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dd.ShadowLayout;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.model.MyCustomerListModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomerListAdapter extends BaseAdapter<MyCustomerListModel.DataBeanX.ListBean.DataBean, CustomerListAdapter.VH> {

    private int i;

    public CustomerListAdapter(Context mContext, int i) {
        super(mContext);
        this.i = i;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_customer_list, parent, false));
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
        if (mDatas.get(position).getSource() != null) {
            holder.tvTag.setVisibility(View.VISIBLE);
            holder.tvTag.setText(mDatas.get(position).getSource().getName());
        } else {
            holder.tvTag.setVisibility(View.GONE);
        }

        if (mDatas.get(position).getStatus() != null) {
            holder.tvTag1.setVisibility(View.VISIBLE);
            holder.tvTag1.setText(mDatas.get(position).getStatus().getName());
        } else {
            holder.tvTag1.setVisibility(View.GONE);
        }

        if (i == 0) {
            holder.tvEdit.setText("编辑");
            holder.tvFollowUp.setVisibility(View.VISIBLE);
        } else if (i == 1) {
            holder.tvEdit.setText("创建项目");
            holder.tvFollowUp.setVisibility(View.VISIBLE);
        } else if (i == 2) {
            holder.tvEdit.setText("编辑");
            holder.tvFollowUp.setVisibility(View.GONE);
        }

        holder.llDelete.setOnClickListener(v -> {
            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemViewClick(v, position);
            }
        });

        holder.rlUser.setOnClickListener(v -> {
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
        @BindView(R.id.rl_user)
        RelativeLayout rlUser;
        @BindView(R.id.ll_delete)
        LinearLayout llDelete;
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
        @BindView(R.id.tv_delete)
        TextView tvDelete;
        @BindView(R.id.tv_edit)
        TextView tvEdit;
        @BindView(R.id.tv_follow_up)
        TextView tvFollowUp;
        @BindView(R.id.fab)
        ShadowLayout fab;
        @BindView(R.id.tv_tag1)
        TextView tvTag1;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
