package e8;

import com.google.android.gms.internal.ads.Cif;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class at implements q20 {

    /* renamed from: a  reason: collision with root package name */
    public final xs f13747a;

    public at(xs xsVar) {
        this.f13747a = xsVar;
    }

    public final void B(Cif ifVar, String str) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue() && Cif.RENDERER == ifVar) {
            xs xsVar = this.f13747a;
            long a10 = l.B.f13193j.a();
            synchronized (xsVar) {
                synchronized (xsVar.f17518g) {
                    xsVar.f17514c = a10;
                }
            }
        }
    }

    public final void P(Cif ifVar, String str) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue() && Cif.RENDERER == ifVar && this.f13747a.a() != 0) {
            this.f13747a.b(l.B.f13193j.a() - this.f13747a.a());
        }
    }

    public final void g(Cif ifVar, String str, Throwable th) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue() && Cif.RENDERER == ifVar && this.f13747a.a() != 0) {
            this.f13747a.b(l.B.f13193j.a() - this.f13747a.a());
        }
    }

    public final void y(Cif ifVar, String str) {
    }
}
