package oe;

import ke.d0;
import ve.i;

/* compiled from: HttpHeaders */
public final class e {
    static {
        i.i("\"\\");
        i.i("\t ,=");
    }

    public static long a(d0 d0Var) {
        String c10 = d0Var.f20669f.c("Content-Length");
        if (c10 != null) {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static boolean b(d0 d0Var) {
        if (d0Var.f20664a.f20881b.equals("HEAD")) {
            return false;
        }
        int i10 = d0Var.f20666c;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(d0Var) == -1) {
            String c10 = d0Var.f20669f.c("Transfer-Encoding");
            if (c10 == null) {
                c10 = null;
            }
            if ("chunked".equalsIgnoreCase(c10)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static int c(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c2, code lost:
        if ((r0.equals(r10) || (r0.endsWith(r10) && r0.charAt((r0.length() - r10.length()) - 1) == '.' && !le.c.f21277q.matcher(r0).matches())) == false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f3, code lost:
        if (r13 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0202, code lost:
        if (r13 == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0204, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r20 <= 0) goto L_0x00f4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x020c */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02f2 A[LOOP:8: B:192:0x02ef->B:194:0x02f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(ke.k r34, ke.s r35, ke.r r36) {
        /*
            r0 = r36
            ke.k r1 = ke.k.f20762a
            r2 = r34
            if (r2 != r1) goto L_0x0009
            return
        L_0x0009:
            java.util.regex.Pattern r1 = ke.j.f20749j
            java.lang.String r1 = "Set-Cookie"
            int r3 = r36.g()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0014:
            if (r6 >= r3) goto L_0x0032
            java.lang.String r8 = r0.d(r6)
            boolean r8 = r1.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x002f
            if (r7 != 0) goto L_0x0028
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 2
            r7.<init>(r8)
        L_0x0028:
            java.lang.String r8 = r0.h(r6)
            r7.add(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0032:
            if (r7 == 0) goto L_0x0039
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            goto L_0x003d
        L_0x0039:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x003d:
            r1 = r0
            int r3 = r1.size()
            r6 = 0
            r7 = 0
        L_0x0044:
            if (r6 >= r3) goto L_0x035e
            java.lang.Object r0 = r1.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            int r11 = r8.length()
            r12 = 59
            int r0 = le.c.i(r8, r5, r11, r12)
            r13 = 61
            int r14 = le.c.i(r8, r5, r0, r13)
            if (r14 != r0) goto L_0x0067
        L_0x0063:
            r8 = r35
            goto L_0x034b
        L_0x0067:
            java.lang.String r16 = le.c.y(r8, r5, r14)
            boolean r15 = r16.isEmpty()
            if (r15 != 0) goto L_0x0063
            int r15 = le.c.q(r16)
            r4 = -1
            if (r15 == r4) goto L_0x0079
            goto L_0x0063
        L_0x0079:
            int r14 = r14 + 1
            java.lang.String r17 = le.c.y(r8, r14, r0)
            int r14 = le.c.q(r17)
            if (r14 == r4) goto L_0x0086
            goto L_0x0063
        L_0x0086:
            int r0 = r0 + 1
            r18 = -1
            r4 = 1
            r20 = r18
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r28 = 0
            r29 = 0
        L_0x009e:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r11) goto L_0x0154
            int r14 = le.c.i(r8, r0, r11, r12)
            int r15 = le.c.i(r8, r0, r14, r13)
            java.lang.String r0 = le.c.y(r8, r0, r15)
            if (r15 >= r14) goto L_0x00bc
            int r15 = r15 + 1
            java.lang.String r15 = le.c.y(r8, r15, r14)
            goto L_0x00be
        L_0x00bc:
            java.lang.String r15 = ""
        L_0x00be:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00cf
            int r0 = r15.length()     // Catch:{ IllegalArgumentException -> 0x014e }
            long r26 = ke.j.b(r15, r5, r0)     // Catch:{ IllegalArgumentException -> 0x014e }
            goto L_0x00f9
        L_0x00cf:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00fd
            long r20 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00e2 }
            r30 = 0
            int r0 = (r20 > r30 ? 1 : (r20 == r30 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            goto L_0x00f4
        L_0x00e2:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r15.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "-"
            boolean r0 = r15.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00f7
        L_0x00f4:
            r20 = r32
            goto L_0x00f9
        L_0x00f7:
            r20 = r30
        L_0x00f9:
            r25 = 1
            goto L_0x014e
        L_0x00fc:
            throw r12     // Catch:{  }
        L_0x00fd:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x012e
            java.lang.String r0 = "."
            boolean r12 = r15.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x014e }
            if (r12 != 0) goto L_0x0128
            boolean r0 = r15.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x014e }
            if (r0 == 0) goto L_0x0117
            java.lang.String r15 = r15.substring(r4)     // Catch:{ IllegalArgumentException -> 0x014e }
        L_0x0117:
            java.lang.String r0 = le.c.c(r15)     // Catch:{ IllegalArgumentException -> 0x014e }
            if (r0 == 0) goto L_0x0122
            r28 = r0
            r24 = 0
            goto L_0x014e
        L_0x0122:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x014e }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x014e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x014e }
        L_0x0128:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x014e }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x014e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x014e }
        L_0x012e:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0139
            r29 = r15
            goto L_0x014e
        L_0x0139:
            java.lang.String r12 = "secure"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0144
            r22 = 1
            goto L_0x014e
        L_0x0144:
            java.lang.String r12 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x014e
            r23 = 1
        L_0x014e:
            int r0 = r14 + 1
            r12 = 59
            goto L_0x009e
        L_0x0154:
            int r0 = (r20 > r32 ? 1 : (r20 == r32 ? 0 : -1))
            if (r0 != 0) goto L_0x015d
            r8 = r35
            r18 = r32
            goto L_0x018c
        L_0x015d:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0188
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x016e
            r11 = 1000(0x3e8, double:4.94E-321)
            long r30 = r20 * r11
        L_0x016e:
            long r30 = r9 + r30
            int r0 = (r30 > r9 ? 1 : (r30 == r9 ? 0 : -1))
            r8 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r0 < 0) goto L_0x0183
            int r0 = (r30 > r8 ? 1 : (r30 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
            goto L_0x0183
        L_0x017e:
            r8 = r35
            r18 = r30
            goto L_0x018c
        L_0x0183:
            r18 = r8
            r8 = r35
            goto L_0x018c
        L_0x0188:
            r8 = r35
            r18 = r26
        L_0x018c:
            java.lang.String r0 = r8.f20785d
            r9 = 46
            r10 = r28
            if (r10 != 0) goto L_0x0196
            r10 = r0
            goto L_0x01c6
        L_0x0196:
            boolean r11 = r0.equals(r10)
            if (r11 == 0) goto L_0x019d
            goto L_0x01bf
        L_0x019d:
            boolean r11 = r0.endsWith(r10)
            if (r11 == 0) goto L_0x01c1
            int r11 = r0.length()
            int r12 = r10.length()
            int r11 = r11 - r12
            int r11 = r11 - r4
            char r11 = r0.charAt(r11)
            if (r11 != r9) goto L_0x01c1
            java.util.regex.Pattern r11 = le.c.f21277q
            java.util.regex.Matcher r11 = r11.matcher(r0)
            boolean r11 = r11.matches()
            if (r11 != 0) goto L_0x01c1
        L_0x01bf:
            r11 = 1
            goto L_0x01c2
        L_0x01c1:
            r11 = 0
        L_0x01c2:
            if (r11 != 0) goto L_0x01c6
            goto L_0x034b
        L_0x01c6:
            int r0 = r0.length()
            int r11 = r10.length()
            if (r0 == r11) goto L_0x031a
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23724h
            r11.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r10)
            java.lang.String r12 = "\\."
            java.lang.String[] r12 = r0.split(r12)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f23725a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x021d
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f23725a
            boolean r0 = r0.compareAndSet(r5, r4)
            if (r0 == 0) goto L_0x021d
            r13 = 0
        L_0x01f0:
            r11.b()     // Catch:{ InterruptedIOException -> 0x020c, IOException -> 0x01f8 }
            if (r13 == 0) goto L_0x022a
            goto L_0x0204
        L_0x01f6:
            r0 = move-exception
            goto L_0x0213
        L_0x01f8:
            r0 = move-exception
            r14 = r0
            re.f r0 = re.f.f24794a     // Catch:{ all -> 0x01f6 }
            r15 = 5
            java.lang.String r9 = "Failed to read public suffix list"
            r0.l(r15, r9, r14)     // Catch:{ all -> 0x01f6 }
            if (r13 == 0) goto L_0x022a
        L_0x0204:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x022a
        L_0x020c:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x01f6 }
            r9 = 46
            r13 = 1
            goto L_0x01f0
        L_0x0213:
            if (r13 == 0) goto L_0x021c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x021c:
            throw r0
        L_0x021d:
            java.util.concurrent.CountDownLatch r0 = r11.f23726b     // Catch:{ InterruptedException -> 0x0223 }
            r0.await()     // Catch:{ InterruptedException -> 0x0223 }
            goto L_0x022a
        L_0x0223:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x022a:
            monitor-enter(r11)
            byte[] r0 = r11.f23727c     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x030f
            monitor-exit(r11)     // Catch:{ all -> 0x0317 }
            int r0 = r12.length
            byte[][] r9 = new byte[r0][]
            r13 = 0
        L_0x0234:
            int r14 = r12.length
            if (r13 >= r14) goto L_0x0244
            r14 = r12[r13]
            java.nio.charset.Charset r15 = le.c.f21269i
            byte[] r14 = r14.getBytes(r15)
            r9[r13] = r14
            int r13 = r13 + 1
            goto L_0x0234
        L_0x0244:
            r13 = 0
        L_0x0245:
            if (r13 >= r0) goto L_0x0253
            byte[] r14 = r11.f23727c
            java.lang.String r14 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r14, r9, r13)
            if (r14 == 0) goto L_0x0250
            goto L_0x0254
        L_0x0250:
            int r13 = r13 + 1
            goto L_0x0245
        L_0x0253:
            r14 = 0
        L_0x0254:
            if (r0 <= r4) goto L_0x0271
            java.lang.Object r13 = r9.clone()
            byte[][] r13 = (byte[][]) r13
            r15 = 0
        L_0x025d:
            int r5 = r13.length
            int r5 = r5 - r4
            if (r15 >= r5) goto L_0x0271
            byte[] r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23721e
            r13[r15] = r5
            byte[] r5 = r11.f23727c
            java.lang.String r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r5, r13, r15)
            if (r5 == 0) goto L_0x026e
            goto L_0x0272
        L_0x026e:
            int r15 = r15 + 1
            goto L_0x025d
        L_0x0271:
            r5 = 0
        L_0x0272:
            if (r5 == 0) goto L_0x0285
            r13 = 0
        L_0x0275:
            int r15 = r0 + -1
            if (r13 >= r15) goto L_0x0285
            byte[] r15 = r11.f23728d
            java.lang.String r15 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r15, r9, r13)
            if (r15 == 0) goto L_0x0282
            goto L_0x0286
        L_0x0282:
            int r13 = r13 + 1
            goto L_0x0275
        L_0x0285:
            r15 = 0
        L_0x0286:
            if (r15 == 0) goto L_0x02a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "!"
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "\\."
            java.lang.String[] r0 = r0.split(r5)
            goto L_0x02c3
        L_0x02a0:
            if (r14 != 0) goto L_0x02a7
            if (r5 != 0) goto L_0x02a7
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23723g
            goto L_0x02c3
        L_0x02a7:
            if (r14 == 0) goto L_0x02b0
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r14.split(r0)
            goto L_0x02b2
        L_0x02b0:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23722f
        L_0x02b2:
            if (r5 == 0) goto L_0x02bb
            java.lang.String r9 = "\\."
            java.lang.String[] r5 = r5.split(r9)
            goto L_0x02bd
        L_0x02bb:
            java.lang.String[] r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23722f
        L_0x02bd:
            int r9 = r0.length
            int r11 = r5.length
            if (r9 <= r11) goto L_0x02c2
            goto L_0x02c3
        L_0x02c2:
            r0 = r5
        L_0x02c3:
            int r5 = r12.length
            int r9 = r0.length
            r11 = 33
            if (r5 != r9) goto L_0x02d4
            r5 = 0
            r9 = r0[r5]
            char r9 = r9.charAt(r5)
            if (r9 == r11) goto L_0x02d5
            r0 = 0
            goto L_0x030b
        L_0x02d4:
            r5 = 0
        L_0x02d5:
            r9 = r0[r5]
            char r9 = r9.charAt(r5)
            if (r9 != r11) goto L_0x02e0
            int r5 = r12.length
            int r0 = r0.length
            goto L_0x02e3
        L_0x02e0:
            int r5 = r12.length
            int r0 = r0.length
            int r0 = r0 + r4
        L_0x02e3:
            int r5 = r5 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "\\."
            java.lang.String[] r9 = r10.split(r9)
        L_0x02ef:
            int r11 = r9.length
            if (r5 >= r11) goto L_0x02ff
            r11 = r9[r5]
            r0.append(r11)
            r11 = 46
            r0.append(r11)
            int r5 = r5 + 1
            goto L_0x02ef
        L_0x02ff:
            int r5 = r0.length()
            int r5 = r5 - r4
            r0.deleteCharAt(r5)
            java.lang.String r0 = r0.toString()
        L_0x030b:
            if (r0 != 0) goto L_0x031a
            r5 = 0
            goto L_0x034b
        L_0x030f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x0317 }
            throw r0     // Catch:{ all -> 0x0317 }
        L_0x0317:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0317 }
            throw r0
        L_0x031a:
            r4 = r29
            if (r4 == 0) goto L_0x032b
            java.lang.String r0 = "/"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0327
            goto L_0x032b
        L_0x0327:
            r21 = r4
            r5 = 0
            goto L_0x0342
        L_0x032b:
            java.lang.String r0 = r35.f()
            r4 = 47
            int r4 = r0.lastIndexOf(r4)
            if (r4 == 0) goto L_0x033d
            r5 = 0
            java.lang.String r0 = r0.substring(r5, r4)
            goto L_0x0340
        L_0x033d:
            r5 = 0
            java.lang.String r0 = "/"
        L_0x0340:
            r21 = r0
        L_0x0342:
            ke.j r0 = new ke.j
            r15 = r0
            r20 = r10
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x034c
        L_0x034b:
            r0 = 0
        L_0x034c:
            if (r0 != 0) goto L_0x034f
            goto L_0x035a
        L_0x034f:
            if (r7 != 0) goto L_0x0357
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = r4
        L_0x0357:
            r7.add(r0)
        L_0x035a:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x035e:
            if (r7 == 0) goto L_0x0365
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            goto L_0x0369
        L_0x0365:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0369:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0370
            return
        L_0x0370:
            r34.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.e.d(ke.k, ke.s, ke.r):void");
    }

    public static int e(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }
}
