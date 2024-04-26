package e8;

import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.we;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class wo implements tc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17381a;

    /* renamed from: b  reason: collision with root package name */
    public final uo f17382b;

    /* renamed from: c  reason: collision with root package name */
    public final t7 f17383c;

    /* renamed from: d  reason: collision with root package name */
    public final m9 f17384d;

    public wo(uo uoVar, t7 t7Var, m9 m9Var, int i10) {
        this.f17381a = i10;
        if (i10 != 1) {
            this.f17382b = uoVar;
            this.f17383c = t7Var;
            this.f17384d = m9Var;
            return;
        }
        this.f17382b = uoVar;
        this.f17383c = t7Var;
        this.f17384d = m9Var;
    }

    public final void d(boolean z10) {
        switch (this.f17381a) {
            case 0:
                uo uoVar = this.f17382b;
                t7 t7Var = this.f17383c;
                m9 m9Var = this.f17384d;
                uoVar.getClass();
                if (z10) {
                    if (!(uoVar.f16977a.f17188b == null || t7Var.o() == null)) {
                        t7Var.o().v6(uoVar.f16977a.f17188b);
                    }
                    m9Var.b(m9Var.f15472b);
                    return;
                }
                m9Var.c(new ru(we.INTERNAL_ERROR, "Instream video Web View failed to load."));
                return;
            default:
                uo uoVar2 = this.f17382b;
                t7 t7Var2 = this.f17383c;
                m9 m9Var2 = this.f17384d;
                if (!(uoVar2.f16977a.f17188b == null || t7Var2.o() == null)) {
                    t7Var2.o().v6(uoVar2.f16977a.f17188b);
                }
                m9Var2.b(m9Var2.f15472b);
                return;
        }
    }
}
