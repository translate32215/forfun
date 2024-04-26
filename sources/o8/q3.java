package o8;

import android.text.TextUtils;
import cb.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import e8.cr;
import java.util.Map;
import k8.h1;
import k8.j2;
import k8.l2;
import k8.m2;
import k8.n2;
import k8.nb;
import k8.p0;
import k8.p2;
import k8.t6;
import k8.v3;
import k8.x3;
import s.a;
import s.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class q3 extends r5 implements e {

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Map<String, String>> f23399d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f23400e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f23401f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, n2> f23402g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f23403h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final g<String, p0> f23404i = new p3(this);

    /* renamed from: j  reason: collision with root package name */
    public final d f23405j = new d(this);

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f23406k = new a();

    public q3(u5 u5Var) {
        super(u5Var);
    }

    public static final Map<String, String> y(n2 n2Var) {
        a aVar = new a();
        for (p2 next : n2Var.C()) {
            aVar.put(next.t(), next.u());
        }
        return aVar;
    }

    public final String a(String str, String str2) {
        h();
        w(str);
        Map map = this.f23399d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean k() {
        return false;
    }

    public final int l(String str, String str2) {
        Integer num;
        h();
        w(str);
        Map map = this.f23403h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final n2 m(String str) {
        i();
        h();
        i.e(str);
        w(str);
        return this.f23402g.get(str);
    }

    public final boolean n(String str) {
        h();
        n2 m10 = m(str);
        if (m10 == null) {
            return false;
        }
        return m10.F();
    }

    public final boolean o(String str) {
        n2 n2Var;
        nb.b();
        if (!this.f8864a.f8843g.v((String) null, v2.f23536s0) || TextUtils.isEmpty(str) || (n2Var = this.f23402g.get(str)) == null || n2Var.s() == 0) {
            return false;
        }
        return true;
    }

    public final boolean p(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean q(String str, String str2) {
        Boolean bool;
        h();
        w(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f23401f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean r(String str, String str2) {
        Boolean bool;
        h();
        w(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && r.U(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && r.V(str2)) {
            return true;
        }
        Map map = this.f23400e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean s(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0375, code lost:
        if (r5.C().insertWithOnConflict(r4, (java.lang.String) null, r9, 5) != -1) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0377, code lost:
        r5.f8864a.d().f8797f.b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.h.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0388, code lost:
        r3 = r21;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03a2, code lost:
        r0 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03ae, code lost:
        if (r0.hasNext() == false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03b0, code lost:
        r3 = r0.next();
        r5.i();
        r5.h();
        com.google.android.gms.common.internal.i.e(r28);
        com.google.android.gms.common.internal.i.h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03ca, code lost:
        if (android.text.TextUtils.isEmpty(r3.w()) == false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03cc, code lost:
        r0 = r5.f8864a.d().f8800i;
        r9 = com.google.android.gms.measurement.internal.h.t(r28);
        r11 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03e2, code lost:
        if (r3.B() == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03e4, code lost:
        r3 = java.lang.Integer.valueOf(r3.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03ed, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03ee, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03f7, code lost:
        r9 = r3.i();
        r11 = new android.content.ContentValues();
        r11.put(r6, r2);
        r23 = r0;
        r11.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0410, code lost:
        if (r3.B() == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0412, code lost:
        r0 = java.lang.Integer.valueOf(r3.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x041b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x041c, code lost:
        r11.put("filter_id", r0);
        r24 = r6;
        r11.put("property_name", r3.w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x042e, code lost:
        if (r3.C() == false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0430, code lost:
        r0 = java.lang.Boolean.valueOf(r3.A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0439, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x043a, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x044c, code lost:
        if (r5.C().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x044e, code lost:
        r5.f8864a.d().f8797f.b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.h.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0460, code lost:
        r0 = r23;
        r6 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0466, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r5.f8864a.d().f8797f.c("Error storing property filter. appId", com.google.android.gms.measurement.internal.h.t(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04a5, code lost:
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x028e, code lost:
        r9 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x029a, code lost:
        if (r9.hasNext() == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02a6, code lost:
        if (r9.next().B() != false) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a8, code lost:
        r5.f8864a.d().f8800i.c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.h.t(r28), java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02bf, code lost:
        r9 = r0.y().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02cb, code lost:
        r6 = "app_id";
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02d9, code lost:
        if (r9.hasNext() == false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r11 = r9.next();
        r5.i();
        r5.h();
        com.google.android.gms.common.internal.i.e(r28);
        com.google.android.gms.common.internal.i.h(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02f5, code lost:
        if (android.text.TextUtils.isEmpty(r11.y()) == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f7, code lost:
        r0 = r5.f8864a.d().f8800i;
        r6 = com.google.android.gms.measurement.internal.h.t(r28);
        r9 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x030d, code lost:
        if (r11.G() == false) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x030f, code lost:
        r11 = java.lang.Integer.valueOf(r11.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0318, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0319, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r6, r9, java.lang.String.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0322, code lost:
        r3 = r11.i();
        r23 = r9;
        r9 = new android.content.ContentValues();
        r9.put(r6, r2);
        r9.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x033b, code lost:
        if (r11.G() == false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x033d, code lost:
        r6 = java.lang.Integer.valueOf(r11.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0346, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0347, code lost:
        r9.put("filter_id", r6);
        r9.put("event_name", r11.y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0357, code lost:
        if (r11.H() == false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0359, code lost:
        r6 = java.lang.Boolean.valueOf(r11.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0362, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0363, code lost:
        r9.put("session_scoped", r6);
        r9.put("data", r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r30
            r27.i()
            r27.h()
            com.google.android.gms.common.internal.i.e(r28)
            k8.n2 r0 = r27.u(r28, r29)
            k8.h6 r0 = r0.o()
            r4 = r0
            k8.m2 r4 = (k8.m2) r4
            r1.v(r2, r4)
            k8.nb.b()
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            o8.f r0 = r0.f8843g
            o8.u2<java.lang.Boolean> r5 = o8.v2.f23536s0
            r6 = 0
            boolean r0 = r0.v(r6, r5)
            if (r0 == 0) goto L_0x0036
            k8.k6 r0 = r4.f()
            k8.n2 r0 = (k8.n2) r0
            r1.x(r2, r0)
        L_0x0036:
            java.util.Map<java.lang.String, k8.n2> r0 = r1.f23402g
            k8.k6 r5 = r4.f()
            k8.n2 r5 = (k8.n2) r5
            r0.put(r2, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f23406k
            r0.put(r2, r3)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f23399d
            k8.k6 r5 = r4.f()
            k8.n2 r5 = (k8.n2) r5
            java.util.Map r5 = y(r5)
            r0.put(r2, r5)
            o8.u5 r0 = r1.f23413b
            o8.j r5 = r0.f23472c
            o8.u5.I(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            MessageType r0 = r4.f20242b
            k8.n2 r0 = (k8.n2) r0
            java.util.List r0 = r0.A()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.<init>(r0)
            java.lang.String r8 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r9 = "event_filters"
            java.lang.String r10 = "property_filters"
            r12 = 0
        L_0x0076:
            int r13 = r7.size()
            if (r12 >= r13) goto L_0x01f1
            java.lang.Object r13 = r7.get(r12)
            k8.u1 r13 = (k8.u1) r13
            k8.h6 r13 = r13.o()
            k8.t1 r13 = (k8.t1) r13
            MessageType r15 = r13.f20242b
            k8.u1 r15 = (k8.u1) r15
            int r15 = r15.t()
            if (r15 == 0) goto L_0x0174
            r15 = r13
            r6 = 0
        L_0x0094:
            MessageType r14 = r15.f20242b
            k8.u1 r14 = (k8.u1) r14
            int r14 = r14.t()
            if (r6 >= r14) goto L_0x016d
            MessageType r14 = r15.f20242b
            k8.u1 r14 = (k8.u1) r14
            k8.w1 r14 = r14.w(r6)
            k8.h6 r14 = r14.o()
            k8.v1 r14 = (k8.v1) r14
            k8.h6 r16 = r14.clone()
            r11 = r16
            k8.v1 r11 = (k8.v1) r11
            MessageType r3 = r14.f20242b
            k8.w1 r3 = (k8.w1) r3
            java.lang.String r3 = r3.y()
            java.lang.String r3 = o8.e4.b(r3)
            if (r3 == 0) goto L_0x00d5
            boolean r1 = r11.f20243c
            if (r1 == 0) goto L_0x00cc
            r11.h()
            r1 = 0
            r11.f20243c = r1
        L_0x00cc:
            MessageType r1 = r11.f20242b
            k8.w1 r1 = (k8.w1) r1
            k8.w1.A(r1, r3)
            r1 = 1
            goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            r16 = r4
            r3 = 0
        L_0x00d9:
            MessageType r4 = r14.f20242b
            k8.w1 r4 = (k8.w1) r4
            int r4 = r4.s()
            if (r3 >= r4) goto L_0x0138
            MessageType r4 = r14.f20242b
            k8.w1 r4 = (k8.w1) r4
            k8.y1 r4 = r4.w(r3)
            r17 = r14
            java.lang.String r14 = r4.w()
            r18 = r8
            java.lang.String[] r8 = o8.f4.f23201a
            r19 = r9
            java.lang.String[] r9 = o8.f4.f23202b
            java.lang.String r8 = x.f.g(r14, r8, r9)
            if (r8 == 0) goto L_0x012f
            k8.h6 r1 = r4.o()
            k8.x1 r1 = (k8.x1) r1
            boolean r4 = r1.f20243c
            if (r4 == 0) goto L_0x0110
            r1.h()
            r4 = 0
            r1.f20243c = r4
            goto L_0x0111
        L_0x0110:
            r4 = 0
        L_0x0111:
            MessageType r9 = r1.f20242b
            k8.y1 r9 = (k8.y1) r9
            k8.y1.x(r9, r8)
            k8.k6 r1 = r1.f()
            k8.y1 r1 = (k8.y1) r1
            boolean r8 = r11.f20243c
            if (r8 == 0) goto L_0x0127
            r11.h()
            r11.f20243c = r4
        L_0x0127:
            MessageType r4 = r11.f20242b
            k8.w1 r4 = (k8.w1) r4
            k8.w1.B(r4, r3, r1)
            r1 = 1
        L_0x012f:
            int r3 = r3 + 1
            r14 = r17
            r8 = r18
            r9 = r19
            goto L_0x00d9
        L_0x0138:
            r18 = r8
            r19 = r9
            if (r1 == 0) goto L_0x015f
            boolean r1 = r15.f20243c
            if (r1 == 0) goto L_0x0148
            r15.h()
            r1 = 0
            r15.f20243c = r1
        L_0x0148:
            MessageType r1 = r15.f20242b
            k8.u1 r1 = (k8.u1) r1
            k8.k6 r3 = r11.f()
            k8.w1 r3 = (k8.w1) r3
            k8.u1.B(r1, r6, r3)
            k8.k6 r1 = r13.f()
            k8.u1 r1 = (k8.u1) r1
            r7.set(r12, r1)
            r15 = r13
        L_0x015f:
            int r6 = r6 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r8 = r18
            r9 = r19
            goto L_0x0094
        L_0x016d:
            r16 = r4
            r18 = r8
            r19 = r9
            goto L_0x017b
        L_0x0174:
            r16 = r4
            r18 = r8
            r19 = r9
            r15 = r13
        L_0x017b:
            MessageType r1 = r15.f20242b
            k8.u1 r1 = (k8.u1) r1
            int r1 = r1.u()
            if (r1 == 0) goto L_0x01e2
            r1 = 0
        L_0x0186:
            MessageType r3 = r15.f20242b
            k8.u1 r3 = (k8.u1) r3
            int r3 = r3.u()
            if (r1 >= r3) goto L_0x01e2
            MessageType r3 = r15.f20242b
            k8.u1 r3 = (k8.u1) r3
            k8.e2 r3 = r3.x(r1)
            java.lang.String r4 = r3.w()
            java.lang.String[] r6 = o8.g4.f23219a
            java.lang.String[] r8 = o8.g4.f23220b
            java.lang.String r4 = x.f.g(r4, r6, r8)
            if (r4 == 0) goto L_0x01df
            k8.h6 r3 = r3.o()
            k8.d2 r3 = (k8.d2) r3
            boolean r6 = r3.f20243c
            if (r6 == 0) goto L_0x01b7
            r3.h()
            r6 = 0
            r3.f20243c = r6
            goto L_0x01b8
        L_0x01b7:
            r6 = 0
        L_0x01b8:
            MessageType r8 = r3.f20242b
            k8.e2 r8 = (k8.e2) r8
            k8.e2.x(r8, r4)
            boolean r4 = r15.f20243c
            if (r4 == 0) goto L_0x01c8
            r15.h()
            r15.f20243c = r6
        L_0x01c8:
            MessageType r4 = r15.f20242b
            k8.u1 r4 = (k8.u1) r4
            k8.k6 r3 = r3.f()
            k8.e2 r3 = (k8.e2) r3
            k8.u1.A(r4, r1, r3)
            k8.k6 r3 = r13.f()
            k8.u1 r3 = (k8.u1) r3
            r7.set(r12, r3)
            r15 = r13
        L_0x01df:
            int r1 = r1 + 1
            goto L_0x0186
        L_0x01e2:
            int r12 = r12 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r8 = r18
            r9 = r19
            r6 = 0
            goto L_0x0076
        L_0x01f1:
            r16 = r4
            r18 = r8
            r19 = r9
            r5.i()
            r5.h()
            com.google.android.gms.common.internal.i.e(r28)
            android.database.sqlite.SQLiteDatabase r1 = r5.C()
            r1.beginTransaction()
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            android.database.sqlite.SQLiteDatabase r3 = r5.C()     // Catch:{ all -> 0x060e }
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ all -> 0x060e }
            r8 = 0
            r6[r8] = r2     // Catch:{ all -> 0x060e }
            r3.delete(r10, r0, r6)     // Catch:{ all -> 0x060e }
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ all -> 0x060e }
            r6[r8] = r2     // Catch:{ all -> 0x060e }
            r4 = r19
            r3.delete(r4, r0, r6)     // Catch:{ all -> 0x060e }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x060e }
        L_0x022a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x04ad
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x060e }
            k8.u1 r0 = (k8.u1) r0     // Catch:{ all -> 0x060e }
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ all -> 0x060e }
            boolean r8 = r0.C()     // Catch:{ all -> 0x060e }
            if (r8 != 0) goto L_0x025a
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x060e }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            r0.b(r6, r8)     // Catch:{ all -> 0x060e }
            goto L_0x022a
        L_0x025a:
            int r8 = r0.s()     // Catch:{ all -> 0x060e }
            java.util.List r9 = r0.y()     // Catch:{ all -> 0x060e }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x060e }
        L_0x0266:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x060e }
            if (r11 == 0) goto L_0x028e
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x060e }
            k8.w1 r11 = (k8.w1) r11     // Catch:{ all -> 0x060e }
            boolean r11 = r11.G()     // Catch:{ all -> 0x060e }
            if (r11 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x060e }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            r0.c(r6, r9, r8)     // Catch:{ all -> 0x060e }
            goto L_0x022a
        L_0x028e:
            java.util.List r9 = r0.z()     // Catch:{ all -> 0x060e }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x060e }
        L_0x0296:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x060e }
            if (r11 == 0) goto L_0x02bf
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x060e }
            k8.e2 r11 = (k8.e2) r11     // Catch:{ all -> 0x060e }
            boolean r11 = r11.B()     // Catch:{ all -> 0x060e }
            if (r11 != 0) goto L_0x0296
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x060e }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            r0.c(r6, r9, r8)     // Catch:{ all -> 0x060e }
            goto L_0x022a
        L_0x02bf:
            java.util.List r9 = r0.y()     // Catch:{ all -> 0x060e }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x060e }
        L_0x02c7:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x060e }
            java.lang.String r12 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r15 = "audience_id"
            java.lang.String r6 = "app_id"
            r19 = -1
            r21 = r3
            if (r11 == 0) goto L_0x03a2
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x060e }
            k8.w1 r11 = (k8.w1) r11     // Catch:{ all -> 0x060e }
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.h(r11)     // Catch:{ all -> 0x060e }
            java.lang.String r22 = r11.y()     // Catch:{ all -> 0x060e }
            boolean r22 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x060e }
            if (r22 == 0) goto L_0x0322
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x060e }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x060e }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            boolean r12 = r11.G()     // Catch:{ all -> 0x060e }
            if (r12 == 0) goto L_0x0318
            int r11 = r11.t()     // Catch:{ all -> 0x060e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x060e }
            goto L_0x0319
        L_0x0318:
            r11 = 0
        L_0x0319:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x060e }
            r0.d(r3, r6, r9, r11)     // Catch:{ all -> 0x060e }
            goto L_0x0478
        L_0x0322:
            byte[] r3 = r11.i()     // Catch:{ all -> 0x060e }
            r23 = r9
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x060e }
            r9.<init>()     // Catch:{ all -> 0x060e }
            r9.put(r6, r2)     // Catch:{ all -> 0x060e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            r9.put(r15, r6)     // Catch:{ all -> 0x060e }
            boolean r6 = r11.G()     // Catch:{ all -> 0x060e }
            if (r6 == 0) goto L_0x0346
            int r6 = r11.t()     // Catch:{ all -> 0x060e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x060e }
            goto L_0x0347
        L_0x0346:
            r6 = 0
        L_0x0347:
            r9.put(r14, r6)     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "event_name"
            java.lang.String r14 = r11.y()     // Catch:{ all -> 0x060e }
            r9.put(r6, r14)     // Catch:{ all -> 0x060e }
            boolean r6 = r11.H()     // Catch:{ all -> 0x060e }
            if (r6 == 0) goto L_0x0362
            boolean r6 = r11.E()     // Catch:{ all -> 0x060e }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x060e }
            goto L_0x0363
        L_0x0362:
            r6 = 0
        L_0x0363:
            r9.put(r13, r6)     // Catch:{ all -> 0x060e }
            r9.put(r12, r3)     // Catch:{ all -> 0x060e }
            android.database.sqlite.SQLiteDatabase r3 = r5.C()     // Catch:{ SQLiteException -> 0x038e }
            r6 = 5
            r11 = 0
            long r12 = r3.insertWithOnConflict(r4, r11, r9, r6)     // Catch:{ SQLiteException -> 0x038e }
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x0388
            com.google.android.gms.measurement.internal.l r3 = r5.f8864a     // Catch:{ SQLiteException -> 0x038e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x038e }
            o8.a3 r3 = r3.f8797f     // Catch:{ SQLiteException -> 0x038e }
            java.lang.String r6 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ SQLiteException -> 0x038e }
            r3.b(r6, r9)     // Catch:{ SQLiteException -> 0x038e }
        L_0x0388:
            r3 = r21
            r9 = r23
            goto L_0x02c7
        L_0x038e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x060e }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Error storing event filter. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            r3.c(r6, r9, r0)     // Catch:{ all -> 0x060e }
            goto L_0x0478
        L_0x03a2:
            java.util.List r0 = r0.z()     // Catch:{ all -> 0x060e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x060e }
        L_0x03aa:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x060e }
            if (r3 == 0) goto L_0x04a5
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x060e }
            k8.e2 r3 = (k8.e2) r3     // Catch:{ all -> 0x060e }
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.h(r3)     // Catch:{ all -> 0x060e }
            java.lang.String r9 = r3.w()     // Catch:{ all -> 0x060e }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x060e }
            if (r9 == 0) goto L_0x03f7
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x060e }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            boolean r12 = r3.B()     // Catch:{ all -> 0x060e }
            if (r12 == 0) goto L_0x03ed
            int r3 = r3.s()     // Catch:{ all -> 0x060e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x060e }
            goto L_0x03ee
        L_0x03ed:
            r3 = 0
        L_0x03ee:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x060e }
            r0.d(r6, r9, r11, r3)     // Catch:{ all -> 0x060e }
            goto L_0x0478
        L_0x03f7:
            byte[] r9 = r3.i()     // Catch:{ all -> 0x060e }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x060e }
            r11.<init>()     // Catch:{ all -> 0x060e }
            r11.put(r6, r2)     // Catch:{ all -> 0x060e }
            r23 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x060e }
            r11.put(r15, r0)     // Catch:{ all -> 0x060e }
            boolean r0 = r3.B()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x041b
            int r0 = r3.s()     // Catch:{ all -> 0x060e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x060e }
            goto L_0x041c
        L_0x041b:
            r0 = 0
        L_0x041c:
            r11.put(r14, r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "property_name"
            r24 = r6
            java.lang.String r6 = r3.w()     // Catch:{ all -> 0x060e }
            r11.put(r0, r6)     // Catch:{ all -> 0x060e }
            boolean r0 = r3.C()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x0439
            boolean r0 = r3.A()     // Catch:{ all -> 0x060e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x060e }
            goto L_0x043a
        L_0x0439:
            r0 = 0
        L_0x043a:
            r11.put(r13, r0)     // Catch:{ all -> 0x060e }
            r11.put(r12, r9)     // Catch:{ all -> 0x060e }
            android.database.sqlite.SQLiteDatabase r0 = r5.C()     // Catch:{ SQLiteException -> 0x0466 }
            r3 = 5
            r6 = 0
            long r25 = r0.insertWithOnConflict(r10, r6, r11, r3)     // Catch:{ SQLiteException -> 0x0466 }
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0460
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ SQLiteException -> 0x0466 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x0466 }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteException -> 0x0466 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ SQLiteException -> 0x0466 }
            r0.b(r3, r6)     // Catch:{ SQLiteException -> 0x0466 }
            goto L_0x0478
        L_0x0460:
            r0 = r23
            r6 = r24
            goto L_0x03aa
        L_0x0466:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x060e }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "Error storing property filter. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            r3.c(r6, r9, r0)     // Catch:{ all -> 0x060e }
        L_0x0478:
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            android.database.sqlite.SQLiteDatabase r0 = r5.C()     // Catch:{ all -> 0x060e }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x060e }
            r9 = 0
            r6[r9] = r2     // Catch:{ all -> 0x060e }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x060e }
            r12 = 1
            r6[r12] = r11     // Catch:{ all -> 0x060e }
            r11 = r18
            r0.delete(r10, r11, r6)     // Catch:{ all -> 0x060e }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x060e }
            r3[r9] = r2     // Catch:{ all -> 0x060e }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x060e }
            r3[r12] = r6     // Catch:{ all -> 0x060e }
            r0.delete(r4, r11, r3)     // Catch:{ all -> 0x060e }
            goto L_0x04a7
        L_0x04a5:
            r11 = r18
        L_0x04a7:
            r18 = r11
            r3 = r21
            goto L_0x022a
        L_0x04ad:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x060e }
            r0.<init>()     // Catch:{ all -> 0x060e }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x060e }
        L_0x04b6:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x060e }
            if (r4 == 0) goto L_0x04d6
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x060e }
            k8.u1 r4 = (k8.u1) r4     // Catch:{ all -> 0x060e }
            boolean r6 = r4.C()     // Catch:{ all -> 0x060e }
            if (r6 == 0) goto L_0x04d1
            int r4 = r4.s()     // Catch:{ all -> 0x060e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x060e }
            goto L_0x04d2
        L_0x04d1:
            r11 = 0
        L_0x04d2:
            r0.add(r11)     // Catch:{ all -> 0x060e }
            goto L_0x04b6
        L_0x04d6:
            com.google.android.gms.common.internal.i.e(r28)     // Catch:{ all -> 0x060e }
            r5.i()     // Catch:{ all -> 0x060e }
            r5.h()     // Catch:{ all -> 0x060e }
            android.database.sqlite.SQLiteDatabase r3 = r5.C()     // Catch:{ all -> 0x060e }
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0586 }
            r4 = 0
            r6[r4] = r2     // Catch:{ SQLiteException -> 0x0586 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r6 = r5.y(r4, r6)     // Catch:{ SQLiteException -> 0x0586 }
            com.google.android.gms.measurement.internal.l r4 = r5.f8864a     // Catch:{ all -> 0x060e }
            o8.f r4 = r4.f8843g     // Catch:{ all -> 0x060e }
            r5 = 2000(0x7d0, float:2.803E-42)
            o8.u2<java.lang.Integer> r8 = o8.v2.F     // Catch:{ all -> 0x060e }
            int r4 = r4.o(r2, r8)     // Catch:{ all -> 0x060e }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x060e }
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x060e }
            long r8 = (long) r4     // Catch:{ all -> 0x060e }
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x050b
            goto L_0x0598
        L_0x050b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x060e }
            r5.<init>()     // Catch:{ all -> 0x060e }
            r6 = 0
        L_0x0511:
            int r7 = r0.size()     // Catch:{ all -> 0x060e }
            if (r6 >= r7) goto L_0x052d
            java.lang.Object r7 = r0.get(r6)     // Catch:{ all -> 0x060e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x060e }
            if (r7 == 0) goto L_0x0598
            int r7 = r7.intValue()     // Catch:{ all -> 0x060e }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x060e }
            r5.add(r7)     // Catch:{ all -> 0x060e }
            int r6 = r6 + 1
            goto L_0x0511
        L_0x052d:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x060e }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x060e }
            int r5 = r5.length()     // Catch:{ all -> 0x060e }
            r6 = 2
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x060e }
            r6.<init>(r5)     // Catch:{ all -> 0x060e }
            java.lang.String r5 = "("
            r6.append(r5)     // Catch:{ all -> 0x060e }
            r6.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x060e }
            java.lang.String r5 = "audience_filter_values"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x060e }
            int r6 = r6.length()     // Catch:{ all -> 0x060e }
            int r6 = r6 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x060e }
            r7.<init>(r6)     // Catch:{ all -> 0x060e }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r7.append(r6)     // Catch:{ all -> 0x060e }
            r7.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r7.append(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x060e }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x060e }
            r7 = 0
            r6[r7] = r2     // Catch:{ all -> 0x060e }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x060e }
            r7 = 1
            r6[r7] = r4     // Catch:{ all -> 0x060e }
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x060e }
            goto L_0x0598
        L_0x0586:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r5.f8864a     // Catch:{ all -> 0x060e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x060e }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x060e }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r28)     // Catch:{ all -> 0x060e }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x060e }
        L_0x0598:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x060e }
            r1.endTransaction()
            r1 = r16
            boolean r0 = r1.f20243c     // Catch:{ RuntimeException -> 0x05be }
            if (r0 == 0) goto L_0x05aa
            r1.h()     // Catch:{ RuntimeException -> 0x05be }
            r3 = 0
            r1.f20243c = r3     // Catch:{ RuntimeException -> 0x05be }
        L_0x05aa:
            MessageType r0 = r1.f20242b     // Catch:{ RuntimeException -> 0x05be }
            k8.n2 r0 = (k8.n2) r0     // Catch:{ RuntimeException -> 0x05be }
            k8.n2.E(r0)     // Catch:{ RuntimeException -> 0x05be }
            k8.k6 r0 = r1.f()     // Catch:{ RuntimeException -> 0x05be }
            k8.n2 r0 = (k8.n2) r0     // Catch:{ RuntimeException -> 0x05be }
            byte[] r0 = r0.i()     // Catch:{ RuntimeException -> 0x05be }
            r3 = r27
            goto L_0x05d4
        L_0x05be:
            r0 = move-exception
            r3 = r27
            com.google.android.gms.measurement.internal.l r4 = r3.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8800i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r28)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.c(r6, r5, r0)
            r0 = r29
        L_0x05d4:
            k8.hb r4 = k8.hb.f20252b
            k8.ib r4 = r4.zza()
            r4.zza()
            com.google.android.gms.measurement.internal.l r4 = r3.f8864a
            o8.f r4 = r4.f8843g
            o8.u2<java.lang.Boolean> r5 = o8.v2.f23530p0
            r6 = 0
            boolean r4 = r4.v(r6, r5)
            if (r4 == 0) goto L_0x05f7
            o8.u5 r4 = r3.f23413b
            o8.j r4 = r4.f23472c
            o8.u5.I(r4)
            r5 = r30
            r4.q(r2, r0, r5)
            goto L_0x0601
        L_0x05f7:
            o8.u5 r4 = r3.f23413b
            o8.j r4 = r4.f23472c
            o8.u5.I(r4)
            r4.q(r2, r0, r6)
        L_0x0601:
            java.util.Map<java.lang.String, k8.n2> r0 = r3.f23402g
            k8.k6 r1 = r1.f()
            k8.n2 r1 = (k8.n2) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x060e:
            r0 = move-exception
            r3 = r27
            r1.endTransaction()
            goto L_0x0616
        L_0x0615:
            throw r0
        L_0x0616:
            goto L_0x0615
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.q3.t(java.lang.String, byte[], java.lang.String):boolean");
    }

    public final n2 u(String str, byte[] bArr) {
        if (bArr == null) {
            return n2.y();
        }
        try {
            n2 n2Var = (n2) ((m2) q.C(n2.w(), bArr)).f();
            a3 a3Var = this.f8864a.d().f8805n;
            String str2 = null;
            Long valueOf = n2Var.H() ? Long.valueOf(n2Var.u()) : null;
            if (n2Var.G()) {
                str2 = n2Var.z();
            }
            a3Var.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return n2Var;
        } catch (t6 e10) {
            this.f8864a.d().f8800i.c("Unable to merge remote config. appId", h.t(str), e10);
            return n2.y();
        } catch (RuntimeException e11) {
            this.f8864a.d().f8800i.c("Unable to merge remote config. appId", h.t(str), e11);
            return n2.y();
        }
    }

    public final void v(String str, m2 m2Var) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        for (int i10 = 0; i10 < ((n2) m2Var.f20242b).t(); i10++) {
            j2 j2Var = (j2) ((n2) m2Var.f20242b).v(i10).o();
            if (TextUtils.isEmpty(j2Var.n())) {
                this.f8864a.d().f8800i.a("EventConfig contained null event name");
            } else {
                String n10 = j2Var.n();
                String b10 = e4.b(j2Var.n());
                if (!TextUtils.isEmpty(b10)) {
                    if (j2Var.f20243c) {
                        j2Var.h();
                        j2Var.f20243c = false;
                    }
                    l2.v((l2) j2Var.f20242b, b10);
                    if (m2Var.f20243c) {
                        m2Var.h();
                        m2Var.f20243c = false;
                    }
                    n2.D((n2) m2Var.f20242b, i10, (l2) j2Var.f());
                }
                aVar.put(n10, Boolean.valueOf(((l2) j2Var.f20242b).w()));
                aVar2.put(j2Var.n(), Boolean.valueOf(((l2) j2Var.f20242b).x()));
                if (((l2) j2Var.f20242b).y()) {
                    if (j2Var.m() < 2 || j2Var.m() > 65535) {
                        this.f8864a.d().f8800i.c("Invalid sampling rate. Event name, sample rate", j2Var.n(), Integer.valueOf(j2Var.m()));
                    } else {
                        aVar3.put(j2Var.n(), Integer.valueOf(j2Var.m()));
                    }
                }
            }
        }
        this.f23400e.put(str, aVar);
        this.f23401f.put(str, aVar2);
        this.f23403h.put(str, aVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.lang.String r13) {
        /*
            r12 = this;
            r12.i()
            r12.h()
            com.google.android.gms.common.internal.i.e(r13)
            java.util.Map<java.lang.String, k8.n2> r0 = r12.f23402g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0124
            o8.u5 r0 = r12.f23413b
            o8.j r0 = r0.f23472c
            o8.u5.I(r0)
            com.google.android.gms.common.internal.i.e(r13)
            r0.h()
            r0.i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.C()     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            java.lang.String r3 = "remote_config"
            r10 = 0
            r4[r10] = r3     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            java.lang.String r3 = "config_last_modified_time"
            r11 = 1
            r4[r11] = r3     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0079, all -> 0x0076 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r3 != 0) goto L_0x0049
            goto L_0x008f
        L_0x0049:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r4 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 == 0) goto L_0x0068
            com.google.android.gms.measurement.internal.l r5 = r0.f8864a     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ SQLiteException -> 0x0074 }
            o8.a3 r5 = r5.f8797f     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r13)     // Catch:{ SQLiteException -> 0x0074 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x0068:
            if (r3 != 0) goto L_0x006b
            goto L_0x008f
        L_0x006b:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0074 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0074 }
            r2.close()
            goto L_0x0093
        L_0x0074:
            r3 = move-exception
            goto L_0x007c
        L_0x0076:
            r13 = move-exception
            goto L_0x011e
        L_0x0079:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007c:
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ all -> 0x011c }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x011c }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x011c }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r13)     // Catch:{ all -> 0x011c }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2.close()
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 != 0) goto L_0x00b4
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.f23399d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f23400e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f23401f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, k8.n2> r0 = r12.f23402g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f23406k
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.f23403h
            r0.put(r13, r1)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            k8.n2 r0 = r12.u(r13, r0)
            k8.h6 r0 = r0.o()
            k8.m2 r0 = (k8.m2) r0
            r12.v(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.f23399d
            k8.k6 r3 = r0.f()
            k8.n2 r3 = (k8.n2) r3
            java.util.Map r3 = y(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, k8.n2> r2 = r12.f23402g
            k8.k6 r3 = r0.f()
            k8.n2 r3 = (k8.n2) r3
            r2.put(r13, r3)
            k8.nb.b()
            com.google.android.gms.measurement.internal.l r2 = r12.f8864a
            o8.f r2 = r2.f8843g
            o8.u2<java.lang.Boolean> r3 = o8.v2.f23536s0
            boolean r2 = r2.v(r1, r3)
            if (r2 == 0) goto L_0x00f7
            k8.k6 r0 = r0.f()
            k8.n2 r0 = (k8.n2) r0
            r12.x(r13, r0)
        L_0x00f7:
            k8.hb r0 = k8.hb.f20252b
            k8.ib r0 = r0.zza()
            r0.zza()
            com.google.android.gms.measurement.internal.l r0 = r12.f8864a
            o8.f r0 = r0.f8843g
            o8.u2<java.lang.Boolean> r2 = o8.v2.f23530p0
            boolean r0 = r0.v(r1, r2)
            if (r0 == 0) goto L_0x0116
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f23406k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x0116:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f23406k
            r0.put(r13, r1)
            return
        L_0x011c:
            r13 = move-exception
            r1 = r2
        L_0x011e:
            if (r1 == 0) goto L_0x0123
            r1.close()
        L_0x0123:
            throw r13
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.q3.w(java.lang.String):void");
    }

    public final void x(String str, n2 n2Var) {
        if (n2Var.s() != 0) {
            this.f8864a.d().f8805n.b("EES programs found", Integer.valueOf(n2Var.s()));
            x3 x3Var = n2Var.B().get(0);
            try {
                p0 p0Var = new p0();
                ((Map) p0Var.f20399a.f20290d.f3445b).put("internal.remoteConfig", new a4(this, str));
                ((Map) p0Var.f20399a.f20290d.f3445b).put("internal.appMetadata", new cr(this, str));
                ((Map) p0Var.f20399a.f20290d.f3445b).put("internal.logger", new k8.a(this));
                p0Var.a(x3Var);
                this.f23404i.c(str, p0Var);
                this.f8864a.d().f8805n.c("EES program loaded for appId, activities", str, Integer.valueOf(x3Var.s().s()));
                for (v3 t10 : x3Var.s().v()) {
                    this.f8864a.d().f8805n.b("EES program activity", t10.t());
                }
            } catch (h1 unused) {
                this.f8864a.d().f8797f.b("Failed to load EES program. appId", str);
            }
        } else {
            this.f23404i.d(str);
        }
    }
}
