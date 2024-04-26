package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qr extends is {

    /* renamed from: h  reason: collision with root package name */
    public static volatile Long f7994h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f7995i = new Object();

    public qr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 22);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f7994h == null) {
            synchronized (f7995i) {
                if (f7994h == null) {
                    f7994h = (Long) this.f7105e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            long longValue = f7994h.longValue();
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.u0((ma) aVar.f5970b, longValue);
        }
    }
}
