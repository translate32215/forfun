package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.yh;
import e7.e;
import java.util.concurrent.Executor;
import q.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class st implements lt<u8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16518a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16519b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f16520c;

    /* renamed from: d  reason: collision with root package name */
    public final cb f16521d;

    /* renamed from: e  reason: collision with root package name */
    public final w00 f16522e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f16523f;

    /* renamed from: g  reason: collision with root package name */
    public final f9 f16524g;

    public st(Context context, f9 f9Var, w00 w00, Executor executor, rm rmVar, cb cbVar) {
        this.f16520c = context;
        this.f16522e = w00;
        this.f16519b = rmVar;
        this.f16523f = executor;
        this.f16524g = f9Var;
        this.f16521d = cbVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        switch (this.f16518a) {
            case 0:
                te teVar = qeVar.f7965r;
                if (teVar == null || teVar.f8193a == null) {
                    return false;
                }
                return true;
            case 1:
                te teVar2 = qeVar.f7965r;
                return (teVar2 == null || teVar2.f8193a == null) ? false : true;
            default:
                te teVar3 = qeVar.f7965r;
                if (teVar3 == null || teVar3.f8193a == null) {
                    return false;
                }
                return true;
        }
    }

    public final p50 b(t00 t00, qe qeVar) {
        switch (this.f16518a) {
            case 0:
                wp wpVar = new wp();
                p50 j10 = yh.j(yh.h(null), new xr(this, qeVar, t00, wpVar), this.f16523f);
                ((gh) j10).a(new e(wpVar), this.f16523f);
                return j10;
            case 1:
                wp wpVar2 = new wp();
                p50 j11 = yh.j(yh.h(null), new xr(this, qeVar, t00, wpVar2, (q.e) null), this.f16523f);
                ((gh) j11).a(new du(wpVar2, 0), this.f16523f);
                return j11;
            default:
                wp wpVar3 = new wp();
                p50 j12 = yh.j(yh.h(null), new xr(this, qeVar, t00, wpVar3, (f) null), this.f16523f);
                ((gh) j12).a(new du(wpVar3, 1), this.f16523f);
                return j12;
        }
    }

    public st(Context context, f9 f9Var, w00 w00, Executor executor, kp kpVar, cb cbVar) {
        this.f16520c = context;
        this.f16522e = w00;
        this.f16519b = kpVar;
        this.f16523f = executor;
        this.f16524g = f9Var;
        this.f16521d = cbVar;
    }

    public st(tf tfVar, Context context, Executor executor, cb cbVar, w00 w00, f9 f9Var) {
        this.f16520c = context;
        this.f16519b = tfVar;
        this.f16523f = executor;
        this.f16521d = cbVar;
        this.f16522e = w00;
        this.f16524g = f9Var;
    }
}
