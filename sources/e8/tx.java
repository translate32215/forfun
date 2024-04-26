package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zc;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tx implements dy<kw> {

    /* renamed from: a  reason: collision with root package name */
    public final o50 f16817a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f16818b;

    /* renamed from: c  reason: collision with root package name */
    public final jv f16819c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f16820d;

    /* renamed from: e  reason: collision with root package name */
    public final w00 f16821e;

    /* renamed from: f  reason: collision with root package name */
    public final zc f16822f;

    /* renamed from: g  reason: collision with root package name */
    public String f16823g;

    public tx(o50 o50, ScheduledExecutorService scheduledExecutorService, String str, jv jvVar, Context context, w00 w00, zc zcVar) {
        this.f16817a = o50;
        this.f16818b = scheduledExecutorService;
        this.f16823g = str;
        this.f16819c = jvVar;
        this.f16820d = context;
        this.f16821e = w00;
        this.f16822f = zcVar;
    }

    public final p50<kw> b() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.Q0)).booleanValue()) {
            return yh.d(new sx(this), this.f16817a);
        }
        return yh.h(null);
    }
}
