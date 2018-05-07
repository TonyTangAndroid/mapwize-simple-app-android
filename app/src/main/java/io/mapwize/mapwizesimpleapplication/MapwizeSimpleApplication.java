package io.mapwize.mapwizesimpleapplication;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class MapwizeSimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "YOUR_MAPWIZE_API_KEY"); // PASTE YOU MAPWIZE API KEY HERE !!! Get your key by signin up at mapwize.io
    }

}
