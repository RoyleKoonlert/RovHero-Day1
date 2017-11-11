package com.royle.rovhero.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by A Little Boy @Nextzy on 11/11/2017 AD.
 */

public class ApiManager {

    private static HeroService heroService;

    public static HeroService getHeroService() {
        if (heroService == null) {
            heroService = new Retrofit.Builder()
                    .baseUrl(RovHeroUrl.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(HeroService.class);
        }
        return heroService;
    }
}
