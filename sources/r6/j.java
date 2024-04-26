package r6;

import android.util.Pair;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import java.util.Arrays;
import v6.e0;
import v6.s;
import x4.c1;
import x4.e;
import x4.m;
import x4.w0;
import x4.x0;
import z5.f0;
import z5.g0;
import z5.r;

/* compiled from: MappingTrackSelector */
public abstract class j extends n {

    /* renamed from: c  reason: collision with root package name */
    public a f24655c;

    /* compiled from: MappingTrackSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f24656a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f24657b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f24658c;

        /* renamed from: d  reason: collision with root package name */
        public final g0[] f24659d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f24660e;

        /* renamed from: f  reason: collision with root package name */
        public final int[][][] f24661f;

        /* renamed from: g  reason: collision with root package name */
        public final g0 f24662g;

        public a(String[] strArr, int[] iArr, g0[] g0VarArr, int[] iArr2, int[][][] iArr3, g0 g0Var) {
            this.f24657b = strArr;
            this.f24658c = iArr;
            this.f24659d = g0VarArr;
            this.f24661f = iArr3;
            this.f24660e = iArr2;
            this.f24662g = g0Var;
            this.f24656a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f24659d[i10].f28590b[i11].f28583a;
            int[] iArr = new int[i12];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = this.f24661f[i10][i11][i15] & 7;
                if (i16 == 4 || (z10 && i16 == 3)) {
                    iArr[i14] = i15;
                    i14++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            String str = null;
            int i17 = 16;
            boolean z11 = false;
            int i18 = 0;
            while (i13 < copyOf.length) {
                String str2 = this.f24659d[i10].f28590b[i11].f28584b[copyOf[i13]].f27408t;
                int i19 = i18 + 1;
                if (i18 == 0) {
                    str = str2;
                } else {
                    z11 |= !e0.a(str, str2);
                }
                i17 = Math.min(i17, this.f24661f[i10][i11][i13] & 24);
                i13++;
                i18 = i19;
            }
            return z11 ? Math.min(i17, this.f24660e[i10]) : i17;
        }

        public int b(int i10, int i11, int i12) {
            return this.f24661f[i10][i11][i12] & 7;
        }

        public int c(int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f24656a; i12++) {
                if (this.f24658c[i12] == i10) {
                    int[][] iArr = this.f24661f[i12];
                    int length = iArr.length;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        for (int i15 : iArr[i13]) {
                            int i16 = i15 & 7;
                            int i17 = 2;
                            if (i16 == 0 || i16 == 1 || i16 == 2) {
                                i17 = 1;
                            } else if (i16 != 3) {
                                if (i16 == 4) {
                                    i14 = 3;
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            i14 = Math.max(i14, i17);
                        }
                        i13++;
                    }
                    i11 = Math.max(i11, i14);
                }
            }
            return i11;
        }
    }

    public final void a(Object obj) {
        this.f24655c = (a) obj;
    }

    public final o b(w0[] w0VarArr, g0 g0Var, r.a aVar, c1 c1Var) throws m {
        int[] iArr;
        w0[] w0VarArr2 = w0VarArr;
        g0 g0Var2 = g0Var;
        int[] iArr2 = new int[(w0VarArr2.length + 1)];
        int length = w0VarArr2.length + 1;
        f0[][] f0VarArr = new f0[length][];
        int[][][] iArr3 = new int[(w0VarArr2.length + 1)][][];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = g0Var2.f28589a;
            f0VarArr[i11] = new f0[i12];
            iArr3[i11] = new int[i12][];
        }
        int length2 = w0VarArr2.length;
        int[] iArr4 = new int[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            iArr4[i13] = w0VarArr2[i13].l();
        }
        int i14 = 0;
        while (i14 < g0Var2.f28589a) {
            f0 f0Var = g0Var2.f28590b[i14];
            boolean z10 = s.i(f0Var.f28584b[i10].f27408t) == 5;
            int length3 = w0VarArr2.length;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = true;
            while (i15 < w0VarArr2.length) {
                w0 w0Var = w0VarArr2[i15];
                int i17 = 0;
                while (i10 < f0Var.f28583a) {
                    i17 = Math.max(i17, w0Var.h(f0Var.f28584b[i10]) & 7);
                    i10++;
                }
                boolean z12 = iArr2[i15] == 0;
                if (i17 > i16 || (i17 == i16 && z10 && !z11 && z12)) {
                    z11 = z12;
                    i16 = i17;
                    length3 = i15;
                }
                i15++;
                g0 g0Var3 = g0Var;
                i10 = 0;
            }
            if (length3 == w0VarArr2.length) {
                iArr = new int[f0Var.f28583a];
            } else {
                w0 w0Var2 = w0VarArr2[length3];
                int[] iArr5 = new int[f0Var.f28583a];
                for (int i18 = 0; i18 < f0Var.f28583a; i18++) {
                    iArr5[i18] = w0Var2.h(f0Var.f28584b[i18]);
                }
                iArr = iArr5;
            }
            int i19 = iArr2[length3];
            f0VarArr[length3][i19] = f0Var;
            iArr3[length3][i19] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
            i14++;
            g0Var2 = g0Var;
            i10 = 0;
        }
        g0[] g0VarArr = new g0[w0VarArr2.length];
        String[] strArr = new String[w0VarArr2.length];
        int[] iArr6 = new int[w0VarArr2.length];
        for (int i20 = 0; i20 < w0VarArr2.length; i20++) {
            int i21 = iArr2[i20];
            g0VarArr[i20] = new g0((f0[]) e0.L(f0VarArr[i20], i21));
            iArr3[i20] = (int[][]) e0.L(iArr3[i20], i21);
            strArr[i20] = w0VarArr2[i20].a();
            iArr6[i20] = ((e) w0VarArr2[i20]).f27492a;
        }
        a aVar2 = new a(strArr, iArr6, g0VarArr, iArr4, iArr3, new g0((f0[]) e0.L(f0VarArr[w0VarArr2.length], iArr2[w0VarArr2.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> c10 = c(aVar2, iArr3, iArr4, aVar, c1Var);
        return new o((x0[]) c10.first, (h[]) c10.second, aVar2);
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> c(a aVar, int[][][] iArr, int[] iArr2, r.a aVar2, c1 c1Var) throws m;
}
