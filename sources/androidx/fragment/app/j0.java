package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import b2.e;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f1732a = (Build.VERSION.SDK_INT >= 21 ? new k0() : null);

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f1733b;

    static {
        m0 m0Var = null;
        try {
            m0Var = e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f1733b = m0Var;
    }

    public static void a(ArrayList<View> arrayList, int i10) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i10);
            }
        }
    }
}
