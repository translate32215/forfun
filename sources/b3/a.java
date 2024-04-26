package b3;

import a3.e;
import a3.k;
import android.graphics.PointF;
import w2.b;

/* compiled from: CircleShape */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final k<PointF, PointF> f3461b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3462c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3463d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3464e;

    public a(String str, k<PointF, PointF> kVar, e eVar, boolean z10, boolean z11) {
        this.f3460a = str;
        this.f3461b = kVar;
        this.f3462c = eVar;
        this.f3463d = z10;
        this.f3464e = z11;
    }

    public b a(u2.e eVar, c3.b bVar) {
        return new w2.e(eVar, bVar, this);
    }
}
