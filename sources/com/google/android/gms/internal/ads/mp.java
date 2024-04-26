package com.google.android.gms.internal.ads;

import d4.f;
import e8.b70;
import e8.f70;
import e8.gz;
import e8.i70;
import e8.j70;
import e8.l90;
import e8.v70;
import e8.w90;
import e8.y9;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import l0.d;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class mp implements Serializable, Iterable<Byte> {

    /* renamed from: b  reason: collision with root package name */
    public static final mp f7494b = new np(v70.f17030b);

    /* renamed from: c  reason: collision with root package name */
    public static final j70 f7495c;

    /* renamed from: a  reason: collision with root package name */
    public int f7496a = 0;

    static {
        j70 j70;
        if (b70.a()) {
            j70 = new ap(2);
        } else {
            j70 = new f(3);
        }
        f7495c = j70;
    }

    public static mp C(InputStream inputStream) throws IOException {
        mp mpVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 256;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            if (i11 == 0) {
                mpVar = null;
            } else {
                mpVar = I(bArr, 0, i11);
            }
            if (mpVar == null) {
                return K(arrayList);
            }
            arrayList.add(mpVar);
            i10 = Math.min(i10 << 1, 8192);
        }
    }

    public static int H(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(y9.a(66, "Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(y9.a(37, "End index: ", i11, " >= ", i12));
        }
    }

    public static mp I(byte[] bArr, int i10, int i11) {
        H(i10, i10 + i11, bArr.length);
        return new np(f7495c.e(bArr, i10, i11));
    }

    public static mp J(String str) {
        return new np(str.getBytes(v70.f17029a));
    }

    public static mp K(Iterable<mp> iterable) {
        int i10;
        if (!(iterable instanceof Collection)) {
            i10 = 0;
            Iterator<mp> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i10++;
            }
        } else {
            i10 = ((Collection) iterable).size();
        }
        if (i10 == 0) {
            return f7494b;
        }
        return f(iterable.iterator(), i10);
    }

    public static mp L(byte[] bArr) {
        return I(bArr, 0, bArr.length);
    }

    public static mp f(Iterator<mp> it, int i10) {
        hq hqVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i10)}));
        } else if (i10 == 1) {
            return it.next();
        } else {
            int i11 = i10 >>> 1;
            mp f10 = f(it, i11);
            mp f11 = f(it, i10 - i11);
            if (Integer.MAX_VALUE - f10.size() < f11.size()) {
                throw new IllegalArgumentException(y9.a(53, "ByteString would be too long: ", f10.size(), "+", f11.size()));
            } else if (f11.size() == 0) {
                return f10;
            } else {
                if (f10.size() == 0) {
                    return f11;
                }
                int size = f11.size() + f10.size();
                if (size < 128) {
                    return hq.M(f10, f11);
                }
                if (f10 instanceof hq) {
                    hq hqVar2 = (hq) f10;
                    if (f11.size() + hqVar2.f6890f.size() < 128) {
                        hqVar = new hq(hqVar2.f6889e, hq.M(hqVar2.f6890f, f11));
                        return hqVar;
                    } else if (hqVar2.f6889e.A() > hqVar2.f6890f.A() && hqVar2.f6892h > f11.A()) {
                        return new hq(hqVar2.f6889e, new hq(hqVar2.f6890f, f11));
                    }
                }
                if (size < hq.N(Math.max(f10.A(), f11.A()) + 1)) {
                    return new gz((l90) null).e(f10, f11);
                }
                hqVar = new hq(f10, f11);
                return hqVar;
            }
        }
    }

    public static void q(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(d.a(22, "Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(y9.a(40, "Index > length: ", i10, ", ", i11));
    }

    public abstract int A();

    public abstract boolean B();

    public abstract byte D(int i10);

    public abstract int E(int i10, int i11, int i12);

    public abstract byte F(int i10);

    public abstract int G(int i10, int i11, int i12);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return v70.f17030b;
        }
        byte[] bArr = new byte[size];
        s(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public abstract String h(Charset charset);

    public final int hashCode() {
        int i10 = this.f7496a;
        if (i10 == 0) {
            int size = size();
            i10 = G(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7496a = i10;
        }
        return i10;
    }

    public abstract void i(w4 w4Var) throws IOException;

    @Deprecated
    public final void j(byte[] bArr, int i10, int i11, int i12) {
        H(i10, i10 + i12, size());
        H(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            s(bArr, i10, i11, i12);
        }
    }

    public abstract mp o(int i10, int i11);

    public abstract void s(byte[] bArr, int i10, int i11, int i12);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? w90.a(this) : String.valueOf(w90.a(o(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: x */
    public i70 iterator() {
        return new f70(this);
    }

    public abstract boolean y();

    public abstract op z();
}
