package e8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import l0.e;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class sq {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f16508a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16509b;

    /* renamed from: c  reason: collision with root package name */
    public final c9 f16510c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16511d;

    /* renamed from: e  reason: collision with root package name */
    public final a30 f16512e;

    public sq(Executor executor, c9 c9Var, a30 a30) {
        boolean z10;
        String str = (String) p0.f15859b.b();
        this.f16509b = executor;
        this.f16510c = c9Var;
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue()) {
            z10 = ((Boolean) ti0.f16763j.f16769f.a(t.f16568e1)).booleanValue();
        } else {
            z10 = ((double) ti0.f16763j.f16771h.nextFloat()) <= ((Double) p0.f15858a.b()).doubleValue();
        }
        this.f16511d = z10;
        this.f16512e = a30;
    }

    public final void a(Map<String, String> map) {
        String a10 = this.f16512e.a(map);
        if (this.f16511d) {
            this.f16509b.execute(new m(this, a10));
        }
        e.H(a10);
    }
}
