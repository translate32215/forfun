package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class as extends is {

    /* renamed from: h  reason: collision with root package name */
    public List<Long> f5974h = null;

    public as(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 31);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        ma.a aVar = this.f7104d;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        ma.w0((ma) aVar.f5970b, -1);
        ma.a aVar2 = this.f7104d;
        if (aVar2.f5971c) {
            aVar2.n();
            aVar2.f5971c = false;
        }
        ma.x0((ma) aVar2.f5970b, -1);
        if (this.f5974h == null) {
            this.f5974h = (List) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a});
        }
        List<Long> list = this.f5974h;
        if (list != null && list.size() == 2) {
            synchronized (this.f7104d) {
                ma.a aVar3 = this.f7104d;
                long longValue = this.f5974h.get(0).longValue();
                if (aVar3.f5971c) {
                    aVar3.n();
                    aVar3.f5971c = false;
                }
                ma.w0((ma) aVar3.f5970b, longValue);
                ma.a aVar4 = this.f7104d;
                long longValue2 = this.f5974h.get(1).longValue();
                if (aVar4.f5971c) {
                    aVar4.n();
                    aVar4.f5971c = false;
                }
                ma.x0((ma) aVar4.f5970b, longValue2);
            }
        }
    }
}
