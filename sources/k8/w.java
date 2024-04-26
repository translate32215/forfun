package k8;

import java.util.ArrayList;
import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class w extends u {
    public w() {
        this.f20482a.add(e0.APPLY);
        this.f20482a.add(e0.BLOCK);
        this.f20482a.add(e0.BREAK);
        this.f20482a.add(e0.CASE);
        this.f20482a.add(e0.DEFAULT);
        this.f20482a.add(e0.CONTINUE);
        this.f20482a.add(e0.DEFINE_FUNCTION);
        this.f20482a.add(e0.FN);
        this.f20482a.add(e0.IF);
        this.f20482a.add(e0.QUOTE);
        this.f20482a.add(e0.RETURN);
        this.f20482a.add(e0.SWITCH);
        this.f20482a.add(e0.TERNARY);
    }

    public static o c(g gVar, List<o> list) {
        e0 e0Var = e0.FN;
        f.o("FN", 2, list);
        o y10 = gVar.y(list.get(0));
        o y11 = gVar.y(list.get(1));
        if (y11 instanceof e) {
            List<o> B = ((e) y11).B();
            List<o> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new n(y10.q(), B, arrayList, gVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{y11.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        if (r10.equals("continue") == false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o a(java.lang.String r10, n2.g r11, java.util.List<k8.o> r12) {
        /*
            r9 = this;
            k8.e0 r0 = k8.e0.ADD
            k8.e0 r0 = x.f.k(r10)
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            r3 = 3
            r4 = 2
            if (r0 == r4) goto L_0x0201
            r5 = 15
            java.lang.String r6 = "BREAK"
            if (r0 == r5) goto L_0x01f9
            r5 = 25
            if (r0 == r5) goto L_0x01f4
            r5 = 41
            r7 = 0
            if (r0 == r5) goto L_0x01a6
            r5 = 54
            if (r0 == r5) goto L_0x01a0
            r5 = 57
            java.lang.String r8 = "return"
            if (r0 == r5) goto L_0x017f
            r5 = 19
            if (r0 == r5) goto L_0x015e
            r5 = 20
            if (r0 == r5) goto L_0x0142
            r5 = 60
            if (r0 == r5) goto L_0x0087
            r5 = 61
            if (r0 == r5) goto L_0x0056
            switch(r0) {
                case 11: goto L_0x0048;
                case 12: goto L_0x0040;
                case 13: goto L_0x015e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r9.b(r10)
            throw r7
        L_0x0040:
            k8.e0 r10 = k8.e0.BREAK
            x.f.n(r6, r2, r12)
            k8.o r10 = k8.o.f20384q
            return r10
        L_0x0048:
            n2.g r10 = r11.w()
            k8.e r11 = new k8.e
            r11.<init>(r12)
            k8.o r10 = r10.z(r11)
            return r10
        L_0x0056:
            k8.e0 r10 = k8.e0.TERNARY
            java.lang.String r10 = "TERNARY"
            x.f.n(r10, r3, r12)
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            java.lang.Boolean r10 = r10.j()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x007c
            java.lang.Object r10 = r12.get(r1)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            goto L_0x0086
        L_0x007c:
            java.lang.Object r10 = r12.get(r4)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
        L_0x0086:
            return r10
        L_0x0087:
            k8.e0 r10 = k8.e0.SWITCH
            java.lang.String r10 = "SWITCH"
            x.f.n(r10, r3, r12)
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            java.lang.Object r0 = r12.get(r1)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r11.y(r0)
            java.lang.Object r12 = r12.get(r4)
            k8.o r12 = (k8.o) r12
            k8.o r12 = r11.y(r12)
            boolean r3 = r0 instanceof k8.e
            if (r3 == 0) goto L_0x013a
            boolean r3 = r12 instanceof k8.e
            if (r3 == 0) goto L_0x0132
            k8.e r0 = (k8.e) r0
            k8.e r12 = (k8.e) r12
            r3 = 0
            r4 = 0
        L_0x00ba:
            int r5 = r0.x()
            if (r3 >= r5) goto L_0x00fb
            if (r4 != 0) goto L_0x00d7
            k8.o r4 = r0.y(r3)
            java.lang.Object r5 = r11.f21851b
            m3.t r5 = (m3.t) r5
            k8.o r4 = r5.d(r11, r4)
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r4 = 0
            goto L_0x00f8
        L_0x00d7:
            k8.o r4 = r12.y(r3)
            java.lang.Object r5 = r11.f21851b
            m3.t r5 = (m3.t) r5
            k8.o r4 = r5.d(r11, r4)
            boolean r5 = r4 instanceof k8.g
            if (r5 == 0) goto L_0x00f7
            r10 = r4
            k8.g r10 = (k8.g) r10
            java.lang.String r10 = r10.f20214b
            java.lang.String r11 = "break"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x012e
            k8.o r10 = k8.o.f20381n
            return r10
        L_0x00f7:
            r4 = 1
        L_0x00f8:
            int r3 = r3 + 1
            goto L_0x00ba
        L_0x00fb:
            int r10 = r0.x()
            int r10 = r10 + r1
            int r1 = r12.x()
            if (r10 != r1) goto L_0x012f
            int r10 = r0.x()
            k8.o r10 = r12.y(r10)
            java.lang.Object r12 = r11.f21851b
            m3.t r12 = (m3.t) r12
            k8.o r4 = r12.d(r11, r10)
            boolean r10 = r4 instanceof k8.g
            if (r10 == 0) goto L_0x012f
            r10 = r4
            k8.g r10 = (k8.g) r10
            java.lang.String r10 = r10.f20214b
            boolean r11 = r10.equals(r8)
            if (r11 != 0) goto L_0x012e
            java.lang.String r11 = "continue"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            return r4
        L_0x012f:
            k8.o r10 = k8.o.f20381n
            return r10
        L_0x0132:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Malformed SWITCH statement, case statements are not a list"
            r10.<init>(r11)
            throw r10
        L_0x013a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Malformed SWITCH statement, cases are not a list"
            r10.<init>(r11)
            throw r10
        L_0x0142:
            k8.e0 r10 = k8.e0.DEFINE_FUNCTION
            java.lang.String r10 = "DEFINE_FUNCTION"
            x.f.o(r10, r4, r12)
            k8.o r10 = c(r11, r12)
            r12 = r10
            k8.i r12 = (k8.i) r12
            java.lang.String r12 = r12.f20254a
            if (r12 != 0) goto L_0x015a
            java.lang.String r12 = ""
            r11.C(r12, r10)
            goto L_0x015d
        L_0x015a:
            r11.C(r12, r10)
        L_0x015d:
            return r10
        L_0x015e:
            boolean r10 = r12.isEmpty()
            if (r10 == 0) goto L_0x0167
            k8.o r10 = k8.o.f20381n
            goto L_0x017e
        L_0x0167:
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            boolean r12 = r10 instanceof k8.e
            if (r12 == 0) goto L_0x017c
            k8.e r10 = (k8.e) r10
            k8.o r10 = r11.z(r10)
            goto L_0x017e
        L_0x017c:
            k8.o r10 = k8.o.f20381n
        L_0x017e:
            return r10
        L_0x017f:
            boolean r10 = r12.isEmpty()
            if (r10 == 0) goto L_0x0188
            k8.o r10 = k8.o.T
            goto L_0x019f
        L_0x0188:
            k8.e0 r10 = k8.e0.RETURN
            java.lang.String r10 = "RETURN"
            x.f.n(r10, r1, r12)
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            k8.g r11 = new k8.g
            r11.<init>(r8, r10)
            r10 = r11
        L_0x019f:
            return r10
        L_0x01a0:
            k8.e r10 = new k8.e
            r10.<init>(r12)
            return r10
        L_0x01a6:
            k8.e0 r10 = k8.e0.IF
            java.lang.String r10 = "IF"
            x.f.o(r10, r4, r12)
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            java.lang.Object r0 = r12.get(r1)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r11.y(r0)
            int r1 = r12.size()
            if (r1 <= r4) goto L_0x01d1
            java.lang.Object r12 = r12.get(r4)
            k8.o r12 = (k8.o) r12
            k8.o r7 = r11.y(r12)
        L_0x01d1:
            k8.o r12 = k8.o.f20381n
            java.lang.Boolean r10 = r10.j()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x01e4
            k8.e r0 = (k8.e) r0
            k8.o r10 = r11.z(r0)
            goto L_0x01ee
        L_0x01e4:
            if (r7 == 0) goto L_0x01ed
            k8.e r7 = (k8.e) r7
            k8.o r10 = r11.z(r7)
            goto L_0x01ee
        L_0x01ed:
            r10 = r12
        L_0x01ee:
            boolean r11 = r10 instanceof k8.g
            if (r11 == 0) goto L_0x01f3
            return r10
        L_0x01f3:
            return r12
        L_0x01f4:
            k8.o r10 = c(r11, r12)
            return r10
        L_0x01f9:
            k8.e0 r10 = k8.e0.BREAK
            x.f.n(r6, r2, r12)
            k8.o r10 = k8.o.f20383p
            return r10
        L_0x0201:
            k8.e0 r10 = k8.e0.APPLY
            java.lang.String r10 = "APPLY"
            x.f.n(r10, r3, r12)
            java.lang.Object r10 = r12.get(r2)
            k8.o r10 = (k8.o) r10
            k8.o r10 = r11.y(r10)
            java.lang.Object r0 = r12.get(r1)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r11.y(r0)
            java.lang.String r0 = r0.q()
            java.lang.Object r12 = r12.get(r4)
            k8.o r12 = (k8.o) r12
            k8.o r12 = r11.y(r12)
            boolean r3 = r12 instanceof k8.e
            if (r3 == 0) goto L_0x0247
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x023f
            k8.e r12 = (k8.e) r12
            java.util.List r12 = r12.B()
            k8.o r10 = r10.s(r0, r11, r12)
            return r10
        L_0x023f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Function name for apply is undefined"
            r10.<init>(r11)
            throw r10
        L_0x0247:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getCanonicalName()
            r11[r2] = r12
            java.lang.String r12 = "Function arguments for Apply are not a list found %s"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r10.<init>(r11)
            goto L_0x0260
        L_0x025f:
            throw r10
        L_0x0260:
            goto L_0x025f
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.w.a(java.lang.String, n2.g, java.util.List):k8.o");
    }
}
