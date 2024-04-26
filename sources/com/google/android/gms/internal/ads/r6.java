package com.google.android.gms.internal.ads;

import e8.uh0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    public long f8010a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8011b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8012c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8013d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8014e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8015f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8016g;

    /* renamed from: h  reason: collision with root package name */
    public final List<uh0> f8017h;

    public r6(String str, String str2, long j10, long j11, long j12, long j13, List<uh0> list) {
        this.f8011b = str;
        this.f8012c = "".equals(str2) ? null : str2;
        this.f8013d = j10;
        this.f8014e = j11;
        this.f8015f = j12;
        this.f8016g = j13;
        this.f8017h = list;
    }

    public static r6 b(h7 h7Var) throws IOException {
        if (h6.k(h7Var) == 538247942) {
            String d10 = h6.d(h7Var);
            String d11 = h6.d(h7Var);
            long m10 = h6.m(h7Var);
            long m11 = h6.m(h7Var);
            long m12 = h6.m(h7Var);
            long m13 = h6.m(h7Var);
            int k10 = h6.k(h7Var);
            if (k10 >= 0) {
                List emptyList = k10 == 0 ? Collections.emptyList() : new ArrayList();
                for (int i10 = 0; i10 < k10; i10++) {
                    emptyList.add(new uh0(h6.d(h7Var).intern(), h6.d(h7Var).intern()));
                }
                return new r6(d10, d11, m10, m11, m12, m13, emptyList);
            }
            throw new IOException(d.a(31, "readHeaderList size=", k10));
        }
        throw new IOException();
    }

    public final boolean a(OutputStream outputStream) {
        try {
            h6.e(outputStream, 538247942);
            h6.g(outputStream, this.f8011b);
            String str = this.f8012c;
            if (str == null) {
                str = "";
            }
            h6.g(outputStream, str);
            h6.f(outputStream, this.f8013d);
            h6.f(outputStream, this.f8014e);
            h6.f(outputStream, this.f8015f);
            h6.f(outputStream, this.f8016g);
            List<uh0> list = this.f8017h;
            if (list != null) {
                h6.e(outputStream, list.size());
                for (uh0 next : list) {
                    h6.g(outputStream, next.f16960a);
                    h6.g(outputStream, next.f16961b);
                }
            } else {
                h6.e(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e10) {
            i4.a("%s", e10.toString());
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r6(java.lang.String r14, e8.qe0 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f16147b
            long r3 = r15.f16148c
            long r5 = r15.f16149d
            long r7 = r15.f16150e
            long r9 = r15.f16151f
            java.util.List<e8.uh0> r0 = r15.f16153h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f16152g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            e8.uh0 r11 = new e8.uh0
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r6.<init>(java.lang.String, e8.qe0):void");
    }
}
