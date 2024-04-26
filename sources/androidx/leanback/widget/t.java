package androidx.leanback.widget;

import android.os.Bundle;
import androidx.activity.e;
import java.net.DatagramPacket;
import o8.i6;
import o8.p;
import o8.r;
import we.c;

/* compiled from: HeaderItem */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2524a;

    /* renamed from: b  reason: collision with root package name */
    public long f2525b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2526c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2527d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2528e;

    public t(String str, String str2, Bundle bundle, long j10) {
        this.f2524a = 1;
        this.f2526c = str;
        this.f2527d = str2;
        this.f2528e = bundle;
        this.f2525b = j10;
    }

    public static t g(r rVar) {
        return new t(rVar.f23414a, rVar.f23416c, rVar.f23415b.i(), rVar.f23417d);
    }

    public byte[] a() {
        Object obj = this.f2528e;
        if (((byte[]) obj) != null) {
            return (byte[]) obj;
        }
        DatagramPacket datagramPacket = (DatagramPacket) this.f2527d;
        byte[] bytes = new String(datagramPacket.getData(), 0, datagramPacket.getLength()).getBytes();
        this.f2528e = bytes;
        return bytes;
    }

    public String b() {
        return c.a(a(), "USN");
    }

    public boolean c() {
        String a10 = c.a(a(), "NTS");
        if (a10 == null) {
            return false;
        }
        return a10.startsWith("ssdp:byebye");
    }

    public boolean d() {
        boolean z10;
        boolean z11;
        String a10 = c.a(a(), "NT");
        if (a10 == null) {
            z10 = false;
        } else {
            z10 = a10.startsWith("upnp:rootdevice");
        }
        if (z10) {
            return true;
        }
        String a11 = c.a(a(), "ST");
        if (a11 == null) {
            z11 = false;
        } else if (a11.equals("upnp:rootdevice")) {
            z11 = true;
        } else {
            z11 = a11.equals("\"upnp:rootdevice\"");
        }
        if (z11) {
            return true;
        }
        String b10 = b();
        if (b10 == null) {
            return false;
        }
        return b10.endsWith("upnp:rootdevice");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0102, code lost:
        if (r14 == null) goto L_0x0107;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k8.y2 e(java.lang.String r18, k8.y2 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.z()
            java.util.List r9 = r19.A()
            java.lang.Object r2 = r1.f2528e
            o8.i6 r2 = (o8.i6) r2
            o8.u5 r2 = r2.f23413b
            com.google.android.gms.measurement.internal.q r2 = r2.f23476g
            o8.u5.I(r2)
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.q.o(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L_0x024d
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01ff
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            o8.u5 r0 = r0.f23413b
            com.google.android.gms.measurement.internal.q r0 = r0.f23476g
            o8.u5.I(r0)
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.q.o(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8798g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r5
        L_0x005b:
            java.lang.Object r0 = r1.f2526c
            k8.y2 r0 = (k8.y2) r0
            r12 = 1
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r1.f2527d
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0078
            long r13 = r4.longValue()
            java.lang.Object r0 = r1.f2527d
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0135
        L_0x0078:
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            o8.u5 r0 = r0.f23413b
            o8.j r13 = r0.f23472c
            o8.u5.I(r13)
            r13.h()
            r13.i()
            android.database.sqlite.SQLiteDatabase r0 = r13.C()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r14[r10] = r3     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r14[r12] = r15     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r0 != 0) goto L_0x00b8
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x00b6 }
            o8.a3 r0 = r0.f8805n     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00b6 }
            r14.close()
            r0 = r5
            goto L_0x0108
        L_0x00b6:
            r0 = move-exception
            goto L_0x00f5
        L_0x00b8:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00b6 }
            long r15 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00b6 }
            k8.x2 r5 = k8.y2.w()     // Catch:{ IOException -> 0x00dc }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r5, r0)     // Catch:{ IOException -> 0x00dc }
            k8.x2 r0 = (k8.x2) r0     // Catch:{ IOException -> 0x00dc }
            k8.k6 r0 = r0.f()     // Catch:{ IOException -> 0x00dc }
            k8.y2 r0 = (k8.y2) r0     // Catch:{ IOException -> 0x00dc }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00b6 }
            r14.close()
            goto L_0x0108
        L_0x00dc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r5 = r13.f8864a     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ SQLiteException -> 0x00b6 }
            o8.a3 r5 = r5.f8797f     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.h.t(r18)     // Catch:{ SQLiteException -> 0x00b6 }
            r5.d(r15, r10, r4, r0)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0104
        L_0x00ef:
            r0 = move-exception
            r5 = 0
            goto L_0x01f9
        L_0x00f3:
            r0 = move-exception
            r14 = 0
        L_0x00f5:
            com.google.android.gms.measurement.internal.l r5 = r13.f8864a     // Catch:{ all -> 0x01f7 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x01f7 }
            o8.a3 r5 = r5.f8797f     // Catch:{ all -> 0x01f7 }
            java.lang.String r10 = "Error selecting main event"
            r5.b(r10, r0)     // Catch:{ all -> 0x01f7 }
            if (r14 == 0) goto L_0x0107
        L_0x0104:
            r14.close()
        L_0x0107:
            r0 = 0
        L_0x0108:
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0110
            goto L_0x01e4
        L_0x0110:
            k8.y2 r5 = (k8.y2) r5
            r1.f2526c = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.f2525b = r13
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            o8.u5 r0 = r0.f23413b
            com.google.android.gms.measurement.internal.q r0 = r0.f23476g
            o8.u5.I(r0)
            java.lang.Object r0 = r1.f2526c
            k8.y2 r0 = (k8.y2) r0
            java.lang.Object r0 = com.google.android.gms.measurement.internal.q.o(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f2527d = r0
        L_0x0135:
            long r13 = r1.f2525b
            r15 = -1
            long r13 = r13 + r15
            r1.f2525b = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0179
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            o8.u5 r0 = r0.f23413b
            o8.j r2 = r0.f23472c
            o8.u5.I(r2)
            r2.h()
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.C()     // Catch:{ SQLiteException -> 0x016a }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x016a }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x016a }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x016a }
            goto L_0x0190
        L_0x016a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x0190
        L_0x0179:
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            o8.u5 r0 = r0.f23413b
            o8.j r2 = r0.f23472c
            o8.u5.I(r2)
            long r5 = r1.f2525b
            java.lang.Object r0 = r1.f2526c
            r7 = r0
            k8.y2 r7 = (k8.y2) r7
            r3 = r18
            r2.s(r3, r4, r5, r7)
        L_0x0190:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r1.f2526c
            k8.y2 r2 = (k8.y2) r2
            java.util.List r2 = r2.A()
            java.util.Iterator r2 = r2.iterator()
        L_0x01a1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c6
            java.lang.Object r3 = r2.next()
            k8.c3 r3 = (k8.c3) r3
            java.lang.Object r4 = r1.f2528e
            o8.i6 r4 = (o8.i6) r4
            o8.u5 r4 = r4.f23413b
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g
            o8.u5.I(r4)
            java.lang.String r4 = r3.y()
            k8.c3 r4 = com.google.android.gms.measurement.internal.q.n(r8, r4)
            if (r4 != 0) goto L_0x01a1
            r0.add(r3)
            goto L_0x01a1
        L_0x01c6:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01d1
            r0.addAll(r9)
            r9 = r0
            goto L_0x01e2
        L_0x01d1:
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8798g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r11)
        L_0x01e2:
            r0 = r11
            goto L_0x024d
        L_0x01e4:
            java.lang.Object r0 = r1.f2528e
            o8.i6 r0 = (o8.i6) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8798g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r11, r4)
            r2 = 0
            return r2
        L_0x01f7:
            r0 = move-exception
            r5 = r14
        L_0x01f9:
            if (r5 == 0) goto L_0x01fe
            r5.close()
        L_0x01fe:
            throw r0
        L_0x01ff:
            r1.f2527d = r4
            r1.f2526c = r8
            java.lang.Object r2 = r1.f2528e
            o8.i6 r2 = (o8.i6) r2
            o8.u5 r2 = r2.f23413b
            com.google.android.gms.measurement.internal.q r2 = r2.f23476g
            o8.u5.I(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.q.o(r8, r5)
            if (r5 == 0) goto L_0x021b
            r2 = r5
        L_0x021b:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f2525b = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0239
            java.lang.Object r2 = r1.f2528e
            o8.i6 r2 = (o8.i6) r2
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8798g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.b(r3, r0)
            goto L_0x024d
        L_0x0239:
            java.lang.Object r2 = r1.f2528e
            o8.i6 r2 = (o8.i6) r2
            o8.u5 r2 = r2.f23413b
            o8.j r2 = r2.f23472c
            o8.u5.I(r2)
            long r5 = r1.f2525b
            r3 = r18
            r7 = r19
            r2.s(r3, r4, r5, r7)
        L_0x024d:
            k8.h6 r2 = r19.o()
            k8.x2 r2 = (k8.x2) r2
            r2.r(r0)
            boolean r0 = r2.f20243c
            if (r0 == 0) goto L_0x0260
            r2.h()
            r3 = 0
            r2.f20243c = r3
        L_0x0260:
            MessageType r0 = r2.f20242b
            k8.y2 r0 = (k8.y2) r0
            k8.y2.E(r0)
            boolean r0 = r2.f20243c
            if (r0 == 0) goto L_0x0271
            r2.h()
            r3 = 0
            r2.f20243c = r3
        L_0x0271:
            MessageType r0 = r2.f20242b
            k8.y2 r0 = (k8.y2) r0
            k8.y2.D(r0, r9)
            k8.k6 r0 = r2.f()
            k8.y2 r0 = (k8.y2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.t.e(java.lang.String, k8.y2):k8.y2");
    }

    public r f() {
        return new r((String) this.f2526c, new p(new Bundle((Bundle) this.f2528e)), (String) this.f2527d, this.f2525b);
    }

    public String toString() {
        switch (this.f2524a) {
            case 1:
                String str = (String) this.f2527d;
                String str2 = (String) this.f2526c;
                String valueOf = String.valueOf((Bundle) this.f2528e);
                int length = String.valueOf(str).length();
                StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
                s.a(sb2, "origin=", str, ",name=", str2);
                return e.a(sb2, ",params=", valueOf);
            case 3:
                return new String(a());
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(i6 i6Var) {
        this.f2524a = 2;
        this.f2528e = i6Var;
    }

    public t(long j10, String str) {
        this.f2524a = 0;
        this.f2525b = j10;
        this.f2526c = str;
    }

    public t(byte[] bArr, int i10) {
        this.f2524a = 3;
        this.f2527d = null;
        this.f2526c = "";
        this.f2528e = null;
        this.f2527d = new DatagramPacket(bArr, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(String str) {
        this(-1, str);
        this.f2524a = 0;
    }
}
