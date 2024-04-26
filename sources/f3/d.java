package f3;

import android.support.v4.media.a;
import com.startapp.b4;
import f3.c;
import java.io.EOFException;
import java.io.IOException;
import ve.f;
import ve.h;
import ve.i;

/* compiled from: JsonUtf8Reader */
public final class d extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final i f18098t = i.i("'\\");

    /* renamed from: u  reason: collision with root package name */
    public static final i f18099u = i.i("\"\\");

    /* renamed from: v  reason: collision with root package name */
    public static final i f18100v = i.i("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: w  reason: collision with root package name */
    public static final i f18101w = i.i("\n\r");

    /* renamed from: x  reason: collision with root package name */
    public static final i f18102x = i.i("*/");

    /* renamed from: f  reason: collision with root package name */
    public final h f18103f;

    /* renamed from: g  reason: collision with root package name */
    public final f f18104g;

    /* renamed from: h  reason: collision with root package name */
    public int f18105h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f18106i;

    /* renamed from: r  reason: collision with root package name */
    public int f18107r;

    /* renamed from: s  reason: collision with root package name */
    public String f18108s;

    public d(h hVar) {
        if (hVar != null) {
            this.f18103f = hVar;
            this.f18104g = hVar.A();
            N(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    public int G() throws IOException {
        String str;
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 16) {
            long j10 = this.f18106i;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f18105h = 0;
                int[] iArr = this.f18084d;
                int i12 = this.f18081a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder a10 = a.a("Expected an int but was ");
            a10.append(this.f18106i);
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
        if (i10 == 17) {
            this.f18108s = this.f18104g.h0((long) this.f18107r);
        } else if (i10 == 9 || i10 == 8) {
            if (i10 == 9) {
                str = m0(f18099u);
            } else {
                str = m0(f18098t);
            }
            this.f18108s = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f18105h = 0;
                int[] iArr2 = this.f18084d;
                int i13 = this.f18081a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            StringBuilder a11 = a.a("Expected an int but was ");
            a11.append(M());
            a11.append(" at path ");
            a11.append(s());
            throw new a(a11.toString());
        }
        this.f18105h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f18108s);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f18108s = null;
                this.f18105h = 0;
                int[] iArr3 = this.f18084d;
                int i15 = this.f18081a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            StringBuilder a12 = a.a("Expected an int but was ");
            a12.append(this.f18108s);
            a12.append(" at path ");
            a12.append(s());
            throw new a(a12.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder a13 = a.a("Expected an int but was ");
            a13.append(this.f18108s);
            a13.append(" at path ");
            a13.append(s());
            throw new a(a13.toString());
        }
    }

    public String H() throws IOException {
        String str;
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 14) {
            str = n0();
        } else if (i10 == 13) {
            str = m0(f18099u);
        } else if (i10 == 12) {
            str = m0(f18098t);
        } else if (i10 == 15) {
            str = this.f18108s;
        } else {
            StringBuilder a10 = a.a("Expected a name but was ");
            a10.append(M());
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
        this.f18105h = 0;
        this.f18083c[this.f18081a - 1] = str;
        return str;
    }

    public String J() throws IOException {
        String str;
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 10) {
            str = n0();
        } else if (i10 == 9) {
            str = m0(f18099u);
        } else if (i10 == 8) {
            str = m0(f18098t);
        } else if (i10 == 11) {
            str = this.f18108s;
            this.f18108s = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f18106i);
        } else if (i10 == 17) {
            str = this.f18104g.h0((long) this.f18107r);
        } else {
            StringBuilder a10 = a.a("Expected a string but was ");
            a10.append(M());
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
        this.f18105h = 0;
        int[] iArr = this.f18084d;
        int i11 = this.f18081a - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public c.b M() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case b4.f10106f:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int T(c.a aVar) throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return j0(this.f18108s, aVar);
        }
        int f10 = this.f18103f.f(aVar.f18086b);
        if (f10 != -1) {
            this.f18105h = 0;
            this.f18083c[this.f18081a - 1] = aVar.f18085a[f10];
            return f10;
        }
        String str = this.f18083c[this.f18081a - 1];
        String H = H();
        int j02 = j0(H, aVar);
        if (j02 == -1) {
            this.f18105h = 15;
            this.f18108s = H;
            this.f18083c[this.f18081a - 1] = str;
        }
        return j02;
    }

    public void V() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 14) {
            q0();
        } else if (i10 == 13) {
            p0(f18099u);
        } else if (i10 == 12) {
            p0(f18098t);
        } else if (i10 != 15) {
            StringBuilder a10 = a.a("Expected a name but was ");
            a10.append(M());
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
        this.f18105h = 0;
        this.f18083c[this.f18081a - 1] = "null";
    }

    public void a() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 3) {
            N(1);
            this.f18084d[this.f18081a - 1] = 0;
            this.f18105h = 0;
            return;
        }
        StringBuilder a10 = a.a("Expected BEGIN_ARRAY but was ");
        a10.append(M());
        a10.append(" at path ");
        a10.append(s());
        throw new a(a10.toString());
    }

    public void close() throws IOException {
        this.f18105h = 0;
        this.f18082b[0] = 8;
        this.f18081a = 1;
        this.f18104g.a();
        this.f18103f.close();
    }

    public void d() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 1) {
            N(3);
            this.f18105h = 0;
            return;
        }
        StringBuilder a10 = a.a("Expected BEGIN_OBJECT but was ");
        a10.append(M());
        a10.append(" at path ");
        a10.append(s());
        throw new a(a10.toString());
    }

    public void f0() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f18105h;
            if (i11 == 0) {
                i11 = i0();
            }
            if (i11 == 3) {
                N(1);
            } else if (i11 == 1) {
                N(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f18081a--;
                    } else {
                        StringBuilder a10 = a.a("Expected a value but was ");
                        a10.append(M());
                        a10.append(" at path ");
                        a10.append(s());
                        throw new a(a10.toString());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f18081a--;
                    } else {
                        StringBuilder a11 = a.a("Expected a value but was ");
                        a11.append(M());
                        a11.append(" at path ");
                        a11.append(s());
                        throw new a(a11.toString());
                    }
                } else if (i11 == 14 || i11 == 10) {
                    q0();
                } else if (i11 == 9 || i11 == 13) {
                    p0(f18099u);
                } else if (i11 == 8 || i11 == 12) {
                    p0(f18098t);
                } else if (i11 == 17) {
                    this.f18104g.b((long) this.f18107r);
                } else if (i11 == 18) {
                    StringBuilder a12 = a.a("Expected a value but was ");
                    a12.append(M());
                    a12.append(" at path ");
                    a12.append(s());
                    throw new a(a12.toString());
                }
                this.f18105h = 0;
            }
            i10++;
            this.f18105h = 0;
        } while (i10 != 0);
        int[] iArr = this.f18084d;
        int i12 = this.f18081a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f18083c[i12 - 1] = "null";
    }

    public final void h0() throws IOException {
        g0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public void i() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 4) {
            int i11 = this.f18081a - 1;
            this.f18081a = i11;
            int[] iArr = this.f18084d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f18105h = 0;
            return;
        }
        StringBuilder a10 = a.a("Expected END_ARRAY but was ");
        a10.append(M());
        a10.append(" at path ");
        a10.append(s());
        throw new a(a10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01aa, code lost:
        if (k0(r2) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ad, code lost:
        if (r1 != 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01af, code lost:
        if (r6 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b5, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b7, code lost:
        if (r9 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bd, code lost:
        if (r7 != 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bf, code lost:
        if (r9 != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c1, code lost:
        if (r9 == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c4, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c5, code lost:
        r0.f18106i = r7;
        r0.f18104g.b((long) r5);
        r15 = 16;
        r0.f18105h = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d2, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d3, code lost:
        if (r1 == r2) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d6, code lost:
        if (r1 == 4) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d9, code lost:
        if (r1 != 7) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01db, code lost:
        r0.f18107r = r5;
        r15 = 17;
        r0.f18105h = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0131, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i0() throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f18082b
            int r2 = r0.f18081a
            int r3 = r2 + -1
            r3 = r1[r3]
            r5 = 34
            r6 = 93
            r7 = 59
            r8 = 44
            r9 = 6
            r10 = 3
            r11 = 7
            r12 = 5
            r13 = 4
            r14 = 2
            r15 = 0
            r16 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0022
            int r2 = r2 - r4
            r1[r2] = r14
            goto L_0x0082
        L_0x0022:
            if (r3 != r14) goto L_0x0040
            int r1 = r0.l0(r4)
            ve.f r2 = r0.f18104g
            r2.readByte()
            if (r1 == r8) goto L_0x0082
            if (r1 == r7) goto L_0x003c
            if (r1 != r6) goto L_0x0036
            r0.f18105h = r13
            return r13
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            r0.g0(r1)
            throw r16
        L_0x003c:
            r17.h0()
            throw r16
        L_0x0040:
            if (r3 == r10) goto L_0x026e
            if (r3 != r12) goto L_0x0046
            goto L_0x026e
        L_0x0046:
            if (r3 != r13) goto L_0x0066
            int r2 = r2 - r4
            r1[r2] = r12
            int r1 = r0.l0(r4)
            ve.f r2 = r0.f18104g
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x0082
            r2 = 61
            if (r1 == r2) goto L_0x0062
            java.lang.String r1 = "Expected ':'"
            r0.g0(r1)
            throw r16
        L_0x0062:
            r17.h0()
            throw r16
        L_0x0066:
            if (r3 != r9) goto L_0x006c
            int r2 = r2 - r4
            r1[r2] = r11
            goto L_0x0082
        L_0x006c:
            if (r3 != r11) goto L_0x007e
            int r1 = r0.l0(r15)
            r2 = -1
            if (r1 != r2) goto L_0x007a
            r1 = 18
            r0.f18105h = r1
            return r1
        L_0x007a:
            r17.h0()
            throw r16
        L_0x007e:
            r1 = 8
            if (r3 == r1) goto L_0x0266
        L_0x0082:
            int r1 = r0.l0(r4)
            if (r1 == r5) goto L_0x025c
            r2 = 39
            if (r1 == r2) goto L_0x0258
            if (r1 == r8) goto L_0x0248
            if (r1 == r7) goto L_0x0248
            r2 = 91
            if (r1 == r2) goto L_0x023f
            if (r1 == r6) goto L_0x0234
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x022c
            ve.f r1 = r0.f18104g
            r2 = 0
            byte r1 = r1.u(r2)
            r5 = 116(0x74, float:1.63E-43)
            if (r1 == r5) goto L_0x00c8
            r5 = 84
            if (r1 != r5) goto L_0x00ab
            goto L_0x00c8
        L_0x00ab:
            r5 = 102(0x66, float:1.43E-43)
            if (r1 == r5) goto L_0x00c2
            r5 = 70
            if (r1 != r5) goto L_0x00b4
            goto L_0x00c2
        L_0x00b4:
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L_0x00bc
            r5 = 78
            if (r1 != r5) goto L_0x00df
        L_0x00bc:
            java.lang.String r1 = "null"
            java.lang.String r5 = "NULL"
            r6 = 7
            goto L_0x00cd
        L_0x00c2:
            java.lang.String r1 = "false"
            java.lang.String r5 = "FALSE"
            r6 = 6
            goto L_0x00cd
        L_0x00c8:
            java.lang.String r1 = "true"
            java.lang.String r5 = "TRUE"
            r6 = 5
        L_0x00cd:
            int r7 = r1.length()
            r8 = 1
        L_0x00d2:
            if (r8 >= r7) goto L_0x00fd
            ve.h r15 = r0.f18103f
            int r11 = r8 + 1
            long r12 = (long) r11
            boolean r12 = r15.p(r12)
            if (r12 != 0) goto L_0x00e1
        L_0x00df:
            r6 = 0
            goto L_0x011e
        L_0x00e1:
            ve.f r12 = r0.f18104g
            long r9 = (long) r8
            byte r9 = r12.u(r9)
            char r10 = r1.charAt(r8)
            if (r9 == r10) goto L_0x00f5
            char r8 = r5.charAt(r8)
            if (r9 == r8) goto L_0x00f5
            goto L_0x00df
        L_0x00f5:
            r8 = r11
            r9 = 6
            r10 = 3
            r11 = 7
            r12 = 5
            r13 = 4
            r15 = 0
            goto L_0x00d2
        L_0x00fd:
            ve.h r1 = r0.f18103f
            int r5 = r7 + 1
            long r8 = (long) r5
            boolean r1 = r1.p(r8)
            if (r1 == 0) goto L_0x0116
            ve.f r1 = r0.f18104g
            long r8 = (long) r7
            byte r1 = r1.u(r8)
            boolean r1 = r0.k0(r1)
            if (r1 == 0) goto L_0x0116
            goto L_0x00df
        L_0x0116:
            ve.f r1 = r0.f18104g
            long r7 = (long) r7
            r1.b(r7)
            r0.f18105h = r6
        L_0x011e:
            if (r6 == 0) goto L_0x0121
            return r6
        L_0x0121:
            r7 = r2
            r1 = 0
            r5 = 0
            r6 = 1
            r9 = 0
        L_0x0126:
            ve.h r10 = r0.f18103f
            int r11 = r5 + 1
            long r2 = (long) r11
            boolean r2 = r10.p(r2)
            if (r2 != 0) goto L_0x0134
        L_0x0131:
            r2 = 2
            goto L_0x01ad
        L_0x0134:
            ve.f r2 = r0.f18104g
            long r13 = (long) r5
            byte r2 = r2.u(r13)
            r12 = 43
            if (r2 == r12) goto L_0x0203
            r12 = 69
            if (r2 == r12) goto L_0x01f7
            r12 = 101(0x65, float:1.42E-43)
            if (r2 == r12) goto L_0x01f7
            r12 = 45
            if (r2 == r12) goto L_0x01ea
            r12 = 46
            if (r2 == r12) goto L_0x01e2
            r12 = 48
            if (r2 < r12) goto L_0x01a6
            r12 = 57
            if (r2 <= r12) goto L_0x0158
            goto L_0x01a6
        L_0x0158:
            if (r1 == r4) goto L_0x019c
            if (r1 != 0) goto L_0x015d
            goto L_0x019c
        L_0x015d:
            r5 = 2
            if (r1 != r5) goto L_0x018b
            r12 = 0
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0168
            goto L_0x0210
        L_0x0168:
            r12 = 10
            long r12 = r12 * r7
            int r2 = r2 + -48
            r14 = r11
            long r10 = (long) r2
            long r12 = r12 - r10
            r10 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0185
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0183
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r2 = 0
            goto L_0x0186
        L_0x0185:
            r2 = 1
        L_0x0186:
            r2 = r2 & r6
            r6 = r2
            r7 = r12
            r3 = 6
            goto L_0x01a3
        L_0x018b:
            r14 = r11
            r2 = 3
            if (r1 != r2) goto L_0x0194
            r1 = 4
            r2 = 7
            r3 = 6
            goto L_0x020a
        L_0x0194:
            r2 = 5
            r3 = 6
            if (r1 == r2) goto L_0x019a
            if (r1 != r3) goto L_0x01a3
        L_0x019a:
            r1 = 7
            goto L_0x01a3
        L_0x019c:
            r14 = r11
            r3 = 6
            int r2 = r2 + -48
            int r1 = -r2
            long r7 = (long) r1
            r1 = 2
        L_0x01a3:
            r2 = 7
            goto L_0x020a
        L_0x01a6:
            boolean r2 = r0.k0(r2)
            if (r2 != 0) goto L_0x0210
            goto L_0x0131
        L_0x01ad:
            if (r1 != r2) goto L_0x01d3
            if (r6 == 0) goto L_0x01d2
            r2 = -9223372036854775808
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01b9
            if (r9 == 0) goto L_0x01d2
        L_0x01b9:
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01c1
            if (r9 != 0) goto L_0x01d2
        L_0x01c1:
            if (r9 == 0) goto L_0x01c4
            goto L_0x01c5
        L_0x01c4:
            long r7 = -r7
        L_0x01c5:
            r0.f18106i = r7
            ve.f r1 = r0.f18104g
            long r2 = (long) r5
            r1.b(r2)
            r15 = 16
            r0.f18105h = r15
            goto L_0x0211
        L_0x01d2:
            r2 = 2
        L_0x01d3:
            if (r1 == r2) goto L_0x01db
            r2 = 4
            if (r1 == r2) goto L_0x01db
            r2 = 7
            if (r1 != r2) goto L_0x0210
        L_0x01db:
            r0.f18107r = r5
            r15 = 17
            r0.f18105h = r15
            goto L_0x0211
        L_0x01e2:
            r14 = r11
            r2 = 7
            r3 = 6
            r5 = 2
            if (r1 != r5) goto L_0x0210
            r1 = 3
            goto L_0x020a
        L_0x01ea:
            r14 = r11
            r2 = 7
            r3 = 6
            r5 = 2
            if (r1 != 0) goto L_0x01f3
            r1 = 1
            r9 = 1
            goto L_0x020a
        L_0x01f3:
            r11 = 5
            if (r1 != r11) goto L_0x0210
            goto L_0x0209
        L_0x01f7:
            r14 = r11
            r2 = 7
            r3 = 6
            r5 = 2
            r11 = 5
            if (r1 == r5) goto L_0x0201
            r5 = 4
            if (r1 != r5) goto L_0x0210
        L_0x0201:
            r1 = 5
            goto L_0x020a
        L_0x0203:
            r14 = r11
            r2 = 7
            r3 = 6
            r11 = 5
            if (r1 != r11) goto L_0x0210
        L_0x0209:
            r1 = 6
        L_0x020a:
            r5 = r14
            r2 = 0
            r14 = 2
            goto L_0x0126
        L_0x0210:
            r15 = 0
        L_0x0211:
            if (r15 == 0) goto L_0x0214
            return r15
        L_0x0214:
            ve.f r1 = r0.f18104g
            r2 = 0
            byte r1 = r1.u(r2)
            boolean r1 = r0.k0(r1)
            if (r1 != 0) goto L_0x0228
            java.lang.String r1 = "Expected value"
            r0.g0(r1)
            throw r16
        L_0x0228:
            r17.h0()
            throw r16
        L_0x022c:
            ve.f r1 = r0.f18104g
            r1.readByte()
            r0.f18105h = r4
            return r4
        L_0x0234:
            if (r3 != r4) goto L_0x0248
            ve.f r1 = r0.f18104g
            r1.readByte()
            r1 = 4
            r0.f18105h = r1
            return r1
        L_0x023f:
            ve.f r1 = r0.f18104g
            r1.readByte()
            r1 = 3
            r0.f18105h = r1
            return r1
        L_0x0248:
            if (r3 == r4) goto L_0x0254
            r1 = 2
            if (r3 != r1) goto L_0x024e
            goto L_0x0254
        L_0x024e:
            java.lang.String r1 = "Unexpected value"
            r0.g0(r1)
            throw r16
        L_0x0254:
            r17.h0()
            throw r16
        L_0x0258:
            r17.h0()
            throw r16
        L_0x025c:
            ve.f r1 = r0.f18104g
            r1.readByte()
            r1 = 9
            r0.f18105h = r1
            return r1
        L_0x0266:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x026e:
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x0294
            int r2 = r0.l0(r4)
            ve.f r6 = r0.f18104g
            r6.readByte()
            if (r2 == r8) goto L_0x0294
            if (r2 == r7) goto L_0x0290
            if (r2 != r1) goto L_0x028a
            r1 = 2
            r0.f18105h = r1
            return r1
        L_0x028a:
            java.lang.String r1 = "Unterminated object"
            r0.g0(r1)
            throw r16
        L_0x0290:
            r17.h0()
            throw r16
        L_0x0294:
            int r2 = r0.l0(r4)
            if (r2 == r5) goto L_0x02bf
            r4 = 39
            if (r2 == r4) goto L_0x02b6
            if (r2 != r1) goto L_0x02b2
            r1 = 5
            if (r3 == r1) goto L_0x02ac
            ve.f r1 = r0.f18104g
            r1.readByte()
            r1 = 2
            r0.f18105h = r1
            return r1
        L_0x02ac:
            java.lang.String r1 = "Expected name"
            r0.g0(r1)
            throw r16
        L_0x02b2:
            r17.h0()
            throw r16
        L_0x02b6:
            ve.f r1 = r0.f18104g
            r1.readByte()
            r17.h0()
            throw r16
        L_0x02bf:
            ve.f r1 = r0.f18104g
            r1.readByte()
            r1 = 13
            r0.f18105h = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.i0():int");
    }

    public final int j0(String str, c.a aVar) {
        int length = aVar.f18085a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f18085a[i10])) {
                this.f18105h = 0;
                this.f18083c[this.f18081a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean k0(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (!(i10 == 47 || i10 == 61)) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h0();
        throw null;
    }

    public final int l0(boolean z10) throws IOException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (this.f18103f.p((long) i11)) {
                byte u10 = this.f18104g.u((long) i10);
                if (u10 == 10 || u10 == 32 || u10 == 13 || u10 == 9) {
                    i10 = i11;
                } else {
                    this.f18104g.b((long) (i11 - 1));
                    if (u10 == 47) {
                        if (!this.f18103f.p(2)) {
                            return u10;
                        }
                        h0();
                        throw null;
                    } else if (u10 != 35) {
                        return u10;
                    } else {
                        h0();
                        throw null;
                    }
                }
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String m0(i iVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long q10 = this.f18103f.q(iVar);
            if (q10 == -1) {
                g0("Unterminated string");
                throw null;
            } else if (this.f18104g.u(q10) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f18104g.h0(q10));
                this.f18104g.readByte();
                sb2.append(o0());
            } else if (sb2 == null) {
                String h02 = this.f18104g.h0(q10);
                this.f18104g.readByte();
                return h02;
            } else {
                sb2.append(this.f18104g.h0(q10));
                this.f18104g.readByte();
                return sb2.toString();
            }
        }
    }

    public final String n0() throws IOException {
        long q10 = this.f18103f.q(f18100v);
        return q10 != -1 ? this.f18104g.h0(q10) : this.f18104g.g0();
    }

    public void o() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 2) {
            int i11 = this.f18081a - 1;
            this.f18081a = i11;
            this.f18083c[i11] = null;
            int[] iArr = this.f18084d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f18105h = 0;
            return;
        }
        StringBuilder a10 = a.a("Expected END_OBJECT but was ");
        a10.append(M());
        a10.append(" at path ");
        a10.append(s());
        throw new a(a10.toString());
    }

    public final char o0() throws IOException {
        int i10;
        int i11;
        if (this.f18103f.p(1)) {
            byte readByte = this.f18104g.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder a10 = a.a("Invalid escape sequence: \\");
                a10.append((char) readByte);
                g0(a10.toString());
                throw null;
            } else if (this.f18103f.p(4)) {
                char c10 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    byte u10 = this.f18104g.u((long) i12);
                    char c11 = (char) (c10 << 4);
                    if (u10 < 48 || u10 > 57) {
                        if (u10 >= 97 && u10 <= 102) {
                            i11 = u10 - 97;
                        } else if (u10 < 65 || u10 > 70) {
                            StringBuilder a11 = a.a("\\u");
                            a11.append(this.f18104g.h0(4));
                            g0(a11.toString());
                            throw null;
                        } else {
                            i11 = u10 - 65;
                        }
                        i10 = i11 + 10;
                    } else {
                        i10 = u10 - 48;
                    }
                    c10 = (char) (i10 + c11);
                }
                this.f18104g.b(4);
                return c10;
            } else {
                StringBuilder a12 = a.a("Unterminated escape sequence at path ");
                a12.append(s());
                throw new EOFException(a12.toString());
            }
        } else {
            g0("Unterminated escape sequence");
            throw null;
        }
    }

    public final void p0(i iVar) throws IOException {
        while (true) {
            long q10 = this.f18103f.q(iVar);
            if (q10 == -1) {
                g0("Unterminated string");
                throw null;
            } else if (this.f18104g.u(q10) == 92) {
                this.f18104g.b(q10 + 1);
                o0();
            } else {
                this.f18104g.b(q10 + 1);
                return;
            }
        }
    }

    public final void q0() throws IOException {
        long q10 = this.f18103f.q(f18100v);
        f fVar = this.f18104g;
        if (q10 == -1) {
            q10 = fVar.f26740b;
        }
        fVar.b(q10);
    }

    public boolean t() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public String toString() {
        StringBuilder a10 = a.a("JsonReader(");
        a10.append(this.f18103f);
        a10.append(")");
        return a10.toString();
    }

    public boolean u() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 5) {
            this.f18105h = 0;
            int[] iArr = this.f18084d;
            int i11 = this.f18081a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f18105h = 0;
            int[] iArr2 = this.f18084d;
            int i12 = this.f18081a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder a10 = a.a("Expected a boolean but was ");
            a10.append(M());
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
    }

    public double v() throws IOException {
        int i10 = this.f18105h;
        if (i10 == 0) {
            i10 = i0();
        }
        if (i10 == 16) {
            this.f18105h = 0;
            int[] iArr = this.f18084d;
            int i11 = this.f18081a - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f18106i;
        }
        if (i10 == 17) {
            this.f18108s = this.f18104g.h0((long) this.f18107r);
        } else if (i10 == 9) {
            this.f18108s = m0(f18099u);
        } else if (i10 == 8) {
            this.f18108s = m0(f18098t);
        } else if (i10 == 10) {
            this.f18108s = n0();
        } else if (i10 != 11) {
            StringBuilder a10 = a.a("Expected a double but was ");
            a10.append(M());
            a10.append(" at path ");
            a10.append(s());
            throw new a(a10.toString());
        }
        this.f18105h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f18108s);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + s());
            }
            this.f18108s = null;
            this.f18105h = 0;
            int[] iArr2 = this.f18084d;
            int i12 = this.f18081a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder a11 = a.a("Expected a double but was ");
            a11.append(this.f18108s);
            a11.append(" at path ");
            a11.append(s());
            throw new a(a11.toString());
        }
    }
}
