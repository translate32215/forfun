package z5;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder */
public interface d0 {
    d0 a(int i10, int i11);

    int b();

    int c(int i10);

    d0 d(int i10, int i11);

    int e();

    int f(int i10);

    int g();

    d0 h();

    /* compiled from: ShuffleOrder */
    public static class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public final Random f28556a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f28557b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f28558c;

        public a(int[] iArr, Random random) {
            this.f28557b = iArr;
            this.f28556a = random;
            this.f28558c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f28558c[iArr[i10]] = i10;
            }
        }

        public d0 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f28557b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f28557b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f28556a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public int b() {
            return this.f28557b.length;
        }

        public int c(int i10) {
            int i11 = this.f28558c[i10] + 1;
            int[] iArr = this.f28557b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public d0 d(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f28556a.nextInt(this.f28557b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f28556a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f28557b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f28557b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f28556a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        public int e() {
            int[] iArr = this.f28557b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public int f(int i10) {
            int i11 = this.f28558c[i10] - 1;
            if (i11 >= 0) {
                return this.f28557b[i11];
            }
            return -1;
        }

        public int g() {
            int[] iArr = this.f28557b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public d0 h() {
            return new a(0, new Random(this.f28556a.nextLong()));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r6, java.util.Random r7) {
            /*
                r5 = this;
                int[] r0 = new int[r6]
                r1 = 0
            L_0x0003:
                if (r1 >= r6) goto L_0x0013
                int r2 = r1 + 1
                int r3 = r7.nextInt(r2)
                r4 = r0[r3]
                r0[r1] = r4
                r0[r3] = r1
                r1 = r2
                goto L_0x0003
            L_0x0013:
                r5.<init>((int[]) r0, (java.util.Random) r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.d0.a.<init>(int, java.util.Random):void");
        }
    }
}
