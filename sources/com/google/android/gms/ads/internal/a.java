package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.e5;
import d7.l;
import e8.h8;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5590a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5591b;

    /* renamed from: c  reason: collision with root package name */
    public h8 f5592c;

    /* renamed from: d  reason: collision with root package name */
    public e5 f5593d;

    public a(Context context, h8 h8Var) {
        this.f5590a = context;
        this.f5592c = h8Var;
        this.f5593d = null;
        this.f5593d = new e5();
    }

    public final void a(String str) {
        List<String> list;
        if (b()) {
            if (str == null) {
                str = "";
            }
            h8 h8Var = this.f5592c;
            if (h8Var != null) {
                h8Var.d(str, (Map<String, String>) null, 3);
                return;
            }
            e5 e5Var = this.f5593d;
            if (e5Var.f6261a && (list = e5Var.f6262b) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        p pVar = l.B.f13186c;
                        p.r(this.f5590a, "", replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        h8 h8Var = this.f5592c;
        return (h8Var != null && h8Var.c().f14094f) || this.f5593d.f6261a;
    }

    public final boolean c() {
        return !b() || this.f5591b;
    }
}
