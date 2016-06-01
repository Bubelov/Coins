package com.bubelov.coins.service;

import android.app.IntentService;

import com.bubelov.coins.App;
import com.bubelov.coins.api.CoinsApi;

/**
 * Author: Igor Bubelov
 * Date: 17/04/15 18:29
 */

public abstract class CoinsIntentService extends IntentService {
    private App app;

    public CoinsIntentService(String name) {
        super(name);
        app = App.getInstance();
    }

    protected CoinsApi getApi() {
        return app.getApi();
    }
}