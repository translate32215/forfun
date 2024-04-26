package ce;

import java.util.List;
import kd.g;
import td.p;
import ud.l;

/* compiled from: Strings.kt */
public final class j extends l implements p<CharSequence, Integer, g<? extends Integer, ? extends Integer>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<String> f4396b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f4397c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(List<String> list, boolean z10) {
        super(2);
        this.f4396b = list;
        this.f4397c = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            ud.k.f(r14, r0)
            java.util.List<java.lang.String> r6 = r13.f4396b
            boolean r7 = r13.f4397c
            r8 = 0
            r0 = 0
            if (r7 != 0) goto L_0x0056
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x0056
            java.lang.String r1 = "<this>"
            ud.k.f(r6, r1)
            ud.k.f(r6, r1)
            int r1 = r6.size()
            if (r1 == 0) goto L_0x004e
            if (r1 != r2) goto L_0x0046
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = ce.k.p(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x003b
            goto L_0x00f6
        L_0x003b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            kd.g r15 = new kd.g
            r15.<init>(r14, r1)
            goto L_0x00f7
        L_0x0046:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x004e:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x0056:
            zd.c r1 = new zd.c
            if (r15 >= 0) goto L_0x005b
            r15 = 0
        L_0x005b:
            int r0 = r14.length()
            r1.<init>(r15, r0)
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L_0x00af
            int r15 = r1.f()
            int r9 = r1.h()
            int r10 = r1.i()
            if (r10 <= 0) goto L_0x0076
            if (r15 <= r9) goto L_0x007a
        L_0x0076:
            if (r10 >= 0) goto L_0x00f6
            if (r9 > r15) goto L_0x00f6
        L_0x007a:
            java.util.Iterator r11 = r6.iterator()
        L_0x007e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r15
            r5 = r7
            boolean r0 = ce.i.e(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x007e
            goto L_0x009d
        L_0x009c:
            r12 = r8
        L_0x009d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00ab
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kd.g r15 = new kd.g
            r15.<init>(r14, r12)
            goto L_0x00f7
        L_0x00ab:
            if (r15 == r9) goto L_0x00f6
            int r15 = r15 + r10
            goto L_0x007a
        L_0x00af:
            int r15 = r1.f()
            int r9 = r1.h()
            int r10 = r1.i()
            if (r10 <= 0) goto L_0x00bf
            if (r15 <= r9) goto L_0x00c3
        L_0x00bf:
            if (r10 >= 0) goto L_0x00f6
            if (r9 > r15) goto L_0x00f6
        L_0x00c3:
            java.util.Iterator r11 = r6.iterator()
        L_0x00c7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = ce.k.q(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c7
            goto L_0x00e4
        L_0x00e3:
            r12 = r8
        L_0x00e4:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00f2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kd.g r15 = new kd.g
            r15.<init>(r14, r12)
            goto L_0x00f7
        L_0x00f2:
            if (r15 == r9) goto L_0x00f6
            int r15 = r15 + r10
            goto L_0x00c3
        L_0x00f6:
            r15 = r8
        L_0x00f7:
            if (r15 == 0) goto L_0x010c
            A r14 = r15.f20614a
            B r15 = r15.f20615b
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            kd.g r8 = new kd.g
            r8.<init>(r14, r15)
        L_0x010c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.j.h(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
