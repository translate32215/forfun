package d7;

import android.os.Build;
import androidx.appcompat.widget.m;
import androidx.databinding.a;
import com.google.android.gms.ads.internal.util.n;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.e7;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.h;
import com.google.android.gms.internal.ads.i2;
import com.google.android.gms.internal.ads.o4;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.u7;
import com.google.android.gms.internal.ads.y6;
import d4.f;
import e8.bb;
import e8.q9;
import f7.c;
import f7.d;
import f7.m0;
import f7.n0;
import f7.o0;
import f7.p0;
import f7.q0;
import z3.b;
import z3.i;
import z7.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l {
    public static l B = new l();
    public final q9 A;

    /* renamed from: a  reason: collision with root package name */
    public final b f13184a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13185b;

    /* renamed from: c  reason: collision with root package name */
    public final p f13186c;

    /* renamed from: d  reason: collision with root package name */
    public final u7 f13187d;

    /* renamed from: e  reason: collision with root package name */
    public final m0 f13188e;

    /* renamed from: f  reason: collision with root package name */
    public final pu f13189f;

    /* renamed from: g  reason: collision with root package name */
    public final y6 f13190g;

    /* renamed from: h  reason: collision with root package name */
    public final d f13191h;

    /* renamed from: i  reason: collision with root package name */
    public final gv f13192i;

    /* renamed from: j  reason: collision with root package name */
    public final z7.b f13193j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.b f13194k;

    /* renamed from: l  reason: collision with root package name */
    public final h f13195l;

    /* renamed from: m  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.b f13196m;

    /* renamed from: n  reason: collision with root package name */
    public final g2 f13197n;

    /* renamed from: o  reason: collision with root package name */
    public final e7 f13198o;

    /* renamed from: p  reason: collision with root package name */
    public final i2 f13199p;

    /* renamed from: q  reason: collision with root package name */
    public final d6.l f13200q;

    /* renamed from: r  reason: collision with root package name */
    public final f f13201r;

    /* renamed from: s  reason: collision with root package name */
    public final a f13202s;

    /* renamed from: t  reason: collision with root package name */
    public final q2 f13203t;

    /* renamed from: u  reason: collision with root package name */
    public final m f13204u;

    /* renamed from: v  reason: collision with root package name */
    public final o4 f13205v;

    /* renamed from: w  reason: collision with root package name */
    public final ap f13206w;

    /* renamed from: x  reason: collision with root package name */
    public final p6 f13207x;

    /* renamed from: y  reason: collision with root package name */
    public final n f13208y;

    /* renamed from: z  reason: collision with root package name */
    public final bb f13209z;

    public l() {
        m0 m0Var;
        b bVar = new b(1);
        i iVar = new i(1);
        p pVar = new p();
        u7 u7Var = new u7();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            m0Var = new com.google.android.gms.ads.internal.util.a();
        } else if (i10 >= 26) {
            m0Var = new c();
        } else if (i10 >= 24) {
            m0Var = new q0();
        } else if (i10 >= 21) {
            m0Var = new f7.b();
        } else if (i10 >= 19) {
            m0Var = new o0();
        } else if (i10 >= 18) {
            m0Var = new p0();
        } else {
            m0Var = new n0();
        }
        pu puVar = new pu();
        y6 y6Var = new y6();
        d dVar = new d();
        gv gvVar = new gv();
        e eVar = e.f28726a;
        com.google.android.gms.ads.internal.b bVar2 = new com.google.android.gms.ads.internal.b();
        h hVar = new h();
        com.google.android.gms.ads.internal.util.b bVar3 = new com.google.android.gms.ads.internal.util.b();
        g2 g2Var = new g2();
        e7 e7Var = new e7();
        i2 i2Var = new i2();
        d6.l lVar = new d6.l();
        g2 g2Var2 = g2Var;
        f fVar = new f(1);
        a aVar = new a(2);
        q2 q2Var = new q2(0);
        m mVar = new m(5);
        o4 o4Var = new o4();
        m mVar2 = mVar;
        ap apVar = new ap(4);
        p6 p6Var = new p6();
        n nVar = new n();
        bb bbVar = new bb();
        q9 q9Var = new q9();
        this.f13184a = bVar;
        this.f13185b = iVar;
        this.f13186c = pVar;
        this.f13187d = u7Var;
        this.f13188e = m0Var;
        this.f13189f = puVar;
        this.f13190g = y6Var;
        this.f13191h = dVar;
        this.f13192i = gvVar;
        this.f13193j = eVar;
        this.f13194k = bVar2;
        this.f13195l = hVar;
        this.f13196m = bVar3;
        this.f13197n = g2Var2;
        this.f13198o = e7Var;
        this.f13199p = i2Var;
        this.f13200q = lVar;
        this.f13201r = fVar;
        this.f13202s = aVar;
        this.f13203t = q2Var;
        this.f13204u = mVar2;
        this.f13205v = o4Var;
        this.f13206w = apVar;
        this.f13207x = p6Var;
        this.f13208y = nVar;
        this.f13209z = bbVar;
        this.A = q9Var;
    }

    public static y6 a() {
        return B.f13190g;
    }

    public static z7.b b() {
        return B.f13193j;
    }

    public static e7 c() {
        return B.f13198o;
    }
}
