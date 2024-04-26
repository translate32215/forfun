package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.yh;
import d7.l;
import f7.d0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rw implements dy<Object> {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f16345g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f16346a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16347b;

    /* renamed from: c  reason: collision with root package name */
    public final uh f16348c;

    /* renamed from: d  reason: collision with root package name */
    public final xe f16349d;

    /* renamed from: e  reason: collision with root package name */
    public final w00 f16350e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f16351f = l.B.f13190g.f();

    public rw(String str, String str2, uh uhVar, xe xeVar, w00 w00) {
        this.f16346a = str;
        this.f16347b = str2;
        this.f16348c = uhVar;
        this.f16349d = xeVar;
        this.f16350e = w00;
    }

    public final p50<Object> b() {
        Bundle bundle = new Bundle();
        if (((Boolean) ti0.f16763j.f16769f.a(t.W2)).booleanValue()) {
            this.f16348c.a(this.f16350e.f17190d);
            bundle.putAll(this.f16349d.a());
        }
        return yh.h(new pw(this, bundle));
    }
}
