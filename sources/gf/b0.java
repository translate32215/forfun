package gf;

import java.util.ArrayList;
import ld.l;
import q.c;
import ud.k;

/* compiled from: Search.kt */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public g0<?> f18648a;

    /* renamed from: b  reason: collision with root package name */
    public g0<?> f18649b;

    /* renamed from: c  reason: collision with root package name */
    public g0<?> f18650c;

    /* renamed from: d  reason: collision with root package name */
    public Object f18651d;

    /* compiled from: Search.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18652a = new a();
    }

    public b0(g0 g0Var, g0 g0Var2, g0<?> g0Var3, Object obj, int i10) {
        g0Var3 = (i10 & 4) != 0 ? null : g0Var3;
        a aVar = (i10 & 8) != 0 ? a.f18652a : null;
        this.f18648a = null;
        this.f18649b = null;
        this.f18650c = g0Var3;
        this.f18651d = aVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = null;
        if (this.f18648a != null) {
            StringBuilder a10 = android.support.v4.media.a.a("contextType=");
            g0<?> g0Var = this.f18648a;
            a10.append(g0Var != null ? g0Var.e() : null);
            arrayList.add(a10.toString());
        }
        if (this.f18649b != null) {
            StringBuilder a11 = android.support.v4.media.a.a("argType=");
            g0<?> g0Var2 = this.f18649b;
            a11.append(g0Var2 != null ? g0Var2.e() : null);
            arrayList.add(a11.toString());
        }
        if (this.f18650c != null) {
            StringBuilder a12 = android.support.v4.media.a.a("type=");
            g0<?> g0Var3 = this.f18650c;
            if (g0Var3 != null) {
                str = g0Var3.e();
            }
            a12.append(str);
            arrayList.add(a12.toString());
        }
        if (!k.a(this.f18651d, a.f18652a)) {
            StringBuilder a13 = android.support.v4.media.a.a("tag=");
            a13.append(this.f18651d);
            arrayList.add(a13.toString());
        }
        StringBuilder a14 = c.a('[');
        a14.append(l.m(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (td.l) null, 62));
        a14.append(']');
        return a14.toString();
    }
}
