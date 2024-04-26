package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.qe;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class hg implements pj {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14905a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14906b;

    /* renamed from: c  reason: collision with root package name */
    public final f9 f14907c;

    /* renamed from: d  reason: collision with root package name */
    public final qe f14908d;

    /* renamed from: e  reason: collision with root package name */
    public final w00 f14909e;

    public hg(Context context, f9 f9Var, qe qeVar, w00 w00, int i10) {
        this.f14905a = i10;
        if (i10 != 1) {
            this.f14906b = context;
            this.f14907c = f9Var;
            this.f14908d = qeVar;
            this.f14909e = w00;
            return;
        }
        this.f14906b = context;
        this.f14907c = f9Var;
        this.f14908d = qeVar;
        this.f14909e = w00;
    }

    public final void v() {
        switch (this.f14905a) {
            case 0:
                l.B.f13196m.b(this.f14906b, this.f14907c.f14544a, this.f14908d.B.toString(), this.f14909e.f17192f);
                return;
            default:
                l.B.f13196m.b(this.f14906b, this.f14907c.f14544a, this.f14908d.B.toString(), this.f14909e.f17192f);
                return;
        }
    }
}
