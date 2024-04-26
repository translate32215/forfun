package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.db0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cs extends is {

    /* renamed from: h  reason: collision with root package name */
    public final StackTraceElement[] f6142h;

    public cs(fr frVar, String str, String str2, ma.a aVar, int i10, StackTraceElement[] stackTraceElementArr) {
        super(frVar, str, str2, aVar, i10, 45);
        this.f6142h = stackTraceElementArr;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        nb nbVar;
        Object obj = this.f6142h;
        if (obj != null) {
            db0 db0 = new db0((String) this.f7105e.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f7104d) {
                ma.a aVar = this.f7104d;
                long longValue = db0.f14242a.longValue();
                if (aVar.f5971c) {
                    aVar.n();
                    aVar.f5971c = false;
                }
                ma.H0(aVar.f5970b, longValue);
                if (db0.f14243b.booleanValue()) {
                    ma.a aVar2 = this.f7104d;
                    if (db0.f14244c.booleanValue()) {
                        nbVar = nb.ENUM_FALSE;
                    } else {
                        nbVar = nb.ENUM_TRUE;
                    }
                    if (aVar2.f5971c) {
                        aVar2.n();
                        aVar2.f5971c = false;
                    }
                    ma.d0(aVar2.f5970b, nbVar);
                } else {
                    ma.a aVar3 = this.f7104d;
                    nb nbVar2 = nb.ENUM_FAILURE;
                    if (aVar3.f5971c) {
                        aVar3.n();
                        aVar3.f5971c = false;
                    }
                    ma.d0(aVar3.f5970b, nbVar2);
                }
            }
        }
    }
}
