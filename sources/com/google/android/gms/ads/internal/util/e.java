package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.b7;
import e8.j3;
import e8.sd0;
import e8.va;
import e8.wi0;
import f7.u;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e extends a {

    /* renamed from: v  reason: collision with root package name */
    public final Object f5664v = new Object();

    /* renamed from: w  reason: collision with root package name */
    public u f5665w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ byte[] f5666x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Map f5667y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ b7 f5668z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i10, String str, u uVar, j3 j3Var, byte[] bArr, Map map, b7 b7Var) {
        super(i10, str, j3Var);
        this.f5666x = bArr;
        this.f5667y = map;
        this.f5668z = b7Var;
        this.f5665w = uVar;
    }

    public final Map<String, String> a() throws sd0 {
        Map<String, String> map = this.f5667y;
        return map == null ? Collections.emptyMap() : map;
    }

    public final c c(wi0 wi0) {
        String str;
        String str2;
        try {
            byte[] bArr = wi0.f17364b;
            Map<String, String> map = wi0.f17365c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(wi0.f17364b);
        }
        return new c(str, va.a(wi0));
    }

    public final void f(Object obj) {
        u uVar;
        String str = (String) obj;
        this.f5668z.f(str);
        synchronized (this.f5664v) {
            uVar = this.f5665w;
        }
        if (uVar != null) {
            uVar.b(str);
        }
    }

    public final byte[] s() throws sd0 {
        byte[] bArr = this.f5666x;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
