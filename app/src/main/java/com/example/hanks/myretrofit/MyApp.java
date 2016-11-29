package com.example.hanks.myretrofit;

import android.app.Application;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by yvtc on 2016/11/18.
 */
public class MyApp extends Application{
    List<Repo> result;
    GitHubService service;
    Call<List<Repo>> repos;
    Call<ResponseBody> delete;
    //    Call<ResponseBody> add;
//    Call<ResponseBody> addByPlainText;
    Call<ResponseBody> addByFormPost;
    Call<ResponseBody> updateByGet;
}
