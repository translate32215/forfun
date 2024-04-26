package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import k8.b3;
import k8.b7;
import k8.c2;
import k8.c3;
import k8.e2;
import k8.f5;
import k8.f6;
import k8.g3;
import k8.h3;
import k8.h6;
import k8.i2;
import k8.i3;
import k8.n3;
import k8.p3;
import k8.q3;
import k8.r3;
import k8.t6;
import k8.u2;
import k8.w2;
import k8.x2;
import k8.x5;
import k8.y1;
import k8.y2;
import o8.b6;
import o8.m;
import o8.r;
import o8.r5;
import o8.u5;
import o8.v2;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class q extends r5 {
    public q(u5 u5Var) {
        super(u5Var);
    }

    public static <Builder extends f5> Builder C(Builder builder, byte[] bArr) throws t6 {
        Class<x5> cls = x5.class;
        x5 x5Var = x5.f20542c;
        if (x5Var == null) {
            synchronized (cls) {
                x5Var = x5.f20542c;
                if (x5Var == null) {
                    x5Var = f6.b(cls);
                    x5.f20542c = x5Var;
                }
            }
        }
        if (x5Var != null) {
            builder.getClass();
            Builder builder2 = (h6) builder;
            builder2.l(bArr, 0, bArr.length, x5Var);
            return builder2;
        }
        builder.getClass();
        Builder builder3 = (h6) builder;
        builder3.l(bArr, 0, bArr.length, x5.a());
        return builder3;
    }

    public static List<c3> F(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                b3 w10 = c3.w();
                for (String str : bundle.keySet()) {
                    b3 w11 = c3.w();
                    w11.o(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        w11.n(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        w11.p((String) obj);
                    } else if (obj instanceof Double) {
                        w11.m(((Double) obj).doubleValue());
                    }
                    if (w10.f20243c) {
                        w10.h();
                        w10.f20243c = false;
                    }
                    c3.I((c3) w10.f20242b, (c3) w11.f());
                }
                if (((c3) w10.f20242b).u() > 0) {
                    arrayList.add((c3) w10.f());
                }
            }
        }
        return arrayList;
    }

    public static List<Long> H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean L(List<Long> list, int i10) {
        if (i10 >= ((b7) list).f20079c * 64) {
            return false;
        }
        return ((1 << (i10 % 64)) & ((Long) ((b7) list).get(i10 / 64)).longValue()) != 0;
    }

    public static boolean N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void l(x2 x2Var, String str, Object obj) {
        List<c3> w10 = x2Var.w();
        int i10 = 0;
        while (true) {
            if (i10 >= w10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(w10.get(i10).y())) {
                break;
            } else {
                i10++;
            }
        }
        b3 w11 = c3.w();
        w11.o(str);
        if (obj instanceof Long) {
            w11.n(((Long) obj).longValue());
        } else if (obj instanceof String) {
            w11.p((String) obj);
        } else if (obj instanceof Double) {
            w11.m(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<c3> F = F((Bundle[]) obj);
            if (w11.f20243c) {
                w11.h();
                w11.f20243c = false;
            }
            c3.J((c3) w11.f20242b, F);
        }
        if (i10 >= 0) {
            if (x2Var.f20243c) {
                x2Var.h();
                x2Var.f20243c = false;
            }
            y2.B((y2) x2Var.f20242b, i10, (c3) w11.f());
            return;
        }
        x2Var.p(w11);
    }

    public static final boolean m(r rVar, b6 b6Var) {
        if (rVar != null) {
            return !TextUtils.isEmpty(b6Var.f23132b) || !TextUtils.isEmpty(b6Var.f23147y);
        }
        throw new NullPointerException("null reference");
    }

    public static final c3 n(y2 y2Var, String str) {
        for (c3 next : y2Var.A()) {
            if (next.y().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static final Object o(y2 y2Var, String str) {
        c3 n10 = n(y2Var, str);
        if (n10 == null) {
            return null;
        }
        if (n10.P()) {
            return n10.z();
        }
        if (n10.N()) {
            return Long.valueOf(n10.v());
        }
        if (n10.L()) {
            return Double.valueOf(n10.s());
        }
        if (n10.u() <= 0) {
            return null;
        }
        List<c3> A = n10.A();
        ArrayList arrayList = new ArrayList();
        for (c3 next : A) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (c3 next2 : next.A()) {
                    if (next2.P()) {
                        bundle.putString(next2.y(), next2.z());
                    } else if (next2.N()) {
                        bundle.putLong(next2.y(), next2.v());
                    } else if (next2.L()) {
                        bundle.putDouble(next2.y(), next2.s());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void r(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final String s(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void t(StringBuilder sb2, int i10, String str, n3 n3Var) {
        if (n3Var != null) {
            r(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (n3Var.t() != 0) {
                r(sb2, 4);
                sb2.append("results: ");
                int i11 = 0;
                for (Long next : n3Var.C()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (n3Var.v() != 0) {
                r(sb2, 4);
                sb2.append("status: ");
                int i13 = 0;
                for (Long next2 : n3Var.E()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next2);
                    i13 = i14;
                }
                sb2.append(10);
            }
            if (n3Var.s() != 0) {
                r(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (w2 next3 : n3Var.B()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next3.z() ? Integer.valueOf(next3.s()) : null);
                    sb2.append(":");
                    sb2.append(next3.y() ? Long.valueOf(next3.t()) : null);
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            if (n3Var.u() != 0) {
                r(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (p3 next4 : n3Var.D()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next4.A() ? Integer.valueOf(next4.t()) : null);
                    sb2.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.x()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i19 = i20;
                    }
                    sb2.append("]");
                    i17 = i18;
                }
                sb2.append("}\n");
            }
            r(sb2, 3);
            sb2.append("}\n");
        }
    }

    public static final void u(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj != null) {
            r(sb2, i10 + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    public static final void v(StringBuilder sb2, int i10, String str, c2 c2Var) {
        if (c2Var != null) {
            r(sb2, i10);
            sb2.append(str);
            sb2.append(" {\n");
            if (c2Var.y()) {
                int D = c2Var.D();
                u(sb2, i10, "comparison_type", D != 1 ? D != 2 ? D != 3 ? D != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (c2Var.A()) {
                u(sb2, i10, "match_as_float", Boolean.valueOf(c2Var.x()));
            }
            if (c2Var.z()) {
                u(sb2, i10, "comparison_value", c2Var.u());
            }
            if (c2Var.C()) {
                u(sb2, i10, "min_comparison_value", c2Var.w());
            }
            if (c2Var.B()) {
                u(sb2, i10, "max_comparison_value", c2Var.v());
            }
            r(sb2, i10);
            sb2.append("}\n");
        }
    }

    public static int w(h3 h3Var, String str) {
        for (int i10 = 0; i10 < ((i3) h3Var.f20242b).m1(); i10++) {
            if (str.equals(((i3) h3Var.f20242b).B1(i10).x())) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.r A(k8.b r9) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f20076c
            r1 = 1
            android.os.Bundle r0 = r8.y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "app"
        L_0x001c:
            r5 = r1
            java.lang.String r1 = r9.f20074a
            java.lang.String r1 = o8.e4.b(r1)
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = r9.f20074a
        L_0x0027:
            r3 = r1
            o8.r r1 = new o8.r
            o8.p r4 = new o8.p
            r4.<init>(r0)
            long r6 = r9.f20075b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q.A(k8.b):o8.r");
    }

    public final y2 B(m mVar) {
        x2 w10 = y2.w();
        long j10 = mVar.f23333e;
        if (w10.f20243c) {
            w10.h();
            w10.f20243c = false;
        }
        y2.I((y2) w10.f20242b, j10);
        for (String str : mVar.f23334f.f23382a.keySet()) {
            b3 w11 = c3.w();
            w11.o(str);
            Object obj = mVar.f23334f.f23382a.get(str);
            i.h(obj);
            J(w11, obj);
            w10.p(w11);
        }
        return (y2) w10.f();
    }

    public final String D(g3 g3Var) {
        StringBuilder a10 = a.a("\nbatch {\n");
        for (i3 next : g3Var.v()) {
            if (next != null) {
                r(a10, 1);
                a10.append("bundle {\n");
                if (next.b1()) {
                    u(a10, 1, "protocol_version", Integer.valueOf(next.j1()));
                }
                u(a10, 1, "platform", next.C());
                if (next.X0()) {
                    u(a10, 1, "gmp_version", Long.valueOf(next.s1()));
                }
                if (next.h1()) {
                    u(a10, 1, "uploading_gmp_version", Long.valueOf(next.x1()));
                }
                if (next.V0()) {
                    u(a10, 1, "dynamite_version", Long.valueOf(next.q1()));
                }
                if (next.q0()) {
                    u(a10, 1, "config_version", Long.valueOf(next.o1()));
                }
                u(a10, 1, "gmp_app_id", next.z());
                u(a10, 1, "admob_app_id", next.C1());
                u(a10, 1, "app_id", next.D1());
                u(a10, 1, "app_version", next.t());
                if (next.o0()) {
                    u(a10, 1, "app_version_major", Integer.valueOf(next.R()));
                }
                u(a10, 1, "firebase_instance_id", next.x());
                if (next.U0()) {
                    u(a10, 1, "dev_cert_hash", Long.valueOf(next.p1()));
                }
                u(a10, 1, "app_store", next.s());
                if (next.g1()) {
                    u(a10, 1, "upload_timestamp_millis", Long.valueOf(next.w1()));
                }
                if (next.e1()) {
                    u(a10, 1, "start_timestamp_millis", Long.valueOf(next.v1()));
                }
                if (next.W0()) {
                    u(a10, 1, "end_timestamp_millis", Long.valueOf(next.r1()));
                }
                if (next.a1()) {
                    u(a10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.u1()));
                }
                if (next.Z0()) {
                    u(a10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.t1()));
                }
                u(a10, 1, "app_instance_id", next.E1());
                u(a10, 1, "resettable_device_id", next.D());
                u(a10, 1, "ds_id", next.w());
                if (next.Y0()) {
                    u(a10, 1, "limited_ad_tracking", Boolean.valueOf(next.l0()));
                }
                u(a10, 1, "os_version", next.B());
                u(a10, 1, "device_model", next.v());
                u(a10, 1, "user_default_language", next.E());
                if (next.f1()) {
                    u(a10, 1, "time_zone_offset_minutes", Integer.valueOf(next.l1()));
                }
                if (next.p0()) {
                    u(a10, 1, "bundle_sequential_index", Integer.valueOf(next.R0()));
                }
                if (next.d1()) {
                    u(a10, 1, "service_upload", Boolean.valueOf(next.m0()));
                }
                u(a10, 1, "health_monitor", next.A());
                if (!this.f8864a.f8843g.v((String) null, v2.f23524m0) && next.n0() && next.n1() != 0) {
                    u(a10, 1, "android_id", Long.valueOf(next.n1()));
                }
                if (next.c1()) {
                    u(a10, 1, "retry_counter", Integer.valueOf(next.k1()));
                }
                if (next.r0()) {
                    u(a10, 1, "consent_signals", next.u());
                }
                List<r3> H = next.H();
                if (H != null) {
                    for (r3 next2 : H) {
                        if (next2 != null) {
                            r(a10, 2);
                            a10.append("user_property {\n");
                            u(a10, 2, "set_timestamp_millis", next2.J() ? Long.valueOf(next2.u()) : null);
                            u(a10, 2, "name", this.f8864a.f8849m.f(next2.x()));
                            u(a10, 2, "string_value", next2.y());
                            u(a10, 2, "int_value", next2.I() ? Long.valueOf(next2.t()) : null);
                            u(a10, 2, "double_value", next2.H() ? Double.valueOf(next2.s()) : null);
                            r(a10, 2);
                            a10.append("}\n");
                        }
                    }
                }
                List<u2> F = next.F();
                if (F != null) {
                    for (u2 next3 : F) {
                        if (next3 != null) {
                            r(a10, 2);
                            a10.append("audience_membership {\n");
                            if (next3.C()) {
                                u(a10, 2, "audience_id", Integer.valueOf(next3.s()));
                            }
                            if (next3.D()) {
                                u(a10, 2, "new_audience", Boolean.valueOf(next3.B()));
                            }
                            t(a10, 2, "current_data", next3.v());
                            if (next3.E()) {
                                t(a10, 2, "previous_data", next3.w());
                            }
                            r(a10, 2);
                            a10.append("}\n");
                        }
                    }
                }
                List<y2> G = next.G();
                if (G != null) {
                    for (y2 next4 : G) {
                        if (next4 != null) {
                            r(a10, 2);
                            a10.append("event {\n");
                            u(a10, 2, "name", this.f8864a.f8849m.d(next4.z()));
                            if (next4.L()) {
                                u(a10, 2, "timestamp_millis", Long.valueOf(next4.v()));
                            }
                            if (next4.K()) {
                                u(a10, 2, "previous_timestamp_millis", Long.valueOf(next4.u()));
                            }
                            if (next4.J()) {
                                u(a10, 2, "count", Integer.valueOf(next4.s()));
                            }
                            if (next4.t() != 0) {
                                p(a10, 2, next4.A());
                            }
                            r(a10, 2);
                            a10.append("}\n");
                        }
                    }
                }
                r(a10, 1);
                a10.append("}\n");
            }
        }
        a10.append("}\n");
        return a10.toString();
    }

    public final String E(e2 e2Var) {
        StringBuilder a10 = a.a("\nproperty_filter {\n");
        if (e2Var.B()) {
            u(a10, 0, "filter_id", Integer.valueOf(e2Var.s()));
        }
        u(a10, 0, "property_name", this.f8864a.f8849m.f(e2Var.w()));
        String s10 = s(e2Var.y(), e2Var.z(), e2Var.A());
        if (!s10.isEmpty()) {
            u(a10, 0, "filter_type", s10);
        }
        q(a10, 1, e2Var.t());
        a10.append("}\n");
        return a10.toString();
    }

    public final List<Long> G(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.f8864a.d().f8800i.b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f8864a.d().f8800i.c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (next.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    public final Map<String, Object> I(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if ((obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public final void J(b3 b3Var, Object obj) {
        if (b3Var.f20243c) {
            b3Var.h();
            b3Var.f20243c = false;
        }
        c3.D((c3) b3Var.f20242b);
        if (b3Var.f20243c) {
            b3Var.h();
            b3Var.f20243c = false;
        }
        c3.F((c3) b3Var.f20242b);
        if (b3Var.f20243c) {
            b3Var.h();
            b3Var.f20243c = false;
        }
        c3.H((c3) b3Var.f20242b);
        if (b3Var.f20243c) {
            b3Var.h();
            b3Var.f20243c = false;
        }
        c3.K((c3) b3Var.f20242b);
        if (obj instanceof String) {
            b3Var.p((String) obj);
        } else if (obj instanceof Long) {
            b3Var.n(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            b3Var.m(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<c3> F = F((Bundle[]) obj);
            if (b3Var.f20243c) {
                b3Var.h();
                b3Var.f20243c = false;
            }
            c3.J((c3) b3Var.f20242b, F);
        } else {
            this.f8864a.d().f8797f.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void K(q3 q3Var, Object obj) {
        if (obj != null) {
            if (q3Var.f20243c) {
                q3Var.h();
                q3Var.f20243c = false;
            }
            r3.C((r3) q3Var.f20242b);
            if (q3Var.f20243c) {
                q3Var.h();
                q3Var.f20243c = false;
            }
            r3.E((r3) q3Var.f20242b);
            if (q3Var.f20243c) {
                q3Var.h();
                q3Var.f20243c = false;
            }
            r3.G((r3) q3Var.f20242b);
            if (obj instanceof String) {
                String str = (String) obj;
                if (q3Var.f20243c) {
                    q3Var.h();
                    q3Var.f20243c = false;
                }
                r3.B((r3) q3Var.f20242b, str);
            } else if (obj instanceof Long) {
                q3Var.m(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (q3Var.f20243c) {
                    q3Var.h();
                    q3Var.f20243c = false;
                }
                r3.F((r3) q3Var.f20242b, doubleValue);
            } else {
                this.f8864a.d().f8797f.b("Ignoring invalid (type) user attribute value", obj);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final boolean M(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f8864a.f8850n.b() - j10) > j11;
    }

    public final byte[] O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f8864a.d().f8797f.b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final boolean k() {
        return false;
    }

    public final void p(StringBuilder sb2, int i10, List<c3> list) {
        if (list != null) {
            int i11 = i10 + 1;
            for (c3 next : list) {
                if (next != null) {
                    r(sb2, i11);
                    sb2.append("param {\n");
                    Double d10 = null;
                    u(sb2, i11, "name", next.O() ? this.f8864a.f8849m.e(next.y()) : null);
                    u(sb2, i11, "string_value", next.P() ? next.z() : null);
                    u(sb2, i11, "int_value", next.N() ? Long.valueOf(next.v()) : null);
                    if (next.L()) {
                        d10 = Double.valueOf(next.s());
                    }
                    u(sb2, i11, "double_value", d10);
                    if (next.u() > 0) {
                        p(sb2, i11, next.A());
                    }
                    r(sb2, i11);
                    sb2.append("}\n");
                }
            }
        }
    }

    public final void q(StringBuilder sb2, int i10, y1 y1Var) {
        String str;
        if (y1Var != null) {
            r(sb2, i10);
            sb2.append("filter {\n");
            if (y1Var.z()) {
                u(sb2, i10, "complement", Boolean.valueOf(y1Var.y()));
            }
            if (y1Var.B()) {
                u(sb2, i10, "param_name", this.f8864a.f8849m.e(y1Var.w()));
            }
            if (y1Var.C()) {
                int i11 = i10 + 1;
                i2 v10 = y1Var.v();
                if (v10 != null) {
                    r(sb2, i11);
                    sb2.append("string_filter {\n");
                    if (v10.A()) {
                        switch (v10.B()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        u(sb2, i11, "match_type", str);
                    }
                    if (v10.z()) {
                        u(sb2, i11, "expression", v10.v());
                    }
                    if (v10.y()) {
                        u(sb2, i11, "case_sensitive", Boolean.valueOf(v10.x()));
                    }
                    if (v10.s() > 0) {
                        r(sb2, i11 + 1);
                        sb2.append("expression_list {\n");
                        for (String append : v10.w()) {
                            r(sb2, i11 + 2);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    r(sb2, i11);
                    sb2.append("}\n");
                }
            }
            if (y1Var.A()) {
                v(sb2, i10 + 1, "number_filter", y1Var.u());
            }
            r(sb2, i10);
            sb2.append("}\n");
        }
    }

    public final long x(byte[] bArr) {
        this.f8864a.A().h();
        MessageDigest r10 = r.r("MD5");
        if (r10 != null) {
            return r.m0(r10.digest(bArr));
        }
        this.f8864a.d().f8797f.a("Failed to get MD5");
        return 0;
    }

    public final Bundle y(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(y((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArrayList(next, arrayList2);
            }
        }
        return bundle;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f8864a.d().f8797f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T z(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.l r5 = r4.f8864a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x001a }
            o8.a3 r5 = r5.f8797f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q.z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
