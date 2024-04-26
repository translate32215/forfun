package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ma;
import e8.gz;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jr extends is {

    /* renamed from: i  reason: collision with root package name */
    public static gz<String> f7164i = new gz(9);

    /* renamed from: h  reason: collision with root package name */
    public final Context f7165h;

    public jr(fr frVar, String str, String str2, ma.a aVar, int i10, Context context) {
        super(frVar, str, str2, aVar, i10, 29);
        this.f7165h = context;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        ma.a aVar = this.f7104d;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.h0((ma) aVar.f5970b, "E");
        AtomicReference c10 = f7164i.c(this.f7165h.getPackageName());
        if (c10.get() == null) {
            synchronized (c10) {
                if (c10.get() == null) {
                    c10.set((String) this.f7105e.invoke((Object) null, new Object[]{this.f7165h}));
                }
            }
        }
        String str = (String) c10.get();
        synchronized (this.f7104d) {
            ma.a aVar2 = this.f7104d;
            String a10 = uc.a(str.getBytes(), true);
            if (aVar2.f5971c) {
                aVar2.n();
                aVar2.f5971c = false;
            }
            ma.h0((ma) aVar2.f5970b, a10);
        }
    }
}
