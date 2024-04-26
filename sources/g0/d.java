package g0;

import android.graphics.Path;
import android.util.Log;
import j.f;

/* compiled from: PathParser */
public class d {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10].f18360a != aVarArr2[i10].f18360a || aVarArr[i10].f18361b.length != aVarArr2[i10].f18361b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10, int i11) {
        if (i10 <= i11) {
            int length = fArr.length;
            if (i10 < 0 || i10 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = i11 - i10;
            int min = Math.min(i12, length - i10);
            float[] fArr2 = new float[i12];
            System.arraycopy(fArr, i10, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r13 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[Catch:{ NumberFormatException -> 0x00ba }, LOOP:3: B:25:0x006d->B:45:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g0.d.a[] c(java.lang.String r16) {
        /*
            r0 = r16
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x000e:
            int r5 = r16.length()
            if (r3 >= r5) goto L_0x00df
        L_0x0014:
            int r5 = r16.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r3 >= r5) goto L_0x003a
            char r5 = r0.charAt(r3)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0032
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0037
        L_0x0032:
            if (r5 == r7) goto L_0x0037
            if (r5 == r6) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x003a:
            java.lang.String r4 = r0.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00d7
            char r5 = r4.charAt(r2)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00c9
            char r5 = r4.charAt(r2)
            r8 = 90
            if (r5 != r8) goto L_0x005a
            goto L_0x00c9
        L_0x005a:
            int r5 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00ba }
            int r8 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            r9 = 1
            r10 = 0
        L_0x0066:
            if (r9 >= r8) goto L_0x00b2
            r2 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r9
        L_0x006d:
            int r15 = r4.length()     // Catch:{ NumberFormatException -> 0x00ba }
            if (r14 >= r15) goto L_0x009b
            char r15 = r4.charAt(r14)     // Catch:{ NumberFormatException -> 0x00ba }
            r7 = 32
            if (r15 == r7) goto L_0x0091
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008f
            if (r15 == r7) goto L_0x008f
            switch(r15) {
                case 44: goto L_0x0093;
                case 45: goto L_0x0089;
                case 46: goto L_0x0085;
                default: goto L_0x0084;
            }     // Catch:{ NumberFormatException -> 0x00ba }
        L_0x0084:
            goto L_0x0094
        L_0x0085:
            if (r12 != 0) goto L_0x008d
            r12 = 1
            goto L_0x0094
        L_0x0089:
            if (r14 == r9) goto L_0x0094
            if (r13 != 0) goto L_0x0094
        L_0x008d:
            r11 = 1
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0095
        L_0x0091:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0093:
            r2 = 1
        L_0x0094:
            r13 = 0
        L_0x0095:
            if (r2 == 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            int r14 = r14 + 1
            goto L_0x006d
        L_0x009b:
            if (r9 >= r14) goto L_0x00aa
            int r2 = r10 + 1
            java.lang.String r9 = r4.substring(r9, r14)     // Catch:{ NumberFormatException -> 0x00ba }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00ba }
            r5[r10] = r9     // Catch:{ NumberFormatException -> 0x00ba }
            r10 = r2
        L_0x00aa:
            if (r11 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            int r14 = r14 + 1
        L_0x00af:
            r9 = r14
            r2 = 0
            goto L_0x0066
        L_0x00b2:
            float[] r2 = b(r5, r2, r10)     // Catch:{ NumberFormatException -> 0x00ba }
            r5 = 0
            r5 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00ba:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = q.b.a(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r5 = new float[r2]
        L_0x00cb:
            char r2 = r4.charAt(r2)
            g0.d$a r4 = new g0.d$a
            r4.<init>(r2, r5)
            r1.add(r4)
        L_0x00d7:
            int r2 = r3 + 1
            r4 = 0
            r4 = r3
            r3 = r2
            r2 = 0
            goto L_0x000e
        L_0x00df:
            int r3 = r3 - r4
            r2 = 1
            if (r3 != r2) goto L_0x00f8
            int r2 = r16.length()
            if (r4 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r4)
            r2 = 0
            float[] r2 = new float[r2]
            g0.d$a r3 = new g0.d$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00f8:
            int r0 = r1.size()
            g0.d$a[] r0 = new g0.d.a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            g0.d$a[] r0 = (g0.d.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.c(java.lang.String):g0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 == null) {
            return null;
        }
        try {
            a.b(c10, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(f.a("Error in parsing ", str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f18360a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f18361b;

        public a(char c10, float[] fArr) {
            this.f18360a = c10;
            this.f18361b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            float f17 = f10;
            float f18 = f12;
            float f19 = f14;
            boolean z12 = z11;
            double radians = Math.toRadians((double) f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = (double) f17;
            Double.isNaN(d12);
            double d13 = (double) f11;
            Double.isNaN(d13);
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = (double) f19;
            Double.isNaN(d16);
            double d17 = d14 / d16;
            double d18 = radians;
            double d19 = (double) (-f17);
            Double.isNaN(d19);
            Double.isNaN(d13);
            double d20 = (d13 * cos) + (d19 * sin);
            double d21 = (double) f15;
            Double.isNaN(d21);
            double d22 = d20 / d21;
            double d23 = d13;
            double d24 = (double) f18;
            Double.isNaN(d24);
            double d25 = (double) f13;
            Double.isNaN(d25);
            Double.isNaN(d16);
            double d26 = ((d25 * sin) + (d24 * cos)) / d16;
            double d27 = (double) (-f18);
            Double.isNaN(d27);
            Double.isNaN(d25);
            Double.isNaN(d21);
            double d28 = ((d25 * cos) + (d27 * sin)) / d21;
            double d29 = d17 - d26;
            double d30 = d22 - d28;
            double d31 = (d17 + d26) / 2.0d;
            double d32 = (d22 + d28) / 2.0d;
            double d33 = sin;
            double d34 = (d30 * d30) + (d29 * d29);
            if (d34 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d35 = (1.0d / d34) - 0.25d;
            if (d35 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d34);
                float sqrt = (float) (Math.sqrt(d34) / 1.99999d);
                a(path, f10, f11, f12, f13, f19 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d35);
            double d36 = d29 * sqrt2;
            double d37 = sqrt2 * d30;
            if (z10 == z12) {
                d11 = d31 - d37;
                d10 = d32 + d36;
            } else {
                d11 = d31 + d37;
                d10 = d32 - d36;
            }
            double atan2 = Math.atan2(d22 - d10, d17 - d11);
            double atan22 = Math.atan2(d28 - d10, d26 - d11) - atan2;
            int i10 = 0;
            if (z12 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d16);
            double d38 = d11 * d16;
            Double.isNaN(d21);
            double d39 = d10 * d21;
            double d40 = (d38 * cos) - (d39 * d33);
            double d41 = (d39 * cos) + (d38 * d33);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            Double.isNaN(d16);
            double d42 = -d16;
            double d43 = d42 * cos2;
            Double.isNaN(d21);
            double d44 = d21 * sin2;
            double d45 = (d43 * sin3) - (d44 * cos3);
            double d46 = d42 * sin2;
            Double.isNaN(d21);
            double d47 = d21 * cos2;
            double d48 = (cos3 * d47) + (sin3 * d46);
            double d49 = atan2;
            double d50 = (double) ceil;
            Double.isNaN(d50);
            Double.isNaN(d50);
            double d51 = atan22 / d50;
            double d52 = d49;
            while (i10 < ceil) {
                double d53 = d52 + d51;
                double sin4 = Math.sin(d53);
                double cos4 = Math.cos(d53);
                Double.isNaN(d16);
                double d54 = d51;
                double d55 = (((d16 * cos2) * cos4) + d40) - (d44 * sin4);
                Double.isNaN(d16);
                double d56 = d40;
                double d57 = (d47 * sin4) + (d16 * sin2 * cos4) + d41;
                double d58 = (d43 * sin4) - (d44 * cos4);
                double d59 = (cos4 * d47) + (sin4 * d46);
                double d60 = d53 - d52;
                double tan = Math.tan(d60 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d60)) / 3.0d;
                double d61 = (d45 * sqrt3) + d15;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d61, (float) ((d48 * sqrt3) + d23), (float) (d55 - (sqrt3 * d58)), (float) (d57 - (sqrt3 * d59)), (float) d55, (float) d57);
                i10++;
                d47 = d47;
                d46 = d46;
                ceil = ceil;
                cos2 = cos2;
                d52 = d53;
                d16 = d16;
                d48 = d59;
                d45 = d58;
                d15 = d55;
                d23 = d57;
                d51 = d54;
                d40 = d56;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            float f10;
            float f11;
            int i11;
            int i12;
            float[] fArr;
            char c10;
            int i13;
            float[] fArr2;
            char c11;
            int i14;
            float f12;
            float f13;
            float f14;
            float f15;
            int i15;
            float f16;
            float f17;
            int i16;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            float f31;
            float f32;
            a[] aVarArr2 = aVarArr;
            Path path2 = path;
            float[] fArr3 = new float[6];
            char c12 = 'm';
            char c13 = 0;
            char c14 = 'm';
            int i17 = 0;
            while (i17 < aVarArr2.length) {
                char c15 = aVarArr2[i17].f18360a;
                float[] fArr4 = aVarArr2[i17].f18361b;
                float f33 = fArr3[c13];
                float f34 = fArr3[1];
                float f35 = fArr3[2];
                float f36 = fArr3[3];
                float f37 = fArr3[4];
                float f38 = fArr3[5];
                switch (c15) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f37, f38);
                        f33 = f37;
                        f35 = f33;
                        f34 = f38;
                        f36 = f34;
                        break;
                }
                i10 = 2;
                float f39 = f37;
                float f40 = f38;
                float f41 = f33;
                float f42 = f34;
                int i18 = 0;
                while (i18 < fArr4.length) {
                    if (c15 != 'A') {
                        if (c15 != 'C') {
                            if (c15 == 'H') {
                                i11 = i18;
                                fArr = fArr4;
                                c10 = c15;
                                i12 = i17;
                                int i19 = i11 + 0;
                                path2.lineTo(fArr[i19], f42);
                                f41 = fArr[i19];
                            } else if (c15 == 'Q') {
                                i15 = i18;
                                fArr = fArr4;
                                c10 = c15;
                                i12 = i17;
                                int i20 = i15 + 0;
                                int i21 = i15 + 1;
                                int i22 = i15 + 2;
                                int i23 = i15 + 3;
                                path2.quadTo(fArr[i20], fArr[i21], fArr[i22], fArr[i23]);
                                f15 = fArr[i20];
                                f14 = fArr[i21];
                                f41 = fArr[i22];
                                f42 = fArr[i23];
                            } else if (c15 == 'V') {
                                i11 = i18;
                                fArr = fArr4;
                                c10 = c15;
                                i12 = i17;
                                int i24 = i11 + 0;
                                path2.lineTo(f41, fArr[i24]);
                                f42 = fArr[i24];
                            } else if (c15 != 'a') {
                                if (c15 != 'c') {
                                    if (c15 == 'h') {
                                        i11 = i18;
                                        float f43 = f42;
                                        int i25 = i11 + 0;
                                        path2.rLineTo(fArr4[i25], 0.0f);
                                        f41 += fArr4[i25];
                                    } else if (c15 != 'q') {
                                        if (c15 == 'v') {
                                            i11 = i18;
                                            f23 = f42;
                                            float f44 = f41;
                                            int i26 = i11 + 0;
                                            path2.rLineTo(0.0f, fArr4[i26]);
                                            f24 = fArr4[i26];
                                        } else if (c15 != 'L') {
                                            if (c15 == 'M') {
                                                i11 = i18;
                                                int i27 = i11 + 0;
                                                float f45 = fArr4[i27];
                                                int i28 = i11 + 1;
                                                float f46 = fArr4[i28];
                                                if (i11 > 0) {
                                                    path2.lineTo(fArr4[i27], fArr4[i28]);
                                                    f41 = f45;
                                                    f42 = f46;
                                                } else {
                                                    path2.moveTo(fArr4[i27], fArr4[i28]);
                                                    f39 = f45;
                                                    f40 = f46;
                                                }
                                            } else if (c15 == 'S') {
                                                i16 = i18;
                                                float f47 = f42;
                                                float f48 = f41;
                                                if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                    f25 = (f47 * 2.0f) - f10;
                                                    f26 = (f48 * 2.0f) - f11;
                                                } else {
                                                    f26 = f48;
                                                    f25 = f47;
                                                }
                                                int i29 = i16 + 0;
                                                int i30 = i16 + 1;
                                                int i31 = i16 + 2;
                                                int i32 = i16 + 3;
                                                path.cubicTo(f26, f25, fArr4[i29], fArr4[i30], fArr4[i31], fArr4[i32]);
                                                float f49 = fArr4[i29];
                                                float f50 = fArr4[i30];
                                                f17 = fArr4[i31];
                                                f16 = fArr4[i32];
                                                f11 = f49;
                                                f10 = f50;
                                                f41 = f17;
                                                f42 = f16;
                                            } else if (c15 == 'T') {
                                                i11 = i18;
                                                float f51 = f42;
                                                float f52 = f41;
                                                if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                    f27 = (f52 * 2.0f) - f11;
                                                    f28 = (f51 * 2.0f) - f10;
                                                } else {
                                                    f27 = f52;
                                                    f28 = f51;
                                                }
                                                int i33 = i11 + 0;
                                                int i34 = i11 + 1;
                                                path2.quadTo(f27, f28, fArr4[i33], fArr4[i34]);
                                                f10 = f28;
                                                f11 = f27;
                                                fArr = fArr4;
                                                c10 = c15;
                                                i12 = i17;
                                                f41 = fArr4[i33];
                                                f42 = fArr4[i34];
                                            } else if (c15 == 'l') {
                                                i11 = i18;
                                                f23 = f42;
                                                int i35 = i11 + 0;
                                                int i36 = i11 + 1;
                                                path2.rLineTo(fArr4[i35], fArr4[i36]);
                                                f41 += fArr4[i35];
                                                f24 = fArr4[i36];
                                            } else if (c15 == c12) {
                                                i11 = i18;
                                                int i37 = i11 + 0;
                                                f41 += fArr4[i37];
                                                int i38 = i11 + 1;
                                                f42 += fArr4[i38];
                                                if (i11 > 0) {
                                                    path2.rLineTo(fArr4[i37], fArr4[i38]);
                                                } else {
                                                    path2.rMoveTo(fArr4[i37], fArr4[i38]);
                                                    f40 = f42;
                                                    f39 = f41;
                                                }
                                            } else if (c15 != 's') {
                                                if (c15 == 't') {
                                                    if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                        f31 = f41 - f11;
                                                        f32 = f42 - f10;
                                                    } else {
                                                        f32 = 0.0f;
                                                        f31 = 0;
                                                    }
                                                    int i39 = i18 + 0;
                                                    int i40 = i18 + 1;
                                                    path2.rQuadTo(f31, f32, fArr4[i39], fArr4[i40]);
                                                    float f53 = f31 + f41;
                                                    float f54 = f32 + f42;
                                                    f41 += fArr4[i39];
                                                    f42 += fArr4[i40];
                                                    f10 = f54;
                                                    f11 = f53;
                                                }
                                                i11 = i18;
                                            } else {
                                                if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                    f29 = f42 - f10;
                                                    f30 = f41 - f11;
                                                } else {
                                                    f30 = 0.0f;
                                                    f29 = 0.0f;
                                                }
                                                int i41 = i18 + 0;
                                                int i42 = i18 + 1;
                                                int i43 = i18 + 2;
                                                int i44 = i18 + 3;
                                                i16 = i18;
                                                f18 = f42;
                                                float f55 = f41;
                                                path.rCubicTo(f30, f29, fArr4[i41], fArr4[i42], fArr4[i43], fArr4[i44]);
                                                f21 = fArr4[i41] + f55;
                                                f20 = fArr4[i42] + f18;
                                                f19 = f55 + fArr4[i43];
                                                f22 = fArr4[i44];
                                            }
                                            f41 = f39;
                                            f42 = f40;
                                        } else {
                                            i11 = i18;
                                            int i45 = i11 + 0;
                                            int i46 = i11 + 1;
                                            path2.lineTo(fArr4[i45], fArr4[i46]);
                                            f41 = fArr4[i45];
                                            f42 = fArr4[i46];
                                        }
                                        f42 = f23 + f24;
                                    } else {
                                        i16 = i18;
                                        f18 = f42;
                                        float f56 = f41;
                                        int i47 = i16 + 0;
                                        int i48 = i16 + 1;
                                        int i49 = i16 + 2;
                                        int i50 = i16 + 3;
                                        path2.rQuadTo(fArr4[i47], fArr4[i48], fArr4[i49], fArr4[i50]);
                                        f21 = fArr4[i47] + f56;
                                        f20 = fArr4[i48] + f18;
                                        float f57 = f56 + fArr4[i49];
                                        float f58 = fArr4[i50];
                                        f19 = f57;
                                        f22 = f58;
                                    }
                                    fArr = fArr4;
                                    c10 = c15;
                                    i12 = i17;
                                } else {
                                    i16 = i18;
                                    f18 = f42;
                                    float f59 = f41;
                                    int i51 = i16 + 2;
                                    int i52 = i16 + 3;
                                    int i53 = i16 + 4;
                                    int i54 = i16 + 5;
                                    path.rCubicTo(fArr4[i16 + 0], fArr4[i16 + 1], fArr4[i51], fArr4[i52], fArr4[i53], fArr4[i54]);
                                    f21 = fArr4[i51] + f59;
                                    f20 = fArr4[i52] + f18;
                                    f19 = f59 + fArr4[i53];
                                    f22 = fArr4[i54];
                                }
                                f16 = f18 + f22;
                                f11 = f21;
                                f10 = f20;
                                f17 = f19;
                                f41 = f17;
                                f42 = f16;
                                fArr = fArr4;
                                c10 = c15;
                                i12 = i17;
                            } else {
                                i13 = i18;
                                float f60 = f42;
                                float f61 = f41;
                                int i55 = i13 + 5;
                                float f62 = fArr4[i55] + f61;
                                int i56 = i13 + 6;
                                float f63 = fArr4[i56] + f60;
                                float f64 = fArr4[i13 + 0];
                                float f65 = fArr4[i13 + 1];
                                float f66 = fArr4[i13 + 2];
                                boolean z10 = fArr4[i13 + 3] != 0.0f;
                                boolean z11 = fArr4[i13 + 4] != 0.0f;
                                fArr2 = fArr4;
                                float f67 = f66;
                                c11 = c15;
                                i14 = i17;
                                a(path, f61, f60, f62, f63, f64, f65, f67, z10, z11);
                                f12 = f61 + fArr2[i55];
                                f13 = f60 + fArr2[i56];
                            }
                            i18 = i11 + i10;
                            c14 = c10;
                            c15 = c14;
                            fArr4 = fArr;
                            i17 = i12;
                            c12 = 'm';
                            a[] aVarArr3 = aVarArr;
                        } else {
                            i15 = i18;
                            fArr = fArr4;
                            c10 = c15;
                            i12 = i17;
                            int i57 = i15 + 2;
                            int i58 = i15 + 3;
                            int i59 = i15 + 4;
                            int i60 = i15 + 5;
                            path.cubicTo(fArr[i15 + 0], fArr[i15 + 1], fArr[i57], fArr[i58], fArr[i59], fArr[i60]);
                            float f68 = fArr[i59];
                            float f69 = fArr[i60];
                            f15 = fArr[i57];
                            f41 = f68;
                            f42 = f69;
                            f14 = fArr[i58];
                        }
                        f11 = f15;
                        f10 = f14;
                        i18 = i11 + i10;
                        c14 = c10;
                        c15 = c14;
                        fArr4 = fArr;
                        i17 = i12;
                        c12 = 'm';
                        a[] aVarArr32 = aVarArr;
                    } else {
                        i13 = i18;
                        fArr2 = fArr4;
                        c11 = c15;
                        i14 = i17;
                        int i61 = i13 + 5;
                        int i62 = i13 + 6;
                        a(path, f41, f42, fArr2[i61], fArr2[i62], fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f12 = fArr2[i61];
                        f13 = fArr2[i62];
                    }
                    f10 = f42;
                    f11 = f41;
                    i18 = i11 + i10;
                    c14 = c10;
                    c15 = c14;
                    fArr4 = fArr;
                    i17 = i12;
                    c12 = 'm';
                    a[] aVarArr322 = aVarArr;
                }
                int i63 = i17;
                fArr3[0] = f41;
                fArr3[1] = f42;
                fArr3[2] = f11;
                fArr3[3] = f10;
                fArr3[4] = f39;
                fArr3[5] = f40;
                i17 = i63 + 1;
                c14 = aVarArr[i63].f18360a;
                c12 = 'm';
                c13 = 0;
                aVarArr2 = aVarArr;
            }
        }

        public a(a aVar) {
            this.f18360a = aVar.f18360a;
            float[] fArr = aVar.f18361b;
            this.f18361b = d.b(fArr, 0, fArr.length);
        }
    }
}
