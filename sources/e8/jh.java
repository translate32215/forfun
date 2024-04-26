package e8;

import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.qe;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jh implements ta0<qe> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15147a;

    /* renamed from: b  reason: collision with root package name */
    public final j8 f15148b;

    public jh(j8 j8Var, int i10) {
        this.f15147a = i10;
        if (i10 != 1) {
            this.f15148b = j8Var;
        } else {
            this.f15148b = j8Var;
        }
    }

    public static jh a(j8 j8Var) {
        return new jh(j8Var, 0);
    }

    public static qe b(j8 j8Var) {
        qe qeVar = (qe) j8Var.f7135c;
        jc0.b(qeVar, "Cannot return null from a non-@Nullable @Provides method");
        return qeVar;
    }

    public static jh c(j8 j8Var) {
        return new jh(j8Var, 1);
    }

    public static String d(j8 j8Var) {
        String str = (String) j8Var.f7136d;
        jc0.b(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    public final /* synthetic */ Object get() {
        switch (this.f15147a) {
            case 0:
                return b(this.f15148b);
            default:
                return d(this.f15148b);
        }
    }
}
