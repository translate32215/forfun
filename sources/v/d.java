package v;

import com.startapp.b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.h;
import w.i;
import w.o;

/* compiled from: ConstraintAnchor */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f26229a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f26230b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26231c;

    /* renamed from: d  reason: collision with root package name */
    public final f f26232d;

    /* renamed from: e  reason: collision with root package name */
    public final a f26233e;

    /* renamed from: f  reason: collision with root package name */
    public d f26234f;

    /* renamed from: g  reason: collision with root package name */
    public int f26235g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f26236h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public h f26237i;

    /* compiled from: ConstraintAnchor */
    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(f fVar, a aVar) {
        this.f26232d = fVar;
        this.f26233e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r8.f26232d.E == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r5 != r12) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r5 != r1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (r5 != r12) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        if (r5 != r2) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(v.d r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0007
            r8.h()
            return r0
        L_0x0007:
            if (r12 != 0) goto L_0x0078
            v.d$a r12 = v.d.a.CENTER_Y
            v.d$a r1 = v.d.a.RIGHT
            v.d$a r2 = v.d.a.CENTER_X
            v.d$a r3 = v.d.a.LEFT
            v.d$a r4 = v.d.a.BASELINE
            v.d$a r5 = r9.f26233e
            v.d$a r6 = r8.f26233e
            r7 = 0
            if (r5 != r6) goto L_0x002b
            if (r6 != r4) goto L_0x0029
            v.f r12 = r9.f26232d
            boolean r12 = r12.E
            if (r12 == 0) goto L_0x0074
            v.f r12 = r8.f26232d
            boolean r12 = r12.E
            if (r12 != 0) goto L_0x0029
            goto L_0x0074
        L_0x0029:
            r1 = 1
            goto L_0x0075
        L_0x002b:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0061;
                case 2: goto L_0x004a;
                case 3: goto L_0x0061;
                case 4: goto L_0x004a;
                case 5: goto L_0x0045;
                case 6: goto L_0x003e;
                case 7: goto L_0x0074;
                case 8: goto L_0x0074;
                default: goto L_0x0032;
            }
        L_0x0032:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            v.d$a r10 = r8.f26233e
            java.lang.String r10 = r10.name()
            r9.<init>(r10)
            throw r9
        L_0x003e:
            if (r5 == r4) goto L_0x0074
            if (r5 == r2) goto L_0x0074
            if (r5 == r12) goto L_0x0074
            goto L_0x0029
        L_0x0045:
            if (r5 == r3) goto L_0x0074
            if (r5 != r1) goto L_0x0029
            goto L_0x0074
        L_0x004a:
            v.d$a r1 = v.d.a.TOP
            if (r5 == r1) goto L_0x0055
            v.d$a r1 = v.d.a.BOTTOM
            if (r5 != r1) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 0
            goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            v.f r2 = r9.f26232d
            boolean r2 = r2 instanceof v.h
            if (r2 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0029
            if (r5 != r12) goto L_0x0074
            goto L_0x0029
        L_0x0061:
            if (r5 == r3) goto L_0x0068
            if (r5 != r1) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 0
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            v.f r12 = r9.f26232d
            boolean r12 = r12 instanceof v.h
            if (r12 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0029
            if (r5 != r2) goto L_0x0074
            goto L_0x0029
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 != 0) goto L_0x0078
            return r7
        L_0x0078:
            r8.f26234f = r9
            java.util.HashSet<v.d> r12 = r9.f26229a
            if (r12 != 0) goto L_0x0085
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r9.f26229a = r12
        L_0x0085:
            v.d r9 = r8.f26234f
            java.util.HashSet<v.d> r9 = r9.f26229a
            if (r9 == 0) goto L_0x008e
            r9.add(r8)
        L_0x008e:
            r8.f26235g = r10
            r8.f26236h = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d.a(v.d, int, int, boolean):boolean");
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f26229a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f26232d, i10, arrayList, oVar);
            }
        }
    }

    public int c() {
        if (!this.f26231c) {
            return 0;
        }
        return this.f26230b;
    }

    public int d() {
        d dVar;
        if (this.f26232d.f26264i0 == 8) {
            return 0;
        }
        int i10 = this.f26236h;
        if (i10 == Integer.MIN_VALUE || (dVar = this.f26234f) == null || dVar.f26232d.f26264i0 != 8) {
            return this.f26235g;
        }
        return i10;
    }

    public boolean e() {
        d dVar;
        HashSet<d> hashSet = this.f26229a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            d next = it.next();
            switch (next.f26233e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case b4.f10106f:
                    dVar = null;
                    break;
                case 1:
                    dVar = next.f26232d.L;
                    break;
                case 2:
                    dVar = next.f26232d.M;
                    break;
                case 3:
                    dVar = next.f26232d.J;
                    break;
                case 4:
                    dVar = next.f26232d.K;
                    break;
                default:
                    throw new AssertionError(next.f26233e.name());
            }
            if (dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<d> hashSet = this.f26229a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.f26234f != null;
    }

    public void h() {
        HashSet<d> hashSet;
        d dVar = this.f26234f;
        if (!(dVar == null || (hashSet = dVar.f26229a) == null)) {
            hashSet.remove(this);
            if (this.f26234f.f26229a.size() == 0) {
                this.f26234f.f26229a = null;
            }
        }
        this.f26229a = null;
        this.f26234f = null;
        this.f26235g = 0;
        this.f26236h = Integer.MIN_VALUE;
        this.f26231c = false;
        this.f26230b = 0;
    }

    public void i() {
        h hVar = this.f26237i;
        if (hVar == null) {
            this.f26237i = new h(1);
        } else {
            hVar.c();
        }
    }

    public void j(int i10) {
        this.f26230b = i10;
        this.f26231c = true;
    }

    public String toString() {
        return this.f26232d.f26266j0 + ":" + this.f26233e.toString();
    }
}
