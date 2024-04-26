package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.k9;
import e8.t60;
import e8.th0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;
import s8.i;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class mf {

    /* renamed from: d  reason: collision with root package name */
    public static volatile k9.c f7485d = k9.c.UNKNOWN;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7486a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7487b;

    /* renamed from: c  reason: collision with root package name */
    public final i<th0> f7488c;

    public mf(Context context, Executor executor, i<th0> iVar) {
        this.f7486a = context;
        this.f7487b = executor;
        this.f7488c = iVar;
    }

    public final i<Boolean> a(int i10, long j10, Exception exc) {
        return b(i10, j10, exc, (String) null, (String) null);
    }

    public final i b(int i10, long j10, Exception exc, String str, String str2) {
        k9.a F = k9.F();
        String packageName = this.f7486a.getPackageName();
        if (F.f5971c) {
            F.n();
            F.f5971c = false;
        }
        k9.A((k9) F.f5970b, packageName);
        if (F.f5971c) {
            F.n();
            F.f5971c = false;
        }
        k9.y((k9) F.f5970b, j10);
        k9.c cVar = f7485d;
        if (F.f5971c) {
            F.n();
            F.f5971c = false;
        }
        k9.z((k9) F.f5970b, cVar);
        if (exc != null) {
            Object obj = rg.f8038a;
            StringWriter stringWriter = new StringWriter();
            t60.f16708a.a(exc, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (F.f5971c) {
                F.n();
                F.f5971c = false;
            }
            k9.B((k9) F.f5970b, stringWriter2);
            String name = exc.getClass().getName();
            if (F.f5971c) {
                F.n();
                F.f5971c = false;
            }
            k9.C((k9) F.f5970b, name);
        }
        if (str2 != null) {
            if (F.f5971c) {
                F.n();
                F.f5971c = false;
            }
            k9.D((k9) F.f5970b, str2);
        }
        if (str != null) {
            if (F.f5971c) {
                F.n();
                F.f5971c = false;
            }
            k9.E((k9) F.f5970b, str);
        }
        return this.f7488c.e(this.f7487b, new se(F, i10));
    }

    public final i c(int i10, long j10, String str) {
        return b(i10, j10, (Exception) null, str, (String) null);
    }

    public final i<Boolean> d(int i10, String str) {
        return b(i10, 0, (Exception) null, (String) null, str);
    }

    public final i<Boolean> e(int i10, long j10) {
        return b(i10, j10, (Exception) null, (String) null, (String) null);
    }
}
