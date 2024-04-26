package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ur extends is {

    /* renamed from: h  reason: collision with root package name */
    public static volatile String f8275h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f8276i = new Object();

    public ur(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 1);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        ma.a aVar = this.f7104d;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.F((ma) aVar.f5970b, "E");
        if (f8275h == null) {
            synchronized (f8276i) {
                if (f8275h == null) {
                    f8275h = (String) this.f7105e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f7104d) {
            ma.a aVar2 = this.f7104d;
            String str = f8275h;
            if (aVar2.f5971c) {
                aVar2.n();
                aVar2.f5971c = false;
            }
            ma.F((ma) aVar2.f5970b, str);
        }
    }
}
