package androidx.leanback.transition;

import android.content.Context;
import android.os.Build;
import android.view.animation.AnimationUtils;
import com.startapp.startappsdk.R;

/* compiled from: LeanbackTransitionHelper */
public class a {
    public static Object a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 21) {
            return b.c(context, R.transition.lb_title_in);
        }
        SlideKitkat slideKitkat = new SlideKitkat();
        slideKitkat.b(48);
        slideKitkat.setInterpolator(AnimationUtils.loadInterpolator(context, 17432582));
        slideKitkat.addTarget(R.id.browse_title_group);
        return slideKitkat;
    }

    public static Object b(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 21) {
            return b.c(context, R.transition.lb_title_out);
        }
        SlideKitkat slideKitkat = new SlideKitkat();
        slideKitkat.b(48);
        slideKitkat.setInterpolator(AnimationUtils.loadInterpolator(context, R.anim.lb_decelerator_4));
        slideKitkat.addTarget(R.id.browse_title_group);
        return slideKitkat;
    }
}
