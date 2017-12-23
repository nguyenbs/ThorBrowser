package acr.browser.barebones.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.explore.web.browser.R;

/**
 * Created by luchen on 10/17/2017.
 */

public class splashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    Intent intent =new Intent(splashActivity.this,BrowserActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
