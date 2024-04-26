package ve;

import android.support.v4.media.a;
import j.f;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import q.b;
import v.e;

/* compiled from: ByteString */
public class i implements Serializable, Comparable<i> {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f26742d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e  reason: collision with root package name */
    public static final i f26743e = r(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26744a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f26745b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f26746c;

    public i(byte[] bArr) {
        this.f26744a = bArr;
    }

    public static i b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (c(str.charAt(i11 + 1)) + (c(str.charAt(i11)) << 4));
            }
            return r(bArr);
        }
        throw new IllegalArgumentException(f.a("Unexpected hex string: ", str));
    }

    public static int c(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static i i(String str) {
        if (str != null) {
            i iVar = new i(str.getBytes(a0.f26727a));
            iVar.f26746c = str;
            return iVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static i r(byte... bArr) {
        if (bArr != null) {
            return new i((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = this.f26744a;
        byte[] bArr2 = d.f26736a;
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i14] & 255) >> 4)];
            int i15 = i13 + 1;
            int i16 = i11 + 2;
            bArr3[i13] = bArr2[((bArr[i14] & 15) << 2) | ((bArr[i16] & 255) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr2[bArr[i16] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i17 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i18] = 61;
            bArr3[i18 + 1] = 61;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i20 = i19 + 1;
            int i21 = length + 1;
            bArr3[i19] = bArr2[((bArr[i21] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i20] = bArr2[(bArr[i21] & 15) << 2];
            bArr3[i20 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            ve.i r10 = (ve.i) r10
            int r0 = r9.u()
            int r1 = r10.u()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.m(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = -1
            goto L_0x0031
        L_0x0029:
            r3 = 1
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int u10 = iVar.u();
            byte[] bArr = this.f26744a;
            if (u10 != bArr.length || !iVar.t(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final i f(String str) {
        try {
            return r(MessageDigest.getInstance(str).digest(this.f26744a));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public int hashCode() {
        int i10 = this.f26745b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f26744a);
        this.f26745b = hashCode;
        return hashCode;
    }

    public byte m(int i10) {
        return this.f26744a[i10];
    }

    public String o() {
        byte[] bArr = this.f26744a;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f26742d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] q() {
        return this.f26744a;
    }

    public boolean s(int i10, i iVar, int i11, int i12) {
        return iVar.t(i11, this.f26744a, i10, i12);
    }

    public boolean t(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f26744a;
            return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && a0.a(bArr2, i10, bArr, i11, i12);
        }
    }

    public String toString() {
        if (this.f26744a.length == 0) {
            return "[size=0]";
        }
        String x10 = x();
        int length = x10.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = x10.length();
                break;
            } else if (i11 == 64) {
                break;
            } else {
                int codePointAt = x10.codePointAt(i10);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i11++;
                    i10 += Character.charCount(codePointAt);
                }
            }
        }
        i10 = -1;
        if (i10 != -1) {
            String replace = x10.substring(0, i10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i10 >= x10.length()) {
                return b.a("[text=", replace, "]");
            }
            StringBuilder a10 = a.a("[size=");
            a10.append(this.f26744a.length);
            a10.append(" text=");
            a10.append(replace);
            a10.append("…]");
            return a10.toString();
        } else if (this.f26744a.length <= 64) {
            StringBuilder a11 = a.a("[hex=");
            a11.append(o());
            a11.append("]");
            return a11.toString();
        } else {
            StringBuilder a12 = a.a("[size=");
            a12.append(this.f26744a.length);
            a12.append(" hex=");
            a12.append(v(0, 64).o());
            a12.append("…]");
            return a12.toString();
        }
    }

    public int u() {
        return this.f26744a.length;
    }

    public i v(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f26744a;
            if (i11 <= bArr.length) {
                int i12 = i11 - i10;
                if (i12 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i10 == 0 && i11 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i10, bArr2, 0, i12);
                    return new i(bArr2);
                }
            } else {
                throw new IllegalArgumentException(e.a(a.a("endIndex > length("), this.f26744a.length, ")"));
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public i w() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f26744a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new i(bArr2);
            }
        }
    }

    public String x() {
        String str = this.f26746c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f26744a, a0.f26727a);
        this.f26746c = str2;
        return str2;
    }

    public void y(f fVar) {
        byte[] bArr = this.f26744a;
        fVar.o0(bArr, 0, bArr.length);
    }
}
