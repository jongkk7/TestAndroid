package com.leesunhwa.atry;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.leesunhwa.atry.Adapter.UserAdapter;
import com.leesunhwa.atry.DataModel.UserDataModel;
import com.leesunhwa.atry.view.BaseAcitivty;

import java.util.ArrayList;

public class MainActivity extends BaseAcitivty {
    private final String TAG = "[MainActivity]";

    private android.support.v7.widget.RecyclerView recyclerView;
    private android.widget.TextView textViewHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setEvent();
        loadData();
    }

    private void loadData() {

        try {

//            recyclerView.setLayoutManager(new LinearLayoutManager(this)); // 세로
//            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)); // 가로
//            recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Grid 2줄,
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3, LinearLayoutManager.HORIZONTAL, false)); // Grid 3줄, 가로

            ArrayList<UserDataModel> list = new ArrayList<>();
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("한녕희","26"));
            list.add(new UserDataModel("최동찬","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));
            list.add(new UserDataModel("유종권","28"));

            UserAdapter adapter = new UserAdapter(this, list);
            recyclerView.setAdapter(adapter);

        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    protected void initView() {

        try {

            this.recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            this.textViewHi = (TextView) findViewById(R.id.textViewHi);

        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    protected void setEvent() {

        try {




        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }
    }
}
