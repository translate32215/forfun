package e8;

import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.f9;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.n8;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.xe;
import com.startapp.b4;
import d7.l;
import f7.h0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import t1.c;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bd implements ta0<Set<ul<il>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13933a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<ps> f13934b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Executor> f13935c;

    public bd(ab0 ab0, ab0 ab02, int i10) {
        this.f13933a = i10;
        switch (i10) {
            case 1:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 2:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 3:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 4:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 5:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 6:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 7:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case b4.f10106f:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 9:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 10:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 11:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 12:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 13:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 14:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 15:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 16:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 17:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 18:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 19:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 20:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 21:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 22:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 23:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 24:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 25:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 26:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 27:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            case 28:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
            default:
                this.f13934b = ab0;
                this.f13935c = ab02;
                return;
        }
    }

    public static bd a(ab0<Context> ab0, ab0<tg0> ab02) {
        return new bd(ab0, ab02, 1);
    }

    public static bd b(ab0<jb> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 13);
    }

    public static bd c(ab0<nv> ab0, ab0<Map<Cif, hq>> ab02) {
        return new bd(ab0, ab02, 14);
    }

    public static bd d(ab0<n20> ab0, ab0<Context> ab02) {
        return new bd(ab0, ab02, 16);
    }

    public static bd e(ab0<Context> ab0, ab0<p6> ab02) {
        return new bd(ab0, ab02, 17);
    }

    public static bd f(ab0<ws> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 18);
    }

    public static bd g(ab0<us> ab0, ab0<o50> ab02) {
        return new bd(ab0, ab02, 19);
    }

    public static bd h(ab0<Context> ab0, ab0<o50> ab02) {
        return new bd(ab0, ab02, 24);
    }

    public static bd i(ab0<o50> ab0, ab0<Bundle> ab02) {
        return new bd(ab0, ab02, 25);
    }

    public static bd j(ab0<zj> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 3);
    }

    public static <T> bd k(ab0<Executor> ab0, ab0<Set<dy<? extends by<T>>>> ab02) {
        return new bd(ab0, ab02, 26);
    }

    public static bd l(ab0<Context> ab0, ab0<x8> ab02) {
        return new bd(ab0, ab02, 27);
    }

    public static bd m(ab0<yl> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 4);
    }

    public static bd n(ab0<n8> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 5);
    }

    public static bd o(ab0<f9> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 6);
    }

    public static bd p(ab0<f9> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 7);
    }

    public static bd q(ab0<f9> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 8);
    }

    public static bd r(ab0<jb> ab0, ab0<Executor> ab02) {
        return new bd(ab0, ab02, 12);
    }

    public final Object get() {
        Set set;
        switch (this.f13933a) {
            case 0:
                ps psVar = this.f13934b.get();
                Executor executor = this.f13935c.get();
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16574f1)).booleanValue()) {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
                        set = Collections.singleton(new ul(psVar, executor));
                        jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
                        return set;
                    }
                }
                set = Collections.emptySet();
                jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
                return set;
            case 1:
                return new o8((Context) this.f13934b.get(), (tg0) this.f13935c.get());
            case 2:
                return new d9((ScheduledExecutorService) this.f13934b.get(), (b) this.f13935c.get());
            case 3:
                return new ul((zj) this.f13934b.get(), this.f13935c.get());
            case 4:
                return new ul((yl) this.f13934b.get(), this.f13935c.get());
            case 5:
                return new ul((n8) this.f13934b.get(), this.f13935c.get());
            case 6:
                return new ul((f9) this.f13934b.get(), this.f13935c.get());
            case 7:
                return new ul((f9) this.f13934b.get(), this.f13935c.get());
            case b4.f10106f:
                return new ul((f9) this.f13934b.get(), this.f13935c.get());
            case 9:
                p pVar = l.B.f13186c;
                return new tg0(p.K(), (f9) this.f13934b.get(), (String) this.f13935c.get(), new JSONObject(), true);
            case 10:
                return new ul((fd) this.f13934b.get(), this.f13935c.get());
            case 11:
                return new ro((Executor) this.f13934b.get(), (no) this.f13935c.get());
            case 12:
                return new ul((jb) this.f13934b.get(), this.f13935c.get());
            case 13:
                return new ul((jb) this.f13934b.get(), this.f13935c.get());
            case 14:
                return new kb((nv) this.f13934b.get(), (Map) this.f13935c.get());
            case 15:
                return new uq((String) this.f13934b.get(), (tq) this.f13935c.get());
            case 16:
                CookieManager l10 = l.B.f13188e.l((Context) this.f13935c.get());
                c c10 = ((n20) this.f13934b.get()).c(Cif.WEBVIEW_COOKIE);
                return c10.h(new h0(l10), ((k20) c10.f25351c).f15223a).a(1, TimeUnit.SECONDS).d(Exception.class, new vo(gr.f14817a)).e();
            case 17:
                return new tr((Context) this.f13934b.get(), (p6) this.f13935c.get());
            case 18:
                return new ul((ws) this.f13934b.get(), this.f13935c.get());
            case 19:
                return new vs((us) this.f13934b.get(), (o50) this.f13935c.get());
            case 20:
                return new dt((Context) this.f13934b.get(), (o50) this.f13935c.get());
            case 21:
                return new wb((Context) this.f13934b.get(), (pg) this.f13935c.get());
            case 22:
                return new hv((Context) this.f13934b.get(), (rm) this.f13935c.get());
            case 23:
                return new yw((gy) this.f13934b.get(), ((Long) o0.f15724a.b()).longValue(), (b) this.f13935c.get());
            case 24:
                return new zw((Context) this.f13934b.get(), (o50) this.f13935c.get());
            case 25:
                return new zw((o50) this.f13934b.get(), (Bundle) this.f13935c.get());
            case 26:
                return new cy((Executor) this.f13934b.get(), (Set) this.f13935c.get());
            case 27:
                return new xe((Context) this.f13934b.get(), (x8) this.f13935c.get());
            default:
                return new r20((Executor) this.f13934b.get(), (c9) this.f13935c.get());
        }
    }
}
