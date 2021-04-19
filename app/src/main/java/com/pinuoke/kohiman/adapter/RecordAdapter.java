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

public class RecordAdapter extends BaseAdapter<ProjectDetailModel.DataBean.FollowLogBean, RecordAdapter.VH> {



    public RecordAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_record, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvType.setText(mDatas.get(position).getFollow_type().getName());
        holder.tvContent.setText(mDatas.get(position).getContent());
        holder.tvTime.setText(mDatas.get(position).getUser().getUser_name()+"/"+mDatas.get(position).getCreate_time());
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_type)
        TextView tvType;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_time)
        TextView tvTime;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
