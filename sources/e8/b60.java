package e8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import cb.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.yg;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import java.util.concurrent.atomic.AtomicReference;
import k8.v0;
import o8.r;
import o8.s4;
import o8.u5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b60 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13895a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13896b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13897c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13898d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13899e;

    public b60(d dVar, String str, Bundle bundle) {
        this.f13899e = dVar;
        this.f13897c = str;
        this.f13896b = "_err";
        this.f13898d = bundle;
    }

    public final void run() {
        l lVar;
        switch (this.f13895a) {
            case 0:
                try {
                    yg.G.g((Context) this.f13896b, this.f13897c, (View) this.f13898d, (Activity) this.f13899e);
                    return;
                } catch (Exception e10) {
                    yg.I.a(2021, -1, e10);
                    return;
                }
            case 1:
                p y10 = ((s4) this.f13899e).f8864a.y();
                y10.h();
                y10.i();
                y10.t(new ib(y10, (AtomicReference) this.f13896b, this.f13897c, (String) this.f13898d, y10.q(false)));
                return;
            case 2:
                byte[] bArr = null;
                try {
                    Object obj = this.f13899e;
                    com.google.android.gms.measurement.internal.d dVar = ((p) obj).f8867d;
                    if (dVar == null) {
                        ((p) obj).f8864a.d().f8797f.a("Discarding data. Failed to send event to service to bundle");
                        lVar = ((p) this.f13899e).f8864a;
                    } else {
                        bArr = dVar.h5((r) this.f13896b, this.f13897c);
                        ((p) this.f13899e).s();
                        lVar = ((p) this.f13899e).f8864a;
                    }
                } catch (RemoteException e11) {
                    ((p) this.f13899e).f8864a.d().f8797f.b("Failed to send event to the service to bundle", e11);
                    lVar = ((p) this.f13899e).f8864a;
                } catch (Throwable th) {
                    ((p) this.f13899e).f8864a.A().E((v0) this.f13898d, bArr);
                    throw th;
                }
                lVar.A().E((v0) this.f13898d, bArr);
                return;
            default:
                r s02 = ((u5) ((d) this.f13899e).f4374b).Q().s0(this.f13897c, (String) this.f13896b, (Bundle) this.f13898d, "auto", ((u5) ((d) this.f13899e).f4374b).e().b(), false, true);
                i.h(s02);
                ((u5) ((d) this.f13899e).f4374b).j(s02, this.f13897c);
                return;
        }
    }

    public b60(p pVar, r rVar, String str, v0 v0Var) {
        this.f13899e = pVar;
        this.f13896b = rVar;
        this.f13897c = str;
        this.f13898d = v0Var;
    }

    public b60(s4 s4Var, AtomicReference atomicReference, String str, String str2) {
        this.f13899e = s4Var;
        this.f13896b = atomicReference;
        this.f13897c = str;
        this.f13898d = str2;
    }

    public b60(Context context, String str, View view, Activity activity) {
        this.f13896b = context;
        this.f13897c = str;
        this.f13898d = view;
        this.f13899e = activity;
    }
}
