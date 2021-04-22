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
import com.pinuoke.kohiman.model.ProjectClientListModel;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InnerClientAdapter extends BaseAdapter<ProjectDetailModel.DataBean.DetailBean.ClientBeanX, InnerClientAdapter.VH> {

    public InnerClientAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_inner_client, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
