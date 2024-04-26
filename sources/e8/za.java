package e8;

import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.q7;
import d7.l;
import e7.e;
import f7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class za extends a {

    /* renamed from: b  reason: collision with root package name */
    public final ia f17700b;

    /* renamed from: c  reason: collision with root package name */
    public final q7 f17701c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17702d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f17703e;

    public za(ia iaVar, q7 q7Var, String str, String[] strArr) {
        this.f17700b = iaVar;
        this.f17701c = q7Var;
        this.f17702d = str;
        this.f17703e = strArr;
        l.B.f13209z.f13912a.add(this);
    }

    public final void a() {
        try {
            this.f17701c.q(this.f17702d, this.f17703e);
        } finally {
            p.f5702i.post(new e(this));
        }
    }
}
