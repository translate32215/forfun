package o8;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class x3 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final l f23575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23576b;

    /* renamed from: c  reason: collision with root package name */
    public String f23577c;

    /* renamed from: d  reason: collision with root package name */
    public String f23578d;

    /* renamed from: e  reason: collision with root package name */
    public String f23579e;

    /* renamed from: f  reason: collision with root package name */
    public String f23580f;

    /* renamed from: g  reason: collision with root package name */
    public long f23581g;

    /* renamed from: h  reason: collision with root package name */
    public long f23582h;

    /* renamed from: i  reason: collision with root package name */
    public long f23583i;

    /* renamed from: j  reason: collision with root package name */
    public String f23584j;

    /* renamed from: k  reason: collision with root package name */
    public long f23585k;

    /* renamed from: l  reason: collision with root package name */
    public String f23586l;

    /* renamed from: m  reason: collision with root package name */
    public long f23587m;

    /* renamed from: n  reason: collision with root package name */
    public long f23588n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23589o;

    /* renamed from: p  reason: collision with root package name */
    public long f23590p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f23591q;

    /* renamed from: r  reason: collision with root package name */
    public String f23592r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f23593s;

    /* renamed from: t  reason: collision with root package name */
    public long f23594t;

    /* renamed from: u  reason: collision with root package name */
    public List<String> f23595u;

    /* renamed from: v  reason: collision with root package name */
    public String f23596v;

    /* renamed from: w  reason: collision with root package name */
    public long f23597w;

    /* renamed from: x  reason: collision with root package name */
    public long f23598x;

    /* renamed from: y  reason: collision with root package name */
    public long f23599y;

    /* renamed from: z  reason: collision with root package name */
    public long f23600z;

    public x3(l lVar, String str) {
        if (lVar != null) {
            i.e(str);
            this.f23575a = lVar;
            this.f23576b = str;
            lVar.b().h();
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final boolean A() {
        this.f23575a.b().h();
        return this.f23589o;
    }

    public final long B() {
        this.f23575a.b().h();
        return this.f23585k;
    }

    public final long C() {
        this.f23575a.b().h();
        return this.E;
    }

    public final long D() {
        this.f23575a.b().h();
        return this.f23588n;
    }

    public final long E() {
        this.f23575a.b().h();
        return this.f23594t;
    }

    public final long F() {
        this.f23575a.b().h();
        return this.F;
    }

    public final long G() {
        this.f23575a.b().h();
        return this.f23587m;
    }

    public final long H() {
        this.f23575a.b().h();
        return this.f23583i;
    }

    public final long I() {
        this.f23575a.b().h();
        return this.f23581g;
    }

    public final long J() {
        this.f23575a.b().h();
        return this.f23582h;
    }

    public final String K() {
        this.f23575a.b().h();
        return this.f23592r;
    }

    public final String L() {
        this.f23575a.b().h();
        String str = this.C;
        s((String) null);
        return str;
    }

    public final String M() {
        this.f23575a.b().h();
        return this.f23576b;
    }

    public final String N() {
        this.f23575a.b().h();
        return this.f23577c;
    }

    public final String O() {
        this.f23575a.b().h();
        return this.f23586l;
    }

    public final String P() {
        this.f23575a.b().h();
        return this.f23584j;
    }

    public final String Q() {
        this.f23575a.b().h();
        return this.f23580f;
    }

    public final String R() {
        this.f23575a.b().h();
        return this.f23596v;
    }

    public final String S() {
        this.f23575a.b().h();
        return this.f23578d;
    }

    public final List<String> a() {
        this.f23575a.b().h();
        return this.f23595u;
    }

    public final void b() {
        this.f23575a.b().h();
        long j10 = this.f23581g + 1;
        if (j10 > 2147483647L) {
            this.f23575a.d().f8800i.b("Bundle index overflow. appId", h.t(this.f23576b));
            j10 = 0;
        }
        this.D = true;
        this.f23581g = j10;
    }

    public final void c(String str) {
        this.f23575a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ r.Y(this.f23592r, str);
        this.f23592r = str;
    }

    public final void d(boolean z10) {
        this.f23575a.b().h();
        this.D |= this.f23591q != z10;
        this.f23591q = z10;
    }

    public final void e(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23590p != j10;
        this.f23590p = j10;
    }

    public final void f(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.f23577c, str);
        this.f23577c = str;
    }

    public final void g(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.f23586l, str);
        this.f23586l = str;
    }

    public final void h(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.f23584j, str);
        this.f23584j = str;
    }

    public final void i(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23585k != j10;
        this.f23585k = j10;
    }

    public final void j(long j10) {
        this.f23575a.b().h();
        this.D |= this.E != j10;
        this.E = j10;
    }

    public final void k(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23588n != j10;
        this.f23588n = j10;
    }

    public final void l(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23594t != j10;
        this.f23594t = j10;
    }

    public final void m(long j10) {
        this.f23575a.b().h();
        this.D |= this.F != j10;
        this.F = j10;
    }

    public final void n(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.f23580f, str);
        this.f23580f = str;
    }

    public final void o(String str) {
        this.f23575a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ r.Y(this.f23596v, str);
        this.f23596v = str;
    }

    public final void p(String str) {
        this.f23575a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ r.Y(this.f23578d, str);
        this.f23578d = str;
    }

    public final void q(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23587m != j10;
        this.f23587m = j10;
    }

    public final long r() {
        this.f23575a.b().h();
        return this.f23590p;
    }

    public final void s(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.C, str);
        this.C = str;
    }

    public final void t(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23583i != j10;
        this.f23583i = j10;
    }

    public final void u(long j10) {
        boolean z10 = true;
        i.a(j10 >= 0);
        this.f23575a.b().h();
        boolean z11 = this.D;
        if (this.f23581g == j10) {
            z10 = false;
        }
        this.D = z10 | z11;
        this.f23581g = j10;
    }

    public final void v(long j10) {
        this.f23575a.b().h();
        this.D |= this.f23582h != j10;
        this.f23582h = j10;
    }

    public final void w(boolean z10) {
        this.f23575a.b().h();
        this.D |= this.f23589o != z10;
        this.f23589o = z10;
    }

    public final void x(String str) {
        this.f23575a.b().h();
        this.D |= !r.Y(this.f23579e, str);
        this.f23579e = str;
    }

    public final void y(List<String> list) {
        this.f23575a.b().h();
        List<String> list2 = this.f23595u;
        String[] strArr = r.f8873g;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.D = true;
                this.f23595u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    public final boolean z() {
        this.f23575a.b().h();
        return this.f23591q;
    }
}
