package com.example.bajian.deletableedittext;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private DeletableEditText usernameDeletableEditText;
    private DeletableEditText passwordDeletableEditText;
    private Button btn_logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameDeletableEditText=(DeletableEditText)findViewById(R.id.det_test);
        passwordDeletableEditText=(DeletableEditText)findViewById(R.id.user_password_input);
        btn_logButton=(Button)findViewById(R.id.btn_login);
        btn_logButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String string1 = usernameDeletableEditText.getText().toString();
                String string2 = passwordDeletableEditText.getText().toString();
                if (TextUtils.isEmpty(string1)) {
                    usernameDeletableEditText.startShakeAnimation();//设置动画
                } else if (TextUtils.isEmpty(string2)) {
                    passwordDeletableEditText.startShakeAnimation();//设置动画
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
