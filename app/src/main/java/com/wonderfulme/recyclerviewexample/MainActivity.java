package com.wonderfulme.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String KEY_RECYCLER_VIEW_SAVE_STATE = "KEY_RECYCLER_VIEW_SAVE_STATE";
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_simple);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (savedInstanceState != null) {
            mRecyclerView.getLayoutManager().onRestoreInstanceState(savedInstanceState.getParcelable(KEY_RECYCLER_VIEW_SAVE_STATE));
        }

        List<Integer> mDataToShow = Utils.getRecyclerViewValue();
        SimpleAdapter mAdapter = new SimpleAdapter(mDataToShow);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_RECYCLER_VIEW_SAVE_STATE, mRecyclerView.getLayoutManager().onSaveInstanceState());
    }
}
