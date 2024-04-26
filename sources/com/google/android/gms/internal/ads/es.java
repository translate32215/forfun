package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.mb0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class es extends is {

    /* renamed from: h  reason: collision with root package name */
    public final mb0 f6318h;

    /* renamed from: i  reason: collision with root package name */
    public long f6319i;

    public es(fr frVar, String str, String str2, ma.a aVar, int i10, mb0 mb0) {
        super(frVar, str, str2, aVar, i10, 53);
        this.f6318h = mb0;
        if (mb0 != null) {
            this.f6319i = mb0.c();
        }
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f6318h != null) {
            ma.a aVar = this.f7104d;
            long longValue = ((Long) this.f7105e.invoke((Object) null, new Object[]{Long.valueOf(this.f6319i)})).longValue();
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.H((ma) aVar.f5970b, longValue);
        }
    }
}
