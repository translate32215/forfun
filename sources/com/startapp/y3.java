package com.startapp;

import android.app.Activity;
import com.startapp.o7;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import j.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: Sta */
public class y3 {

    /* renamed from: a  reason: collision with root package name */
    public final AdvertisingIdResolver f12870a;

    /* renamed from: b  reason: collision with root package name */
    public final ub f12871b;

    /* renamed from: c  reason: collision with root package name */
    public final c6 f12872c;

    /* renamed from: d  reason: collision with root package name */
    public final g7 f12873d;

    /* renamed from: e  reason: collision with root package name */
    public final d3<z3> f12874e;

    public y3(AdvertisingIdResolver advertisingIdResolver, ub ubVar, c6 c6Var, g7 g7Var, d3<z3> d3Var) {
        this.f12870a = advertisingIdResolver;
        this.f12871b = ubVar;
        this.f12872c = c6Var;
        this.f12873d = g7Var;
        this.f12874e = d3Var;
    }

    public final o7.a a(String str, y0 y0Var, b3<Throwable, Void> b3Var) {
        Map<String, String> map;
        if (y0Var != null) {
            map = a();
            try {
                c7 c7Var = new c7();
                y0Var.a((m8) c7Var);
                str = a(str, c7Var.toString());
            } catch (SDKException e10) {
                i4.a((Throwable) e10);
                return null;
            }
        } else {
            map = null;
        }
        String str2 = this.f12871b.f12678a;
        boolean z10 = b().f12912a;
        long currentTimeMillis = System.currentTimeMillis();
        long a10 = wb.a();
        g7 g7Var = this.f12873d;
        n7 n7Var = g7Var != null ? new n7(g7Var) : null;
        try {
            o7.a a11 = o7.a(str, map, str2, z10);
            if (n7Var != null) {
                n7Var.a("GET", str, (SDKException) null);
            }
            a11.f11525d = currentTimeMillis;
            a11.f11526e = a10;
            a11.f11527f = wb.a();
            return a11;
        } catch (SDKException e11) {
            if (n7Var != null) {
                n7Var.a("GET", str, e11);
            }
            if (b3Var != null) {
                b3Var.a(e11);
            }
        } catch (Throwable th) {
            i4.a(th);
        }
        return null;
    }

    public final z3 b() {
        z3 call = this.f12874e.call();
        return call != null ? call : z3.f12911c;
    }

    public static String a(String str, String str2) {
        if (!str.contains("?") || !str2.startsWith("?")) {
            return f.a(str, str2);
        }
        StringBuilder a10 = t.f.a(str, "&");
        a10.append(str2.substring(1));
        return a10.toString();
    }

    public final String a(String str, y0 y0Var, byte[] bArr, boolean z10, b3<Throwable, Void> b3Var) {
        Map<String, String> map;
        if (bArr != null) {
            map = null;
        } else if (y0Var != null) {
            Map<String, String> a10 = a();
            try {
                p5 p5Var = new p5();
                y0Var.a((m8) p5Var);
                byte[] bytes = p5Var.f11572a.toString().getBytes();
                if (b().f12912a) {
                    try {
                        Map<Activity, Integer> map2 = wb.f12765a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        bytes = byteArrayOutputStream.toByteArray();
                        z10 = true;
                    } catch (IOException e10) {
                        i4.a((Throwable) e10);
                    }
                }
                Map<String, String> map3 = a10;
                bArr = bytes;
                map = map3;
            } catch (SDKException e11) {
                i4.a((Throwable) e11);
                return null;
            }
        } else {
            map = null;
            bArr = null;
        }
        String str2 = this.f12871b.f12678a;
        g7 g7Var = this.f12873d;
        n7 n7Var = g7Var != null ? new n7(g7Var) : null;
        try {
            String a11 = o7.a(str, bArr, map, str2, z10);
            if (n7Var != null) {
                n7Var.a("POST", str, (SDKException) null);
            }
            return a11 != null ? a11 : "";
        } catch (SDKException e12) {
            if (n7Var != null) {
                n7Var.a("POST", str, e12);
            }
            if (b3Var != null) {
                b3Var.a(e12);
            }
        } catch (Throwable th) {
            i4.a(th);
        }
        return null;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        if (!b().f12913b) {
            String str = null;
            try {
                str = URLEncoder.encode(this.f12870a.a().f12591a, "UTF-8");
            } catch (Throwable th) {
                i4.a(th);
            }
            hashMap.put("device-id", str);
        }
        hashMap.put("Accept-Language", ((b6) this.f12872c.b()).f10139c);
        return hashMap;
    }
}
