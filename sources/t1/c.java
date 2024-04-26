package t1;

import ab.j;
import ab.k;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.LiveData;
import c8.b;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.ch;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.ju;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.n8;
import com.google.android.gms.internal.ads.np;
import com.google.android.gms.internal.ads.p7;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.zh;
import com.startapp.startappsdk.R;
import d7.l;
import e8.ah;
import e8.c10;
import e8.d30;
import e8.dt;
import e8.dv;
import e8.f3;
import e8.f70;
import e8.ft;
import e8.gh;
import e8.h4;
import e8.j3;
import e8.k20;
import e8.mc0;
import e8.n30;
import e8.n40;
import e8.n9;
import e8.o50;
import e8.o9;
import e8.p4;
import e8.p50;
import e8.pf0;
import e8.q20;
import e8.r4;
import e8.r5;
import e8.t00;
import e8.t60;
import e8.v4;
import e8.vt;
import e8.yc0;
import f7.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import jd.a;
import k8.o;
import k8.z;
import l0.e;
import n2.g;
import o8.c3;
import o8.o5;
import o8.u5;
import r7.d;
import r7.t;
import r7.v;
import s8.i;
import z7.h;

/* compiled from: InvalidationLiveDataContainer */
public class c implements a, j3, s8.a, n40, o9, n9, pf0, zh, gf, ff, j9, z, c3, com.google.android.youtube.player.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25349a;

    /* renamed from: b  reason: collision with root package name */
    public Set<LiveData> f25350b;

    /* renamed from: c  reason: collision with root package name */
    public Object f25351c;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Set<androidx.lifecycle.LiveData>, java.util.concurrent.ConcurrentHashMap] */
    public c() {
        this.f25349a = 20;
        this.f25350b = new ConcurrentHashMap(16, 0.75f, 10);
        this.f25351c = new ReferenceQueue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[SYNTHETIC, Splitter:B:15:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[SYNTHETIC, Splitter:B:19:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t1.c d(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0029, Error -> 0x0027, OverlappingFileLockException -> 0x0025 }
            t1.c r1 = new t1.c     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            r1.<init>((java.nio.channels.FileChannel) r4, (java.nio.channels.FileLock) r5)     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0035
        L_0x0021:
            r1 = move-exception
            goto L_0x0035
        L_0x0023:
            r1 = move-exception
            goto L_0x0035
        L_0x0025:
            r5 = move-exception
            goto L_0x002a
        L_0x0027:
            r5 = move-exception
            goto L_0x002a
        L_0x0029:
            r5 = move-exception
        L_0x002a:
            r1 = r5
            r5 = r0
            goto L_0x0035
        L_0x002d:
            r4 = move-exception
            goto L_0x0032
        L_0x002f:
            r4 = move-exception
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            r1 = r4
            r4 = r0
            r5 = r4
        L_0x0035:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x0043
            r5.release()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.d(android.content.Context, java.lang.String):t1.c");
    }

    public static boolean i(js jsVar) {
        int i10 = n30.f15583a[jsVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
    }

    public void F(Object obj) {
        hf hfVar = (hf) this.f25350b;
        ((q20) obj).g((Cif) hfVar.f6855a, hfVar.f6856b, (Throwable) this.f25351c);
    }

    public /* synthetic */ void a(Object obj) {
        switch (this.f25349a) {
            case 9:
                n8 n8Var = (n8) this.f25351c;
                c10 c10 = n8Var.f7556g;
                d30 d30 = n8Var.f7555f;
                t00 t00 = n8Var.f7553d;
                qe qeVar = n8Var.f7554e;
                c10.c(d30.b(t00, qeVar, false, (String) this.f25350b, (String) obj, qeVar.f7948d));
                return;
            case 10:
                gh.a((gh) this.f25351c);
                ((zh) this.f25350b).a((ah) obj);
                return;
            default:
                ((t7) obj).r((String) this.f25350b, (f3) this.f25351c);
                return;
        }
    }

    public Object apply(Object obj) {
        dt dtVar = (dt) this.f25350b;
        ft ftVar = (ft) this.f25351c;
        dtVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(ftVar.f14678a));
        contentValues.put("gws_query_id", (String) ftVar.f14679b);
        contentValues.put("url", (String) ftVar.f14680c);
        contentValues.put("event_state", Integer.valueOf(ftVar.f14681d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", (String) null, contentValues);
        p pVar = l.B.f13186c;
        f u10 = p.u(dtVar.f14329a);
        if (u10 != null) {
            try {
                u10.zzap(new b(dtVar.f14329a));
            } catch (RemoteException e10) {
                e.v("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public g b(o oVar) {
        ((g) this.f25350b).B((String) this.f25351c, oVar);
        return (g) this.f25350b;
    }

    public ju c() {
        byte[] bArr = (byte[]) this.f25351c;
        return new p7(new ku(bArr), bArr.length, ((pf0) this.f25350b).c());
    }

    public Object e(i iVar) {
        switch (this.f25349a) {
            case 3:
                d dVar = (d) this.f25350b;
                Bundle bundle = (Bundle) this.f25351c;
                dVar.getClass();
                if (!iVar.l()) {
                    return iVar;
                }
                Bundle bundle2 = (Bundle) iVar.h();
                return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? iVar : dVar.b(bundle).m(v.f24734a, t.f24732a);
            case 28:
                Context context = (Context) this.f25350b;
                Intent intent = (Intent) this.f25351c;
                Object obj = com.google.firebase.messaging.a.f9712c;
                return (!h.d() || ((Integer) iVar.h()).intValue() != 402) ? iVar : com.google.firebase.messaging.a.a(context, intent).e(j.f227a, k.f228a);
            default:
                com.google.firebase.messaging.c cVar = (com.google.firebase.messaging.c) this.f25350b;
                String str = (String) this.f25351c;
                synchronized (cVar) {
                    cVar.f9722b.remove(str);
                }
                return iVar;
        }
    }

    public String f(String str) {
        int identifier = ((Resources) this.f25350b).getIdentifier(str, "string", (String) this.f25351c);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f25350b).getString(identifier);
    }

    public void g() {
        try {
            ((FileLock) this.f25351c).release();
            ((FileChannel) this.f25350b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public Object get() {
        switch (this.f25349a) {
            case 1:
                return new p4.g((Context) ((a) this.f25350b).get(), (p4.e) ((a) this.f25351c).get());
            default:
                return ((e8.l) this.f25351c).d(((com.google.android.gms.internal.ads.e) this.f25350b).f6257e);
        }
    }

    public <O> dv h(Callable<O> callable, o50 o50) {
        return new dv((k20) this.f25351c, (Object) this.f25350b, (p50) k20.f15222d, Collections.emptyList(), (p50) o50.i(callable));
    }

    public String j() {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String property = System.getProperty("os.arch");
        if (!TextUtils.isEmpty(property) && hashSet.contains(property)) {
            return property;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e10) {
            mf mfVar = (mf) this.f25351c;
            if (mfVar != null) {
                mfVar.a(2024, 0, e10);
            }
        } catch (IllegalAccessException e11) {
            mf mfVar2 = (mf) this.f25351c;
            if (mfVar2 != null) {
                mfVar2.a(2024, 0, e11);
            }
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    public js k() {
        FileInputStream fileInputStream;
        js jsVar = js.UNKNOWN;
        js jsVar2 = js.UNSUPPORTED;
        File file = new File(new File(((Context) this.f25350b).getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            Object obj = this.f25351c;
            if (((mf) obj) != null) {
                ((mf) obj).d(5017, "No lib/");
            }
            return jsVar;
        }
        File[] listFiles = file.listFiles(new ch(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            Object obj2 = this.f25351c;
            if (((mf) obj2) != null) {
                ((mf) obj2).d(5017, "No .so");
            }
            return jsVar;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            byte[] bArr = new byte[20];
            if (fileInputStream.read(bArr) == 20) {
                byte[] bArr2 = {0, 0};
                if (bArr[5] == 2) {
                    r(bArr, (String) null);
                    fileInputStream.close();
                    return jsVar2;
                }
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s10 = ByteBuffer.wrap(bArr2).getShort();
                if (s10 == 3) {
                    js jsVar3 = js.X86;
                    fileInputStream.close();
                    return jsVar3;
                } else if (s10 == 40) {
                    js jsVar4 = js.ARM7;
                    fileInputStream.close();
                    return jsVar4;
                } else if (s10 == 62) {
                    js jsVar5 = js.X86_64;
                    fileInputStream.close();
                    return jsVar5;
                } else if (s10 != 183) {
                    r(bArr, (String) null);
                    fileInputStream.close();
                    return jsVar2;
                } else {
                    js jsVar6 = js.ARM64;
                    fileInputStream.close();
                    return jsVar6;
                }
            } else {
                fileInputStream.close();
                return jsVar2;
            }
        } catch (IOException e10) {
            r((byte[]) null, e10.toString());
        } catch (Throwable th) {
            t60.f16708a.b(th, th);
        }
        throw th;
    }

    public void l(yc0 yc0) {
        if (((mc0) this.f25351c) != null) {
            ((Handler) this.f25350b).post(new e7.i(this, yc0));
        }
    }

    public /* synthetic */ void m(Object obj) {
        h4 h4Var = (h4) obj;
        synchronized (((h2) this.f25351c).f6725a) {
            Object obj2 = this.f25351c;
            ((h2) obj2).f6732h = 0;
            if (!(((h2) obj2).f6731g == null || ((r4) this.f25350b) == ((h2) obj2).f6731g)) {
                e.H("New JS engine is loaded, marking previous one as destroyable.");
                ((h2) this.f25351c).f6731g.r();
            }
            ((h2) this.f25351c).f6731g = (r4) this.f25350b;
        }
    }

    public void n(Throwable th) {
        switch (this.f25349a) {
            case 9:
                n8 n8Var = (n8) this.f25351c;
                c10 c10 = n8Var.f7556g;
                d30 d30 = n8Var.f7555f;
                t00 t00 = n8Var.f7553d;
                qe qeVar = n8Var.f7554e;
                c10.c(d30.b(t00, qeVar, false, (String) this.f25350b, (String) null, qeVar.f7948d));
                return;
            case 10:
                gh.a((gh) this.f25351c);
                ((zh) this.f25350b).n(th);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    public void o(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        o8.j jVar;
        u5 u5Var = (u5) this.f25351c;
        String str2 = (String) this.f25350b;
        u5Var.b().h();
        u5Var.g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                u5Var.f23489t = false;
                u5Var.A();
                throw th2;
            }
        }
        List<Long> list = u5Var.f23493x;
        com.google.android.gms.common.internal.i.h(list);
        u5Var.f23493x = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            u5Var.d().f8805n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            u5Var.f23478i.f23249j.b(u5Var.e().b());
            if (i10 == 503 || i10 == 429) {
                u5Var.f23478i.f23247h.b(u5Var.e().b());
            }
            o8.j jVar2 = u5Var.f23472c;
            u5.I(jVar2);
            jVar2.T(list);
            u5Var.D();
            u5Var.f23489t = false;
            u5Var.A();
        }
        if (th == null) {
            try {
                u5Var.f23478i.f23248i.b(u5Var.e().b());
                u5Var.f23478i.f23249j.b(0);
                u5Var.D();
                u5Var.d().f8805n.c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                o8.j jVar3 = u5Var.f23472c;
                u5.I(jVar3);
                jVar3.Q();
                try {
                    for (Long next : list) {
                        try {
                            jVar = u5Var.f23472c;
                            u5.I(jVar);
                            long longValue = next.longValue();
                            jVar.h();
                            jVar.i();
                            if (jVar.C().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e10) {
                            jVar.f8864a.d().f8797f.b("Failed to delete a bundle in a queue table", e10);
                            throw e10;
                        } catch (SQLiteException e11) {
                            List<Long> list2 = u5Var.f23494y;
                            if (list2 == null || !list2.contains(next)) {
                                throw e11;
                            }
                        }
                    }
                    o8.j jVar4 = u5Var.f23472c;
                    u5.I(jVar4);
                    jVar4.n();
                    o8.j jVar5 = u5Var.f23472c;
                    u5.I(jVar5);
                    jVar5.S();
                    u5Var.f23494y = null;
                    com.google.android.gms.measurement.internal.i iVar = u5Var.f23471b;
                    u5.I(iVar);
                    if (!iVar.m() || !u5Var.G()) {
                        u5Var.f23495z = -1;
                        u5Var.D();
                    } else {
                        u5Var.t();
                    }
                    u5Var.f23484o = 0;
                    u5Var.f23489t = false;
                    u5Var.A();
                } catch (Throwable th3) {
                    o8.j jVar6 = u5Var.f23472c;
                    u5.I(jVar6);
                    jVar6.S();
                    throw th3;
                }
            } catch (SQLiteException e12) {
                u5Var.d().f8797f.b("Database error while trying to delete uploaded bundles", e12);
                u5Var.f23484o = u5Var.e().a();
                u5Var.d().f8805n.b("Disable upload, time", Long.valueOf(u5Var.f23484o));
            }
        }
        u5Var.d().f8805n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        u5Var.f23478i.f23249j.b(u5Var.e().b());
        u5Var.f23478i.f23247h.b(u5Var.e().b());
        o8.j jVar22 = u5Var.f23472c;
        u5.I(jVar22);
        jVar22.T(list);
        u5Var.D();
        u5Var.f23489t = false;
        u5Var.A();
    }

    public void p(r5 r5Var) {
        String str = (String) this.f25350b;
        String exc = r5Var.toString();
        StringBuilder sb2 = new StringBuilder(androidx.appcompat.widget.o.a(exc, androidx.appcompat.widget.o.a(str, 21)));
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(exc);
        e.K(sb2.toString());
        ((u) this.f25351c).b(null);
    }

    public mp q() {
        if (((sp) this.f25350b).t() == 0) {
            return new np((byte[]) this.f25351c);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public void r(byte[] bArr, String str) {
        if (((mf) this.f25351c) != null) {
            StringBuilder a10 = android.support.v4.media.a.a("os.arch:");
            a10.append(System.getProperty("os.arch"));
            a10.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
                if (strArr != null) {
                    a10.append("supported_abis:");
                    a10.append(Arrays.toString(strArr));
                    a10.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            a10.append("CPU_ABI:");
            a10.append(Build.CPU_ABI);
            a10.append(";");
            a10.append("CPU_ABI2:");
            a10.append(Build.CPU_ABI2);
            a10.append(";");
            if (bArr != null) {
                a10.append("ELF:");
                a10.append(Arrays.toString(bArr));
                a10.append(";");
            }
            if (str != null) {
                a10.append("dbg:");
                a10.append(str);
                a10.append(";");
            }
            ((mf) this.f25351c).d(4007, a10.toString());
        }
    }

    public void run() {
        switch (this.f25349a) {
            case 7:
                ((d7) this.f25350b).c(new v4("Unable to obtain a JavascriptEngine."));
                ((p4) this.f25351c).p();
                return;
            default:
                ((n) ((vt) this.f25350b).f17162b).L3((com.google.android.gms.internal.ads.l) this.f25351c);
                return;
        }
    }

    public <O> dv s(p50<O> p50) {
        return new dv((k20) this.f25351c, (Object) this.f25350b, (p50) k20.f15222d, Collections.emptyList(), (p50) p50);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r2, android.content.Intent r3) {
        /*
            r1 = this;
            r0 = 28
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, com.google.android.gms.internal.ads.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.internal.ads.e r2, e8.l r3) {
        /*
            r1 = this;
            r0 = 5
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.internal.ads.e, e8.l):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, com.google.android.gms.internal.ads.hf] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.internal.ads.hf r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            r0 = 15
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.internal.ads.hf, java.lang.Throwable):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Set<androidx.lifecycle.LiveData>, k8.x0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, k8.x0 r3) {
        /*
            r1 = this;
            r0 = 25
            r1.f25349a = r0
            r1.f25351c = r2
            r1.<init>()
            r1.f25350b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService, k8.x0):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.firebase.messaging.c, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.firebase.messaging.c r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 29
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.firebase.messaging.c, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.dt, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.dt r2, e8.ft r3) {
        /*
            r1 = this;
            r0 = 12
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(e8.dt, e8.ft):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.vt, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.vt r2, com.google.android.gms.internal.ads.l r3) {
        /*
            r1 = this;
            r0 = 13
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(e8.vt, com.google.android.gms.internal.ads.l):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, e8.pf0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.pf0 r2, byte[] r3) {
        /*
            r1 = this;
            r0 = 8
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(e8.pf0, byte[]):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, n2.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(n2.g r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 21
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(n2.g, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(o8.q3 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 22
            r1.f25349a = r0
            r1.f25351c = r2
            r1.f25350b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(o8.q3, java.lang.String):void");
    }

    public c(o5 o5Var) {
        this.f25349a = 23;
        this.f25351c = o5Var;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(o8.u5 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 24
            r1.f25349a = r0
            r1.f25351c = r2
            r1.f25350b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(o8.u5, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, r7.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(r7.d r2, android.os.Bundle r3) {
        /*
            r1 = this;
            r0 = 3
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(r7.d, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.Object, z9.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(z9.c r2, z9.e r3) {
        /*
            r1 = this;
            r0 = 26
            r1.f25349a = r0
            r1.<init>()
            java.lang.String r0 = "connectionClient cannot be null"
            u.b.b(r2, r0)
            r1.f25350b = r2
            java.lang.String r2 = "embeddedPlayer cannot be null"
            u.b.b(r3, r2)
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(z9.c, z9.e):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.sp$b, java.util.Set<androidx.lifecycle.LiveData>] */
    public c(int i10) {
        this.f25349a = 17;
        byte[] bArr = new byte[i10];
        this.f25351c = bArr;
        Logger logger = sp.f8137b;
        this.f25350b = new sp.b(bArr, i10);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Set<androidx.lifecycle.LiveData>, android.content.res.Resources] */
    public c(Context context) {
        this.f25349a = 4;
        if (context != null) {
            ? resources = context.getResources();
            this.f25350b = resources;
            this.f25351c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r2, com.google.android.gms.internal.ads.mf r3) {
        /*
            r1 = this;
            r0 = 16
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(android.content.Context, com.google.android.gms.internal.ads.mf):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.os.Handler r2, e8.mc0 r3) {
        /*
            r1 = this;
            r0 = 18
            r1.f25349a = r0
            r1.<init>()
            if (r3 == 0) goto L_0x000d
            r2.getClass()
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(android.os.Handler, e8.mc0):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e8.r4, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.internal.ads.h2 r2, e8.r4 r3) {
        /*
            r1 = this;
            r0 = 6
            r1.f25349a = r0
            r1.f25351c = r2
            r1.f25350b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.internal.ads.h2, e8.r4):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7, java.util.Set<androidx.lifecycle.LiveData>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.internal.ads.d7 r2, e8.p4 r3) {
        /*
            r1 = this;
            r0 = 7
            r1.f25349a = r0
            r1.f25350b = r2
            r1.f25351c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.internal.ads.d7, e8.p4):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.google.android.gms.internal.ads.n8 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 9
            r1.f25349a = r0
            r1.f25351c = r2
            r1.f25350b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(com.google.android.gms.internal.ads.n8, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Set<androidx.lifecycle.LiveData>, com.google.android.gms.internal.ads.zh] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.gh r2, com.google.android.gms.internal.ads.zh r3) {
        /*
            r1 = this;
            r0 = 10
            r1.f25349a = r0
            r1.f25351c = r2
            r1.f25350b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(e8.gh, com.google.android.gms.internal.ads.zh):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, e8.f3 r3) {
        /*
            r1 = this;
            r0 = 11
            r1.f25349a = r0
            r1.f25350b = r2
            r1.f25351c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(java.lang.String, e8.f3):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, f7.u r3) {
        /*
            r1 = this;
            r0 = 2
            r1.f25349a = r0
            r1.f25350b = r2
            r1.f25351c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(java.lang.String, f7.u):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, f70 f70) {
        this(i10);
        this.f25349a = 17;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.k20 r1, java.lang.Object r2, e.h r3) {
        /*
            r0 = this;
            r3 = 14
            r0.f25349a = r3
            r0.f25349a = r3
            r0.f25351c = r1
            r0.<init>()
            r0.f25350b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(e8.k20, java.lang.Object, e.h):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, jd.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(jd.a r2, jd.a r3) {
        /*
            r1 = this;
            r0 = 1
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(jd.a, jd.a):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<androidx.lifecycle.LiveData>, java.nio.channels.FileChannel] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.nio.channels.FileChannel r2, java.nio.channels.FileLock r3) {
        /*
            r1 = this;
            r0 = 27
            r1.f25349a = r0
            r1.<init>()
            r1.f25350b = r2
            r1.f25351c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.<init>(java.nio.channels.FileChannel, java.nio.channels.FileLock):void");
    }

    public c(e eVar) {
        this.f25349a = 0;
        this.f25350b = Collections.newSetFromMap(new IdentityHashMap());
        this.f25351c = eVar;
    }
}
