package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.gb0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bs extends is {
    public bs(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 51);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.f7104d) {
            gb0 gb0 = new gb0((String) this.f7105e.invoke((Object) null, new Object[0]));
            ma.a aVar = this.f7104d;
            long longValue = gb0.f14762a.longValue();
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.I0((ma) aVar.f5970b, longValue);
            ma.a aVar2 = this.f7104d;
            long longValue2 = gb0.f14763b.longValue();
            if (aVar2.f5971c) {
                aVar2.n();
                aVar2.f5971c = false;
            }
            ma.J0((ma) aVar2.f5970b, longValue2);
        }
    }
}
