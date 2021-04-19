package com.pinuoke.kohiman.mine;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.openxu.cview.chart.ProgressPieChart;
import com.openxu.cview.chart.barchart.BarVerticalChart;
import com.openxu.cview.chart.bean.BarBean;
import com.openxu.cview.chart.bean.ChartLable;
import com.openxu.utils.DensityUtil;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.model.MyDataModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyDataActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.chart1)
    ProgressPieChart chart1;
    @BindView(R.id.tv_total)
    TextView tvTotal;
    @BindView(R.id.tv_finish)
    TextView tvFinish;
    @BindView(R.id.tv_num)
    TextView tvNum;
    @BindView(R.id.tv_num1)
    TextView tvNum1;
    @BindView(R.id.tv_num2)
    TextView tvNum2;
    @BindView(R.id.tv_total1)
    TextView tvTotal1;
    @BindView(R.id.tv_finish1)
    TextView tvFinish1;
    @BindView(R.id.chart2)
    ProgressPieChart chart2;
    @BindView(R.id.chart3)
    BarVerticalChart chart3;
    @BindView(R.id.tv_week)
    TextView tvWeek;
    @BindView(R.id.tv_month)
    TextView tvMonth;
    @BindView(R.id.tv_year)
    TextView tvYear;
    private DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        ButterKnife.bind(this);
        dataRepository = Injection.dataRepository(this);

        myData("1");
    }

    private void myData(String span) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/data");
        map.put("token", FastData.getToken());
        map.put("span", span);
        dataRepository.myData(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                MyDataModel myDataModel = (MyDataModel) data;
                if (myDataModel.getCode() == 1) {
                    tvNum.setText(myDataModel.getData().getTeam().getTotal() + "");
                    tvNum1.setText(myDataModel.getData().getTeam().getFollow() + "");
                    tvNum2.setText(myDataModel.getData().getTeam().getFinish() + "");

                    tvTotal.setText(myDataModel.getData().getMy().getTotal() + "");
                    tvFinish.setText(myDataModel.getData().getMy().getFinish() + "");
                    chart1.setProSize(DensityUtil.dip2px(MyDataActivity.this, 12));  //圆环宽度
                    chart1.setDebug(false);
                    chart1.setLoading(false);
                    chart1.setProColor(Color.parseColor("#7A40F2"));  //进度颜色
                    List<ChartLable> lables = new ArrayList<>();
                    lables.add(new ChartLable(myDataModel.getData().getMy().getPercent() + "%",
                            DensityUtil.sp2px(MyDataActivity.this, 22), Color.parseColor("#7A40F2")));
                    lables.add(new ChartLable("个人成交率",
                            DensityUtil.sp2px(MyDataActivity.this, 12), Color.parseColor("#7A40F2")));
                    chart1.setData(100, myDataModel.getData().getMy().getPercent(), lables);

                    tvTotal1.setText(myDataModel.getData().getTeam().getTotal() + "");
                    tvFinish1.setText(myDataModel.getData().getTeam().getFinish() + "");
                    chart2.setProSize(DensityUtil.dip2px(MyDataActivity.this, 12));  //圆环宽度
                    chart2.setDebug(false);
                    chart2.setLoading(false);
                    chart2.setProColor(Color.parseColor("#FF9060"));  //进度颜色
                    List<ChartLable> lables1 = new ArrayList<>();
                    lables1.add(new ChartLable(myDataModel.getData().getTeam().getPercent() + "%",
                            DensityUtil.sp2px(MyDataActivity.this, 22), Color.parseColor("#FF9060")));
                    lables1.add(new ChartLable("团队成交率",
                            DensityUtil.sp2px(MyDataActivity.this, 12), Color.parseColor("#FF9060")));
                    chart2.setData(100, (int) myDataModel.getData().getTeam().getPercent(), lables1);

                    chart3.setBarItemSpace(DensityUtil.dip2px(MyDataActivity.this, 30));  //柱间距
                    chart3.setDebug(false);
                    chart3.setBarNum(1);   //一组柱子数量
                    chart3.setBarColor(new int[]{Color.parseColor("#3ACBE9")});
                    List<String> strXList = new ArrayList<>();
                    List<List<BarBean>> dataList = new ArrayList<>();
                    for (int i = 0; i < myDataModel.getData().getTeam().getUser().size(); i++) {
                        //此集合为柱状图上一条数据，集合中包含几个实体就是几个柱子
                        List<BarBean> list = new ArrayList<>();
                        list.add(new BarBean((float) myDataModel.getData().getTeam().getUser().get(i).getPercent(), "个人成交率"));
                        dataList.add(list);
                        strXList.add(myDataModel.getData().getTeam().getUser().get(i).getName());
                    }
                    chart3.setLoading(false);
                    chart3.setData(dataList, strXList);
                }
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.tv_week, R.id.tv_month, R.id.tv_year})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_week:
                tvWeek.setTextColor(0xffffffff);
                tvWeek.setBackgroundResource(R.drawable.bg_green_15);
                tvMonth.setTextColor(0xff666666);
                tvMonth.setBackgroundResource(R.drawable.bg_white_15);
                tvYear.setTextColor(0xff666666);
                tvYear.setBackgroundResource(R.drawable.bg_white_15);
                myData("1");
                break;
            case R.id.tv_month:
                tvMonth.setTextColor(0xffffffff);
                tvMonth.setBackgroundResource(R.drawable.bg_green_15);
                tvWeek.setTextColor(0xff666666);
                tvWeek.setBackgroundResource(R.drawable.bg_white_15);
                tvYear.setTextColor(0xff666666);
                tvYear.setBackgroundResource(R.drawable.bg_white_15);
                myData("2");
                break;
            case R.id.tv_year:
                tvYear.setTextColor(0xffffffff);
                tvYear.setBackgroundResource(R.drawable.bg_green_15);
                tvWeek.setTextColor(0xff666666);
                tvWeek.setBackgroundResource(R.drawable.bg_white_15);
                tvMonth.setTextColor(0xff666666);
                tvMonth.setBackgroundResource(R.drawable.bg_white_15);
                myData("3");
                break;
        }
    }
}