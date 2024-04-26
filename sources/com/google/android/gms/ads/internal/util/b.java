package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.c;
import com.google.android.gms.internal.ads.d7;
import d7.l;
import e8.p50;
import e8.t;
import e8.ti0;
import f7.m;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5656a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public String f5657b = "";
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public String f5658c = "";
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    public boolean f5659d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f5660e = "";

    public static String e(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", l.B.f13186c.H(context, str2));
        p50<String> a10 = new d(context).a(0, str, hashMap, (byte[]) null);
        try {
            return (String) ((d7) a10).get((long) ((Integer) ti0.f16763j.f16769f.a(t.f16659t2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e10) {
            String valueOf = String.valueOf(str);
            e.C(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e10);
            ((d7) a10).cancel(true);
            return null;
        } catch (InterruptedException e11) {
            String valueOf2 = String.valueOf(str);
            e.C(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e11);
            ((d7) a10).cancel(true);
            return null;
        } catch (Exception e12) {
            String valueOf3 = String.valueOf(str);
            e.C(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e12);
            return null;
        }
    }

    public final void a(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            e.J("Can not create dialog without Activity Context");
        } else {
            p.f5702i.post(new m(context, str, z10, z11));
        }
    }

    public final boolean b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !l.B.f13196m.g()) {
            return false;
        }
        e.E("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) ti0.f16763j.f16769f.a(t.f16653s2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        p pVar = l.B.f13186c;
        p.r(context, str, buildUpon.build().toString());
    }

    public final Uri d(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f5656a) {
            if (TextUtils.isEmpty(this.f5657b)) {
                p pVar = l.B.f13186c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    c.a(openFileInput, byteArrayOutputStream, true, 1024);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    e.E("Error reading from internal storage.");
                    str5 = "";
                }
                this.f5657b = str5;
                if (TextUtils.isEmpty(str5)) {
                    p pVar2 = l.B.f13186c;
                    String K = p.K();
                    this.f5657b = K;
                    p pVar3 = l.B.f13186c;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(K.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        e.C("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f5657b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void f(Context context, String str, String str2) {
        p pVar = l.B.f13186c;
        p.q(context, d(context, (String) ti0.f16763j.f16769f.a(t.f16635p2), str, str2));
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f5656a) {
            z10 = this.f5659d;
        }
        return z10;
    }
}
