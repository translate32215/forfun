package com.google.android.gms.ads.internal.util;

import android.content.Context;
import c5.a0;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.h6;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.v5;
import e8.gf0;
import e8.l9;
import e8.o1;
import e8.p50;
import e8.sd0;
import e8.t;
import e8.ti0;
import f7.u;
import java.io.File;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import n2.g;
import t1.c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static o1 f5662a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5663b = new Object();

    public d(Context context) {
        o1 o1Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f5663b) {
            if (f5662a == null) {
                t.a(context);
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16587h2)).booleanValue()) {
                    o1Var = new o1(new h6(new File(context.getCacheDir(), "admob_volley")), new c(context, new r7()));
                    o1Var.a();
                } else {
                    o1Var = new o1(new h6((l9) new gf0(context.getApplicationContext())), new v5(new r7()));
                    o1Var.a();
                }
                f5662a = o1Var;
            }
        }
    }

    public final p50<String> a(int i10, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = null;
        u uVar = new u((a0) null);
        c cVar = new c(str, uVar);
        b7 b7Var = new b7((String) null);
        e eVar = new e(i10, str, uVar, cVar, bArr, map, b7Var);
        if (b7.a()) {
            try {
                Map<String, String> a10 = eVar.a();
                if (bArr != null) {
                    bArr2 = bArr;
                }
                if (b7.a()) {
                    b7Var.c("onNetworkRequest", new g(str, "GET", (Map) a10, bArr2));
                }
            } catch (sd0 e10) {
                e.K(e10.getMessage());
            }
        }
        f5662a.c(eVar);
        return uVar;
    }
}
