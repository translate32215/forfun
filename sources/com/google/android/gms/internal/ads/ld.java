package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import androidx.leanback.widget.s;
import e.h;
import e7.i;
import e8.cp;
import e8.dw;
import e8.ew;
import e8.f9;
import e8.ih;
import e8.l50;
import e8.o50;
import e8.p50;
import e8.t;
import e8.ti0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ld extends u6 {

    /* renamed from: s  reason: collision with root package name */
    public static final List<String> f7364s = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));

    /* renamed from: t  reason: collision with root package name */
    public static final List<String> f7365t = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: u  reason: collision with root package name */
    public static final List<String> f7366u = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));

    /* renamed from: v  reason: collision with root package name */
    public static final List<String> f7367v = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: a  reason: collision with root package name */
    public b8 f7368a;

    /* renamed from: b  reason: collision with root package name */
    public Context f7369b;

    /* renamed from: c  reason: collision with root package name */
    public tm f7370c;

    /* renamed from: d  reason: collision with root package name */
    public f9 f7371d;

    /* renamed from: e  reason: collision with root package name */
    public ve<cp> f7372e;

    /* renamed from: f  reason: collision with root package name */
    public final o50 f7373f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f7374g;

    /* renamed from: h  reason: collision with root package name */
    public z4 f7375h;

    /* renamed from: i  reason: collision with root package name */
    public Point f7376i = new Point();

    /* renamed from: r  reason: collision with root package name */
    public Point f7377r = new Point();

    public ld(b8 b8Var, Context context, tm tmVar, f9 f9Var, ve<cp> veVar, o50 o50, ScheduledExecutorService scheduledExecutorService) {
        this.f7368a = b8Var;
        this.f7369b = context;
        this.f7370c = tmVar;
        this.f7371d = f9Var;
        this.f7372e = veVar;
        this.f7373f = o50;
        this.f7374g = scheduledExecutorService;
    }

    public static Uri s6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = indexOf + 1;
        StringBuilder sb2 = new StringBuilder(uri2.substring(0, i10));
        s.a(sb2, str, "=", str2, "&");
        sb2.append(uri2.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static boolean t6(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        for (String contains : list) {
            if (path.contains(contains)) {
                for (String endsWith : list2) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f8670b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u6() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.z4 r0 = r1.f7375h
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f8670b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ld.u6():boolean");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [e8.p50, com.google.android.gms.internal.ads.gh, e8.l50] */
    /* JADX WARNING: type inference failed for: r3v1, types: [e8.p50<java.lang.String>, com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Runnable] */
    public final p50<String> v6(String str) {
        cp[] cpVarArr = new cp[1];
        p50 j10 = yh.j(this.f7372e.b(), new ih(this, cpVarArr, str), this.f7373f);
        ((gh) j10).a(new i(this, cpVarArr), this.f7373f);
        ? t10 = l50.v(j10).s((long) ((Integer) ti0.f16763j.f16769f.a(t.f16565d4)).intValue(), TimeUnit.MILLISECONDS, this.f7374g).t(dw.f14339a, this.f7373f);
        mg mgVar = ew.f14516a;
        o50 o50 = this.f7373f;
        ? ehVar = new eh(t10, Exception.class, mgVar);
        t10.a(ehVar, h.d(o50, ehVar));
        return ehVar;
    }
}
