package com.royle.rovhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.royle.rovhero.model.HeroListData;
import com.royle.rovhero.network.ApiManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiManager.getHeroService().getHeroListData()
                .enqueue(new Callback<HeroListData>() {
                    @Override
                    public void onResponse(Call<HeroListData> call, Response<HeroListData> response) {
                        //+
                        Log.e("onResponse", new Gson().toJson(response.body()));
                        //+
                    }

                    @Override
                    public void onFailure(Call<HeroListData> call, Throwable t) {

                    }
                });

    }
}
