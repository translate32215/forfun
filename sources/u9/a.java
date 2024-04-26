package u9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ElasticTabIndicatorInterpolator */
public class a extends com.google.android.material.tabs.a {
    public static float c(float f10) {
        double d10 = (double) f10;
        Double.isNaN(d10);
        return (float) (1.0d - Math.cos((d10 * 3.141592653589793d) / 2.0d));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float f11;
        float f12;
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a10.left < a11.left) {
            f12 = c(f10);
            double d10 = (double) f10;
            Double.isNaN(d10);
            Double.isNaN(d10);
            Double.isNaN(d10);
            f11 = (float) Math.sin((d10 * 3.141592653589793d) / 2.0d);
        } else {
            double d11 = (double) f10;
            Double.isNaN(d11);
            Double.isNaN(d11);
            Double.isNaN(d11);
            f12 = (float) Math.sin((d11 * 3.141592653589793d) / 2.0d);
            f11 = c(f10);
        }
        drawable.setBounds(u8.a.c((int) a10.left, (int) a11.left, f12), drawable.getBounds().top, u8.a.c((int) a10.right, (int) a11.right, f11), drawable.getBounds().bottom);
    }
}
