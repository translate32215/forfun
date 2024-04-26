package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.tm;
import d7.d;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ad implements ta0<WeakReference<Context>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13676a;

    /* renamed from: b  reason: collision with root package name */
    public final c8 f13677b;

    public ad(c8 c8Var, int i10) {
        this.f13676a = i10;
        if (i10 == 1) {
            this.f13677b = c8Var;
        } else if (i10 != 2) {
            this.f13677b = c8Var;
        } else {
            this.f13677b = c8Var;
        }
    }

    public static f9 a(c8 c8Var) {
        f9 f9Var = c8Var.f6072a;
        jc0.b(f9Var, "Cannot return null from a non-@Nullable @Provides method");
        return f9Var;
    }

    public final Object get() {
        switch (this.f13676a) {
            case 0:
                WeakReference<Context> weakReference = this.f13677b.f6074c;
                jc0.b(weakReference, "Cannot return null from a non-@Nullable @Provides method");
                return weakReference;
            case 1:
                c8 c8Var = this.f13677b;
                return new tm(new d(c8Var.f6073b, c8Var.f6072a));
            default:
                return a(this.f13677b);
        }
    }
}
