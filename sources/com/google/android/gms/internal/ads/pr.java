package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pr extends is {

    /* renamed from: h  reason: collision with root package name */
    public long f7872h;

    public pr(fr frVar, String str, String str2, ma.a aVar, long j10, int i10) {
        super(frVar, str, str2, aVar, i10, 25);
        this.f7872h = j10;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f7105e.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f7104d) {
            ma.a aVar = this.f7104d;
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.O((ma) aVar.f5970b, longValue);
            long j10 = this.f7872h;
            if (j10 != 0) {
                ma.a aVar2 = this.f7104d;
                long j11 = longValue - j10;
                if (aVar2.f5971c) {
                    aVar2.n();
                    aVar2.f5971c = false;
                }
                ma.r0((ma) aVar2.f5970b, j11);
                ma.a aVar3 = this.f7104d;
                long j12 = this.f7872h;
                if (aVar3.f5971c) {
                    aVar3.n();
                    aVar3.f5971c = false;
                }
                ma.v0((ma) aVar3.f5970b, j12);
            }
        }
    }
}
