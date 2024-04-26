package jb;

import com.google.gson.internal.q;
import com.startapp.b4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import q.c;

/* compiled from: JsonReader */
public class a implements Closeable {

    /* renamed from: x  reason: collision with root package name */
    public static final char[] f19700x = ")]}'\n".toCharArray();

    /* renamed from: a  reason: collision with root package name */
    public final Reader f19701a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19702b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f19703c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    public int f19704d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f19705e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f19706f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f19707g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f19708h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f19709i;

    /* renamed from: r  reason: collision with root package name */
    public int f19710r;

    /* renamed from: s  reason: collision with root package name */
    public String f19711s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f19712t;

    /* renamed from: u  reason: collision with root package name */
    public int f19713u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f19714v;

    /* renamed from: w  reason: collision with root package name */
    public int[] f19715w;

    /* renamed from: jb.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    public static class C0169a extends q {
    }

    static {
        q.f9959a = new C0169a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f19712t = iArr;
        this.f19713u = 0;
        this.f19713u = 0 + 1;
        iArr[0] = 6;
        this.f19714v = new String[32];
        this.f19715w = new int[32];
        if (reader != null) {
            this.f19701a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public boolean G() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean H() {
        return this.f19702b;
    }

    public final boolean J(char c10) throws IOException {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public String M() {
        return " at line " + (this.f19706f + 1) + " column " + ((this.f19704d - this.f19707g) + 1) + " path " + v();
    }

    public boolean N() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 5) {
            this.f19708h = 0;
            int[] iArr = this.f19715w;
            int i11 = this.f19713u - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f19708h = 0;
            int[] iArr2 = this.f19715w;
            int i12 = this.f19713u - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Expected a boolean but was ");
            a10.append(m0());
            a10.append(M());
            throw new IllegalStateException(a10.toString());
        }
    }

    public double T() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            this.f19708h = 0;
            int[] iArr = this.f19715w;
            int i11 = this.f19713u - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f19709i;
        }
        if (i10 == 16) {
            this.f19711s = new String(this.f19703c, this.f19704d, this.f19710r);
            this.f19704d += this.f19710r;
        } else if (i10 == 8 || i10 == 9) {
            this.f19711s = j0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f19711s = l0();
        } else if (i10 != 11) {
            StringBuilder a10 = android.support.v4.media.a.a("Expected a double but was ");
            a10.append(m0());
            a10.append(M());
            throw new IllegalStateException(a10.toString());
        }
        this.f19708h = 11;
        double parseDouble = Double.parseDouble(this.f19711s);
        if (this.f19702b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f19711s = null;
            this.f19708h = 0;
            int[] iArr2 = this.f19715w;
            int i12 = this.f19713u - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + M());
    }

    public int V() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            long j10 = this.f19709i;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f19708h = 0;
                int[] iArr = this.f19715w;
                int i12 = this.f19713u - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Expected an int but was ");
            a10.append(this.f19709i);
            a10.append(M());
            throw new NumberFormatException(a10.toString());
        }
        if (i10 == 16) {
            this.f19711s = new String(this.f19703c, this.f19704d, this.f19710r);
            this.f19704d += this.f19710r;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f19711s = l0();
            } else {
                this.f19711s = j0(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f19711s);
                this.f19708h = 0;
                int[] iArr2 = this.f19715w;
                int i13 = this.f19713u - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a11 = android.support.v4.media.a.a("Expected an int but was ");
            a11.append(m0());
            a11.append(M());
            throw new IllegalStateException(a11.toString());
        }
        this.f19708h = 11;
        double parseDouble = Double.parseDouble(this.f19711s);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f19711s = null;
            this.f19708h = 0;
            int[] iArr3 = this.f19715w;
            int i15 = this.f19713u - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        StringBuilder a12 = android.support.v4.media.a.a("Expected an int but was ");
        a12.append(this.f19711s);
        a12.append(M());
        throw new NumberFormatException(a12.toString());
    }

    public void a() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 3) {
            n0(1);
            this.f19715w[this.f19713u - 1] = 0;
            this.f19708h = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected BEGIN_ARRAY but was ");
        a10.append(m0());
        a10.append(M());
        throw new IllegalStateException(a10.toString());
    }

    public void close() throws IOException {
        this.f19708h = 0;
        this.f19712t[0] = 8;
        this.f19713u = 1;
        this.f19701a.close();
    }

    public void d() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 1) {
            n0(3);
            this.f19708h = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected BEGIN_OBJECT but was ");
        a10.append(m0());
        a10.append(M());
        throw new IllegalStateException(a10.toString());
    }

    public long f0() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            this.f19708h = 0;
            int[] iArr = this.f19715w;
            int i11 = this.f19713u - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f19709i;
        }
        if (i10 == 16) {
            this.f19711s = new String(this.f19703c, this.f19704d, this.f19710r);
            this.f19704d += this.f19710r;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f19711s = l0();
            } else {
                this.f19711s = j0(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f19711s);
                this.f19708h = 0;
                int[] iArr2 = this.f19715w;
                int i12 = this.f19713u - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Expected a long but was ");
            a10.append(m0());
            a10.append(M());
            throw new IllegalStateException(a10.toString());
        }
        this.f19708h = 11;
        double parseDouble = Double.parseDouble(this.f19711s);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f19711s = null;
            this.f19708h = 0;
            int[] iArr3 = this.f19715w;
            int i13 = this.f19713u - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        StringBuilder a11 = android.support.v4.media.a.a("Expected a long but was ");
        a11.append(this.f19711s);
        a11.append(M());
        throw new NumberFormatException(a11.toString());
    }

    public String g0() throws IOException {
        String str;
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 14) {
            str = l0();
        } else if (i10 == 12) {
            str = j0('\'');
        } else if (i10 == 13) {
            str = j0('\"');
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Expected a name but was ");
            a10.append(m0());
            a10.append(M());
            throw new IllegalStateException(a10.toString());
        }
        this.f19708h = 0;
        this.f19714v[this.f19713u - 1] = str;
        return str;
    }

    public final int h0(boolean z10) throws IOException {
        char[] cArr = this.f19703c;
        int i10 = this.f19704d;
        int i11 = this.f19705e;
        while (true) {
            boolean z11 = true;
            if (i10 == i11) {
                this.f19704d = i10;
                if (u(1)) {
                    i10 = this.f19704d;
                    i11 = this.f19705e;
                } else if (!z10) {
                    return -1;
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("End of input");
                    a10.append(M());
                    throw new EOFException(a10.toString());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f19706f++;
                this.f19707g = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f19704d = i12;
                    if (i12 == i11) {
                        this.f19704d = i12 - 1;
                        boolean u10 = u(2);
                        this.f19704d++;
                        if (!u10) {
                            return c10;
                        }
                    }
                    i();
                    int i13 = this.f19704d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f19704d = i13 + 1;
                        while (true) {
                            int i14 = 0;
                            if (this.f19704d + 2 > this.f19705e && !u(2)) {
                                z11 = false;
                                break;
                            }
                            char[] cArr2 = this.f19703c;
                            int i15 = this.f19704d;
                            if (cArr2[i15] != 10) {
                                while (i14 < 2) {
                                    if (this.f19703c[this.f19704d + i14] == "*/".charAt(i14)) {
                                        i14++;
                                    }
                                }
                                break;
                            }
                            this.f19706f++;
                            this.f19707g = i15 + 1;
                            this.f19704d++;
                        }
                        if (z11) {
                            i10 = this.f19704d + 2;
                            i11 = this.f19705e;
                        } else {
                            t0("Unterminated comment");
                            throw null;
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f19704d = i13 + 1;
                        r0();
                        i10 = this.f19704d;
                        i11 = this.f19705e;
                    }
                } else if (c10 == '#') {
                    this.f19704d = i12;
                    i();
                    r0();
                    i10 = this.f19704d;
                    i11 = this.f19705e;
                } else {
                    this.f19704d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    public final void i() throws IOException {
        if (!this.f19702b) {
            t0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public void i0() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 7) {
            this.f19708h = 0;
            int[] iArr = this.f19715w;
            int i11 = this.f19713u - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected null but was ");
        a10.append(m0());
        a10.append(M());
        throw new IllegalStateException(a10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f19704d = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String j0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f19703c
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f19704d
            int r4 = r10.f19705e
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f19704d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f19704d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.o0()
            r2.append(r3)
            int r3 = r10.f19704d
            int r4 = r10.f19705e
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.f19706f
            int r3 = r3 + r7
            r10.f19706f = r3
            r10.f19707g = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f19704d = r3
            boolean r3 = r10.u(r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.t0(r11)
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.j0(char):java.lang.String");
    }

    public String k0() throws IOException {
        String str;
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 10) {
            str = l0();
        } else if (i10 == 8) {
            str = j0('\'');
        } else if (i10 == 9) {
            str = j0('\"');
        } else if (i10 == 11) {
            str = this.f19711s;
            this.f19711s = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f19709i);
        } else if (i10 == 16) {
            str = new String(this.f19703c, this.f19704d, this.f19710r);
            this.f19704d += this.f19710r;
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Expected a string but was ");
            a10.append(m0());
            a10.append(M());
            throw new IllegalStateException(a10.toString());
        }
        this.f19708h = 0;
        int[] iArr = this.f19715w;
        int i11 = this.f19713u - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String l0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f19704d
            int r4 = r3 + r2
            int r5 = r6.f19705e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f19703c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.i()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f19703c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.u(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f19703c
            int r4 = r6.f19704d
            r1.append(r3, r4, r2)
            int r3 = r6.f19704d
            int r3 = r3 + r2
            r6.f19704d = r3
            r2 = 1
            boolean r2 = r6.u(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f19703c
            int r3 = r6.f19704d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f19703c
            int r3 = r6.f19704d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f19704d
            int r2 = r2 + r0
            r6.f19704d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.l0():java.lang.String");
    }

    public b m0() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case b4.f10106f:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void n0(int i10) {
        int i11 = this.f19713u;
        int[] iArr = this.f19712t;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            int[] iArr3 = new int[(i11 * 2)];
            String[] strArr = new String[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f19715w, 0, iArr3, 0, this.f19713u);
            System.arraycopy(this.f19714v, 0, strArr, 0, this.f19713u);
            this.f19712t = iArr2;
            this.f19715w = iArr3;
            this.f19714v = strArr;
        }
        int[] iArr4 = this.f19712t;
        int i12 = this.f19713u;
        this.f19713u = i12 + 1;
        iArr4[i12] = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0205, code lost:
        if (J(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0207, code lost:
        if (r13 != 2) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0209, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020f, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0211, code lost:
        if (r16 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0217, code lost:
        if (r10 != 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0219, code lost:
        if (r16 != false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021b, code lost:
        if (r16 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021e, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021f, code lost:
        r0.f19709i = r10;
        r0.f19704d += r9;
        r6 = 15;
        r0.f19708h = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x022b, code lost:
        if (r13 == 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x022e, code lost:
        if (r13 == 4) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0231, code lost:
        if (r13 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0233, code lost:
        r0.f19710r = r9;
        r6 = 16;
        r0.f19708h = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0174 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int o() throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f19712t
            int r2 = r0.f19713u
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 6
            r11 = 3
            r12 = 7
            r13 = 0
            r14 = 5
            r15 = 4
            r5 = 2
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r5
            goto L_0x00d1
        L_0x0020:
            if (r3 != r5) goto L_0x003a
            int r1 = r0.h0(r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f19708h = r15
            return r15
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.t0(r1)
            throw r13
        L_0x0035:
            r19.i()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r11) goto L_0x02bc
            if (r3 != r14) goto L_0x0040
            goto L_0x02bc
        L_0x0040:
            if (r3 != r15) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r14
            int r1 = r0.h0(r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r19.i()
            int r1 = r0.f19704d
            int r2 = r0.f19705e
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.u(r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f19703c
            int r2 = r0.f19704d
            char r1 = r1[r2]
            r15 = 62
            if (r1 != r15) goto L_0x00d1
            int r2 = r2 + r4
            r0.f19704d = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.t0(r1)
            throw r13
        L_0x0074:
            if (r3 != r10) goto L_0x00b6
            boolean r1 = r0.f19702b
            if (r1 == 0) goto L_0x00ae
            r0.h0(r4)
            int r1 = r0.f19704d
            int r1 = r1 - r4
            r0.f19704d = r1
            char[] r2 = f19700x
            int r15 = r2.length
            int r1 = r1 + r15
            int r15 = r0.f19705e
            if (r1 <= r15) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.u(r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = 0
        L_0x0093:
            char[] r2 = f19700x
            int r15 = r2.length
            if (r1 >= r15) goto L_0x00a8
            char[] r15 = r0.f19703c
            int r13 = r0.f19704d
            int r13 = r13 + r1
            char r13 = r15[r13]
            char r2 = r2[r1]
            if (r13 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r13 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f19704d
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f19704d = r1
        L_0x00ae:
            int[] r1 = r0.f19712t
            int r2 = r0.f19713u
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.h0(r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
            r0.f19708h = r1
            return r1
        L_0x00c4:
            r19.i()
            int r1 = r0.f19704d
            int r1 = r1 - r4
            r0.f19704d = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02b4
        L_0x00d1:
            int r1 = r0.h0(r4)
            r2 = 34
            if (r1 == r2) goto L_0x02af
            r2 = 39
            if (r1 == r2) goto L_0x02a7
            if (r1 == r9) goto L_0x028f
            if (r1 == r8) goto L_0x028f
            r2 = 91
            if (r1 == r2) goto L_0x028b
            if (r1 == r7) goto L_0x0285
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0282
            int r1 = r0.f19704d
            int r1 = r1 - r4
            r0.f19704d = r1
            char[] r2 = r0.f19703c
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L_0x011f:
            int r7 = r1.length()
            r8 = 1
        L_0x0124:
            if (r8 >= r7) goto L_0x014d
            int r9 = r0.f19704d
            int r9 = r9 + r8
            int r13 = r0.f19705e
            if (r9 < r13) goto L_0x0136
            int r9 = r8 + 1
            boolean r9 = r0.u(r9)
            if (r9 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r9 = r0.f19703c
            int r13 = r0.f19704d
            int r13 = r13 + r8
            char r9 = r9[r13]
            char r13 = r1.charAt(r8)
            if (r9 == r13) goto L_0x014a
            char r13 = r2.charAt(r8)
            if (r9 == r13) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r8 = r8 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f19704d
            int r1 = r1 + r7
            int r2 = r0.f19705e
            if (r1 < r2) goto L_0x015c
            int r1 = r7 + 1
            boolean r1 = r0.u(r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f19703c
            int r2 = r0.f19704d
            int r2 = r2 + r7
            char r1 = r1[r2]
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = 0
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f19704d
            int r1 = r1 + r7
            r0.f19704d = r1
            r0.f19708h = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f19703c
            int r2 = r0.f19704d
            int r3 = r0.f19705e
            r7 = 0
            r10 = r7
            r9 = 0
            r13 = 0
            r15 = 1
            r16 = 0
        L_0x0183:
            int r6 = r2 + r9
            if (r6 != r3) goto L_0x019b
            int r2 = r1.length
            if (r9 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x0264
        L_0x018d:
            int r2 = r9 + 1
            boolean r2 = r0.u(r2)
            if (r2 != 0) goto L_0x0197
            goto L_0x0207
        L_0x0197:
            int r2 = r0.f19704d
            int r3 = r0.f19705e
        L_0x019b:
            int r6 = r2 + r9
            char r6 = r1[r6]
            r12 = 43
            if (r6 == r12) goto L_0x0257
            r12 = 69
            if (r6 == r12) goto L_0x024d
            r12 = 101(0x65, float:1.42E-43)
            if (r6 == r12) goto L_0x024d
            r12 = 45
            if (r6 == r12) goto L_0x0241
            r12 = 46
            if (r6 == r12) goto L_0x023a
            r12 = 48
            if (r6 < r12) goto L_0x0201
            r12 = 57
            if (r6 <= r12) goto L_0x01bc
            goto L_0x0201
        L_0x01bc:
            if (r13 == r4) goto L_0x01f7
            if (r13 != 0) goto L_0x01c1
            goto L_0x01f7
        L_0x01c1:
            if (r13 != r5) goto L_0x01eb
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x01c8
            goto L_0x018a
        L_0x01c8:
            r17 = 10
            long r17 = r17 * r10
            int r6 = r6 + -48
            long r7 = (long) r6
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x01e5
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01e3
            int r6 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r6 = 0
            goto L_0x01e6
        L_0x01e5:
            r6 = 1
        L_0x01e6:
            r15 = r15 & r6
            r10 = r17
            r7 = 6
            goto L_0x01fd
        L_0x01eb:
            r6 = 3
            r7 = 6
            if (r13 != r6) goto L_0x01f1
            r13 = 4
            goto L_0x01fd
        L_0x01f1:
            if (r13 == r14) goto L_0x01f5
            if (r13 != r7) goto L_0x01fd
        L_0x01f5:
            r13 = 7
            goto L_0x01fd
        L_0x01f7:
            r7 = 6
            int r6 = r6 + -48
            int r6 = -r6
            long r10 = (long) r6
            r13 = 2
        L_0x01fd:
            r17 = 0
            goto L_0x025d
        L_0x0201:
            boolean r1 = r0.J(r6)
            if (r1 != 0) goto L_0x018a
        L_0x0207:
            if (r13 != r5) goto L_0x022b
            if (r15 == 0) goto L_0x022b
            r1 = -9223372036854775808
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0213
            if (r16 == 0) goto L_0x022b
        L_0x0213:
            r17 = 0
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x021b
            if (r16 != 0) goto L_0x022b
        L_0x021b:
            if (r16 == 0) goto L_0x021e
            goto L_0x021f
        L_0x021e:
            long r10 = -r10
        L_0x021f:
            r0.f19709i = r10
            int r1 = r0.f19704d
            int r1 = r1 + r9
            r0.f19704d = r1
            r6 = 15
            r0.f19708h = r6
            goto L_0x0264
        L_0x022b:
            if (r13 == r5) goto L_0x0233
            r1 = 4
            if (r13 == r1) goto L_0x0233
            r1 = 7
            if (r13 != r1) goto L_0x018a
        L_0x0233:
            r0.f19710r = r9
            r6 = 16
            r0.f19708h = r6
            goto L_0x0264
        L_0x023a:
            r17 = r7
            r7 = 6
            if (r13 != r5) goto L_0x018a
            r13 = 3
            goto L_0x025d
        L_0x0241:
            r17 = r7
            r7 = 6
            if (r13 != 0) goto L_0x024a
            r13 = 1
            r16 = 1
            goto L_0x025d
        L_0x024a:
            if (r13 != r14) goto L_0x018a
            goto L_0x025c
        L_0x024d:
            r17 = r7
            r7 = 6
            if (r13 == r5) goto L_0x0255
            r6 = 4
            if (r13 != r6) goto L_0x018a
        L_0x0255:
            r13 = 5
            goto L_0x025d
        L_0x0257:
            r17 = r7
            r7 = 6
            if (r13 != r14) goto L_0x018a
        L_0x025c:
            r13 = 6
        L_0x025d:
            int r9 = r9 + 1
            r7 = r17
            r12 = 7
            goto L_0x0183
        L_0x0264:
            if (r6 == 0) goto L_0x0267
            return r6
        L_0x0267:
            char[] r1 = r0.f19703c
            int r2 = r0.f19704d
            char r1 = r1[r2]
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L_0x027b
            r19.i()
            r1 = 10
            r0.f19708h = r1
            return r1
        L_0x027b:
            java.lang.String r1 = "Expected value"
            r0.t0(r1)
            r1 = 0
            throw r1
        L_0x0282:
            r0.f19708h = r4
            return r4
        L_0x0285:
            if (r3 != r4) goto L_0x028f
            r1 = 4
            r0.f19708h = r1
            return r1
        L_0x028b:
            r1 = 3
            r0.f19708h = r1
            return r1
        L_0x028f:
            if (r3 == r4) goto L_0x029b
            if (r3 != r5) goto L_0x0294
            goto L_0x029b
        L_0x0294:
            java.lang.String r1 = "Unexpected value"
            r0.t0(r1)
            r1 = 0
            throw r1
        L_0x029b:
            r19.i()
            int r1 = r0.f19704d
            int r1 = r1 - r4
            r0.f19704d = r1
            r1 = 7
            r0.f19708h = r1
            return r1
        L_0x02a7:
            r19.i()
            r1 = 8
            r0.f19708h = r1
            return r1
        L_0x02af:
            r1 = 9
            r0.f19708h = r1
            return r1
        L_0x02b4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02bc:
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L_0x02db
            int r2 = r0.h0(r4)
            if (r2 == r9) goto L_0x02db
            if (r2 == r8) goto L_0x02d8
            if (r2 != r1) goto L_0x02d1
            r0.f19708h = r5
            return r5
        L_0x02d1:
            java.lang.String r1 = "Unterminated object"
            r0.t0(r1)
            r1 = 0
            throw r1
        L_0x02d8:
            r19.i()
        L_0x02db:
            int r2 = r0.h0(r4)
            r6 = 34
            if (r2 == r6) goto L_0x0316
            r6 = 39
            if (r2 == r6) goto L_0x030e
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L_0x0304
            r19.i()
            int r1 = r0.f19704d
            int r1 = r1 - r4
            r0.f19704d = r1
            char r1 = (char) r2
            boolean r1 = r0.J(r1)
            if (r1 == 0) goto L_0x02ff
            r1 = 14
            r0.f19708h = r1
            return r1
        L_0x02ff:
            r0.t0(r6)
            r1 = 0
            throw r1
        L_0x0304:
            r1 = 0
            if (r3 == r14) goto L_0x030a
            r0.f19708h = r5
            return r5
        L_0x030a:
            r0.t0(r6)
            throw r1
        L_0x030e:
            r19.i()
            r1 = 12
            r0.f19708h = r1
            return r1
        L_0x0316:
            r1 = 13
            r0.f19708h = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.o():int");
    }

    public final char o0() throws IOException {
        int i10;
        int i11;
        if (this.f19704d != this.f19705e || u(1)) {
            char[] cArr = this.f19703c;
            int i12 = this.f19704d;
            int i13 = i12 + 1;
            this.f19704d = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f19706f++;
                this.f19707g = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    t0("Invalid escape sequence");
                    throw null;
                } else if (i13 + 4 <= this.f19705e || u(4)) {
                    char c11 = 0;
                    int i14 = this.f19704d;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f19703c[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                StringBuilder a10 = android.support.v4.media.a.a("\\u");
                                a10.append(new String(this.f19703c, this.f19704d, 4));
                                throw new NumberFormatException(a10.toString());
                            } else {
                                i11 = c12 - 'A';
                            }
                            i10 = i11 + 10;
                        } else {
                            i10 = c12 - '0';
                        }
                        c11 = (char) (i10 + c13);
                        i14++;
                    }
                    this.f19704d += 4;
                    return c11;
                } else {
                    t0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c10;
        }
        t0("Unterminated escape sequence");
        throw null;
    }

    public final void p0(boolean z10) {
        this.f19702b = z10;
    }

    public final void q0(char c10) throws IOException {
        char[] cArr = this.f19703c;
        do {
            int i10 = this.f19704d;
            int i11 = this.f19705e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f19704d = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f19704d = i12;
                    o0();
                    i10 = this.f19704d;
                    i11 = this.f19705e;
                } else {
                    if (c11 == 10) {
                        this.f19706f++;
                        this.f19707g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f19704d = i10;
        } while (u(1));
        t0("Unterminated string");
        throw null;
    }

    public final void r0() throws IOException {
        char c10;
        do {
            if (this.f19704d < this.f19705e || u(1)) {
                char[] cArr = this.f19703c;
                int i10 = this.f19704d;
                int i11 = i10 + 1;
                this.f19704d = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f19706f++;
                    this.f19707g = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    public void s() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 4) {
            int i11 = this.f19713u - 1;
            this.f19713u = i11;
            int[] iArr = this.f19715w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f19708h = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected END_ARRAY but was ");
        a10.append(m0());
        a10.append(M());
        throw new IllegalStateException(a10.toString());
    }

    public void s0() throws IOException {
        int i10;
        int i11 = 0;
        do {
            int i12 = this.f19708h;
            if (i12 == 0) {
                i12 = o();
            }
            if (i12 == 3) {
                n0(1);
            } else if (i12 == 1) {
                n0(3);
            } else {
                if (i12 == 4) {
                    this.f19713u--;
                } else if (i12 == 2) {
                    this.f19713u--;
                } else if (i12 == 14 || i12 == 10) {
                    while (true) {
                        i10 = 0;
                        while (true) {
                            int i13 = this.f19704d + i10;
                            if (i13 < this.f19705e) {
                                char c10 = this.f19703c[i13];
                                if (!(c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ')) {
                                    if (c10 != '#') {
                                        if (c10 != ',') {
                                            if (!(c10 == '/' || c10 == '=')) {
                                                if (!(c10 == '{' || c10 == '}' || c10 == ':')) {
                                                    if (c10 != ';') {
                                                        switch (c10) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i10++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f19704d = i13;
                                if (!u(1)) {
                                }
                            }
                        }
                    }
                    i();
                    this.f19704d += i10;
                    this.f19708h = 0;
                } else if (i12 == 8 || i12 == 12) {
                    q0('\'');
                    this.f19708h = 0;
                } else if (i12 == 9 || i12 == 13) {
                    q0('\"');
                    this.f19708h = 0;
                } else {
                    if (i12 == 16) {
                        this.f19704d += this.f19710r;
                    }
                    this.f19708h = 0;
                }
                i11--;
                this.f19708h = 0;
            }
            i11++;
            this.f19708h = 0;
        } while (i11 != 0);
        int[] iArr = this.f19715w;
        int i14 = this.f19713u;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f19714v[i14 - 1] = "null";
    }

    public void t() throws IOException {
        int i10 = this.f19708h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 2) {
            int i11 = this.f19713u - 1;
            this.f19713u = i11;
            this.f19714v[i11] = null;
            int[] iArr = this.f19715w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f19708h = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected END_OBJECT but was ");
        a10.append(m0());
        a10.append(M());
        throw new IllegalStateException(a10.toString());
    }

    public final IOException t0(String str) throws IOException {
        StringBuilder a10 = android.support.v4.media.a.a(str);
        a10.append(M());
        throw new d(a10.toString());
    }

    public String toString() {
        return getClass().getSimpleName() + M();
    }

    public final boolean u(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f19703c;
        int i13 = this.f19707g;
        int i14 = this.f19704d;
        this.f19707g = i13 - i14;
        int i15 = this.f19705e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f19705e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f19705e = 0;
        }
        this.f19704d = 0;
        do {
            Reader reader = this.f19701a;
            int i17 = this.f19705e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f19705e + read;
            this.f19705e = i11;
            if (this.f19706f == 0 && (i12 = this.f19707g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f19704d++;
                this.f19707g = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String v() {
        StringBuilder a10 = c.a('$');
        int i10 = this.f19713u;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f19712t[i11];
            if (i12 == 1 || i12 == 2) {
                a10.append('[');
                a10.append(this.f19715w[i11]);
                a10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                a10.append('.');
                String[] strArr = this.f19714v;
                if (strArr[i11] != null) {
                    a10.append(strArr[i11]);
                }
            }
        }
        return a10.toString();
    }
}
