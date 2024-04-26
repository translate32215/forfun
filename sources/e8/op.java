package e8;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class op {

    /* renamed from: a  reason: collision with root package name */
    public final ki f15813a;

    /* renamed from: b  reason: collision with root package name */
    public final dj f15814b;

    /* renamed from: c  reason: collision with root package name */
    public final oj f15815c;

    /* renamed from: d  reason: collision with root package name */
    public final uj f15816d;

    /* renamed from: e  reason: collision with root package name */
    public final vk f15817e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f15818f;

    /* renamed from: g  reason: collision with root package name */
    public final l9 f15819g;

    /* renamed from: h  reason: collision with root package name */
    public final p8 f15820h;

    /* renamed from: i  reason: collision with root package name */
    public final a f15821i;

    /* renamed from: j  reason: collision with root package name */
    public final aj f15822j;

    /* renamed from: k  reason: collision with root package name */
    public final h8 f15823k;

    /* renamed from: l  reason: collision with root package name */
    public final tm f15824l;

    /* renamed from: m  reason: collision with root package name */
    public final mk f15825m;

    /* renamed from: n  reason: collision with root package name */
    public final dt f15826n;

    /* renamed from: o  reason: collision with root package name */
    public final e30 f15827o;

    /* renamed from: p  reason: collision with root package name */
    public final oq f15828p;

    /* renamed from: q  reason: collision with root package name */
    public final t20 f15829q;

    public op(ki kiVar, dj djVar, oj ojVar, uj ujVar, vk vkVar, Executor executor, l9 l9Var, p8 p8Var, a aVar, aj ajVar, h8 h8Var, tm tmVar, mk mkVar, dt dtVar, e30 e30, oq oqVar, t20 t20) {
        this.f15813a = kiVar;
        this.f15814b = djVar;
        this.f15815c = ojVar;
        this.f15816d = ujVar;
        this.f15817e = vkVar;
        this.f15818f = executor;
        this.f15819g = l9Var;
        this.f15820h = p8Var;
        this.f15821i = aVar;
        this.f15822j = ajVar;
        this.f15823k = h8Var;
        this.f15824l = tmVar;
        this.f15825m = mkVar;
        this.f15826n = dtVar;
        this.f15827o = e30;
        this.f15828p = oqVar;
        this.f15829q = t20;
    }

    public static p50<?> a(t7 t7Var, String str, String str2) {
        d7 d7Var = new d7();
        ((s7) t7Var.H()).f8095g = new e5(d7Var, 1);
        t7Var.m0(str, str2, (String) null);
        return d7Var;
    }

    public final void b(t7 t7Var, boolean z10) {
        c40 c40;
        t7 t7Var2 = t7Var;
        uc H = t7Var.H();
        ((s7) H).v(new np(this), this.f15815c, this.f15816d, new pp(this), new fp(this), z10, (h3) null, this.f15821i, new g2(this), this.f15823k, this.f15826n, this.f15827o, this.f15828p, this.f15829q);
        t7Var2.setOnTouchListener(new rp(this));
        t7Var2.setOnClickListener(new qp(this));
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16634p1)).booleanValue() && (c40 = this.f15824l.f8207b) != null) {
            c40.a(t7Var.getView());
        }
        this.f15819g.J0(t7Var2, this.f15818f);
        this.f15819g.J0(new zo(t7Var2, 1), this.f15818f);
        this.f15819g.K0(t7Var.getView());
        t7Var2.r("/trackActiveViewUnit", new sp(this, t7Var2));
        p8 p8Var = this.f15820h;
        p8Var.getClass();
        p8Var.f7836r = new WeakReference<>(t7Var2);
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16639q0)).booleanValue()) {
            aj ajVar = this.f15822j;
            ri riVar = new ri(t7Var2);
            Executor executor = this.f15818f;
            cj cjVar = new cj(riVar);
            synchronized (ajVar) {
                try {
                    ajVar.J0(cjVar, executor);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
