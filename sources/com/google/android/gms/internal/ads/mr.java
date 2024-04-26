package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mr extends is {

    /* renamed from: h  reason: collision with root package name */
    public static volatile Long f7497h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f7498i = new Object();

    public mr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 44);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f7497h == null) {
            synchronized (f7498i) {
                if (f7497h == null) {
                    f7497h = (Long) this.f7105e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            long longValue = f7497h.longValue();
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.G0((ma) aVar.f5970b, longValue);
        }
    }
}
