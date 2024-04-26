package androidx.lifecycle;

import de.g0;
import de.k1;
import de.u;
import de.w0;
import de.y;
import de.z0;
import e.j;
import ie.n;
import java.util.concurrent.CancellationException;
import kd.o;
import md.d;
import md.f;
import od.c;
import od.e;
import td.p;
import ud.l;

/* compiled from: CoroutineLiveData.kt */
public final class h<T> extends a0<T> {

    /* renamed from: m  reason: collision with root package name */
    public e<T> f2658m;

    /* compiled from: CoroutineLiveData.kt */
    public static final class a extends l implements td.a<o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h<T> f2659b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h<T> hVar) {
            super(0);
            this.f2659b = hVar;
        }

        public Object d() {
            this.f2659b.f2658m = null;
            return o.f20627a;
        }
    }

    @e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {236}, m = "clearSource$lifecycle_livedata_ktx_release")
    /* compiled from: CoroutineLiveData.kt */
    public static final class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f2660d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ h<T> f2661e;

        /* renamed from: f  reason: collision with root package name */
        public int f2662f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h<T> hVar, d<? super b> dVar) {
            super(dVar);
            this.f2661e = hVar;
        }

        public final Object l(Object obj) {
            this.f2660d = obj;
            this.f2662f |= Integer.MIN_VALUE;
            this.f2661e.o(this);
            return o.f20627a;
        }
    }

    public h(f fVar, long j10, p<? super y<T>, ? super d<? super o>, ? extends Object> pVar) {
        int i10 = w0.f13338l;
        w0.b bVar = w0.b.f13339a;
        k1 k1Var = new k1((w0) fVar.get(bVar));
        u uVar = g0.f13286a;
        f plus = n.f19394a.i0().plus(fVar).plus(k1Var);
        this.f2658m = new e(this, pVar, j10, new ie.c(plus.get(bVar) == null ? plus.plus(new z0((w0) null)) : plus), new a(this));
    }

    public void h() {
        super.h();
        e<T> eVar = this.f2658m;
        if (eVar != null) {
            w0 w0Var = eVar.f2636g;
            if (w0Var != null) {
                w0Var.V((CancellationException) null);
            }
            eVar.f2636g = null;
            if (eVar.f2635f == null) {
                eVar.f2635f = j.b(eVar.f2633d, (f) null, 0, new d(eVar, (d<? super d>) null), 3, (Object) null);
            }
        }
    }

    public void i() {
        super.i();
        e<T> eVar = this.f2658m;
        if (eVar == null) {
            return;
        }
        if (eVar.f2636g == null) {
            y yVar = eVar.f2633d;
            u uVar = g0.f13286a;
            eVar.f2636g = j.b(yVar, n.f19394a.i0(), 0, new c(eVar, (d<? super c>) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(md.d<? super kd.o> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.h.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.h$b r0 = (androidx.lifecycle.h.b) r0
            int r1 = r0.f2662f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2662f = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.h$b r0 = new androidx.lifecycle.h$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2660d
            int r0 = r0.f2662f
            if (r0 == 0) goto L_0x002e
            r1 = 1
            if (r0 != r1) goto L_0x0026
            r0 = 0
            l0.e.l(r5)
            goto L_0x0032
        L_0x0026:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002e:
            l0.e.l(r5)
            r0 = r4
        L_0x0032:
            r0.getClass()
            kd.o r5 = kd.o.f20627a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.o(md.d):java.lang.Object");
    }
}
