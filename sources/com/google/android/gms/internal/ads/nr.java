package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nr extends is {
    public nr(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 5);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        ma.a aVar = this.f7104d;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.Y((ma) aVar.f5970b, -1);
        ma.a aVar2 = this.f7104d;
        if (aVar2.f5971c) {
            aVar2.n();
            aVar2.f5971c = false;
        }
        ma.c0((ma) aVar2.f5970b, -1);
        int[] iArr = (int[]) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a});
        synchronized (this.f7104d) {
            ma.a aVar3 = this.f7104d;
            long j10 = (long) iArr[0];
            if (aVar3.f5971c) {
                aVar3.n();
                aVar3.f5971c = false;
            }
            ma.Y((ma) aVar3.f5970b, j10);
            ma.a aVar4 = this.f7104d;
            long j11 = (long) iArr[1];
            if (aVar4.f5971c) {
                aVar4.n();
                aVar4.f5971c = false;
            }
            ma.c0((ma) aVar4.f5970b, j11);
            if (iArr[2] != Integer.MIN_VALUE) {
                ma.a aVar5 = this.f7104d;
                long j12 = (long) iArr[2];
                if (aVar5.f5971c) {
                    aVar5.n();
                    aVar5.f5971c = false;
                }
                ma.I((ma) aVar5.f5970b, j12);
            }
        }
    }
}
