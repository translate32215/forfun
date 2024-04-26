package v8;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.startapp.startappsdk.R;

/* compiled from: ViewUtilsLollipop */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f26631a = {16843848};

    public static void a(View view, float f10) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969735}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
