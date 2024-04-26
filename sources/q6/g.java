package q6;

import h6.c;
import v6.v;

/* compiled from: WebvttDecoder */
public final class g extends c {

    /* renamed from: n  reason: collision with root package name */
    public final v f24208n = new v();

    /* renamed from: o  reason: collision with root package name */
    public final a f24209o = new a();

    public g() {
        super("WebvttDecoder");
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (")".equals(q6.a.b(r10, r11)) == false) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0315 A[EDGE_INSN: B:198:0x0315->B:161:0x0315 ?: BREAK  
    EDGE_INSN: B:199:0x0315->B:161:0x0315 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.e k(byte[] r21, int r22, boolean r23) throws h6.g {
        /*
            r20 = this;
            r1 = r20
            v6.v r0 = r1.f24208n
            r2 = r21
            r0.f26518a = r2
            r2 = r22
            r0.f26520c = r2
            r2 = 0
            r0.f26519b = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v6.v r3 = r1.f24208n     // Catch:{ m0 -> 0x036a }
            q6.h.d(r3)     // Catch:{ m0 -> 0x036a }
        L_0x0019:
            v6.v r3 = r1.f24208n
            java.lang.String r3 = r3.g()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0026
            goto L_0x0019
        L_0x0026:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002b:
            v6.v r4 = r1.f24208n
            r5 = 3
            r6 = 2
            r7 = -1
            r8 = 1
            r9 = -1
            r10 = 0
        L_0x0033:
            if (r9 != r7) goto L_0x0055
            int r10 = r4.f26519b
            java.lang.String r9 = r4.g()
            if (r9 != 0) goto L_0x003f
            r9 = 0
            goto L_0x0033
        L_0x003f:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x0049
            r9 = 2
            goto L_0x0033
        L_0x0049:
            java.lang.String r11 = "NOTE"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x0053
            r9 = 1
            goto L_0x0033
        L_0x0053:
            r9 = 3
            goto L_0x0033
        L_0x0055:
            r4.D(r10)
            if (r9 == 0) goto L_0x0364
            if (r9 != r8) goto L_0x0069
            v6.v r4 = r1.f24208n
        L_0x005e:
            java.lang.String r5 = r4.g()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x002b
            goto L_0x005e
        L_0x0069:
            if (r9 != r6) goto L_0x0321
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0319
            v6.v r5 = r1.f24208n
            r5.g()
            q6.a r5 = r1.f24209o
            v6.v r9 = r1.f24208n
            java.lang.StringBuilder r10 = r5.f24162b
            r10.setLength(r2)
            int r10 = r9.f26519b
        L_0x0081:
            java.lang.String r11 = r9.g()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0081
            v6.v r11 = r5.f24161a
            byte[] r12 = r9.f26518a
            int r9 = r9.f26519b
            r11.B(r12, r9)
            v6.v r9 = r5.f24161a
            r9.D(r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x009e:
            v6.v r10 = r5.f24161a
            java.lang.StringBuilder r11 = r5.f24162b
            q6.a.c(r10)
            int r12 = r10.a()
            r13 = 5
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            if (r12 >= r13) goto L_0x00b1
            goto L_0x0112
        L_0x00b1:
            java.lang.String r12 = r10.p(r13)
            java.lang.String r13 = "::cue"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00be
            goto L_0x0112
        L_0x00be:
            int r12 = r10.f26519b
            java.lang.String r13 = q6.a.b(r10, r11)
            if (r13 != 0) goto L_0x00c7
            goto L_0x0112
        L_0x00c7:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d2
            r10.D(r12)
            r4 = r15
            goto L_0x0113
        L_0x00d2:
            java.lang.String r12 = "("
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0105
            int r12 = r10.f26519b
            int r13 = r10.f26520c
            r16 = 0
        L_0x00e0:
            if (r12 >= r13) goto L_0x00f7
            if (r16 != 0) goto L_0x00f7
            byte[] r4 = r10.f26518a
            int r16 = r12 + 1
            byte r4 = r4[r12]
            char r4 = (char) r4
            r12 = 41
            if (r4 != r12) goto L_0x00f1
            r4 = 1
            goto L_0x00f2
        L_0x00f1:
            r4 = 0
        L_0x00f2:
            r12 = r16
            r16 = r4
            goto L_0x00e0
        L_0x00f7:
            int r12 = r12 + -1
            int r4 = r10.f26519b
            int r12 = r12 - r4
            java.lang.String r4 = r10.p(r12)
            java.lang.String r4 = r4.trim()
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            java.lang.String r10 = q6.a.b(r10, r11)
            java.lang.String r11 = ")"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0113
        L_0x0112:
            r4 = 0
        L_0x0113:
            if (r4 == 0) goto L_0x0315
            v6.v r10 = r5.f24161a
            java.lang.StringBuilder r11 = r5.f24162b
            java.lang.String r10 = q6.a.b(r10, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0125
            goto L_0x0315
        L_0x0125:
            q6.c r10 = new q6.c
            r10.<init>()
            boolean r11 = r15.equals(r4)
            if (r11 == 0) goto L_0x0131
            goto L_0x0198
        L_0x0131:
            r11 = 91
            int r11 = r4.indexOf(r11)
            if (r11 == r7) goto L_0x0156
            java.util.regex.Pattern r12 = q6.a.f24160c
            java.lang.String r13 = r4.substring(r11)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r12.matches()
            if (r13 == 0) goto L_0x0152
            java.lang.String r12 = r12.group(r8)
            r12.getClass()
            r10.f24167d = r12
        L_0x0152:
            java.lang.String r4 = r4.substring(r2, r11)
        L_0x0156:
            java.lang.String r11 = "\\."
            java.lang.String[] r4 = v6.e0.R(r4, r11)
            r11 = r4[r2]
            r12 = 35
            int r12 = r11.indexOf(r12)
            if (r12 == r7) goto L_0x0175
            java.lang.String r13 = r11.substring(r2, r12)
            r10.f24165b = r13
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)
            r10.f24164a = r11
            goto L_0x0177
        L_0x0175:
            r10.f24165b = r11
        L_0x0177:
            int r11 = r4.length
            if (r11 <= r8) goto L_0x0198
            int r11 = r4.length
            v6.a.a(r8)
            int r12 = r4.length
            if (r11 > r12) goto L_0x0183
            r12 = 1
            goto L_0x0184
        L_0x0183:
            r12 = 0
        L_0x0184:
            v6.a.a(r12)
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r8, r11)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.HashSet r11 = new java.util.HashSet
            java.util.List r4 = java.util.Arrays.asList(r4)
            r11.<init>(r4)
            r10.f24166c = r11
        L_0x0198:
            r4 = 0
            r11 = 0
        L_0x019a:
            java.lang.String r12 = "}"
            if (r4 != 0) goto L_0x0300
            v6.v r4 = r5.f24161a
            int r11 = r4.f26519b
            java.lang.StringBuilder r13 = r5.f24162b
            java.lang.String r4 = q6.a.b(r4, r13)
            if (r4 == 0) goto L_0x01b3
            boolean r13 = r12.equals(r4)
            if (r13 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r13 = 0
            goto L_0x01b4
        L_0x01b3:
            r13 = 1
        L_0x01b4:
            if (r13 != 0) goto L_0x02ef
            v6.v r14 = r5.f24161a
            r14.D(r11)
            v6.v r11 = r5.f24161a
            java.lang.StringBuilder r14 = r5.f24162b
            q6.a.c(r11)
            java.lang.String r2 = q6.a.a(r11, r14)
            boolean r16 = r15.equals(r2)
            if (r16 == 0) goto L_0x01ce
            goto L_0x02ef
        L_0x01ce:
            java.lang.String r7 = q6.a.b(r11, r14)
            java.lang.String r6 = ":"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x01dc
            goto L_0x02ef
        L_0x01dc:
            q6.a.c(r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
        L_0x01e5:
            java.lang.String r8 = ";"
            if (r7 != 0) goto L_0x0215
            r17 = r4
            int r4 = r11.f26519b
            r18 = r5
            java.lang.String r5 = q6.a.b(r11, r14)
            if (r5 != 0) goto L_0x01f7
            r4 = 0
            goto L_0x021d
        L_0x01f7:
            boolean r19 = r12.equals(r5)
            if (r19 != 0) goto L_0x020c
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0204
            goto L_0x020c
        L_0x0204:
            r6.append(r5)
            r4 = r17
            r5 = r18
            goto L_0x01e5
        L_0x020c:
            r11.D(r4)
            r4 = r17
            r5 = r18
            r7 = 1
            goto L_0x01e5
        L_0x0215:
            r17 = r4
            r18 = r5
            java.lang.String r4 = r6.toString()
        L_0x021d:
            if (r4 == 0) goto L_0x02f3
            boolean r5 = r15.equals(r4)
            if (r5 == 0) goto L_0x0227
            goto L_0x02f3
        L_0x0227:
            int r5 = r11.f26519b
            java.lang.String r6 = q6.a.b(r11, r14)
            boolean r7 = r8.equals(r6)
            if (r7 == 0) goto L_0x0234
            goto L_0x023d
        L_0x0234:
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x02f3
            r11.D(r5)
        L_0x023d:
            java.lang.String r5 = "color"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0250
            r5 = 1
            int r2 = v6.e.a(r4, r5)
            r10.f24169f = r2
            r10.f24170g = r5
            goto L_0x02f3
        L_0x0250:
            r5 = 1
            java.lang.String r6 = "background-color"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0263
            int r2 = v6.e.a(r4, r5)
            r10.f24171h = r2
            r10.f24172i = r5
            goto L_0x02f3
        L_0x0263:
            java.lang.String r6 = "ruby-position"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0284
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0277
            r10.f24178o = r5
            goto L_0x02f3
        L_0x0277:
            java.lang.String r2 = "under"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02f3
            r5 = 2
            r10.f24178o = r5
            goto L_0x02f4
        L_0x0284:
            r5 = 2
            java.lang.String r6 = "text-combine-upright"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x02a4
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02a0
            java.lang.String r2 = "digits"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L_0x029e
            goto L_0x02a0
        L_0x029e:
            r2 = 0
            goto L_0x02a1
        L_0x02a0:
            r2 = 1
        L_0x02a1:
            r10.f24179p = r2
            goto L_0x02f4
        L_0x02a4:
            java.lang.String r6 = "text-decoration"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x02b8
            java.lang.String r2 = "underline"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02f4
            r2 = 1
            r10.f24174k = r2
            goto L_0x02f4
        L_0x02b8:
            java.lang.String r6 = "font-family"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x02c7
            java.lang.String r2 = v6.e0.V(r4)
            r10.f24168e = r2
            goto L_0x02f4
        L_0x02c7:
            java.lang.String r6 = "font-weight"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x02db
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02f4
            r6 = 1
            r10.f24175l = r6
            goto L_0x02f5
        L_0x02db:
            r6 = 1
            java.lang.String r7 = "font-style"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x02f5
            java.lang.String r2 = "italic"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02f5
            r10.f24176m = r6
            goto L_0x02f5
        L_0x02ef:
            r17 = r4
            r18 = r5
        L_0x02f3:
            r5 = 2
        L_0x02f4:
            r6 = 1
        L_0x02f5:
            r4 = r13
            r11 = r17
            r5 = r18
            r2 = 0
            r6 = 2
            r7 = -1
            r8 = 1
            goto L_0x019a
        L_0x0300:
            r18 = r5
            r5 = 2
            r6 = 1
            boolean r2 = r12.equals(r11)
            if (r2 == 0) goto L_0x030d
            r9.add(r10)
        L_0x030d:
            r5 = r18
            r2 = 0
            r6 = 2
            r7 = -1
            r8 = 1
            goto L_0x009e
        L_0x0315:
            r0.addAll(r9)
            goto L_0x0361
        L_0x0319:
            h6.g r0 = new h6.g
            java.lang.String r2 = "A style block was found after the first cue."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0321:
            if (r9 != r5) goto L_0x0361
            v6.v r2 = r1.f24208n
            java.util.regex.Pattern r4 = q6.e.f24183a
            java.lang.String r4 = r2.g()
            if (r4 != 0) goto L_0x032f
            r4 = 0
            goto L_0x035c
        L_0x032f:
            java.util.regex.Pattern r5 = q6.e.f24183a
            java.util.regex.Matcher r6 = r5.matcher(r4)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x0341
            r7 = 0
            q6.d r4 = q6.e.d(r7, r6, r2, r0)
            goto L_0x035c
        L_0x0341:
            r7 = 0
            java.lang.String r6 = r2.g()
            if (r6 != 0) goto L_0x034a
        L_0x0348:
            r4 = r7
            goto L_0x035c
        L_0x034a:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x0348
            java.lang.String r4 = r4.trim()
            q6.d r4 = q6.e.d(r4, r5, r2, r0)
        L_0x035c:
            if (r4 == 0) goto L_0x0361
            r3.add(r4)
        L_0x0361:
            r2 = 0
            goto L_0x002b
        L_0x0364:
            q6.j r0 = new q6.j
            r0.<init>(r3)
            return r0
        L_0x036a:
            r0 = move-exception
            h6.g r2 = new h6.g
            r2.<init>((java.lang.Throwable) r0)
            goto L_0x0372
        L_0x0371:
            throw r2
        L_0x0372:
            goto L_0x0371
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g.k(byte[], int, boolean):h6.e");
    }
}
