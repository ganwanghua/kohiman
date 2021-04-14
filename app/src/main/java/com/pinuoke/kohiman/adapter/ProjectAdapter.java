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
import com.pinuoke.kohiman.model.MyProjectListModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProjectAdapter extends BaseAdapter<MyProjectListModel.DataBeanX.ListBean.DataBean, ProjectAdapter.VH> {


    public ProjectAdapter(Context mContext) {
        super(mContext);
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
        holder.tvLocation.setText(mDatas.get(position).getClient().get(0).getClient().getName()+" | "+
                mDatas.get(position).getClient().get(0).getClient().getLink_name() );
        holder.tvPhone.setText(mDatas.get(position).getCategory().getName());
        holder.tvTag.setText(mDatas.get(position).getStatus().getName());

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
        @BindView(R.id.rl_user)
        RelativeLayout rlUser;
        @BindView(R.id.tv_delete)
        TextView tvDelete;
        @BindView(R.id.ll_delete)
        LinearLayout llDelete;
        @BindView(R.id.tv_edit)
        TextView tvEdit;
        @BindView(R.id.tv_follow_up)
        TextView tvFollowUp;
        @BindView(R.id.fab)
        ShadowLayout fab;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
