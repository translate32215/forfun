package e8;

import com.google.android.gms.internal.ads.a7;
import com.google.android.gms.internal.ads.x6;
import com.google.android.gms.internal.ads.z6;
import d7.l;
import f7.d0;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x8 implements yg0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17444a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final d0 f17445b;

    /* renamed from: c  reason: collision with root package name */
    public final a7 f17446c;

    /* renamed from: d  reason: collision with root package name */
    public final z6 f17447d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<x6> f17448e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<w8> f17449f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f17450g = false;

    public x8(String str, d0 d0Var) {
        this.f17447d = new z6(str, d0Var);
        this.f17445b = d0Var;
        this.f17446c = new a7();
    }

    public final void a(boolean z10) {
        long b10 = l.B.f13193j.b();
        if (z10) {
            if (b10 - this.f17445b.l() > ((Long) ti0.f16763j.f16769f.a(t.f16675w0)).longValue()) {
                this.f17447d.f8674d = -1;
            } else {
                this.f17447d.f8674d = this.f17445b.i();
            }
            this.f17450g = true;
            return;
        }
        this.f17445b.g(b10);
        this.f17445b.e(this.f17447d.f8674d);
    }

    public final void b(x6 x6Var) {
        synchronized (this.f17444a) {
            this.f17448e.add(x6Var);
        }
    }
}
