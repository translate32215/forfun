package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.internal.s;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import jb.b;
import q.c;

/* compiled from: JsonTreeReader */
public final class a extends jb.a {
    public static final Object C = new Object();
    public String[] A;
    public int[] B;

    /* renamed from: y  reason: collision with root package name */
    public Object[] f9934y;

    /* renamed from: z  reason: collision with root package name */
    public int f9935z;

    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* compiled from: JsonTreeReader */
    public static class C0111a extends Reader {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C0111a();
    }

    private String M() {
        StringBuilder a10 = android.support.v4.media.a.a(" at path ");
        a10.append(v());
        return a10.toString();
    }

    public boolean G() throws IOException {
        b m02 = m0();
        return (m02 == b.END_OBJECT || m02 == b.END_ARRAY) ? false : true;
    }

    public boolean N() throws IOException {
        u0(b.BOOLEAN);
        boolean s10 = ((o) w0()).s();
        int i10 = this.f9935z;
        if (i10 > 0) {
            int[] iArr = this.B;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return s10;
    }

    public double T() throws IOException {
        b m02 = m0();
        b bVar = b.NUMBER;
        if (m02 == bVar || m02 == b.STRING) {
            o oVar = (o) v0();
            double doubleValue = oVar.f9995a instanceof Number ? oVar.x().doubleValue() : Double.parseDouble(oVar.y());
            if (this.f19702b || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                w0();
                int i10 = this.f9935z;
                if (i10 > 0) {
                    int[] iArr = this.B;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + m02 + M());
    }

    public int V() throws IOException {
        b m02 = m0();
        b bVar = b.NUMBER;
        if (m02 == bVar || m02 == b.STRING) {
            o oVar = (o) v0();
            int intValue = oVar.f9995a instanceof Number ? oVar.x().intValue() : Integer.parseInt(oVar.y());
            w0();
            int i10 = this.f9935z;
            if (i10 > 0) {
                int[] iArr = this.B;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + m02 + M());
    }

    public void a() throws IOException {
        u0(b.BEGIN_ARRAY);
        x0(((g) v0()).iterator());
        this.B[this.f9935z - 1] = 0;
    }

    public void close() throws IOException {
        this.f9934y = new Object[]{C};
        this.f9935z = 1;
    }

    public void d() throws IOException {
        u0(b.BEGIN_OBJECT);
        x0(new s.b.a((s.b) ((m) v0()).f9993a.entrySet()));
    }

    public long f0() throws IOException {
        b m02 = m0();
        b bVar = b.NUMBER;
        if (m02 == bVar || m02 == b.STRING) {
            o oVar = (o) v0();
            long longValue = oVar.f9995a instanceof Number ? oVar.x().longValue() : Long.parseLong(oVar.y());
            w0();
            int i10 = this.f9935z;
            if (i10 > 0) {
                int[] iArr = this.B;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + m02 + M());
    }

    public String g0() throws IOException {
        u0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) v0()).next();
        String str = (String) entry.getKey();
        this.A[this.f9935z - 1] = str;
        x0(entry.getValue());
        return str;
    }

    public void i0() throws IOException {
        u0(b.NULL);
        w0();
        int i10 = this.f9935z;
        if (i10 > 0) {
            int[] iArr = this.B;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String k0() throws IOException {
        b m02 = m0();
        b bVar = b.STRING;
        if (m02 == bVar || m02 == b.NUMBER) {
            String y10 = ((o) w0()).y();
            int i10 = this.f9935z;
            if (i10 > 0) {
                int[] iArr = this.B;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return y10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + m02 + M());
    }

    public b m0() throws IOException {
        if (this.f9935z == 0) {
            return b.END_DOCUMENT;
        }
        Object v02 = v0();
        if (v02 instanceof Iterator) {
            boolean z10 = this.f9934y[this.f9935z - 2] instanceof m;
            Iterator it = (Iterator) v02;
            if (!it.hasNext()) {
                return z10 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z10) {
                return b.NAME;
            }
            x0(it.next());
            return m0();
        } else if (v02 instanceof m) {
            return b.BEGIN_OBJECT;
        } else {
            if (v02 instanceof g) {
                return b.BEGIN_ARRAY;
            }
            if (v02 instanceof o) {
                Object obj = ((o) v02).f9995a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (v02 instanceof l) {
                return b.NULL;
            } else {
                if (v02 == C) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void s() throws IOException {
        u0(b.END_ARRAY);
        w0();
        w0();
        int i10 = this.f9935z;
        if (i10 > 0) {
            int[] iArr = this.B;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void s0() throws IOException {
        if (m0() == b.NAME) {
            g0();
            this.A[this.f9935z - 2] = "null";
        } else {
            w0();
            int i10 = this.f9935z;
            if (i10 > 0) {
                this.A[i10 - 1] = "null";
            }
        }
        int i11 = this.f9935z;
        if (i11 > 0) {
            int[] iArr = this.B;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public void t() throws IOException {
        u0(b.END_OBJECT);
        w0();
        w0();
        int i10 = this.f9935z;
        if (i10 > 0) {
            int[] iArr = this.B;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String toString() {
        return a.class.getSimpleName();
    }

    public final void u0(b bVar) throws IOException {
        if (m0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + m0() + M());
        }
    }

    public String v() {
        StringBuilder a10 = c.a('$');
        int i10 = 0;
        while (i10 < this.f9935z) {
            Object[] objArr = this.f9934y;
            if (objArr[i10] instanceof g) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    a10.append('[');
                    a10.append(this.B[i10]);
                    a10.append(']');
                }
            } else if (objArr[i10] instanceof m) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    a10.append('.');
                    String[] strArr = this.A;
                    if (strArr[i10] != null) {
                        a10.append(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return a10.toString();
    }

    public final Object v0() {
        return this.f9934y[this.f9935z - 1];
    }

    public final Object w0() {
        Object[] objArr = this.f9934y;
        int i10 = this.f9935z - 1;
        this.f9935z = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void x0(Object obj) {
        int i10 = this.f9935z;
        Object[] objArr = this.f9934y;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[(i10 * 2)];
            int[] iArr = new int[(i10 * 2)];
            String[] strArr = new String[(i10 * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.B, 0, iArr, 0, this.f9935z);
            System.arraycopy(this.A, 0, strArr, 0, this.f9935z);
            this.f9934y = objArr2;
            this.B = iArr;
            this.A = strArr;
        }
        Object[] objArr3 = this.f9934y;
        int i11 = this.f9935z;
        this.f9935z = i11 + 1;
        objArr3[i11] = obj;
    }
}
