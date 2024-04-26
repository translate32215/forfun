package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.y6;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zc implements ta0<y6> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17712a;

    /* renamed from: b  reason: collision with root package name */
    public final c8 f17713b;

    public zc(c8 c8Var, int i10) {
        this.f17712a = i10;
        if (i10 == 1) {
            this.f17713b = c8Var;
        } else if (i10 == 2) {
            this.f17713b = c8Var;
        } else if (i10 != 3) {
            this.f17713b = c8Var;
        } else {
            this.f17713b = c8Var;
        }
    }

    public static Context a(c8 c8Var) {
        Context context = c8Var.f6073b;
        jc0.b(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public final Object get() {
        switch (this.f17712a) {
            case 0:
                y6 y6Var = l.B.f13190g;
                jc0.b(y6Var, "Cannot return null from a non-@Nullable @Provides method");
                return y6Var;
            case 1:
                return a(this.f17713b);
            case 2:
                String str = ti0.f16763j.f16766c;
                jc0.b(str, "Cannot return null from a non-@Nullable @Provides method");
                return str;
            default:
                c8 c8Var = this.f17713b;
                c8Var.getClass();
                String H = l.B.f13186c.H(c8Var.f6073b, c8Var.f6072a.f14544a);
                jc0.b(H, "Cannot return null from a non-@Nullable @Provides method");
                return H;
        }
    }
}
