package u8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.a;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import q.c;
import s.i;

/* compiled from: MotionSpec */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final i<String, h> f26161a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final i<String, PropertyValuesHolder[]> f26162b = new i<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            StringBuilder a10 = a.a("Can't load animation resource ID #0x");
            a10.append(Integer.toHexString(i10));
            Log.w("MotionSpec", a10.toString(), e10);
            return null;
        }
    }

    public static g c(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = list.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f26162b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f26149b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f26150c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f26151d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f26166d = objectAnimator.getRepeatCount();
                hVar.f26167e = objectAnimator.getRepeatMode();
                gVar.f26161a.put(propertyName, hVar);
                i10++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public h d(String str) {
        if (this.f26161a.getOrDefault(str, null) != null) {
            return this.f26161a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f26161a.equals(((g) obj).f26161a);
    }

    public int hashCode() {
        return this.f26161a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = c.a(10);
        a10.append(g.class.getName());
        a10.append('{');
        a10.append(Integer.toHexString(System.identityHashCode(this)));
        a10.append(" timings: ");
        a10.append(this.f26161a);
        a10.append("}\n");
        return a10.toString();
    }
}
