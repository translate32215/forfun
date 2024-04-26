package androidx.lifecycle;

import ae.b;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import kd.d;
import td.a;

/* compiled from: ViewModelLazy.kt */
public final class r0<VM extends q0> implements d<VM> {

    /* renamed from: a  reason: collision with root package name */
    public final b<VM> f2710a;

    /* renamed from: b  reason: collision with root package name */
    public final a<u0> f2711b;

    /* renamed from: c  reason: collision with root package name */
    public final a<s0.b> f2712c;

    /* renamed from: d  reason: collision with root package name */
    public final a<k1.a> f2713d;

    /* renamed from: e  reason: collision with root package name */
    public VM f2714e;

    public r0(b<VM> bVar, a<? extends u0> aVar, a<? extends s0.b> aVar2, a<? extends k1.a> aVar3) {
        this.f2710a = bVar;
        this.f2711b = aVar;
        this.f2712c = aVar2;
        this.f2713d = aVar3;
    }

    public Object getValue() {
        VM vm = this.f2714e;
        if (vm != null) {
            return vm;
        }
        VM a10 = new s0(this.f2711b.d(), this.f2712c.d(), this.f2713d.d()).a(sd.a.a(this.f2710a));
        this.f2714e = a10;
        return a10;
    }
}
