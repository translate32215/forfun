package a5;

import android.text.TextUtils;
import o1.q;
import v6.a;
import x4.b0;

/* compiled from: DecoderReuseEvaluation */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f92a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f93b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f94c;

    /* renamed from: d  reason: collision with root package name */
    public final int f95d;

    /* renamed from: e  reason: collision with root package name */
    public final int f96e;

    public g(String str, b0 b0Var, b0 b0Var2, int i10, int i11) {
        a.a(i10 == 0 || i11 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f92a = str;
            b0Var.getClass();
            this.f93b = b0Var;
            this.f94c = b0Var2;
            this.f95d = i10;
            this.f96e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f95d != gVar.f95d || this.f96e != gVar.f96e || !this.f92a.equals(gVar.f92a) || !this.f93b.equals(gVar.f93b) || !this.f94c.equals(gVar.f94c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a10 = q.a(this.f92a, (((this.f95d + 527) * 31) + this.f96e) * 31, 31);
        return this.f94c.hashCode() + ((this.f93b.hashCode() + a10) * 31);
    }
}
