package qe;

import com.startapp.b4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import le.c;
import qe.s;
import ve.f;
import ve.h;
import ve.i;
import ve.p;
import ve.t;
import ve.y;

/* compiled from: Hpack */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f24298a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<i, Integer> f24299b;

    /* compiled from: Hpack */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f24300a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final h f24301b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24302c;

        /* renamed from: d  reason: collision with root package name */
        public int f24303d;

        /* renamed from: e  reason: collision with root package name */
        public c[] f24304e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f24305f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f24306g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f24307h = 0;

        public a(int i10, y yVar) {
            this.f24302c = i10;
            this.f24303d = i10;
            Logger logger = p.f26761a;
            this.f24301b = new t(yVar);
        }

        public final void a() {
            Arrays.fill(this.f24304e, (Object) null);
            this.f24305f = this.f24304e.length - 1;
            this.f24306g = 0;
            this.f24307h = 0;
        }

        public final int b(int i10) {
            return this.f24305f + 1 + i10;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24304e.length;
                while (true) {
                    length--;
                    i11 = this.f24305f;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f24304e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24306g);
                        this.f24305f += i12;
                    } else {
                        c[] cVarArr2 = this.f24304e;
                        i10 -= cVarArr2[length].f24297c;
                        this.f24307h -= cVarArr2[length].f24297c;
                        this.f24306g--;
                        i12++;
                    }
                }
                c[] cVarArr3 = this.f24304e;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f24306g);
                this.f24305f += i12;
            }
            return i12;
        }

        public final i d(int i10) throws IOException {
            if (i10 >= 0 && i10 <= d.f24298a.length + -1) {
                return d.f24298a[i10].f24295a;
            }
            int b10 = b(i10 - d.f24298a.length);
            if (b10 >= 0) {
                c[] cVarArr = this.f24304e;
                if (b10 < cVarArr.length) {
                    return cVarArr[b10].f24295a;
                }
            }
            StringBuilder a10 = android.support.v4.media.a.a("Header index too large ");
            a10.append(i10 + 1);
            throw new IOException(a10.toString());
        }

        public final void e(int i10, c cVar) {
            this.f24300a.add(cVar);
            int i11 = cVar.f24297c;
            if (i10 != -1) {
                i11 -= this.f24304e[(this.f24305f + 1) + i10].f24297c;
            }
            int i12 = this.f24303d;
            if (i11 > i12) {
                a();
                return;
            }
            int c10 = c((this.f24307h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f24306g + 1;
                c[] cVarArr = this.f24304e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f24305f = this.f24304e.length - 1;
                    this.f24304e = cVarArr2;
                }
                int i14 = this.f24305f;
                this.f24305f = i14 - 1;
                this.f24304e[i14] = cVar;
                this.f24306g++;
            } else {
                this.f24304e[this.f24305f + 1 + i10 + c10 + i10] = cVar;
            }
            this.f24307h += i11;
        }

        public i f() throws IOException {
            byte readByte = this.f24301b.readByte() & 255;
            boolean z10 = (readByte & b4.f10104d) == 128;
            int g10 = g(readByte, 127);
            if (!z10) {
                return this.f24301b.l((long) g10);
            }
            s sVar = s.f24429d;
            byte[] D = this.f24301b.D((long) g10);
            sVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            s.a aVar = sVar.f24430a;
            byte b10 = 0;
            int i10 = 0;
            for (byte b11 : D) {
                b10 = (b10 << 8) | (b11 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i11 = i10 - 8;
                    aVar = aVar.f24431a[(b10 >>> i11) & 255];
                    if (aVar.f24431a == null) {
                        byteArrayOutputStream.write(aVar.f24432b);
                        i10 -= aVar.f24433c;
                        aVar = sVar.f24430a;
                    } else {
                        i10 = i11;
                    }
                }
            }
            while (i10 > 0) {
                s.a aVar2 = aVar.f24431a[(b10 << (8 - i10)) & 255];
                if (aVar2.f24431a != null || aVar2.f24433c > i10) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f24432b);
                i10 -= aVar2.f24433c;
                aVar = sVar.f24430a;
            }
            return i.r(byteArrayOutputStream.toByteArray());
        }

        public int g(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f24301b.readByte() & 255;
                if ((readByte & b4.f10104d) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & Byte.MAX_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    /* compiled from: Hpack */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f24308a;

        /* renamed from: b  reason: collision with root package name */
        public int f24309b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public boolean f24310c;

        /* renamed from: d  reason: collision with root package name */
        public int f24311d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public c[] f24312e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f24313f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f24314g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f24315h = 0;

        public b(f fVar) {
            this.f24308a = fVar;
        }

        public final void a() {
            Arrays.fill(this.f24312e, (Object) null);
            this.f24313f = this.f24312e.length - 1;
            this.f24314g = 0;
            this.f24315h = 0;
        }

        public final int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24312e.length;
                while (true) {
                    length--;
                    i11 = this.f24313f;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f24312e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24314g);
                        c[] cVarArr2 = this.f24312e;
                        int i13 = this.f24313f;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f24313f += i12;
                    } else {
                        c[] cVarArr3 = this.f24312e;
                        i10 -= cVarArr3[length].f24297c;
                        this.f24315h -= cVarArr3[length].f24297c;
                        this.f24314g--;
                        i12++;
                    }
                }
                c[] cVarArr4 = this.f24312e;
                System.arraycopy(cVarArr4, i11 + 1, cVarArr4, i11 + 1 + i12, this.f24314g);
                c[] cVarArr22 = this.f24312e;
                int i132 = this.f24313f;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f24313f += i12;
            }
            return i12;
        }

        public final void c(c cVar) {
            int i10 = cVar.f24297c;
            int i11 = this.f24311d;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f24315h + i10) - i11);
            int i12 = this.f24314g + 1;
            c[] cVarArr = this.f24312e;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f24313f = this.f24312e.length - 1;
                this.f24312e = cVarArr2;
            }
            int i13 = this.f24313f;
            this.f24313f = i13 - 1;
            this.f24312e[i13] = cVar;
            this.f24314g++;
            this.f24315h += i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(ve.i r11) throws java.io.IOException {
            /*
                r10 = this;
                qe.s r0 = qe.s.f24429d
                r0.getClass()
                r0 = 0
                r2 = 0
                r4 = r0
                r3 = 0
            L_0x000a:
                int r6 = r11.u()
                r7 = 255(0xff, float:3.57E-43)
                if (r3 >= r6) goto L_0x0020
                byte r6 = r11.m(r3)
                r6 = r6 & r7
                byte[] r7 = qe.s.f24428c
                byte r6 = r7[r6]
                long r6 = (long) r6
                long r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r8 = 7
                long r4 = r4 + r8
                r3 = 3
                long r3 = r4 >> r3
                int r4 = (int) r3
                int r3 = r11.u()
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r3) goto L_0x0080
                ve.f r3 = new ve.f
                r3.<init>()
                qe.s r4 = qe.s.f24429d
                r4.getClass()
                r4 = 0
            L_0x003a:
                int r6 = r11.u()
                if (r2 >= r6) goto L_0x0061
                byte r6 = r11.m(r2)
                r6 = r6 & r7
                int[] r8 = qe.s.f24427b
                r8 = r8[r6]
                byte[] r9 = qe.s.f24428c
                byte r6 = r9[r6]
                long r0 = r0 << r6
                long r8 = (long) r8
                long r0 = r0 | r8
                int r4 = r4 + r6
            L_0x0051:
                r6 = 8
                if (r4 < r6) goto L_0x005e
                int r4 = r4 + -8
                long r8 = r0 >> r4
                int r6 = (int) r8
                r3.C(r6)
                goto L_0x0051
            L_0x005e:
                int r2 = r2 + 1
                goto L_0x003a
            L_0x0061:
                if (r4 <= 0) goto L_0x006e
                int r11 = 8 - r4
                long r0 = r0 << r11
                int r11 = r7 >>> r4
                long r6 = (long) r11
                long r0 = r0 | r6
                int r11 = (int) r0
                r3.C(r11)
            L_0x006e:
                ve.i r11 = r3.T()
                byte[] r0 = r11.f26744a
                int r0 = r0.length
                r1 = 128(0x80, float:1.794E-43)
                r10.f(r0, r5, r1)
                ve.f r0 = r10.f24308a
                r0.m0(r11)
                goto L_0x008c
            L_0x0080:
                int r0 = r11.u()
                r10.f(r0, r5, r2)
                ve.f r0 = r10.f24308a
                r0.m0(r11)
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.d.b.d(ve.i):void");
        }

        public void e(List<c> list) throws IOException {
            int i10;
            int i11;
            if (this.f24310c) {
                int i12 = this.f24309b;
                if (i12 < this.f24311d) {
                    f(i12, 31, 32);
                }
                this.f24310c = false;
                this.f24309b = Integer.MAX_VALUE;
                f(this.f24311d, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = list.get(i13);
                i w10 = cVar.f24295a.w();
                i iVar = cVar.f24296b;
                Integer num = d.f24299b.get(w10);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (i11 > 1 && i11 < 8) {
                        c[] cVarArr = d.f24298a;
                        if (c.l(cVarArr[i11 - 1].f24296b, iVar)) {
                            i10 = i11;
                        } else if (c.l(cVarArr[i11].f24296b, iVar)) {
                            i10 = i11;
                            i11++;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i11 == -1) {
                    int i14 = this.f24313f + 1;
                    int length = this.f24312e.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        if (c.l(this.f24312e[i14].f24295a, w10)) {
                            if (c.l(this.f24312e[i14].f24296b, iVar)) {
                                i11 = d.f24298a.length + (i14 - this.f24313f);
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - this.f24313f) + d.f24298a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i11 != -1) {
                    f(i11, 127, 128);
                } else if (i10 == -1) {
                    this.f24308a.q0(64);
                    d(w10);
                    d(iVar);
                    c(cVar);
                } else {
                    i iVar2 = c.f24289d;
                    w10.getClass();
                    if (!w10.s(0, iVar2, 0, iVar2.f26744a.length) || c.f24294i.equals(w10)) {
                        f(i10, 63, 64);
                        d(iVar);
                        c(cVar);
                    } else {
                        f(i10, 15, 0);
                        d(iVar);
                    }
                }
            }
        }

        public void f(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f24308a.q0(i10 | i12);
                return;
            }
            this.f24308a.q0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f24308a.q0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f24308a.q0(i13);
        }
    }

    static {
        c cVar = new c(c.f24294i, "");
        int i10 = 0;
        i iVar = c.f24291f;
        i iVar2 = c.f24292g;
        i iVar3 = c.f24293h;
        i iVar4 = c.f24290e;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f24298a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        while (true) {
            c[] cVarArr2 = f24298a;
            if (i10 < cVarArr2.length) {
                if (!linkedHashMap.containsKey(cVarArr2[i10].f24295a)) {
                    linkedHashMap.put(cVarArr2[i10].f24295a, Integer.valueOf(i10));
                }
                i10++;
            } else {
                f24299b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static i a(i iVar) throws IOException {
        int u10 = iVar.u();
        int i10 = 0;
        while (i10 < u10) {
            byte m10 = iVar.m(i10);
            if (m10 < 65 || m10 > 90) {
                i10++;
            } else {
                StringBuilder a10 = android.support.v4.media.a.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                a10.append(iVar.x());
                throw new IOException(a10.toString());
            }
        }
        return iVar;
    }
}
