package k8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class x5 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile x5 f20541b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile x5 f20542c;

    /* renamed from: d  reason: collision with root package name */
    public static final x5 f20543d = new x5(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<w5, j6<?, ?>> f20544a;

    public x5() {
        this.f20544a = new HashMap();
    }

    public static x5 a() {
        x5 x5Var = f20541b;
        if (x5Var == null) {
            synchronized (x5.class) {
                x5Var = f20541b;
                if (x5Var == null) {
                    x5Var = f20543d;
                    f20541b = x5Var;
                }
            }
        }
        return x5Var;
    }

    public x5(boolean z10) {
        this.f20544a = Collections.emptyMap();
    }
}
