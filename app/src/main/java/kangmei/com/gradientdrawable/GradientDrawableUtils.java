package kangmei.com.gradientdrawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/**
 * Created by huangdiudiu on 2018/6/20.
 */

public class GradientDrawableUtils {
    public static void Shape(View v,int topLeftRadius,int topRightRadius ,int bottomRightRadius,int bottomLeftRadius,int Strokewidth,int StrokeColor,int solidColor){
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadii(new float[]{topLeftRadius,topLeftRadius,topRightRadius,topRightRadius,bottomRightRadius,bottomRightRadius,bottomLeftRadius,bottomLeftRadius});
       /* drawable.setCornerRadius(10);*/
        drawable.setStroke(Strokewidth, StrokeColor);
        drawable.setColor(solidColor);
        v.setBackgroundDrawable(drawable);
    }
    public static void Shape(View v,int Radius,int Strokewidth,int StrokeColor,int solidColor){
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadius(Radius);
       /* drawable.setCornerRadius(10);*/
        drawable.setStroke(Strokewidth, StrokeColor);
        drawable.setColor(solidColor);
        v.setBackgroundDrawable(drawable);
    }
}
