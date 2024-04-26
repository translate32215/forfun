package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zr extends is {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8732h;

    public zr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 61);
        this.f8732h = frVar.f6495q.f14554a;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a, Boolean.valueOf(this.f8732h)})).longValue();
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.K((ma) aVar.f5970b, longValue);
        }
    }
}
