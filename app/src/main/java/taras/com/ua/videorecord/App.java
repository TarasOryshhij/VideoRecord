package taras.com.ua.videorecord;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Zver on 02.01.2017.
 */

public class App extends Application {

    private static App application;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        application = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Start service
        startService(new Intent(this, RecordService.class));
    }

    public static App getInstance() {
        return application;
    }
}
