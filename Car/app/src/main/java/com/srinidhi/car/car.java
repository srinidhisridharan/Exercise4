package com.srinidhi.car;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class car extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        Integer i;
        final LinearLayout ll=(LinearLayout)findViewById(R.id.car);

                    ll.removeAllViews();
                    Paint paint=new Paint();
                    Paint paint1=new Paint();
                    Paint paint2=new Paint();
                    paint.setColor(Color.parseColor("#005C5E"));
                    paint1.setColor(Color.parseColor("#0D5C8C"));
                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);

                    Bitmap bg=Bitmap.createBitmap(800,800,Bitmap.Config.ARGB_8888);
                    Canvas canvas= new Canvas(bg);
                    canvas.drawCircle(25,550,50,paint2);
                    canvas.drawCircle( 400, 550, 50, paint2);
                    canvas.drawRect( 10, 400, 450, 500, paint);
                    paint1.setStyle(Paint.Style.STROKE);
                    canvas.drawRect( 50, 300, 250, 400, paint1);
                    canvas.drawLine( 200, 300, 200, 400, paint1);

                    ll.setBackgroundDrawable(new BitmapDrawable(bg));

                }




    }

