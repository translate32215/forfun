package e8;

import d7.l;
import f7.d0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ps implements il {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16017a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16018b = false;

    /* renamed from: c  reason: collision with root package name */
    public final String f16019c;

    /* renamed from: d  reason: collision with root package name */
    public final t20 f16020d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f16021e;

    public ps(String str, t20 t20) {
        this.f16019c = str;
        this.f16020d = t20;
        this.f16021e = l.B.f13190g.f();
    }

    public final void Q(String str) {
        t20 t20 = this.f16020d;
        u20 a10 = a("adapter_init_started");
        a10.f16842a.put("ancn", str);
        t20.a(a10);
    }

    public final u20 a(String str) {
        String str2 = this.f16021e.b() ? "" : this.f16019c;
        u20 c10 = u20.c(str);
        c10.f16842a.put("tms", Long.toString(l.B.f13193j.a(), 10));
        c10.f16842a.put("tid", str2);
        return c10;
    }

    public final void g(String str, String str2) {
        t20 t20 = this.f16020d;
        u20 a10 = a("adapter_init_finished");
        a10.f16842a.put("ancn", str);
        a10.f16842a.put("rqe", str2);
        t20.a(a10);
    }

    public final void g0(String str) {
        t20 t20 = this.f16020d;
        u20 a10 = a("adapter_init_finished");
        a10.f16842a.put("ancn", str);
        t20.a(a10);
    }

    public final synchronized void w() {
        if (!this.f16018b) {
            this.f16020d.a(a("init_finished"));
            this.f16018b = true;
        }
    }

    public final synchronized void y0() {
        if (!this.f16017a) {
            this.f16020d.a(a("init_started"));
            this.f16017a = true;
        }
    }
}
