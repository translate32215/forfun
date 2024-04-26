package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.ma;
import e8.t;
import e8.ti0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ir extends is {

    /* renamed from: h  reason: collision with root package name */
    public final Activity f7099h;

    /* renamed from: i  reason: collision with root package name */
    public final View f7100i;

    public ir(fr frVar, String str, String str2, ma.a aVar, int i10, View view, Activity activity) {
        super(frVar, str, str2, aVar, i10, 62);
        this.f7100i = view;
        this.f7099h = activity;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f7100i != null) {
            boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.f16628o1)).booleanValue();
            Object[] objArr = (Object[]) this.f7105e.invoke((Object) null, new Object[]{this.f7100i, this.f7099h, Boolean.valueOf(booleanValue)});
            synchronized (this.f7104d) {
                ma.a aVar = this.f7104d;
                long longValue = ((Long) objArr[0]).longValue();
                if (aVar.f5971c) {
                    aVar.n();
                    aVar.f5971c = false;
                }
                ma.L((ma) aVar.f5970b, longValue);
                ma.a aVar2 = this.f7104d;
                long longValue2 = ((Long) objArr[1]).longValue();
                if (aVar2.f5971c) {
                    aVar2.n();
                    aVar2.f5971c = false;
                }
                ma.N((ma) aVar2.f5970b, longValue2);
                if (booleanValue) {
                    ma.a aVar3 = this.f7104d;
                    String str = (String) objArr[2];
                    if (aVar3.f5971c) {
                        aVar3.n();
                        aVar3.f5971c = false;
                    }
                    ma.q0((ma) aVar3.f5970b, str);
                }
            }
        }
    }
}
