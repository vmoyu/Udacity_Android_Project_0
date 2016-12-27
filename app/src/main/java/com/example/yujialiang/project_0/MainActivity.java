package com.example.yujialiang.project_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    //声明按钮
    private Button btn_Flim; //热门电影按钮
    private Button btn_Stocks; //股票雄鹰按钮
    private Button btn_reader; //XYZ阅读器按钮
    private Button btn_News; //最新闻按钮
    private Button btn_graduation; //毕业设计按钮

    private static String info = "启动应用："; //显示的信息
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView(); //初始化

    }

    //初始化
    private void initView(){
        //实例化按钮
        btn_Flim = (Button) findViewById(R.id.flim_btn);
        btn_Stocks = (Button) findViewById(R.id.stocks_btn);
        btn_reader = (Button) findViewById(R.id.reader_btn);
        btn_News = (Button) findViewById(R.id.news_btn);
        btn_graduation = (Button) findViewById(R.id.graduation_btn);

        //设置监听器
        btn_Flim.setOnClickListener(this);
        btn_Stocks.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_News.setOnClickListener(this);
        btn_graduation.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button mButton = (Button) v;

        if (mButton == null){
            return;
        }

        Toast.makeText(this, info + mButton.getText(), Toast.LENGTH_SHORT).show();
    }
}
