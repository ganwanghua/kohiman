package com.pinuoke.kohiman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserInfoAdapter extends BaseAdapter<ProjectDetailModel.DataBean.DetailBean.UserBeanX, UserInfoAdapter.VH> {

    public UserInfoAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_user_info, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvName.setText(mDatas.get(position).getUser().getUser_name());
        holder.tvPhone.setText(mDatas.get(position).getUser().getMobile());
        holder.tvSort.setText("员工" + position);

    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_phone)
        TextView tvPhone;
        @BindView(R.id.tv_sort)
        TextView tvSort;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
