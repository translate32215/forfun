package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kr extends is {
    public kr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 49);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        ma.a aVar = this.f7104d;
        nb nbVar = nb.ENUM_FAILURE;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.a0((ma) aVar.f5970b, nbVar);
        try {
            boolean booleanValue = ((Boolean) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a})).booleanValue();
            ma.a aVar2 = this.f7104d;
            nb nbVar2 = booleanValue ? nb.ENUM_TRUE : nb.ENUM_FALSE;
            if (aVar2.f5971c) {
                aVar2.n();
                aVar2.f5971c = false;
            }
            ma.a0((ma) aVar2.f5970b, nbVar2);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
