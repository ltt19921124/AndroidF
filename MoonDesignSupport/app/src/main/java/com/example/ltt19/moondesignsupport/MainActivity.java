package com.example.ltt19.moondesignsupport;

import android.media.MediaCodec;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.ltt19.moondesignsupport.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private Button bt_snackerbar;
    private TextInputLayout t1_username;
    private TextInputLayout t1_password;
    private Matcher matcher;

    private boolean validatePassword(String password) {
        return password.length() > 6;
    }

    private static final String
            EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$]";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private boolean validateUserName(String username) {
        matcher = pattern.matcher(username);
        return matcher.matches();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        t1_username =  (EditText) findViewById(R.id.et_username);
//        t1_password = (EditText) findViewById(R.id.et_password);

//        activity_main = (RelativeLayout) this.findViewById(R.id.activity_main);
//        bt_snackerbar = (Button) this.findViewById(R.id.bt_snackbar);
//        bt_snackerbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showSnackBar();
//            }
//        });
        bt_snackerbar = (Button) findViewById(R.id.bt_login);
        bt_snackerbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String username = t1_username.getEditText().getText().toString();
                    String password = t1_password.getEditText().getText().toString();
                    if (!validateUserName(username)) {
                        t1_username.setErrorEnabled(true);
                        t1_username.setError("请输入正确的邮箱地址");
                    } else if (!validatePassword(password)) {
                        t1_password.setErrorEnabled(true);
                        t1_password.setError("密码数字过少");
                    } else {
                        t1_username.setErrorEnabled(false);
                        t1_password.setErrorEnabled(false);
                        Toast.makeText(getApplicationContext(),"登录成功",Toast.LENGTH_SHORT).show();
                    }

            }
        });
    }

//    private void showSnackBar() {
//        Snackbar.make(activity_main,"标题",Snackbar.LENGTH_LONG)
//                .setAction("点击事件", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(MainActivity.this,
//                                "Toast",
//                                Toast.LENGTH_SHORT).show();
//                    }
//                }).setDuration(Snackbar.LENGTH_LONG).show();
//    }



}
