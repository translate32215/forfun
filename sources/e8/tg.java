package e8;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.cc;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.y6;
import com.startapp.b4;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tg implements ta0<lt<dg>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16749a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<n20> f16750b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<o50> f16751c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<wb> f16752d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<wc> f16753e;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.i9, e8.ab0<com.google.android.gms.internal.ads.wc>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tg(com.google.android.gms.internal.ads.i9 r2, e8.ab0 r3, e8.ab0 r4, e8.ab0 r5) {
        /*
            r1 = this;
            r0 = 12
            r1.f16749a = r0
            r1.<init>()
            r1.f16753e = r2
            r1.f16750b = r3
            r1.f16751c = r4
            r1.f16752d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.tg.<init>(com.google.android.gms.internal.ads.i9, e8.ab0, e8.ab0, e8.ab0):void");
    }

    public static tg a(ab0<d10> ab0, ab0<fb> ab02, ab0<oq> ab03, ab0<t20> ab04) {
        return new tg(ab0, ab02, ab03, ab04, 6);
    }

    public static tg b(ab0<yw<td>> ab0, ab0<w00> ab02, ab0<Context> ab03, ab0<y6> ab04) {
        return new tg(ab0, ab02, ab03, ab04, 9);
    }

    public static tg c(ab0<o50> ab0, ab0<yp> ab02, ab0<w00> ab03, ab0<String> ab04) {
        return new tg(ab0, ab02, ab03, ab04, 10);
    }

    public final Object get() {
        switch (this.f16749a) {
            case 0:
                return new zu(this.f16750b.get(), this.f16751c.get(), (wc) this.f16753e.get(), this.f16752d.get());
            case 1:
                return new x8((Context) this.f16750b.get(), (t7) this.f16751c.get(), (qe) this.f16752d.get(), (f9) this.f16753e.get());
            case 2:
                return new zu(this.f16750b.get(), this.f16751c.get(), (wc) this.f16753e.get(), (cc) this.f16752d.get());
            case 3:
                return new ia((cb) this.f16750b.get(), (cp) this.f16751c.get(), (hf) this.f16752d.get(), (pn) this.f16753e.get());
            case 4:
                return new tq((Executor) this.f16750b.get(), (c9) this.f16751c.get(), (z20) this.f16752d.get(), (a30) this.f16753e.get());
            case 5:
                return new jr((ScheduledExecutorService) this.f16750b.get(), this.f16751c.get(), (pr) this.f16752d.get(), ua0.a(this.f16753e));
            case 6:
                return new oc((d10) this.f16750b.get(), (fb) this.f16751c.get(), (oq) this.f16752d.get(), (t20) this.f16753e.get());
            case 7:
                return new bd((Context) this.f16750b.get(), (rx) this.f16751c.get(), (w00) this.f16752d.get(), (dg) this.f16753e.get());
            case b4.f10106f:
                return new fw((o50) this.f16750b.get(), (Context) this.f16751c.get(), (w00) this.f16752d.get(), (ViewGroup) this.f16753e.get());
            case 9:
                return new fw((yw) this.f16750b.get(), (w00) this.f16751c.get(), (Context) this.f16752d.get(), (y6) this.f16753e.get());
            case 10:
                return new fw((o50) this.f16750b.get(), (yp) this.f16751c.get(), (w00) this.f16752d.get(), (String) this.f16753e.get());
            case 11:
                return new fw((f7) this.f16750b.get(), (Context) this.f16751c.get(), (String) this.f16752d.get(), (o50) this.f16753e.get());
            default:
                i9 i9Var = (i9) this.f16753e;
                b bVar = (b) this.f16750b.get();
                oc ocVar = (oc) this.f16751c.get();
                qt qtVar = (qt) this.f16752d.get();
                if (i9Var.f7041o == null) {
                    i9Var.f7041o = new qu(bVar, ocVar, qtVar);
                }
                qu quVar = i9Var.f7041o;
                jc0.b(quVar, "Cannot return null from a non-@Nullable @Provides method");
                return quVar;
        }
    }

    public tg(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, int i10) {
        this.f16749a = i10;
        switch (i10) {
            case 1:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 2:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 3:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 4:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 5:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 6:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 7:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case b4.f10106f:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 9:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 10:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            case 11:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
            default:
                this.f16750b = ab0;
                this.f16751c = ab02;
                this.f16752d = ab03;
                this.f16753e = ab04;
                return;
        }
    }
}
