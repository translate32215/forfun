package b2;

import android.os.Build;

/* compiled from: TransitionUtils */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3438a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3439b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3440c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f3438a = i10 >= 19;
        f3439b = i10 >= 18;
        if (i10 < 28) {
            z10 = false;
        }
        f3440c = z10;
    }
}
