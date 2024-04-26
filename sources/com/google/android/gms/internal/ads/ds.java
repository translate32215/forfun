package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ds extends is {

    /* renamed from: h  reason: collision with root package name */
    public static volatile Long f6239h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f6240i = new Object();

    public ds(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 33);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f6239h == null) {
            synchronized (f6240i) {
                if (f6239h == null) {
                    f6239h = (Long) this.f7105e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            long longValue = f6239h.longValue();
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.y0((ma) aVar.f5970b, longValue);
        }
    }
}
