package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tr extends is {
    public tr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 76);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a})).booleanValue();
        ma.a aVar = this.f7104d;
        nb nbVar = booleanValue ? nb.ENUM_TRUE : nb.ENUM_FALSE;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.j0((ma) aVar.f5970b, nbVar);
    }
}
