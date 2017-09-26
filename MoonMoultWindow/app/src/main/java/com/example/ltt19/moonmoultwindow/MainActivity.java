package com.example.ltt19.moonmoultwindow;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.example.ltt19.moonmoultwindow.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MultWindow";
//    private Button bt_snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        activity_main = (RelativeLayout) this.findViewById(R.id.);
//        bt_snackbar = (Button) this.findViewById(R.id.bt_snackbar);
//        bt_snackbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                  showSnackbar();
//            }
//        });

        Log.d(TAG,"onCreate");
    }

    private void showSnackbar() {
        Snackbar.make(activity_main,"标题",Snackbar.LENGTH_LONG)
                .setAction("点击事件", new View.OnClickListener() {
                    @OverridMainActivitye
                    public void onClick(View v) {
                        Toast.makeText(
                                .this,
                                "Toast",
                                Toast.LENGTH_SHORT).show();

                    }
                }).setDuration(Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

}
