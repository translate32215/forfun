package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.hv;
import com.google.android.gms.internal.ads.jv;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.p;
import java.io.IOException;
import k8.v0;
import l0.e;
import o8.r;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class wu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17399a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17400b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17401c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17402d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17403e;

    public wu(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, String str, String str2) {
        this.f17403e = appMeasurementDynamiteService;
        this.f17400b = v0Var;
        this.f17401c = str;
        this.f17402d = str2;
    }

    public final void run() {
        hv hvVar;
        switch (this.f17399a) {
            case 0:
                uu uuVar = (uu) ((mr) this.f17400b).f15539d;
                uu.c((t00) this.f17401c, (qe) this.f17402d, (mt) this.f17403e);
                return;
            case 1:
                ph0 ph0 = (ph0) this.f17400b;
                lh0 lh0 = (lh0) this.f17401c;
                kh0 kh0 = (kh0) this.f17402d;
                d7 d7Var = (d7) this.f17403e;
                try {
                    jv jvVar = (jv) lh0.v();
                    if (lh0.E()) {
                        hvVar = jvVar.t5(kh0);
                    } else {
                        hvVar = jvVar.e3(kh0);
                    }
                    if (!hvVar.i()) {
                        d7Var.c(new RuntimeException("No entry contents."));
                        kv.a(ph0.f16006c);
                        return;
                    }
                    lv lvVar = new lv(ph0, hvVar.j());
                    int read = lvVar.read();
                    if (read != -1) {
                        lvVar.unread(read);
                        d7Var.b(new sh0(lvVar, hvVar.q(), hvVar.y(), hvVar.x(), hvVar.s()));
                        return;
                    }
                    throw new IOException("Unable to read from cache.");
                } catch (RemoteException | IOException e10) {
                    e.C("Unable to obtain a cache service instance.", e10);
                    d7Var.c(e10);
                    kv.a(ph0.f16006c);
                    return;
                }
            case 2:
                p y10 = ((AppMeasurementDynamiteService) this.f17403e).f8778a.y();
                v0 v0Var = (v0) this.f17400b;
                r rVar = (r) this.f17401c;
                String str = (String) this.f17402d;
                y10.h();
                y10.i();
                com.google.android.gms.measurement.internal.r A = y10.f8864a.A();
                A.getClass();
                if (s7.e.f25013b.d(A.f8864a.f8837a, 12451000) != 0) {
                    y10.f8864a.d().f8800i.a("Not bundling data. Service unavailable or out of date");
                    y10.f8864a.A().E(v0Var, new byte[0]);
                    return;
                }
                y10.t(new b60(y10, rVar, str, v0Var));
                return;
            default:
                p y11 = ((AppMeasurementDynamiteService) this.f17403e).f8778a.y();
                String str2 = (String) this.f17401c;
                String str3 = (String) this.f17402d;
                y11.h();
                y11.i();
                p pVar = y11;
                y11.t(new ib(pVar, str2, str3, y11.q(false), (v0) this.f17400b));
                return;
        }
    }

    public wu(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, r rVar, String str) {
        this.f17403e = appMeasurementDynamiteService;
        this.f17400b = v0Var;
        this.f17401c = rVar;
        this.f17402d = str;
    }

    public wu(mr mrVar, t00 t00, qe qeVar, mt mtVar) {
        this.f17400b = mrVar;
        this.f17401c = t00;
        this.f17402d = qeVar;
        this.f17403e = mtVar;
    }

    public wu(ph0 ph0, lh0 lh0, kh0 kh0, d7 d7Var) {
        this.f17400b = ph0;
        this.f17401c = lh0;
        this.f17402d = kh0;
        this.f17403e = d7Var;
    }
}
