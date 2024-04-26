package com.google.android.gms.internal.ads;

import android.content.Context;
import d7.a;
import d7.h;
import e8.cc;
import e8.ec;
import e8.f9;
import e8.i0;
import e8.t;
import e8.wc;
import f7.y;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u7 {
    public static t7 a(Context context, wc wcVar, String str, boolean z10, boolean z11, tm tmVar, i0 i0Var, f9 f9Var, h hVar, a aVar, nv nvVar, qe qeVar, re reVar) throws ec {
        t.a(context);
        try {
            return (t7) y.b(new cc(context, wcVar, str, z10, z11, tmVar, i0Var, f9Var, hVar, aVar, nvVar, qeVar, reVar));
        } catch (Throwable th) {
            throw new ec("Webview initialization failed.", th);
        }
    }
}
