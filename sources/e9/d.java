package e9;

import android.os.Build;

/* compiled from: CircularRevealHelper */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f17805a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f17805a = 2;
        } else if (i10 >= 18) {
            f17805a = 1;
        } else {
            f17805a = 0;
        }
    }
}
