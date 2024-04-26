package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.ma;
import e8.kb0;
import e8.t;
import e8.ti0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fs extends is {

    /* renamed from: h  reason: collision with root package name */
    public final View f6496h;

    public fs(fr frVar, String str, String str2, ma.a aVar, int i10, View view) {
        super(frVar, str, str2, aVar, i10, 57);
        this.f6496h = view;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f6496h != null) {
            Boolean bool = (Boolean) ti0.f16763j.f16769f.a(t.f16694z1);
            DisplayMetrics displayMetrics = this.f7101a.f6479a.getResources().getDisplayMetrics();
            kb0 kb0 = new kb0((String) this.f7105e.invoke((Object) null, new Object[]{this.f6496h, displayMetrics, bool}));
            ma.e.a z10 = ma.e.z();
            long longValue = kb0.f15267a.longValue();
            if (z10.f5971c) {
                z10.n();
                z10.f5971c = false;
            }
            ma.e.y((ma.e) z10.f5970b, longValue);
            long longValue2 = kb0.f15268b.longValue();
            if (z10.f5971c) {
                z10.n();
                z10.f5971c = false;
            }
            ma.e.B((ma.e) z10.f5970b, longValue2);
            long longValue3 = kb0.f15269c.longValue();
            if (z10.f5971c) {
                z10.n();
                z10.f5971c = false;
            }
            ma.e.C((ma.e) z10.f5970b, longValue3);
            if (bool.booleanValue()) {
                long longValue4 = kb0.f15270d.longValue();
                if (z10.f5971c) {
                    z10.n();
                    z10.f5971c = false;
                }
                ma.e.D((ma.e) z10.f5970b, longValue4);
            }
            ma.a aVar = this.f7104d;
            ma.e eVar = (ma.e) ((aq) z10.j());
            if (aVar.f5971c) {
                aVar.n();
                aVar.f5971c = false;
            }
            ma.D((ma) aVar.f5970b, eVar);
        }
    }
}
