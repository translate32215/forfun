package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.internal.ads.cw;
import d7.l;
import e8.t;
import e8.th0;
import e8.ti0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nv {

    /* renamed from: a  reason: collision with root package name */
    public final th0 f7658a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final cw.a f7659b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7660c;

    public nv(th0 th0) {
        this.f7659b = cw.J();
        this.f7658a = th0;
        this.f7660c = ((Boolean) ti0.f16763j.f16769f.a(t.f16695z2)).booleanValue();
    }

    public static List<Long> f() {
        List<String> c10 = t.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c10).iterator();
        while (it.hasNext()) {
            for (String valueOf : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    e.H("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(mv mvVar) {
        if (this.f7660c) {
            try {
                mvVar.d(this.f7659b);
            } catch (NullPointerException e10) {
                y6 y6Var = l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void b(ov ovVar) {
        if (this.f7660c) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.A2)).booleanValue()) {
                d(ovVar);
            } else {
                c(ovVar);
            }
        }
    }

    public final synchronized void c(ov ovVar) {
        cw.a aVar = this.f7659b;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        cw.y((cw) aVar.f5970b);
        List<Long> f10 = f();
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        cw.E((cw) aVar.f5970b, f10);
        th0 th0 = this.f7658a;
        byte[] f11 = ((cw) ((aq) this.f7659b.j())).f();
        th0.getClass();
        int i10 = ovVar.f7779a;
        try {
            if (th0.f16760b) {
                th0.f16759a.b1(f11);
                th0.f16759a.a4(0);
                th0.f16759a.g5(i10);
                th0.f16759a.T4((int[]) null);
                th0.f16759a.A4();
            }
        } catch (RemoteException e10) {
            e.A("Clearcut log failed", e10);
        }
        String valueOf = String.valueOf(Integer.toString(ovVar.f7779a, 10));
        e.H(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
        return;
    }

    public final synchronized void d(ov ovVar) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(e(ovVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        e.H("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    e.H("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        e.H("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                e.H("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    e.H("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    public final synchronized String e(ov ovVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{((cw) this.f7659b.f5970b).G(), Long.valueOf(l.B.f13193j.a()), Integer.valueOf(ovVar.f7779a), Base64.encodeToString(((cw) ((aq) this.f7659b.j())).f(), 3)});
    }

    public nv() {
        this.f7659b = cw.J();
        this.f7660c = false;
        this.f7658a = new th0();
    }
}
