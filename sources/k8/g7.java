package k8;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class g7 extends l {

    /* renamed from: b  reason: collision with root package name */
    public final c f20221b;

    public g7(c cVar) {
        this.f20221b = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o s(java.lang.String r17, n2.g r18, java.util.List<k8.o> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r5 = 5
            r7 = 1
            r8 = 2
            r9 = 3
            r10 = 4
            java.lang.String r11 = "setEventName"
            java.lang.String r12 = "setParamValue"
            java.lang.String r13 = "getParams"
            java.lang.String r14 = "getParamValue"
            java.lang.String r15 = "getTimestamp"
            java.lang.String r6 = "getEventName"
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r14)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r15)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r6)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x013f
            if (r4 == r7) goto L_0x0114
            if (r4 == r8) goto L_0x00e4
            if (r4 == r9) goto L_0x00cf
            if (r4 == r10) goto L_0x0095
            if (r4 == r5) goto L_0x0063
            k8.o r1 = super.s(r17, r18, r19)
            return r1
        L_0x0063:
            x.f.n(r12, r8, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r2.y(r1)
            java.lang.String r1 = r1.q()
            java.lang.Object r3 = r3.get(r7)
            k8.o r3 = (k8.o) r3
            k8.o r2 = r2.y(r3)
            k8.c r3 = r0.f20221b
            k8.b r3 = r3.f20086b
            java.lang.Object r4 = x.f.l(r2)
            if (r4 != 0) goto L_0x008f
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f20076c
            r3.remove(r1)
            goto L_0x0094
        L_0x008f:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f20076c
            r3.put(r1, r4)
        L_0x0094:
            return r2
        L_0x0095:
            x.f.n(r11, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r2.y(r1)
            k8.o r2 = k8.o.f20381n
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c7
            k8.o r2 = k8.o.f20382o
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c7
            k8.c r2 = r0.f20221b
            k8.b r2 = r2.f20086b
            java.lang.String r3 = r1.q()
            r2.f20074a = r3
            k8.r r2 = new k8.r
            java.lang.String r1 = r1.q()
            r2.<init>(r1)
            return r2
        L_0x00c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00cf:
            r1 = 0
            x.f.n(r15, r1, r3)
            k8.c r1 = r0.f20221b
            k8.b r1 = r1.f20086b
            k8.h r2 = new k8.h
            long r3 = r1.f20075b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e4:
            r1 = 0
            x.f.n(r13, r1, r3)
            k8.c r1 = r0.f20221b
            k8.b r1 = r1.f20086b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f20076c
            k8.l r2 = new k8.l
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            k8.o r5 = b8.a.k(r5)
            r2.o(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            x.f.n(r14, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r2.y(r1)
            java.lang.String r1 = r1.q()
            k8.c r2 = r0.f20221b
            k8.b r2 = r2.f20086b
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f20076c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0139
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f20076c
            java.lang.Object r1 = r2.get(r1)
            goto L_0x013a
        L_0x0139:
            r1 = 0
        L_0x013a:
            k8.o r1 = b8.a.k(r1)
            return r1
        L_0x013f:
            r1 = 0
            x.f.n(r6, r1, r3)
            k8.c r1 = r0.f20221b
            k8.b r1 = r1.f20086b
            k8.r r2 = new k8.r
            java.lang.String r1 = r1.f20074a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.g7.s(java.lang.String, n2.g, java.util.List):k8.o");
    }
}
