package com.example.zehao.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button start; //define start variable
    TextView time; //define time variable
    TextView t1;

    public GridView gv;
    public String[] items = new String[]{"1","2","3","4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create an adapter
        gv = (GridView) this.findViewById(R.id.mygrid);
        CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
        //通过调用setAdapter方法为gripview设置Adapter设置适配器
        gv.setAdapter(gridAdapter);


        start = (Button)findViewById(R.id.ssbutton);// map the variable with the layout button
        time = (TextView)findViewById(R.id.textView);

        t1 = (TextView)findViewById(R.id.t1);
        String s1 = "<font color = 'blue'><b>google pls: </b></font><br>";
        s1 +="<a href = 'http://www.google.ca'>google</a>";
        t1.setText(Html.fromHtml(s1));
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        //create the listener of button
       start.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               new CountDownTimer(10000,1000) {
                   @Override
                   public void onTick(long l) {
                        time.setText("time remining"+l/1000);
                   }

                   @Override
                   public void onFinish() {
                        Toast.makeText(getApplicationContext(),"time is up", Toast.LENGTH_LONG);
                   }
               }.start();
           }
       });
    }
}
