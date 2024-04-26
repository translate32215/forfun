package e8;

import com.google.android.gms.internal.ads.b9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gi implements ta0<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14785a;

    /* renamed from: b  reason: collision with root package name */
    public final b9 f14786b;

    public gi(b9 b9Var, int i10) {
        this.f14785a = i10;
        if (i10 != 1) {
            this.f14786b = b9Var;
        } else {
            this.f14786b = b9Var;
        }
    }

    public static gi a(b9 b9Var) {
        return new gi(b9Var, 0);
    }

    public static gi b(b9 b9Var) {
        return new gi(b9Var, 1);
    }

    public final Object get() {
        switch (this.f14785a) {
            case 0:
                return this.f14786b.f6000d;
            default:
                return this.f14786b.f6001e;
        }
    }
}
