package com.algo.demoaws;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RssService {
    @GET("rss/")
    Call<RssFeed> getFeed();
}
