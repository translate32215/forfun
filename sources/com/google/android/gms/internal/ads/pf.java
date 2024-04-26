package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.k9;
import e8.qz;
import e8.t60;
import e8.th0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class pf {

    /* renamed from: c  reason: collision with root package name */
    public static final ConditionVariable f7857c = new ConditionVariable();

    /* renamed from: d  reason: collision with root package name */
    public static volatile th0 f7858d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Random f7859e = null;

    /* renamed from: a  reason: collision with root package name */
    public fr f7860a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Boolean f7861b;

    public pf(fr frVar) {
        this.f7860a = frVar;
        frVar.f6480b.execute(new qz(this));
    }

    public static Random b() {
        if (f7859e == null) {
            synchronized (pf.class) {
                if (f7859e == null) {
                    f7859e = new Random();
                }
            }
        }
        return f7859e;
    }

    public final void a(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f7857c.block();
            if (this.f7861b.booleanValue() && f7858d != null) {
                k9.a F = k9.F();
                String packageName = this.f7860a.f6479a.getPackageName();
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
                if (str != null) {
                    if (F.f5971c) {
                        F.n();
                        F.f5971c = false;
                    }
                    k9.D((k9) F.f5970b, str);
                }
                if (exc != null) {
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
                th0 th0 = f7858d;
                byte[] f10 = ((k9) ((aq) F.j())).f();
                th0.getClass();
                if (i11 == -1) {
                    i11 = 0;
                }
                try {
                    if (th0.f16760b) {
                        th0.f16759a.b1(f10);
                        th0.f16759a.a4(i11);
                        th0.f16759a.g5(i10);
                        th0.f16759a.T4((int[]) null);
                        th0.f16759a.A4();
                    }
                } catch (RemoteException e10) {
                    e.A("Clearcut log failed", e10);
                }
            }
        } catch (Exception unused) {
        }
    }
}
