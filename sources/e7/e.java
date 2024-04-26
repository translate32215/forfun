package e7;

import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.f;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.k;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.v7;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.zh;
import com.startapp.b4;
import d7.l;
import e8.b0;
import e8.bi;
import e8.br;
import e8.dc;
import e8.fn;
import e8.gl;
import e8.h4;
import e8.jn;
import e8.oq;
import e8.ov;
import e8.p9;
import e8.pi;
import e8.qz;
import e8.sr;
import e8.t;
import e8.ti0;
import e8.uq;
import e8.v20;
import e8.wp;
import e8.y8;
import e8.yq;
import e8.za;
import e8.zh0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r7.d;
import s8.j;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13636a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13637b;

    public e(a aVar) {
        this.f13637b = aVar;
    }

    public final void run() {
        we weVar = we.INVALID_AD_UNIT_ID;
        switch (this.f13636a) {
            case 0:
                ((a) this.f13637b).A6();
                return;
            case 1:
                int i10 = d.f24687h;
                if (((j) this.f13637b).a(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 3:
                Process.setThreadPriority(0);
                ((Runnable) this.f13637b).run();
                return;
            case 4:
                Object obj = this.f13637b;
                if (((c) obj).f6071b != null) {
                    try {
                        ((c) obj).f6071b.F2(1);
                        return;
                    } catch (RemoteException e10) {
                        l0.e.D("Could not notify onRewardedVideoAdFailedToLoad event.", e10);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                f fVar = (f) this.f13637b;
                fVar.getClass();
                while (true) {
                    try {
                        k take = fVar.f6337a.take();
                        b0 c10 = take.c();
                        if (!TextUtils.isEmpty(c10.f13860a)) {
                            fVar.b(fVar.a(fVar.f6338b, take.d()), c10);
                        }
                    } catch (InterruptedException e11) {
                        l0.e.D("CsiReporter:reporter interrupted", e11);
                        return;
                    }
                }
            case 6:
                t1 t1Var = (t1) this.f13637b;
                if (t1Var.f8173a != null) {
                    t1Var.f8173a.p();
                    Binder.flushPendingCommands();
                    return;
                }
                return;
            case 7:
                ((h4) this.f13637b).destroy();
                return;
            case b4.f10106f:
                int i11 = i7.f6920z;
                ((i7) this.f13637b).h("surfaceCreated", new String[0]);
                return;
            case 9:
                i7 i7Var = (i7) ((f7) this.f13637b);
                if (i7Var.f6927g) {
                    if (i7Var.f6936x.getParent() != null) {
                        i7Var.f6922b.removeView(i7Var.f6936x);
                    }
                }
                if (i7Var.f6935w != null) {
                    long a10 = l.B.f13193j.a();
                    if (i7Var.f6926f.getBitmap(i7Var.f6935w) != null) {
                        i7Var.f6937y = true;
                    }
                    long a11 = l.B.f13193j.a() - a10;
                    if (l0.e.O()) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Spinner frame grab took ");
                        sb2.append(a11);
                        sb2.append("ms");
                        l0.e.H(sb2.toString());
                    }
                    if (a11 > i7Var.f6925e) {
                        l0.e.K("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        i7Var.f6930r = false;
                        i7Var.f6935w = null;
                        k kVar = i7Var.f6923c;
                        if (kVar != null) {
                            kVar.b("spinner_jank", Long.toString(a11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                l.B.f13209z.f13912a.remove((za) this.f13637b);
                return;
            case 11:
                s7 s7Var = (s7) this.f13637b;
                s7Var.f8089a.A();
                a K = s7Var.f8089a.K();
                if (K != null) {
                    K.f5635t.removeView(K.f5629f);
                    K.w6(true);
                    return;
                }
                return;
            case 12:
                ((dc) this.f13637b).f14246a.destroy();
                return;
            case 13:
                e.super.destroy();
                return;
            case 14:
                Runnable runnable = (Runnable) ((AtomicReference) this.f13637b).getAndSet((Object) null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((zh) this.f13637b).n(new br(we.NO_FILL));
                return;
            case 16:
                bi biVar = (bi) this.f13637b;
                synchronized (biVar) {
                    if (!biVar.f14018e.isDone()) {
                        biVar.f14018e.i(Boolean.TRUE);
                        return;
                    }
                    return;
                }
            case 17:
                fn fnVar = (fn) this.f13637b;
                fnVar.f14654j.destroy();
                jn jnVar = fnVar.f14653i;
                synchronized (jnVar) {
                    t7 t7Var = jnVar.f15164i;
                    if (t7Var != null) {
                        t7Var.destroy();
                        jnVar.f15164i = null;
                    }
                    t7 t7Var2 = jnVar.f15165j;
                    if (t7Var2 != null) {
                        t7Var2.destroy();
                        jnVar.f15165j = null;
                    }
                    jnVar.f15166k = null;
                    jnVar.f15173r.clear();
                    jnVar.f15174s.clear();
                    jnVar.f15157b = null;
                    jnVar.f15158c = null;
                    jnVar.f15159d = null;
                    jnVar.f15160e = null;
                    jnVar.f15163h = null;
                    jnVar.f15167l = null;
                    jnVar.f15168m = null;
                    jnVar.f15170o = null;
                    jnVar.f15171p = null;
                    jnVar.f15172q = null;
                }
                return;
            case 18:
                sa saVar = (sa) this.f13637b;
                saVar.getClass();
                try {
                    saVar.destroy();
                    return;
                } catch (RemoteException e12) {
                    l0.e.F("#007 Could not call remote method.", e12);
                    return;
                }
            case 19:
                p9 p9Var = (p9) this.f13637b;
                ((oq) p9Var.f15881c).f15830a.a((Map) p9Var.f15880b);
                return;
            case 20:
                yq yqVar = (yq) this.f13637b;
                uq uqVar = yqVar.f17659k;
                synchronized (uqVar) {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16574f1)).booleanValue()) {
                        if (!((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
                            if (!uqVar.f16984d) {
                                Map<String, String> b10 = uqVar.b();
                                ((HashMap) b10).put("action", "init_finished");
                                uqVar.f16982b.add(b10);
                                for (Map<String, String> a12 : uqVar.f16982b) {
                                    uqVar.f16986f.a(a12);
                                }
                                uqVar.f16984d = true;
                            }
                        }
                    }
                }
                yqVar.f17662n.I0(gl.f14790a);
                return;
            case 21:
                ((sr) this.f13637b).a();
                return;
            case 22:
                ((wp) this.f13637b).a();
                return;
            case 23:
                ((pi) ((kd) this.f13637b).f7237d.f7136d).j0(l0.e.p(weVar, (String) null, (zh0) null));
                return;
            case 24:
                ud udVar = (ud) this.f13637b;
                udVar.getClass();
                y8 y8Var = ti0.f16763j.f16764a;
                if (y8.l()) {
                    udVar.t6(5);
                    return;
                } else {
                    udVar.f8234a.e().execute(new f7.j(udVar));
                    return;
                }
            case 25:
                wd wdVar = (wd) this.f13637b;
                wdVar.f8444a.e().execute(new qz(wdVar));
                return;
            case 26:
                ((ov) this.f13637b).v();
                return;
            case 27:
                ((ke) this.f13637b).f7242d.j0(l0.e.p(weVar, (String) null, (zh0) null));
                return;
            case 28:
                ((ke) ((j8) this.f13637b).f7136d).f7242d.v();
                return;
            default:
                v20 v20 = (v20) this.f13637b;
                while (!v20.f17017b.isEmpty()) {
                    v20.f17016a.a(v20.f17017b.remove());
                }
                return;
        }
    }

    public e(f fVar) {
        this.f13637b = fVar;
    }

    public e(s7 s7Var) {
        this.f13637b = s7Var;
    }

    public e(j8 j8Var) {
        this.f13637b = j8Var;
    }

    public e(sa saVar) {
        this.f13637b = saVar;
    }

    public e(kd kdVar) {
        this.f13637b = kdVar;
    }

    public e(ud udVar) {
        this.f13637b = udVar;
    }

    public e(wd wdVar) {
        this.f13637b = wdVar;
    }

    public e(ke keVar) {
        this.f13637b = keVar;
    }

    public e(zh zhVar) {
        this.f13637b = zhVar;
    }

    public e(h4 h4Var) {
        this.f13637b = h4Var;
    }

    public e(p9 p9Var) {
        this.f13637b = p9Var;
    }

    public e(bi biVar) {
        this.f13637b = biVar;
    }

    public e(fn fnVar) {
        this.f13637b = fnVar;
    }

    public e(wp wpVar) {
        this.f13637b = wpVar;
    }

    public e(yq yqVar) {
        this.f13637b = yqVar;
    }

    public e(sr srVar) {
        this.f13637b = srVar;
    }

    public e(ov ovVar) {
        this.f13637b = ovVar;
    }

    public e(v20 v20) {
        this.f13637b = v20;
    }

    public e(Runnable runnable) {
        this.f13637b = runnable;
    }

    public e(AtomicReference atomicReference) {
        this.f13637b = atomicReference;
    }

    public e(j jVar) {
        this.f13637b = jVar;
    }

    public e(c cVar) {
        this.f13637b = cVar;
    }

    public e(t1 t1Var) {
        this.f13637b = t1Var;
    }

    public e(f7 f7Var) {
        this.f13637b = f7Var;
    }

    public e(i7 i7Var) {
        this.f13637b = i7Var;
    }

    public e(v7 v7Var) {
        this.f13637b = v7Var;
    }

    public e(za zaVar) {
        this.f13637b = zaVar;
    }

    public e(dc dcVar) {
        this.f13637b = dcVar;
    }
}
