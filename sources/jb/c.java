package jb;

import android.support.v4.media.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter */
public class c implements Closeable, Flushable {

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f19727r = new String[128];

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f19728s;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f19729a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f19730b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public int f19731c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f19732d;

    /* renamed from: e  reason: collision with root package name */
    public String f19733e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19734f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19735g;

    /* renamed from: h  reason: collision with root package name */
    public String f19736h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f19737i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f19727r[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f19727r;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f19728s = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        T(6);
        this.f19733e = ":";
        this.f19737i = true;
        if (writer != null) {
            this.f19729a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public boolean G() {
        return this.f19734f;
    }

    public c H(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f19736h != null) {
            throw new IllegalStateException();
        } else if (this.f19731c != 0) {
            this.f19736h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void J() throws IOException {
        if (this.f19732d != null) {
            this.f19729a.write("\n");
            int i10 = this.f19731c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f19729a.write(this.f19732d);
            }
        }
    }

    public c M() throws IOException {
        if (this.f19736h != null) {
            if (this.f19737i) {
                p0();
            } else {
                this.f19736h = null;
                return this;
            }
        }
        a();
        this.f19729a.write("null");
        return this;
    }

    public final int N() {
        int i10 = this.f19731c;
        if (i10 != 0) {
            return this.f19730b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void T(int i10) {
        int i11 = this.f19731c;
        int[] iArr = this.f19730b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19730b = iArr2;
        }
        int[] iArr3 = this.f19730b;
        int i12 = this.f19731c;
        this.f19731c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void V(int i10) {
        this.f19730b[this.f19731c - 1] = i10;
    }

    public final void a() throws IOException {
        int N = N();
        if (N == 1) {
            V(2);
            J();
        } else if (N == 2) {
            this.f19729a.append(',');
            J();
        } else if (N != 4) {
            if (N != 6) {
                if (N != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f19734f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            V(7);
        } else {
            this.f19729a.append(this.f19733e);
            V(5);
        }
    }

    public void close() throws IOException {
        this.f19729a.close();
        int i10 = this.f19731c;
        if (i10 > 1 || (i10 == 1 && this.f19730b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19731c = 0;
    }

    public c d() throws IOException {
        p0();
        a();
        T(1);
        this.f19729a.write("[");
        return this;
    }

    public final void f0(boolean z10) {
        this.f19735g = z10;
    }

    public void flush() throws IOException {
        if (this.f19731c != 0) {
            this.f19729a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void g0(String str) {
        if (str.length() == 0) {
            this.f19732d = null;
            this.f19733e = ":";
            return;
        }
        this.f19732d = str;
        this.f19733e = ": ";
    }

    public final void h0(boolean z10) {
        this.f19734f = z10;
    }

    public c i() throws IOException {
        p0();
        a();
        T(3);
        this.f19729a.write("{");
        return this;
    }

    public final void i0(boolean z10) {
        this.f19737i = z10;
    }

    public final void j0(String str) throws IOException {
        String str2;
        String[] strArr = this.f19735g ? f19728s : f19727r;
        this.f19729a.write("\"");
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f19729a.write(str, i10, i11 - i10);
            }
            this.f19729a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f19729a.write(str, i10, length - i10);
        }
        this.f19729a.write("\"");
    }

    public c k0(long j10) throws IOException {
        p0();
        a();
        this.f19729a.write(Long.toString(j10));
        return this;
    }

    public c l0(Boolean bool) throws IOException {
        if (bool == null) {
            return M();
        }
        p0();
        a();
        this.f19729a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c m0(Number number) throws IOException {
        if (number == null) {
            return M();
        }
        p0();
        String obj = number.toString();
        if (this.f19734f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.f19729a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c n0(String str) throws IOException {
        if (str == null) {
            return M();
        }
        p0();
        a();
        j0(str);
        return this;
    }

    public final c o(int i10, int i11, String str) throws IOException {
        int N = N();
        if (N != i11 && N != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f19736h == null) {
            this.f19731c--;
            if (N == i11) {
                J();
            }
            this.f19729a.write(str);
            return this;
        } else {
            StringBuilder a10 = a.a("Dangling name: ");
            a10.append(this.f19736h);
            throw new IllegalStateException(a10.toString());
        }
    }

    public c o0(boolean z10) throws IOException {
        p0();
        a();
        this.f19729a.write(z10 ? "true" : "false");
        return this;
    }

    public final void p0() throws IOException {
        if (this.f19736h != null) {
            int N = N();
            if (N == 5) {
                this.f19729a.write(44);
            } else if (N != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            J();
            V(4);
            j0(this.f19736h);
            this.f19736h = null;
        }
    }

    public c s() throws IOException {
        o(1, 2, "]");
        return this;
    }

    public c t() throws IOException {
        o(3, 5, "}");
        return this;
    }

    public final boolean u() {
        return this.f19737i;
    }

    public final boolean v() {
        return this.f19735g;
    }
}
