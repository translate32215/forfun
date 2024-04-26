package le;

import androidx.activity.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ke.e0;
import ke.r;
import ke.s;
import ke.u;
import q.b;
import ve.f;
import ve.h;
import ve.i;
import ve.y;

/* compiled from: Util */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21261a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f21262b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f21263c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f21264d = i.b("efbbbf");

    /* renamed from: e  reason: collision with root package name */
    public static final i f21265e = i.b("feff");

    /* renamed from: f  reason: collision with root package name */
    public static final i f21266f = i.b("fffe");

    /* renamed from: g  reason: collision with root package name */
    public static final i f21267g = i.b("0000ffff");

    /* renamed from: h  reason: collision with root package name */
    public static final i f21268h = i.b("ffff0000");

    /* renamed from: i  reason: collision with root package name */
    public static final Charset f21269i = Charset.forName("UTF-8");

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f21270j = Charset.forName("UTF-16BE");

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f21271k = Charset.forName("UTF-16LE");

    /* renamed from: l  reason: collision with root package name */
    public static final Charset f21272l = Charset.forName("UTF-32BE");

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f21273m = Charset.forName("UTF-32LE");

    /* renamed from: n  reason: collision with root package name */
    public static final TimeZone f21274n = TimeZone.getTimeZone("GMT");

    /* renamed from: o  reason: collision with root package name */
    public static final Comparator<String> f21275o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final Method f21276p;

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f21277q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* compiled from: Util */
    public class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        f21261a = bArr;
        f fVar = new f();
        fVar.n0(bArr);
        long j10 = (long) 0;
        Method method = null;
        f21263c = new e0.a((u) null, j10, fVar);
        d(j10, j10, j10);
        Charset.forName("ISO-8859-1");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f21276p = method;
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset b(h hVar, Charset charset) throws IOException {
        i iVar = f21264d;
        if (hVar.R(0, iVar)) {
            hVar.b((long) iVar.f26744a.length);
            return f21269i;
        }
        i iVar2 = f21265e;
        if (hVar.R(0, iVar2)) {
            hVar.b((long) iVar2.f26744a.length);
            return f21270j;
        }
        i iVar3 = f21266f;
        if (hVar.R(0, iVar3)) {
            hVar.b((long) iVar3.f26744a.length);
            return f21271k;
        }
        i iVar4 = f21267g;
        if (hVar.R(0, iVar4)) {
            hVar.b((long) iVar4.f26744a.length);
            return f21272l;
        }
        i iVar5 = f21268h;
        if (!hVar.R(0, iVar5)) {
            return charset;
        }
        hVar.b((long) iVar5.f26744a.length);
        return f21273m;
    }

    public static String c(String str) {
        InetAddress inetAddress;
        int i10 = -1;
        boolean z10 = true;
        int i11 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = h(str, 0, str.length());
            } else {
                inetAddress = h(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i10 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                f fVar = new f();
                while (i11 < address.length) {
                    if (i11 == i10) {
                        fVar.q0(58);
                        i11 += i13;
                        if (i11 == 16) {
                            fVar.q0(58);
                        }
                    } else {
                        if (i11 > 0) {
                            fVar.q0(58);
                        }
                        fVar.k((long) (((address[i11] & 255) << 8) | (address[i11 + 1] & 255)));
                        i11 += 2;
                    }
                }
                return fVar.g0();
            }
            throw new AssertionError(b.a("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i16 = 0;
            while (true) {
                if (i16 >= lowerCase.length()) {
                    z10 = false;
                    break;
                }
                char charAt = lowerCase.charAt(i16);
                if (charAt <= 31) {
                    break;
                } else if (charAt >= 127) {
                    break;
                } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    break;
                } else {
                    i16++;
                }
            }
            if (z10) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void d(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!s(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static int g(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress h(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d5
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0032
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r0.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0032
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L_0x002f
            goto L_0x00d5
        L_0x002f:
            r9 = r11
            goto L_0x00a2
        L_0x0032:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r0.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = r0.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x0094
            if (r11 != r2) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            if (r11 == r6) goto L_0x005e
            char r15 = r0.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            int r9 = r9 + 1
        L_0x005e:
            r14 = r9
            r15 = 0
        L_0x0060:
            if (r14 >= r1) goto L_0x0082
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 <= r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            if (r15 != 0) goto L_0x0074
            if (r9 == r14) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0060
        L_0x0082:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r12
            if (r11 == r6) goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d5
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00b8
            char r4 = r0.charAt(r6)
            int r4 = g(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d4
            if (r4 <= r12) goto L_0x00bf
            goto L_0x00d4
        L_0x00bf:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d4:
            return r10
        L_0x00d5:
            r0 = 16
            if (r7 == r0) goto L_0x00eb
            r1 = -1
            if (r8 != r1) goto L_0x00dd
            return r10
        L_0x00dd:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00eb:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f0 }
            return r0
        L_0x00f0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            goto L_0x00f7
        L_0x00f6:
            throw r0
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: le.c.h(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int i(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int j(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean k(y yVar, int i10, TimeUnit timeUnit) {
        try {
            return u(yVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String m(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String n(s sVar, boolean z10) {
        String str;
        if (sVar.f20785d.contains(":")) {
            str = e.a(android.support.v4.media.a.a("["), sVar.f20785d, "]");
        } else {
            str = sVar.f20785d;
        }
        if (!z10 && sVar.f20786e == s.d(sVar.f20782a)) {
            return str;
        }
        StringBuilder a10 = t.f.a(str, ":");
        a10.append(sVar.f20786e);
        return a10.toString();
    }

    public static <T> List<T> o(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> p(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int q(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static String[] r(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean s(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean t(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean u(y yVar, int i10, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c10 = yVar.e().e() ? yVar.e().c() - nanoTime : Long.MAX_VALUE;
        yVar.e().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            f fVar = new f();
            while (yVar.a0(fVar, 8192) != -1) {
                fVar.a();
            }
            if (c10 == Long.MAX_VALUE) {
                yVar.e().a();
            } else {
                yVar.e().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                yVar.e().a();
            } else {
                yVar.e().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                yVar.e().a();
            } else {
                yVar.e().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int v(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int w(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static r x(List<qe.c> list) {
        r.a aVar = new r.a();
        for (qe.c next : list) {
            a.f21259a.a(aVar, next.f24295a.x(), next.f24296b.x());
        }
        return new r(aVar);
    }

    public static String y(String str, int i10, int i11) {
        int v10 = v(str, i10, i11);
        return str.substring(v10, w(str, v10, i11));
    }
}
