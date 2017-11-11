package com.royle.rovhero.network;

import com.royle.rovhero.model.HeroListData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by A Little Boy @Nextzy on 11/11/2017 AD.
 */

public interface HeroService {

    @GET(RovHeroUrl.LIST_HERO)
    Call<HeroListData> getHeroListData();

}
