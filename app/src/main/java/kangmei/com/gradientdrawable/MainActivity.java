package kangmei.com.gradientdrawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout ly;
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ly=findViewById(R.id.ly);
        test=findViewById(R.id.text);
        GradientDrawableUtils.Shape(test,6,10,20,2,1,Color.parseColor("#ff00ff"),Color.parseColor("#999999"));
        GradientDrawableUtils.Shape(ly,10,1,Color.RED,Color.BLUE);
    }
}
