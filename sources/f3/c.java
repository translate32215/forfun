package f3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import ve.f;
import ve.i;
import ve.r;

/* compiled from: JsonReader */
public abstract class c implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f18080e = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public int f18081a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f18082b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public String[] f18083c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    public int[] f18084d = new int[32];

    /* compiled from: JsonReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f18085a;

        /* renamed from: b  reason: collision with root package name */
        public final r f18086b;

        public a(String[] strArr, r rVar) {
            this.f18085a = strArr;
            this.f18086b = rVar;
        }

        public static a a(String... strArr) {
            String str;
            try {
                i[] iVarArr = new i[strArr.length];
                f fVar = new f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str2 = strArr[i10];
                    String[] strArr2 = c.f18080e;
                    fVar.q0(34);
                    int length = str2.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        char charAt = str2.charAt(i12);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                            fVar.x0(str2, i11, i12);
                        }
                        fVar.w0(str);
                        i11 = i12 + 1;
                    }
                    if (i11 < length) {
                        fVar.x0(str2, i11, length);
                    }
                    fVar.q0(34);
                    fVar.readByte();
                    iVarArr[i10] = fVar.T();
                }
                return new a((String[]) strArr.clone(), r.f(iVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* compiled from: JsonReader */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f18080e[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f18080e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int G() throws IOException;

    public abstract String H() throws IOException;

    public abstract String J() throws IOException;

    public abstract b M() throws IOException;

    public final void N(int i10) {
        int i11 = this.f18081a;
        int[] iArr = this.f18082b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f18082b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f18083c;
                this.f18083c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f18084d;
                this.f18084d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder a10 = android.support.v4.media.a.a("Nesting too deep at ");
                a10.append(s());
                throw new a(a10.toString());
            }
        }
        int[] iArr3 = this.f18082b;
        int i12 = this.f18081a;
        this.f18081a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int T(a aVar) throws IOException;

    public abstract void V() throws IOException;

    public abstract void a() throws IOException;

    public abstract void d() throws IOException;

    public abstract void f0() throws IOException;

    public final b g0(String str) throws b {
        StringBuilder a10 = t.f.a(str, " at path ");
        a10.append(s());
        throw new b(a10.toString());
    }

    public abstract void i() throws IOException;

    public abstract void o() throws IOException;

    public final String s() {
        int i10 = this.f18081a;
        int[] iArr = this.f18082b;
        String[] strArr = this.f18083c;
        int[] iArr2 = this.f18084d;
        StringBuilder a10 = q.c.a('$');
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                a10.append('[');
                a10.append(iArr2[i11]);
                a10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                a10.append('.');
                if (strArr[i11] != null) {
                    a10.append(strArr[i11]);
                }
            }
        }
        return a10.toString();
    }

    public abstract boolean t() throws IOException;

    public abstract boolean u() throws IOException;

    public abstract double v() throws IOException;
}
