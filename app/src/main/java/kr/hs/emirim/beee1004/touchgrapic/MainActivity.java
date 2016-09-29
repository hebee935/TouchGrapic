package kr.hs.emirim.beee1004.touchgrapic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    DrawShape ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds = new DrawShape(getApplicationContext());
        LinearLayout linear = (LinearLayout)findViewById(R.id.Linear_view);
        linear.addView(ds);
    }
    public void drawShape (View v){
        switch (v.getId()){
            case R.id.but_line:
                break;
            case R.id.but_rect:
                break;
            case R.id.but_circle:
                break;
        }
    }
    class DrawShape extends View{
        DrawShape(Context context){super(context);}

        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            float cx = getWidth()/2.0f;
            float cy = getHeight()/2.0f;
            Paint paint = new Paint();
            paint.setStrokeWidth(7);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(100,100,310,160,paint);
        }
    }
}
