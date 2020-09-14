package com.algo.demoaws.network;

import com.algo.demoaws.data.RssFeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RssService {
    @GET("rss/")
    Call<RssFeed> getFeed();
}
