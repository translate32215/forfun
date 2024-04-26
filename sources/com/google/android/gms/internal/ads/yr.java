package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.c70;
import e8.t;
import e8.ti0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yr extends is {
    public yr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 3);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.f16640q1)).booleanValue();
        c70 c70 = new c70((String) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a, Boolean.valueOf(booleanValue)}));
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            long j10 = c70.f14087a;
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.A((ma) aVar.f5970b, j10);
            ma.a aVar2 = this.f7104d;
            long j11 = c70.f14088b;
            if (aVar2.f5971c) {
                aVar2.n();
                aVar2.f5971c = false;
            }
            ma.J((ma) aVar2.f5970b, j11);
        }
    }
}
