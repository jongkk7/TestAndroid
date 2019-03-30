package com.leesunhwa.atry.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leesunhwa.atry.DataModel.UserDataModel;
import com.leesunhwa.atry.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private final String TAG = "[UserAdapter]";

    private Context context;
    private List<UserDataModel> list;

    public UserAdapter(Context context, List<UserDataModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_test, parent, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        try {

            UserDataModel item = list.get(position);

            holder.textViewName.setText(item.getName());
            holder.textViewAge.setText(item.getAge());

        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder {

        private android.widget.TextView textViewName;
        private android.widget.TextView textViewAge;

        public UserViewHolder(View v) {
            super(v);

            this.textViewAge = (TextView) v.findViewById(R.id.textViewAge);
            this.textViewName = (TextView) v.findViewById(R.id.textViewName);
        }
    }

}
