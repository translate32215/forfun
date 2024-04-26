package k8;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class m8 {

    /* renamed from: f  reason: collision with root package name */
    public static final m8 f20328f = new m8(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f20329a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f20330b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f20331c;

    /* renamed from: d  reason: collision with root package name */
    public int f20332d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20333e;

    public m8() {
        this(0, new int[8], new Object[8], true);
    }

    public m8(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f20332d = -1;
        this.f20329a = i10;
        this.f20330b = iArr;
        this.f20331c = objArr;
        this.f20333e = z10;
    }

    public static m8 b() {
        return new m8(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f20332d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f20329a; i15++) {
            int i16 = this.f20330b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f20331c[i15]).longValue();
                    i12 = t5.b(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int b10 = t5.b(i17 << 3);
                    int h10 = ((p5) this.f20331c[i15]).h();
                    i14 = t5.b(h10) + h10 + b10 + i14;
                } else if (i18 == 3) {
                    int A = t5.A(i17);
                    i11 = A + A;
                    i10 = ((m8) this.f20331c[i15]).a();
                } else if (i18 == 5) {
                    ((Integer) this.f20331c[i15]).intValue();
                    i12 = t5.b(i17 << 3) + 4;
                } else {
                    int i19 = t6.f20476a;
                    throw new IllegalStateException(new s6());
                }
                i14 = i12 + i14;
            } else {
                long longValue = ((Long) this.f20331c[i15]).longValue();
                i11 = t5.b(i17 << 3);
                i10 = t5.c(longValue);
            }
            i14 = i10 + i11 + i14;
        }
        this.f20332d = i14;
        return i14;
    }

    public final void c(int i10, Object obj) {
        if (this.f20333e) {
            int i11 = this.f20329a;
            int[] iArr = this.f20330b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f20330b = Arrays.copyOf(iArr, i12);
                this.f20331c = Arrays.copyOf(this.f20331c, i12);
            }
            int[] iArr2 = this.f20330b;
            int i13 = this.f20329a;
            iArr2[i13] = i10;
            this.f20331c[i13] = obj;
            this.f20329a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(u5 u5Var) throws IOException {
        if (this.f20329a != 0) {
            for (int i10 = 0; i10 < this.f20329a; i10++) {
                int i11 = this.f20330b[i10];
                Object obj = this.f20331c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    u5Var.f20485a.t(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    u5Var.f20485a.j(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    u5Var.f20485a.f(i12, (p5) obj);
                } else if (i13 == 3) {
                    u5Var.f20485a.p(i12, 3);
                    ((m8) obj).d(u5Var);
                    u5Var.f20485a.p(i12, 4);
                } else if (i13 == 5) {
                    u5Var.f20485a.g(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = t6.f20476a;
                    throw new RuntimeException(new s6());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        int i10 = this.f20329a;
        if (i10 == m8Var.f20329a) {
            int[] iArr = this.f20330b;
            int[] iArr2 = m8Var.f20330b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f20331c;
                    Object[] objArr2 = m8Var.f20331c;
                    int i12 = this.f20329a;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f20329a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f20330b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f20331c;
        int i16 = this.f20329a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
