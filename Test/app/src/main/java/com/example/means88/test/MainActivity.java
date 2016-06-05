package com.example.means88.test;

import android.os.*;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 1) {
                textView.setText("getMessage");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.text_view);
        if(button == null || textView == null) {
            Log.e("MainActivity", "Component not found");
            return;
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            String data = getData("");
                            Message message = new Message();
                            message.what = 1;
                            handler.dispatchMessage(message);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
    }

    public static String getData(String url) throws InterruptedException {
        Thread.sleep(1000);
        return url;
    }
}
