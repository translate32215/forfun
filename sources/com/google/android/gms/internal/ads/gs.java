package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gs extends is {
    public gs(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 48);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f7104d.o(nb.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a})).booleanValue();
        synchronized (this.f7104d) {
            if (booleanValue) {
                this.f7104d.o(nb.ENUM_TRUE);
            } else {
                this.f7104d.o(nb.ENUM_FALSE);
            }
        }
    }
}
