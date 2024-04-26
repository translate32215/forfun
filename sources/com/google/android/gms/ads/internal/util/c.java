package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.ads.v5;
import com.google.android.gms.internal.ads.w4;
import e8.r5;
import e8.t;
import e8.ti0;
import e8.wi0;
import e8.y8;
import java.util.regex.Pattern;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c extends v5 {

    /* renamed from: d  reason: collision with root package name */
    public final Context f5661d;

    public c(Context context, w4 w4Var) {
        super(w4Var);
        this.f5661d = context;
    }

    public final wi0 a(a<?> aVar) throws r5 {
        if (aVar.f5928i && aVar.f5921b == 0) {
            if (Pattern.matches((String) ti0.f16763j.f16769f.a(t.f16593i2), aVar.f5922c)) {
                y8 y8Var = ti0.f16763j.f16764a;
                if (y8.j(this.f5661d, 13400000)) {
                    wi0 a10 = new t1(this.f5661d).a(aVar);
                    if (a10 != null) {
                        String valueOf = String.valueOf(aVar.f5922c);
                        e.H(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a10;
                    }
                    String valueOf2 = String.valueOf(aVar.f5922c);
                    e.H(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(aVar);
    }
}
