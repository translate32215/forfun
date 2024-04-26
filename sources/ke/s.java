package ke;

import j.f;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import le.c;

/* compiled from: HttpUrl */
public final class s {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f20781j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f20782a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20783b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20784c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20785d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20786e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f20787f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f20788g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f20789h;

    /* renamed from: i  reason: collision with root package name */
    public final String f20790i;

    /* compiled from: HttpUrl */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public String f20791a;

        /* renamed from: b  reason: collision with root package name */
        public String f20792b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f20793c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f20794d;

        /* renamed from: e  reason: collision with root package name */
        public int f20795e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f20796f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public List<String> f20797g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f20798h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f20796f = arrayList;
            arrayList.add("");
        }

        public s a() {
            if (this.f20791a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f20794d != null) {
                return new s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public a b(@Nullable String str) {
            this.f20797g = str != null ? s.q(s.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a c(String str) {
            if (str != null) {
                String c10 = c.c(s.m(str, 0, str.length(), false));
                if (c10 != null) {
                    this.f20794d = c10;
                    return this;
                }
                throw new IllegalArgumentException(f.a("unexpected host: ", str));
            }
            throw new NullPointerException("host == null");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0212, code lost:
            if (r1 <= 65535) goto L_0x021a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x02a3  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x035d  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x03a3  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x01e1 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ke.s.a d(@javax.annotation.Nullable ke.s r22, java.lang.String r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r10 = r23
                int r2 = r23.length()
                r8 = 0
                int r9 = le.c.v(r10, r8, r2)
                int r2 = r23.length()
                int r11 = le.c.w(r10, r9, r2)
                int r2 = r11 - r9
                r12 = 2
                r13 = 58
                r14 = -1
                if (r2 >= r12) goto L_0x0020
                goto L_0x0062
            L_0x0020:
                char r2 = r10.charAt(r9)
                r3 = 90
                r4 = 122(0x7a, float:1.71E-43)
                r5 = 65
                r6 = 97
                if (r2 < r6) goto L_0x0030
                if (r2 <= r4) goto L_0x0035
            L_0x0030:
                if (r2 < r5) goto L_0x0062
                if (r2 <= r3) goto L_0x0035
                goto L_0x0062
            L_0x0035:
                r2 = r9
            L_0x0036:
                int r2 = r2 + 1
                if (r2 >= r11) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r6) goto L_0x0042
                if (r7 <= r4) goto L_0x005f
            L_0x0042:
                if (r7 < r5) goto L_0x0046
                if (r7 <= r3) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r13) goto L_0x0062
                r15 = r2
                goto L_0x0064
            L_0x005f:
                r3 = 90
                goto L_0x0036
            L_0x0062:
                r2 = -1
                r15 = -1
            L_0x0064:
                if (r15 == r14) goto L_0x00ac
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007b
                java.lang.String r2 = "https"
                r0.f20791a = r2
                int r9 = r9 + 6
                goto L_0x00b2
            L_0x007b:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0090
                java.lang.String r2 = "http"
                r0.f20791a = r2
                int r9 = r9 + 5
                goto L_0x00b2
            L_0x0090:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
                java.lang.String r3 = r10.substring(r8, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ac:
                if (r1 == 0) goto L_0x03bd
                java.lang.String r2 = r1.f20782a
                r0.f20791a = r2
            L_0x00b2:
                r2 = 0
                r3 = r9
            L_0x00b4:
                r4 = 47
                r5 = 92
                if (r3 >= r11) goto L_0x00c7
                char r6 = r10.charAt(r3)
                if (r6 == r5) goto L_0x00c2
                if (r6 != r4) goto L_0x00c7
            L_0x00c2:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00b4
            L_0x00c7:
                r3 = 63
                r6 = 35
                if (r2 >= r12) goto L_0x010f
                if (r1 == 0) goto L_0x010f
                java.lang.String r7 = r1.f20782a
                java.lang.String r8 = r0.f20791a
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x00da
                goto L_0x010f
            L_0x00da:
                java.lang.String r2 = r22.i()
                r0.f20792b = r2
                java.lang.String r2 = r22.e()
                r0.f20793c = r2
                java.lang.String r2 = r1.f20785d
                r0.f20794d = r2
                int r2 = r1.f20786e
                r0.f20795e = r2
                java.util.List<java.lang.String> r2 = r0.f20796f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f20796f
                java.util.List r3 = r22.g()
                r2.addAll(r3)
                if (r9 == r11) goto L_0x0104
                char r2 = r10.charAt(r9)
                if (r2 != r6) goto L_0x010b
            L_0x0104:
                java.lang.String r1 = r22.h()
                r0.b(r1)
            L_0x010b:
                r17 = r11
                goto L_0x0256
            L_0x010f:
                int r9 = r9 + r2
                r1 = 0
                r2 = 0
                r14 = r9
                r1 = -1
                r12 = 0
                r15 = 0
            L_0x0116:
                java.lang.String r2 = "@/\\?#"
                int r9 = le.c.j(r10, r14, r11, r2)
                if (r9 == r11) goto L_0x0123
                char r2 = r10.charAt(r9)
                goto L_0x0124
            L_0x0123:
                r2 = -1
            L_0x0124:
                if (r2 == r1) goto L_0x01bf
                if (r2 == r6) goto L_0x01bf
                if (r2 == r4) goto L_0x01bf
                if (r2 == r5) goto L_0x01bf
                if (r2 == r3) goto L_0x01bf
                r1 = 64
                if (r2 == r1) goto L_0x0134
                goto L_0x01b2
            L_0x0134:
                java.lang.String r8 = "%40"
                if (r12 != 0) goto L_0x0182
                int r7 = le.c.i(r10, r14, r9, r13)
                r5 = 1
                r6 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r7
                r14 = r7
                r7 = r16
                r13 = r8
                r8 = r17
                r22 = r12
                r12 = r9
                r9 = r18
                java.lang.String r1 = ke.s.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r15 == 0) goto L_0x0166
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f20792b
                java.lang.String r1 = androidx.fragment.app.a.a(r2, r3, r13, r1)
            L_0x0166:
                r0.f20792b = r1
                if (r14 == r12) goto L_0x017e
                int r2 = r14 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r3 = r12
                java.lang.String r1 = ke.s.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.f20793c = r1
                r1 = 1
                goto L_0x0180
            L_0x017e:
                r1 = r22
            L_0x0180:
                r15 = 1
                goto L_0x01af
            L_0x0182:
                r13 = r8
                r22 = r12
                r12 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = r0.f20793c
                r9.append(r1)
                r9.append(r13)
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r13 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r12
                r14 = r9
                r9 = r13
                java.lang.String r1 = ke.s.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f20793c = r1
                r1 = r22
            L_0x01af:
                int r14 = r12 + 1
                r12 = r1
            L_0x01b2:
                r6 = 35
                r3 = 63
                r5 = 92
                r1 = -1
                r4 = 47
                r13 = 58
                goto L_0x0116
            L_0x01bf:
                r12 = r9
                r9 = r14
            L_0x01c1:
                if (r9 >= r12) goto L_0x01e1
                char r1 = r10.charAt(r9)
                r2 = 58
                if (r1 == r2) goto L_0x01df
                r3 = 91
                if (r1 == r3) goto L_0x01d1
                r1 = 1
                goto L_0x01dd
            L_0x01d1:
                r1 = 1
            L_0x01d2:
                int r9 = r9 + r1
                if (r9 >= r12) goto L_0x01dd
                char r3 = r10.charAt(r9)
                r4 = 93
                if (r3 != r4) goto L_0x01d2
            L_0x01dd:
                int r9 = r9 + r1
                goto L_0x01c1
            L_0x01df:
                r13 = r9
                goto L_0x01e2
            L_0x01e1:
                r13 = r12
            L_0x01e2:
                int r15 = r13 + 1
                r9 = 34
                if (r15 >= r12) goto L_0x023a
                r1 = 0
                java.lang.String r1 = ke.s.m(r10, r14, r13, r1)
                java.lang.String r1 = le.c.c(r1)
                r0.f20794d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r23
                r2 = r15
                r3 = r12
                r17 = r11
                r11 = 34
                r9 = r16
                java.lang.String r1 = ke.s.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0219 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0219 }
                if (r1 <= 0) goto L_0x0219
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x0219
                goto L_0x021a
            L_0x0215:
                r17 = r11
                r11 = 34
            L_0x0219:
                r1 = -1
            L_0x021a:
                r0.f20795e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0220
                goto L_0x0251
            L_0x0220:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
                java.lang.String r3 = r10.substring(r15, r12)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x023a:
                r17 = r11
                r11 = 34
                r1 = 0
                java.lang.String r1 = ke.s.m(r10, r14, r13, r1)
                java.lang.String r1 = le.c.c(r1)
                r0.f20794d = r1
                java.lang.String r1 = r0.f20791a
                int r1 = ke.s.d(r1)
                r0.f20795e = r1
            L_0x0251:
                java.lang.String r1 = r0.f20794d
                if (r1 == 0) goto L_0x03a3
                r9 = r12
            L_0x0256:
                java.lang.String r1 = "?#"
                r2 = r17
                int r1 = le.c.j(r10, r9, r2, r1)
                if (r9 != r1) goto L_0x0267
                r13 = r0
                r3 = r1
                r12 = r2
                r1 = r10
                r2 = r1
                goto L_0x0360
            L_0x0267:
                char r3 = r10.charAt(r9)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x028b
                r5 = 92
                if (r3 != r5) goto L_0x0276
                goto L_0x028b
            L_0x0276:
                java.util.List<java.lang.String> r3 = r0.f20796f
                int r5 = r3.size()
                int r5 = r5 + -1
                r3.set(r5, r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r13 = r9
                r2 = r10
                r4 = r3
                r1 = r2
                goto L_0x02a1
            L_0x028b:
                r3 = 1
                java.util.List<java.lang.String> r5 = r0.f20796f
                r5.clear()
                java.util.List<java.lang.String> r5 = r0.f20796f
                r5.add(r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r2 = r10
                r5 = 1
                r4 = r3
                r1 = r2
            L_0x029f:
                int r9 = r9 + r5
            L_0x02a0:
                r13 = r9
            L_0x02a1:
                if (r13 >= r4) goto L_0x035d
                java.lang.String r5 = "/\\"
                int r9 = le.c.j(r1, r13, r4, r5)
                if (r9 >= r4) goto L_0x02ad
                r5 = 1
                goto L_0x02ae
            L_0x02ad:
                r5 = 0
            L_0x02ae:
                r16 = 1
                r17 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                java.lang.String r15 = " \"<>^`{}|/\\?#"
                r12 = r1
                r14 = r9
                java.lang.String r12 = ke.s.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.String r13 = "."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02d3
                java.lang.String r13 = "%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02d1
                goto L_0x02d3
            L_0x02d1:
                r13 = 0
                goto L_0x02d4
            L_0x02d3:
                r13 = 1
            L_0x02d4:
                if (r13 == 0) goto L_0x02d8
                goto L_0x0358
            L_0x02d8:
                java.lang.String r13 = ".."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = "%2e."
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = ".%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = "%2e%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02f9
                goto L_0x02fb
            L_0x02f9:
                r13 = 0
                goto L_0x02fc
            L_0x02fb:
                r13 = 1
            L_0x02fc:
                if (r13 == 0) goto L_0x032c
                java.util.List<java.lang.String> r12 = r8.f20796f
                int r13 = r12.size()
                int r13 = r13 + -1
                java.lang.Object r12 = r12.remove(r13)
                java.lang.String r12 = (java.lang.String) r12
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0326
                java.util.List<java.lang.String> r12 = r8.f20796f
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L_0x0326
                java.util.List<java.lang.String> r12 = r8.f20796f
                int r13 = r12.size()
                int r13 = r13 + -1
                r12.set(r13, r6)
                goto L_0x0358
            L_0x0326:
                java.util.List<java.lang.String> r12 = r8.f20796f
                r12.add(r6)
                goto L_0x0358
            L_0x032c:
                java.util.List<java.lang.String> r13 = r8.f20796f
                int r14 = r13.size()
                int r14 = r14 + -1
                java.lang.Object r13 = r13.get(r14)
                java.lang.String r13 = (java.lang.String) r13
                boolean r13 = r13.isEmpty()
                if (r13 == 0) goto L_0x034c
                java.util.List<java.lang.String> r13 = r8.f20796f
                int r14 = r13.size()
                int r14 = r14 + -1
                r13.set(r14, r12)
                goto L_0x0351
            L_0x034c:
                java.util.List<java.lang.String> r13 = r8.f20796f
                r13.add(r12)
            L_0x0351:
                if (r5 == 0) goto L_0x0358
                java.util.List<java.lang.String> r12 = r8.f20796f
                r12.add(r6)
            L_0x0358:
                if (r5 == 0) goto L_0x02a0
                r5 = 1
                goto L_0x029f
            L_0x035d:
                r13 = r7
                r1 = r10
                r12 = r11
            L_0x0360:
                if (r3 >= r12) goto L_0x0387
                char r4 = r2.charAt(r3)
                r5 = 63
                if (r4 != r5) goto L_0x0387
                r14 = 35
                int r15 = le.c.i(r2, r3, r12, r14)
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 1
                r11 = 0
                java.lang.String r6 = " \"'<>#"
                r3 = r1
                r5 = r15
                java.lang.String r3 = ke.s.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r3 = ke.s.q(r3)
                r13.f20797g = r3
                r3 = r15
                goto L_0x0389
            L_0x0387:
                r14 = 35
            L_0x0389:
                if (r3 >= r12) goto L_0x03a2
                char r2 = r2.charAt(r3)
                if (r2 != r14) goto L_0x03a2
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r6 = ""
                r3 = r1
                r5 = r12
                java.lang.String r1 = ke.s.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.f20798h = r1
            L_0x03a2:
                return r13
            L_0x03a3:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL host: \""
                java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
                java.lang.String r3 = r10.substring(r14, r13)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x03bd:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                goto L_0x03c6
            L_0x03c5:
                throw r1
            L_0x03c6:
                goto L_0x03c5
            */
            throw new UnsupportedOperationException("Method not decompiled: ke.s.a.d(ke.s, java.lang.String):ke.s$a");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f20791a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f20792b.isEmpty() || !this.f20793c.isEmpty()) {
                sb2.append(this.f20792b);
                if (!this.f20793c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f20793c);
                }
                sb2.append('@');
            }
            String str2 = this.f20794d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f20794d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f20794d);
                }
            }
            int i10 = this.f20795e;
            if (!(i10 == -1 && this.f20791a == null)) {
                if (i10 == -1) {
                    i10 = s.d(this.f20791a);
                }
                String str3 = this.f20791a;
                if (str3 == null || i10 != s.d(str3)) {
                    sb2.append(':');
                    sb2.append(i10);
                }
            }
            List<String> list = this.f20796f;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append('/');
                sb2.append(list.get(i11));
            }
            if (this.f20797g != null) {
                sb2.append('?');
                s.j(sb2, this.f20797g);
            }
            if (this.f20798h != null) {
                sb2.append('#');
                sb2.append(this.f20798h);
            }
            return sb2.toString();
        }
    }

    public s(a aVar) {
        this.f20782a = aVar.f20791a;
        this.f20783b = n(aVar.f20792b, false);
        this.f20784c = n(aVar.f20793c, false);
        this.f20785d = aVar.f20794d;
        int i10 = aVar.f20795e;
        this.f20786e = i10 == -1 ? d(aVar.f20791a) : i10;
        this.f20787f = o(aVar.f20796f, false);
        List<String> list = aVar.f20797g;
        String str = null;
        this.f20788g = list != null ? o(list, true) : null;
        String str2 = aVar.f20798h;
        this.f20789h = str2 != null ? m(str2, 0, str2.length(), false) : str;
        this.f20790i = aVar.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        String str3 = str;
        int i12 = i11;
        String str4 = str2;
        Charset charset2 = charset;
        int i13 = i10;
        while (i13 < i12) {
            int codePointAt = str3.codePointAt(i13);
            int i14 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z10 || (z11 && !p(str3, i13, i12)))) || (codePointAt == 43 && z12)))) {
                ve.f fVar = new ve.f();
                fVar.x0(str3, i10, i13);
                ve.f fVar2 = null;
                while (i13 < i12) {
                    int codePointAt2 = str3.codePointAt(i13);
                    if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z12) {
                            fVar.w0(z10 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z13) || str4.indexOf(codePointAt2) != i14 || (codePointAt2 == 37 && (!z10 || (z11 && !p(str3, i13, i12)))))) {
                            if (fVar2 == null) {
                                fVar2 = new ve.f();
                            }
                            if (charset2 == null || charset2.equals(c.f21269i)) {
                                fVar2.y0(codePointAt2);
                            } else {
                                fVar2.v0(str3, i13, Character.charCount(codePointAt2) + i13, charset2);
                            }
                            while (!fVar2.B()) {
                                byte readByte = fVar2.readByte() & 255;
                                fVar.q0(37);
                                char[] cArr = f20781j;
                                fVar.q0(cArr[(readByte >> 4) & 15]);
                                fVar.q0(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.y0(codePointAt2);
                        }
                    }
                    i13 += Character.charCount(codePointAt2);
                    i14 = -1;
                }
                return fVar.g0();
            }
            i13 += Character.charCount(codePointAt);
        }
        int i15 = i10;
        return str.substring(i10, i11);
    }

    public static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, (Charset) null);
    }

    public static String c(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, (Charset) null);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static String m(String str, int i10, int i11, boolean z10) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z10)) {
                ve.f fVar = new ve.f();
                fVar.x0(str, i10, i13);
                while (i13 < i11) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i11) {
                        int g10 = c.g(str.charAt(i13 + 1));
                        int g11 = c.g(str.charAt(i12));
                        if (!(g10 == -1 || g11 == -1)) {
                            fVar.q0((g10 << 4) + g11);
                            i13 = i12;
                            i13 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z10) {
                        fVar.q0(32);
                        i13 += Character.charCount(codePointAt);
                    }
                    fVar.y0(codePointAt);
                    i13 += Character.charCount(codePointAt);
                }
                return fVar.g0();
            }
            i13++;
        }
        return str.substring(i10, i11);
    }

    public static String n(String str, boolean z10) {
        return m(str, 0, str.length(), z10);
    }

    public static boolean p(String str, int i10, int i11) {
        int i12 = i10 + 2;
        if (i12 >= i11 || str.charAt(i10) != '%' || c.g(str.charAt(i10 + 1)) == -1 || c.g(str.charAt(i12)) == -1) {
            return false;
        }
        return true;
    }

    public static List<String> q(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public String e() {
        if (this.f20784c.isEmpty()) {
            return "";
        }
        int indexOf = this.f20790i.indexOf(64);
        return this.f20790i.substring(this.f20790i.indexOf(58, this.f20782a.length() + 3) + 1, indexOf);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f20790i.equals(this.f20790i);
    }

    public String f() {
        int indexOf = this.f20790i.indexOf(47, this.f20782a.length() + 3);
        String str = this.f20790i;
        return this.f20790i.substring(indexOf, c.j(str, indexOf, str.length(), "?#"));
    }

    public List<String> g() {
        int indexOf = this.f20790i.indexOf(47, this.f20782a.length() + 3);
        String str = this.f20790i;
        int j10 = c.j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j10) {
            int i10 = indexOf + 1;
            int i11 = c.i(this.f20790i, i10, j10, '/');
            arrayList.add(this.f20790i.substring(i10, i11));
            indexOf = i11;
        }
        return arrayList;
    }

    @Nullable
    public String h() {
        if (this.f20788g == null) {
            return null;
        }
        int indexOf = this.f20790i.indexOf(63) + 1;
        String str = this.f20790i;
        return this.f20790i.substring(indexOf, c.i(str, indexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.f20790i.hashCode();
    }

    public String i() {
        if (this.f20783b.isEmpty()) {
            return "";
        }
        int length = this.f20782a.length() + 3;
        String str = this.f20790i;
        return this.f20790i.substring(length, c.j(str, length, str.length(), ":@"));
    }

    public a k() {
        String str;
        a aVar = new a();
        aVar.f20791a = this.f20782a;
        aVar.f20792b = i();
        aVar.f20793c = e();
        aVar.f20794d = this.f20785d;
        aVar.f20795e = this.f20786e != d(this.f20782a) ? this.f20786e : -1;
        aVar.f20796f.clear();
        aVar.f20796f.addAll(g());
        aVar.b(h());
        if (this.f20789h == null) {
            str = null;
        } else {
            str = this.f20790i.substring(this.f20790i.indexOf(35) + 1);
        }
        aVar.f20798h = str;
        return aVar;
    }

    @Nullable
    public a l(String str) {
        try {
            a aVar = new a();
            aVar.d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> o(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? m(str, 0, str.length(), z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public URI r() {
        a k10 = k();
        int size = k10.f20796f.size();
        for (int i10 = 0; i10 < size; i10++) {
            k10.f20796f.set(i10, b(k10.f20796f.get(i10), "[]", true, true, false, true));
        }
        List<String> list = k10.f20797g;
        if (list != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str = k10.f20797g.get(i11);
                if (str != null) {
                    k10.f20797g.set(i11, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = k10.f20798h;
        if (str2 != null) {
            k10.f20798h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = k10.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f20790i;
    }
}
