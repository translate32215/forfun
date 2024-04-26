package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import d7.l;
import e7.e;
import e8.a7;
import e8.h9;
import e8.o50;
import e8.p3;
import e8.p50;
import e8.q3;
import e8.r3;
import e8.r5;
import e8.t;
import e8.ti0;
import e8.w3;
import e8.wi0;
import e8.x3;
import e8.z3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class t1 implements wx {

    /* renamed from: a  reason: collision with root package name */
    public volatile q3 f8173a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8174b;

    public t1(Context context) {
        this.f8174b = context;
    }

    public final wi0 a(a<?> aVar) throws r5 {
        Map<String, String> a10 = aVar.a();
        int size = a10.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry next : a10.entrySet()) {
            strArr[i11] = (String) next.getKey();
            strArr2[i11] = (String) next.getValue();
            i11++;
        }
        p3 p3Var = new p3(aVar.f5922c, strArr, strArr2);
        long a11 = l.B.f13193j.a();
        try {
            d7 d7Var = new d7();
            this.f8173a = new q3(this.f8174b, l.B.f13200q.b(), new x3(this, d7Var), new z3(d7Var));
            this.f8173a.n();
            w3 w3Var = new w3(p3Var);
            o50 o50 = h9.f14881a;
            p50 e10 = yh.e(yh.j(d7Var, w3Var, o50), (long) ((Integer) ti0.f16763j.f16769f.a(t.f16599j2)).intValue(), TimeUnit.MILLISECONDS, h9.f14884d);
            e10.a(new e(this), o50);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) e10.get();
            long a12 = l.B.f13193j.a() - a11;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(a12);
            sb2.append("ms");
            l0.e.H(sb2.toString());
            r3 r3Var = (r3) new a7(parcelFileDescriptor).i(r3.CREATOR);
            if (r3Var == null) {
                return null;
            }
            if (r3Var.f16227a) {
                throw new r5(r3Var.f16228b);
            } else if (r3Var.f16231e.length != r3Var.f16232f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = r3Var.f16231e;
                    if (i10 >= strArr3.length) {
                        return new wi0(r3Var.f16229c, r3Var.f16230d, (Map<String, String>) hashMap, r3Var.f16233g, r3Var.f16234h);
                    }
                    hashMap.put(strArr3[i10], r3Var.f16232f[i10]);
                    i10++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(l.B.f13193j.a() - a11);
            sb3.append("ms");
            l0.e.H(sb3.toString());
            return null;
        } catch (Throwable th) {
            StringBuilder sb4 = new StringBuilder(52);
            sb4.append("Http assets remote cache took ");
            sb4.append(l.B.f13193j.a() - a11);
            sb4.append("ms");
            l0.e.H(sb4.toString());
            throw th;
        }
    }
}
