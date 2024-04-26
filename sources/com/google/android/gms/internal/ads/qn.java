package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ma;
import e8.fa;
import e8.h30;
import e8.q10;
import f7.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s8.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qn extends yg {
    public qn(Context context, String str, boolean z10, int i10) {
        super(context, str, z10, i10);
    }

    public static qn r(String str, Context context, boolean z10, int i10) {
        Class<yg> cls = yg.class;
        synchronized (cls) {
            if (!yg.K) {
                yg.L = System.currentTimeMillis() / 1000;
                hh.B = yg.o(context, z10);
                yg.K = true;
            }
        }
        synchronized (cls) {
            if (yg.G == null) {
                if (yg.q(i10)) {
                    j8 j8Var = new j8();
                    j8Var.l(false);
                    j8Var.f7136d = Boolean.TRUE;
                    if (str != null) {
                        j8Var.f7134b = str;
                        j8Var.f7135c = Boolean.valueOf(z10);
                        h30 h10 = j8Var.h();
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
                        mf mfVar = new mf(context, newFixedThreadPool, l.c(newFixedThreadPool, new h0(context)));
                        yg.I = mfVar;
                        yg.G = q10.h(context, mfVar, h10, Executors.newCachedThreadPool());
                        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(1);
                        yg.H = newFixedThreadPool2;
                        newFixedThreadPool2.execute(new fa(1));
                    } else {
                        throw new NullPointerException("Null clientVersion");
                    }
                }
            }
        }
        return new qn(context, str, z10, i10);
    }

    public final List<Callable<Void>> l(fr frVar, Context context, ma.a aVar, n9 n9Var) {
        if (frVar.f6480b == null || !this.C) {
            return super.l(frVar, context, aVar, (n9) null);
        }
        int h10 = frVar.h();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.l(frVar, context, aVar, (n9) null));
        arrayList.add(new or(frVar, "OWd9rVZHQHX0ZS0khfLk9EbaV5B3660u9zEaKwzJiuzlEk0jPLbdFO63rEPIwHWE", "XTJhw9owXn6RPlXdkw8MehSfVDAvl+AxD3gfvf4NYBI=", aVar, h10));
        return arrayList;
    }
}
