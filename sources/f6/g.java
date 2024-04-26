package f6;

import android.net.Uri;
import android.util.Base64;
import ba.y;
import c5.f;
import com.google.android.exoplayer2.upstream.p;
import f6.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.j;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import v6.c0;
import v6.e0;
import x4.m0;

/* compiled from: HlsPlaylistParser */
public final class g implements p.a<f> {
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = b("AUTOSELECT");
    public static final Pattern U = b("DEFAULT");
    public static final Pattern V = b("FORCED");
    public static final Pattern W = b("INDEPENDENT");
    public static final Pattern X = b("GAP");
    public static final Pattern Y = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f18219a0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f18220c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f18221d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f18222e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f18223f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f18224g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f18225h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f18226i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f18227j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f18228k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f18229l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f18230m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f18231n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f18232o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f18233p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f18234q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f18235r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f18236s = b("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f18237t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f18238u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f18239v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f18240w = b("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f18241x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f18242y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f18243z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a  reason: collision with root package name */
    public final d f18244a;

    /* renamed from: b  reason: collision with root package name */
    public final e f18245b;

    /* compiled from: HlsPlaylistParser */
    public static final class a extends IOException {
    }

    /* compiled from: HlsPlaylistParser */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final BufferedReader f18246a;

        /* renamed from: b  reason: collision with root package name */
        public final Queue<String> f18247b;

        /* renamed from: c  reason: collision with root package name */
        public String f18248c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f18247b = queue;
            this.f18246a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String trim;
            if (this.f18248c != null) {
                return true;
            }
            if (!this.f18247b.isEmpty()) {
                String poll = this.f18247b.poll();
                poll.getClass();
                this.f18248c = poll;
                return true;
            }
            do {
                String readLine = this.f18246a.readLine();
                this.f18248c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f18248c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f18248c;
                this.f18248c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public g() {
        this.f18244a = d.f18157n;
        this.f18245b = null;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }

    public static f c(String str, f.b[] bVarArr) {
        f.b[] bVarArr2 = new f.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            f.b bVar = bVarArr[i10];
            bVarArr2[i10] = new f.b(bVar.f4320b, bVar.f4321c, bVar.f4322d, (byte[]) null);
        }
        return new f(str, true, bVarArr2);
    }

    public static String d(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    public static double e(String str, Pattern pattern) throws m0 {
        return Double.parseDouble(q(str, pattern, Collections.emptyMap()));
    }

    public static f.b f(String str, String str2, Map<String, String> map) throws m0 {
        String o10 = o(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String q10 = q(str, K, map);
            return new f.b(x4.f.f27569d, (String) null, "video/mp4", Base64.decode(q10.substring(q10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new f.b(x4.f.f27569d, (String) null, "hls", e0.D(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(o10)) {
                return null;
            }
            String q11 = q(str, K, map);
            byte[] decode = Base64.decode(q11.substring(q11.indexOf(44)), 0);
            UUID uuid = x4.f.f27570e;
            return new f.b(uuid, (String) null, "video/mp4", j.a(uuid, decode));
        }
    }

    public static String g(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int h(String str, Pattern pattern) throws m0 {
        return Integer.parseInt(q(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0134, code lost:
        if (r6 > 0) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f6.d i(f6.g.b r34, java.lang.String r35) throws java.io.IOException {
        /*
            r1 = r35
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            r9 = 0
            r10 = 0
        L_0x0038:
            boolean r13 = r34.a()
            java.lang.String r14 = "application/x-mpegURL"
            if (r13 == 0) goto L_0x0207
            java.lang.String r13 = r34.b()
            java.lang.String r15 = "#EXT"
            boolean r15 = r13.startsWith(r15)
            if (r15 == 0) goto L_0x004f
            r8.add(r13)
        L_0x004f:
            java.lang.String r15 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r15 = r13.startsWith(r15)
            r16 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0072
            java.util.regex.Pattern r10 = P
            java.lang.String r10 = q(r13, r10, r11)
            java.util.regex.Pattern r14 = Y
            java.lang.String r13 = q(r13, r14, r11)
            r11.put(r10, r13)
        L_0x006e:
            r17 = r7
            goto L_0x00d7
        L_0x0072:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x008c
            r10 = 1
            r1 = r0
            r31 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r17 = r7
            r27 = r8
            r26 = r12
            goto L_0x01ec
        L_0x008c:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0098
            r3.add(r13)
            goto L_0x006e
        L_0x0098:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x00ca
            java.util.regex.Pattern r10 = I
            java.lang.String r14 = "identity"
            java.lang.String r10 = o(r13, r10, r14, r11)
            c5.f$b r10 = f(r13, r10, r11)
            if (r10 == 0) goto L_0x006e
            java.util.regex.Pattern r14 = H
            java.lang.String r13 = q(r13, r14, r11)
            java.lang.String r13 = g(r13)
            c5.f r14 = new c5.f
            r15 = 1
            r17 = r7
            c5.f$b[] r7 = new c5.f.b[r15]
            r18 = 0
            r7[r18] = r10
            r14.<init>(r13, r15, r7)
            r12.add(r14)
            goto L_0x00d7
        L_0x00ca:
            r17 = r7
            java.lang.String r7 = "#EXT-X-STREAM-INF"
            boolean r7 = r13.startsWith(r7)
            if (r7 != 0) goto L_0x00e8
            if (r15 == 0) goto L_0x00d7
            goto L_0x00e8
        L_0x00d7:
            r1 = r0
            r31 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r27 = r8
            r26 = r12
            r10 = r16
            goto L_0x01ec
        L_0x00e8:
            java.lang.String r7 = "CLOSED-CAPTIONS=NONE"
            boolean r7 = r13.contains(r7)
            r7 = r7 | r9
            if (r15 == 0) goto L_0x00f4
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00f5
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            java.util.regex.Pattern r10 = f18225h
            int r10 = h(r13, r10)
            r25 = r7
            java.util.regex.Pattern r7 = f18220c
            r26 = r12
            r12 = -1
            int r7 = m(r13, r7, r12)
            java.util.regex.Pattern r12 = f18227j
            java.lang.String r12 = p(r13, r12, r11)
            r27 = r8
            java.util.regex.Pattern r8 = f18228k
            java.lang.String r8 = p(r13, r8, r11)
            if (r8 == 0) goto L_0x0137
            int r18 = v6.e0.f26436a
            r28 = r6
            java.lang.String r6 = "x"
            r29 = r5
            r5 = -1
            java.lang.String[] r6 = r8.split(r6, r5)
            r8 = 0
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x013c
            if (r6 > 0) goto L_0x013e
            goto L_0x013c
        L_0x0137:
            r29 = r5
            r28 = r6
            r5 = -1
        L_0x013c:
            r6 = -1
            r8 = r5
        L_0x013e:
            java.util.regex.Pattern r5 = f18229l
            java.lang.String r5 = p(r13, r5, r11)
            if (r5 == 0) goto L_0x014b
            float r5 = java.lang.Float.parseFloat(r5)
            goto L_0x014d
        L_0x014b:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x014d:
            r30 = r4
            java.util.regex.Pattern r4 = f18221d
            java.lang.String r4 = p(r13, r4, r11)
            r31 = r3
            java.util.regex.Pattern r3 = f18222e
            java.lang.String r3 = p(r13, r3, r11)
            r32 = r0
            java.util.regex.Pattern r0 = f18223f
            java.lang.String r0 = p(r13, r0, r11)
            r33 = r0
            java.util.regex.Pattern r0 = f18224g
            java.lang.String r0 = p(r13, r0, r11)
            if (r15 == 0) goto L_0x017a
            java.util.regex.Pattern r15 = K
            java.lang.String r13 = q(r13, r15, r11)
            android.net.Uri r13 = v6.c0.d(r1, r13)
            goto L_0x018c
        L_0x017a:
            boolean r13 = r34.a()
            if (r13 == 0) goto L_0x01ff
            java.lang.String r13 = r34.b()
            java.lang.String r13 = r(r13, r11)
            android.net.Uri r13 = v6.c0.d(r1, r13)
        L_0x018c:
            x4.b0$b r15 = new x4.b0$b
            r15.<init>()
            int r1 = r2.size()
            r15.b(r1)
            r15.f27424j = r14
            r15.f27422h = r12
            r15.f27420f = r7
            r15.f27421g = r10
            r15.f27430p = r8
            r15.f27431q = r6
            r15.f27432r = r5
            r15.f27419e = r9
            x4.b0 r20 = r15.a()
            f6.d$b r1 = new f6.d$b
            r18 = r1
            r19 = r13
            r21 = r4
            r22 = r3
            r23 = r33
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2.add(r1)
            r1 = r32
            java.lang.Object r5 = r1.get(r13)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01d2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r13, r5)
        L_0x01d2:
            e6.h$b r6 = new e6.h$b
            r18 = r6
            r19 = r7
            r20 = r10
            r21 = r4
            r22 = r3
            r23 = r33
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r5.add(r6)
            r10 = r16
            r9 = r25
        L_0x01ec:
            r0 = r1
            r7 = r17
            r12 = r26
            r8 = r27
            r6 = r28
            r5 = r29
            r4 = r30
            r3 = r31
            r1 = r35
            goto L_0x0038
        L_0x01ff:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "#EXT-X-STREAM-INF must be followed by another line"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0207:
            r1 = r0
            r31 = r3
            r30 = r4
            r29 = r5
            r28 = r6
            r17 = r7
            r27 = r8
            r16 = r10
            r26 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x0223:
            int r5 = r2.size()
            r6 = 0
            if (r4 >= r5) goto L_0x028c
            java.lang.Object r5 = r2.get(r4)
            f6.d$b r5 = (f6.d.b) r5
            android.net.Uri r7 = r5.f18171a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x0289
            x4.b0 r7 = r5.f18172b
            q5.a r7 = r7.f27406r
            if (r7 != 0) goto L_0x0240
            r7 = 1
            goto L_0x0241
        L_0x0240:
            r7 = 0
        L_0x0241:
            v6.a.d(r7)
            e6.h r7 = new e6.h
            android.net.Uri r8 = r5.f18171a
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.getClass()
            r7.<init>(r6, r6, r8)
            q5.a r6 = new q5.a
            r8 = 1
            q5.a$b[] r8 = new q5.a.b[r8]
            r10 = 0
            r8[r10] = r7
            r6.<init>((q5.a.b[]) r8)
            x4.b0 r7 = r5.f18172b
            x4.b0$b r7 = r7.a()
            r7.f27423i = r6
            x4.b0 r20 = r7.a()
            f6.d$b r6 = new f6.d$b
            android.net.Uri r7 = r5.f18171a
            java.lang.String r8 = r5.f18173c
            java.lang.String r10 = r5.f18174d
            java.lang.String r12 = r5.f18175e
            java.lang.String r5 = r5.f18176f
            r18 = r6
            r19 = r7
            r21 = r8
            r22 = r10
            r23 = r12
            r24 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r3.add(r6)
        L_0x0289:
            int r4 = r4 + 1
            goto L_0x0223
        L_0x028c:
            r0 = 0
            r8 = r6
        L_0x028e:
            int r1 = r31.size()
            if (r0 >= r1) goto L_0x0510
            r1 = r31
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.util.regex.Pattern r5 = Q
            java.lang.String r5 = q(r4, r5, r11)
            java.util.regex.Pattern r7 = P
            java.lang.String r7 = q(r4, r7, r11)
            x4.b0$b r10 = new x4.b0$b
            r10.<init>()
            java.lang.String r12 = ":"
            java.lang.String r12 = q.b.a(r5, r12, r7)
            r10.f27415a = r12
            r10.f27416b = r7
            r10.f27424j = r14
            java.util.regex.Pattern r12 = U
            r13 = 0
            boolean r12 = k(r4, r12, r13)
            java.util.regex.Pattern r15 = V
            boolean r15 = k(r4, r15, r13)
            if (r15 == 0) goto L_0x02ca
            r12 = r12 | 2
        L_0x02ca:
            java.util.regex.Pattern r15 = T
            boolean r13 = k(r4, r15, r13)
            if (r13 == 0) goto L_0x02d4
            r12 = r12 | 4
        L_0x02d4:
            r10.f27418d = r12
            java.util.regex.Pattern r12 = R
            java.lang.String r12 = p(r4, r12, r11)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x02e4
            r12 = 0
            goto L_0x0316
        L_0x02e4:
            java.lang.String r13 = ","
            java.lang.String[] r12 = v6.e0.R(r12, r13)
            java.lang.String r13 = "public.accessibility.describes-video"
            boolean r13 = v6.e0.k(r12, r13)
            if (r13 == 0) goto L_0x02f5
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x02f6
        L_0x02f5:
            r13 = 0
        L_0x02f6:
            java.lang.String r15 = "public.accessibility.transcribes-spoken-dialog"
            boolean r15 = v6.e0.k(r12, r15)
            if (r15 == 0) goto L_0x0300
            r13 = r13 | 4096(0x1000, float:5.74E-42)
        L_0x0300:
            java.lang.String r15 = "public.accessibility.describes-music-and-sound"
            boolean r15 = v6.e0.k(r12, r15)
            if (r15 == 0) goto L_0x030a
            r13 = r13 | 1024(0x400, float:1.435E-42)
        L_0x030a:
            java.lang.String r15 = "public.easy-to-read"
            boolean r12 = v6.e0.k(r12, r15)
            if (r12 == 0) goto L_0x0315
            r12 = r13 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0316
        L_0x0315:
            r12 = r13
        L_0x0316:
            r10.f27419e = r12
            java.util.regex.Pattern r12 = O
            java.lang.String r12 = p(r4, r12, r11)
            r10.f27417c = r12
            java.util.regex.Pattern r12 = K
            java.lang.String r12 = p(r4, r12, r11)
            if (r12 != 0) goto L_0x032c
            r12 = 0
            r13 = r35
            goto L_0x0332
        L_0x032c:
            r13 = r35
            android.net.Uri r12 = v6.c0.d(r13, r12)
        L_0x0332:
            q5.a r15 = new q5.a
            r31 = r1
            r1 = 1
            q5.a$b[] r1 = new q5.a.b[r1]
            e6.h r13 = new e6.h
            r18 = r14
            java.util.List r14 = java.util.Collections.emptyList()
            r13.<init>(r5, r7, r14)
            r14 = 0
            r1[r14] = r13
            r15.<init>((q5.a.b[]) r1)
            java.util.regex.Pattern r1 = M
            java.lang.String r1 = q(r4, r1, r11)
            int r13 = r1.hashCode()
            r14 = 2
            switch(r13) {
                case -959297733: goto L_0x037a;
                case -333210994: goto L_0x036f;
                case 62628790: goto L_0x0364;
                case 81665115: goto L_0x0359;
                default: goto L_0x0358;
            }
        L_0x0358:
            goto L_0x0385
        L_0x0359:
            java.lang.String r13 = "VIDEO"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0362
            goto L_0x0385
        L_0x0362:
            r1 = 3
            goto L_0x0386
        L_0x0364:
            java.lang.String r13 = "AUDIO"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x036d
            goto L_0x0385
        L_0x036d:
            r1 = 2
            goto L_0x0386
        L_0x036f:
            java.lang.String r13 = "CLOSED-CAPTIONS"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0378
            goto L_0x0385
        L_0x0378:
            r1 = 1
            goto L_0x0386
        L_0x037a:
            java.lang.String r13 = "SUBTITLES"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0383
            goto L_0x0385
        L_0x0383:
            r1 = 0
            goto L_0x0386
        L_0x0385:
            r1 = -1
        L_0x0386:
            if (r1 == 0) goto L_0x04b0
            r13 = 1
            if (r1 == r13) goto L_0x0470
            if (r1 == r14) goto L_0x03e8
            r4 = 3
            if (r1 == r4) goto L_0x0391
            goto L_0x03cb
        L_0x0391:
            r1 = 0
        L_0x0392:
            int r4 = r2.size()
            if (r1 >= r4) goto L_0x03aa
            java.lang.Object r4 = r2.get(r1)
            f6.d$b r4 = (f6.d.b) r4
            java.lang.String r13 = r4.f18173c
            boolean r13 = r5.equals(r13)
            if (r13 == 0) goto L_0x03a7
            goto L_0x03ab
        L_0x03a7:
            int r1 = r1 + 1
            goto L_0x0392
        L_0x03aa:
            r4 = 0
        L_0x03ab:
            if (r4 == 0) goto L_0x03c9
            x4.b0 r1 = r4.f18172b
            java.lang.String r4 = r1.f27405i
            java.lang.String r4 = v6.e0.s(r4, r14)
            r10.f27422h = r4
            java.lang.String r4 = v6.s.e(r4)
            r10.f27425k = r4
            int r4 = r1.f27413y
            r10.f27430p = r4
            int r4 = r1.f27414z
            r10.f27431q = r4
            float r1 = r1.A
            r10.f27432r = r1
        L_0x03c9:
            if (r12 != 0) goto L_0x03ce
        L_0x03cb:
            r13 = r30
            goto L_0x03de
        L_0x03ce:
            r10.f27423i = r15
            f6.d$a r1 = new f6.d$a
            x4.b0 r4 = r10.a()
            r1.<init>(r12, r4, r5, r7)
            r13 = r30
            r13.add(r1)
        L_0x03de:
            r34 = r8
            r30 = r13
            r7 = r28
            r8 = r29
            goto L_0x0503
        L_0x03e8:
            r13 = r30
            r1 = 0
        L_0x03eb:
            int r14 = r2.size()
            if (r1 >= r14) goto L_0x0407
            java.lang.Object r14 = r2.get(r1)
            f6.d$b r14 = (f6.d.b) r14
            r34 = r8
            java.lang.String r8 = r14.f18174d
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0402
            goto L_0x040a
        L_0x0402:
            int r1 = r1 + 1
            r8 = r34
            goto L_0x03eb
        L_0x0407:
            r34 = r8
            r14 = 0
        L_0x040a:
            if (r14 == 0) goto L_0x041c
            x4.b0 r1 = r14.f18172b
            java.lang.String r1 = r1.f27405i
            r8 = 1
            java.lang.String r1 = v6.e0.s(r1, r8)
            r10.f27422h = r1
            java.lang.String r1 = v6.s.e(r1)
            goto L_0x041d
        L_0x041c:
            r1 = 0
        L_0x041d:
            java.util.regex.Pattern r8 = f18226i
            java.lang.String r4 = p(r4, r8, r11)
            if (r4 == 0) goto L_0x044c
            int r8 = v6.e0.f26436a
            java.lang.String r8 = "/"
            r30 = r13
            r13 = 2
            java.lang.String[] r8 = r4.split(r8, r13)
            r13 = 0
            r8 = r8[r13]
            int r8 = java.lang.Integer.parseInt(r8)
            r10.f27438x = r8
            java.lang.String r8 = "audio/eac3"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x044e
            java.lang.String r8 = "/JOC"
            boolean r4 = r4.endsWith(r8)
            if (r4 == 0) goto L_0x044e
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x044e
        L_0x044c:
            r30 = r13
        L_0x044e:
            r10.f27425k = r1
            if (r12 == 0) goto L_0x0463
            r10.f27423i = r15
            f6.d$a r1 = new f6.d$a
            x4.b0 r4 = r10.a()
            r1.<init>(r12, r4, r5, r7)
            r8 = r29
            r8.add(r1)
            goto L_0x046c
        L_0x0463:
            r8 = r29
            if (r14 == 0) goto L_0x046c
            x4.b0 r1 = r10.a()
            goto L_0x04ad
        L_0x046c:
            r7 = r28
            goto L_0x0503
        L_0x0470:
            r34 = r8
            r8 = r29
            java.util.regex.Pattern r1 = S
            java.lang.String r1 = q(r4, r1, r11)
            java.lang.String r4 = "CC"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x048e
            r4 = 2
            java.lang.String r1 = r1.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r4 = "application/cea-608"
            goto L_0x0499
        L_0x048e:
            r4 = 7
            java.lang.String r1 = r1.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r4 = "application/cea-708"
        L_0x0499:
            if (r6 != 0) goto L_0x04a0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x04a0:
            r10.f27425k = r4
            r10.C = r1
            x4.b0 r1 = r10.a()
            r6.add(r1)
            r1 = r34
        L_0x04ad:
            r7 = r28
            goto L_0x0505
        L_0x04b0:
            r34 = r8
            r8 = r29
            r1 = 0
        L_0x04b5:
            int r4 = r2.size()
            if (r1 >= r4) goto L_0x04cd
            java.lang.Object r4 = r2.get(r1)
            f6.d$b r4 = (f6.d.b) r4
            java.lang.String r13 = r4.f18175e
            boolean r13 = r5.equals(r13)
            if (r13 == 0) goto L_0x04ca
            goto L_0x04ce
        L_0x04ca:
            int r1 = r1 + 1
            goto L_0x04b5
        L_0x04cd:
            r4 = 0
        L_0x04ce:
            if (r4 == 0) goto L_0x04e0
            x4.b0 r1 = r4.f18172b
            java.lang.String r1 = r1.f27405i
            r4 = 3
            java.lang.String r1 = v6.e0.s(r1, r4)
            r10.f27422h = r1
            java.lang.String r1 = v6.s.e(r1)
            goto L_0x04e1
        L_0x04e0:
            r1 = 0
        L_0x04e1:
            if (r1 != 0) goto L_0x04e5
            java.lang.String r1 = "text/vtt"
        L_0x04e5:
            r10.f27425k = r1
            r10.f27423i = r15
            if (r12 == 0) goto L_0x04fa
            f6.d$a r1 = new f6.d$a
            x4.b0 r4 = r10.a()
            r1.<init>(r12, r4, r5, r7)
            r7 = r28
            r7.add(r1)
            goto L_0x0503
        L_0x04fa:
            r7 = r28
            java.lang.String r1 = "HlsPlaylistParser"
            java.lang.String r4 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            android.util.Log.w(r1, r4)
        L_0x0503:
            r1 = r34
        L_0x0505:
            int r0 = r0 + 1
            r28 = r7
            r29 = r8
            r14 = r18
            r8 = r1
            goto L_0x028e
        L_0x0510:
            r34 = r8
            r7 = r28
            r8 = r29
            if (r9 == 0) goto L_0x051e
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x051f
        L_0x051e:
            r9 = r6
        L_0x051f:
            f6.d r13 = new f6.d
            r0 = r13
            r1 = r35
            r2 = r27
            r4 = r30
            r5 = r8
            r6 = r7
            r7 = r17
            r8 = r34
            r10 = r16
            r12 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.g.i(f6.g$b, java.lang.String):f6.d");
    }

    public static e j(d dVar, e eVar, b bVar, String str) throws IOException {
        e.b bVar2;
        ArrayList arrayList;
        String str2;
        String str3;
        boolean z10;
        HashMap hashMap;
        ArrayList arrayList2;
        HashMap hashMap2;
        String str4;
        e eVar2;
        d dVar2;
        d dVar3;
        boolean z11;
        HashMap hashMap3;
        HashMap hashMap4;
        String str5;
        e.b bVar3;
        ArrayList arrayList3;
        e eVar3;
        long j10;
        String str6;
        d dVar4;
        long j11;
        String str7;
        ArrayList arrayList4;
        long j12;
        f fVar;
        long j13;
        String str8;
        String str9;
        e.b bVar4;
        ArrayList arrayList5;
        String str10;
        int i10;
        HashMap hashMap5;
        d dVar5 = dVar;
        boolean z12 = dVar5.f18218c;
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap hashMap8 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        e.f fVar2 = new e.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str11 = "";
        e eVar4 = eVar;
        d dVar6 = dVar5;
        boolean z13 = z12;
        ArrayList arrayList9 = arrayList7;
        e.f fVar3 = fVar2;
        String str12 = str11;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        boolean z14 = false;
        e.b bVar5 = null;
        int i11 = 0;
        long j22 = -9223372036854775807L;
        int i12 = 0;
        int i13 = 1;
        long j23 = -9223372036854775807L;
        long j24 = -9223372036854775807L;
        boolean z15 = false;
        f fVar4 = null;
        f fVar5 = null;
        boolean z16 = false;
        String str13 = null;
        String str14 = null;
        long j25 = -1;
        String str15 = null;
        int i14 = 0;
        boolean z17 = false;
        e.d dVar7 = null;
        while (bVar.a()) {
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList8.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String q10 = q(b10, f18234q, hashMap6);
                if ("VOD".equals(q10)) {
                    i11 = 1;
                } else if ("EVENT".equals(q10)) {
                    i11 = 2;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
            } else if (b10.startsWith("#EXT-X-START")) {
                j22 = (long) (e(b10, C) * 1000000.0d);
            } else {
                if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double l10 = l(b10, f18235r, -9.223372036854776E18d);
                    long j26 = l10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (l10 * 1000000.0d);
                    boolean k10 = k(b10, f18236s, false);
                    double l11 = l(b10, f18238u, -9.223372036854776E18d);
                    long j27 = l11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (l11 * 1000000.0d);
                    double l12 = l(b10, f18239v, -9.223372036854776E18d);
                    bVar2 = bVar5;
                    arrayList = arrayList8;
                    fVar3 = new e.f(j26, k10, j27, l12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (l12 * 1000000.0d), k(b10, f18240w, false));
                } else if (b10.startsWith("#EXT-X-PART-INF")) {
                    bVar2 = bVar5;
                    arrayList = arrayList8;
                    j24 = (long) (e(b10, f18232o) * 1000000.0d);
                } else if (b10.startsWith("#EXT-X-MAP")) {
                    String q11 = q(b10, K, hashMap6);
                    String p10 = p(b10, E, hashMap6);
                    if (p10 != null) {
                        int i15 = e0.f26436a;
                        String[] split = p10.split("@", -1);
                        j25 = Long.parseLong(split[0]);
                        if (split.length > 1) {
                            j16 = Long.parseLong(split[1]);
                        }
                    }
                    if (j25 == -1) {
                        j16 = 0;
                    }
                    String str16 = str13;
                    String str17 = str14;
                    if (str16 == null || str17 != null) {
                        dVar7 = new e.d(q11, j16, j25, str16, str17);
                        if (j25 != -1) {
                            j16 += j25;
                        }
                        str14 = str17;
                        str13 = str16;
                        j25 = -1;
                    } else {
                        throw new m0("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                } else {
                    String str18 = str13;
                    str2 = str14;
                    if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                        j23 = 1000000 * ((long) h(b10, f18230m));
                    } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j15 = Long.parseLong(q(b10, f18241x, Collections.emptyMap()));
                        bVar2 = bVar5;
                        arrayList = arrayList8;
                        str13 = str18;
                        hashMap4 = hashMap8;
                        j18 = j15;
                        dVar3 = dVar6;
                        z11 = z14;
                        hashMap3 = hashMap7;
                        eVar2 = eVar4;
                        str4 = str15;
                        str3 = str11;
                        arrayList2 = arrayList6;
                        str15 = str4;
                        hashMap7 = hashMap2;
                        arrayList6 = arrayList2;
                        hashMap8 = hashMap;
                        str11 = str3;
                        str14 = str2;
                        arrayList8 = arrayList;
                        bVar5 = bVar2;
                        eVar4 = eVar2;
                        z14 = z10;
                        dVar6 = dVar2;
                        d dVar8 = dVar;
                    } else if (b10.startsWith("#EXT-X-VERSION")) {
                        i13 = h(b10, f18233p);
                    } else {
                        if (b10.startsWith("#EXT-X-DEFINE")) {
                            String p11 = p(b10, Z, hashMap6);
                            if (p11 != null) {
                                String str19 = dVar6.f18166l.get(p11);
                                if (str19 != null) {
                                    hashMap6.put(p11, str19);
                                }
                            } else {
                                hashMap6.put(q(b10, P, hashMap6), q(b10, Y, hashMap6));
                            }
                            z10 = z14;
                            bVar3 = bVar5;
                            arrayList3 = arrayList8;
                            str3 = str11;
                            hashMap2 = hashMap7;
                            str4 = str15;
                        } else if (b10.startsWith("#EXTINF")) {
                            str12 = o(b10, f18243z, str11, hashMap6);
                            z10 = z14;
                            bVar3 = bVar5;
                            arrayList3 = arrayList8;
                            j20 = (long) (e(b10, f18242y) * 1000000.0d);
                            hashMap = hashMap8;
                            eVar3 = eVar4;
                            str5 = str2;
                            hashMap2 = hashMap7;
                            str3 = str11;
                            arrayList2 = arrayList6;
                            str4 = str15;
                            eVar2 = eVar3;
                            dVar2 = dVar;
                            str2 = str5;
                            str13 = str18;
                            str15 = str4;
                            hashMap7 = hashMap2;
                            arrayList6 = arrayList2;
                            hashMap8 = hashMap;
                            str11 = str3;
                            str14 = str2;
                            arrayList8 = arrayList;
                            bVar5 = bVar2;
                            eVar4 = eVar2;
                            z14 = z10;
                            dVar6 = dVar2;
                            d dVar82 = dVar;
                        } else if (b10.startsWith("#EXT-X-SKIP")) {
                            int h10 = h(b10, f18237t);
                            e eVar5 = eVar4;
                            v6.a.d(eVar5 != null && arrayList6.isEmpty());
                            int i16 = e0.f26436a;
                            int i17 = (int) (j15 - eVar5.f18182i);
                            int i18 = h10 + i17;
                            if (i17 < 0 || i18 > eVar5.f18189p.size()) {
                                throw new a();
                            }
                            str13 = str18;
                            String str20 = str2;
                            while (i17 < i18) {
                                e.d dVar9 = eVar5.f18189p.get(i17);
                                int i19 = i18;
                                boolean z18 = z14;
                                if (j15 != eVar5.f18182i) {
                                    int i20 = (eVar5.f18181h - i12) + dVar9.f18203d;
                                    ArrayList arrayList10 = new ArrayList();
                                    str10 = str11;
                                    long j28 = j19;
                                    int i21 = 0;
                                    while (i21 < dVar9.f18199u.size()) {
                                        e.b bVar6 = dVar9.f18199u.get(i21);
                                        arrayList10.add(new e.b(bVar6.f18200a, bVar6.f18201b, bVar6.f18202c, i20, j28, bVar6.f18205f, bVar6.f18206g, bVar6.f18207h, bVar6.f18208i, bVar6.f18209r, bVar6.f18210s, bVar6.f18194t, bVar6.f18195u));
                                        j28 += bVar6.f18202c;
                                        i21++;
                                        hashMap7 = hashMap7;
                                        i19 = i19;
                                        arrayList8 = arrayList8;
                                        bVar5 = bVar5;
                                    }
                                    bVar4 = bVar5;
                                    arrayList5 = arrayList8;
                                    i10 = i19;
                                    hashMap5 = hashMap7;
                                    e.d dVar10 = r55;
                                    e.d dVar11 = new e.d(dVar9.f18200a, dVar9.f18201b, dVar9.f18198t, dVar9.f18202c, i20, j19, dVar9.f18205f, dVar9.f18206g, dVar9.f18207h, dVar9.f18208i, dVar9.f18209r, dVar9.f18210s, arrayList10);
                                    dVar9 = dVar10;
                                } else {
                                    bVar4 = bVar5;
                                    arrayList5 = arrayList8;
                                    str10 = str11;
                                    i10 = i19;
                                    hashMap5 = hashMap7;
                                }
                                arrayList6.add(dVar9);
                                j19 += dVar9.f18202c;
                                long j29 = dVar9.f18209r;
                                if (j29 != -1) {
                                    j16 = dVar9.f18208i + j29;
                                }
                                int i22 = dVar9.f18203d;
                                e.d dVar12 = dVar9.f18201b;
                                f fVar6 = dVar9.f18205f;
                                String str21 = dVar9.f18206g;
                                String str22 = dVar9.f18207h;
                                if (str22 == null || !str22.equals(Long.toHexString(j18))) {
                                    str20 = dVar9.f18207h;
                                }
                                j18++;
                                i17++;
                                eVar5 = eVar;
                                i14 = i22;
                                dVar7 = dVar12;
                                fVar5 = fVar6;
                                str13 = str21;
                                hashMap7 = hashMap5;
                                i18 = i10;
                                z14 = z18;
                                str11 = str10;
                                j17 = j19;
                                arrayList8 = arrayList5;
                                bVar5 = bVar4;
                            }
                            z10 = z14;
                            bVar2 = bVar5;
                            arrayList = arrayList8;
                            str3 = str11;
                            hashMap2 = hashMap7;
                            dVar2 = dVar;
                            eVar2 = eVar;
                            arrayList2 = arrayList6;
                            str2 = str20;
                            str4 = str15;
                            hashMap = hashMap8;
                            str15 = str4;
                            hashMap7 = hashMap2;
                            arrayList6 = arrayList2;
                            hashMap8 = hashMap;
                            str11 = str3;
                            str14 = str2;
                            arrayList8 = arrayList;
                            bVar5 = bVar2;
                            eVar4 = eVar2;
                            z14 = z10;
                            dVar6 = dVar2;
                            d dVar822 = dVar;
                        } else {
                            z10 = z14;
                            bVar3 = bVar5;
                            arrayList3 = arrayList8;
                            str3 = str11;
                            hashMap2 = hashMap7;
                            if (b10.startsWith("#EXT-X-KEY")) {
                                String q12 = q(b10, H, hashMap6);
                                String o10 = o(b10, I, "identity", hashMap6);
                                if ("NONE".equals(q12)) {
                                    treeMap.clear();
                                    str9 = null;
                                    str8 = null;
                                    fVar5 = null;
                                } else {
                                    str8 = p(b10, L, hashMap6);
                                    if (!"identity".equals(o10)) {
                                        String str23 = str15;
                                        str15 = str23 == null ? g(q12) : str23;
                                        f.b f10 = f(b10, o10, hashMap6);
                                        if (f10 != null) {
                                            treeMap.put(o10, f10);
                                            fVar5 = null;
                                        }
                                    } else if ("AES-128".equals(q12)) {
                                        str9 = q(b10, K, hashMap6);
                                    }
                                    str9 = null;
                                }
                                str6 = str9;
                                str14 = str8;
                                j11 = j18;
                                bVar5 = bVar3;
                                dVar4 = dVar;
                                hashMap7 = hashMap2;
                                j18 = j11;
                                z14 = z10;
                                str11 = str3;
                                arrayList8 = arrayList3;
                                dVar6 = dVar4;
                            } else {
                                str4 = str15;
                                if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                    String q13 = q(b10, D, hashMap6);
                                    int i23 = e0.f26436a;
                                    String[] split2 = q13.split("@", -1);
                                    j25 = Long.parseLong(split2[0]);
                                    if (split2.length > 1) {
                                        j16 = Long.parseLong(split2[1]);
                                    }
                                } else if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i12 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                    dVar6 = dVar;
                                    str15 = str4;
                                    hashMap7 = hashMap2;
                                    str6 = str18;
                                    str11 = str3;
                                    str14 = str2;
                                    arrayList8 = arrayList3;
                                    bVar5 = bVar3;
                                    z14 = true;
                                } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                    i14++;
                                } else if (!b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (b10.equals("#EXT-X-GAP")) {
                                        dVar4 = dVar;
                                        str15 = str4;
                                        hashMap7 = hashMap2;
                                        str6 = str18;
                                        z14 = z10;
                                        str11 = str3;
                                        str14 = str2;
                                        arrayList8 = arrayList3;
                                        bVar5 = bVar3;
                                        z16 = true;
                                    } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        dVar4 = dVar;
                                        str15 = str4;
                                        hashMap7 = hashMap2;
                                        str6 = str18;
                                        z14 = z10;
                                        str11 = str3;
                                        str14 = str2;
                                        arrayList8 = arrayList3;
                                        bVar5 = bVar3;
                                        z13 = true;
                                    } else if (b10.equals("#EXT-X-ENDLIST")) {
                                        dVar4 = dVar;
                                        str15 = str4;
                                        hashMap7 = hashMap2;
                                        str6 = str18;
                                        z14 = z10;
                                        str11 = str3;
                                        str14 = str2;
                                        arrayList8 = arrayList3;
                                        bVar5 = bVar3;
                                        z15 = true;
                                    } else {
                                        if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long n10 = n(b10, A, (j15 + ((long) arrayList6.size())) - (arrayList9.isEmpty() ? 1 : 0));
                                            int m10 = m(b10, B, j24 != -9223372036854775807L ? (arrayList9.isEmpty() ? ((e.d) y.b(arrayList6)).f18199u : arrayList9).size() - 1 : -1);
                                            Uri parse = Uri.parse(c0.c(str, q(b10, K, hashMap6)));
                                            hashMap8.put(parse, new e.c(parse, n10, m10));
                                        } else {
                                            String str24 = str;
                                            if (!b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j10 = j18;
                                                str5 = str2;
                                                if (b10.startsWith("#EXT-X-PART")) {
                                                    String d10 = d(j10, str18, str5);
                                                    String q14 = q(b10, K, hashMap6);
                                                    arrayList4 = arrayList6;
                                                    long e10 = (long) (e(b10, f18231n) * 1000000.0d);
                                                    hashMap = hashMap8;
                                                    boolean k11 = k(b10, W, false) | (z13 && arrayList9.isEmpty());
                                                    boolean k12 = k(b10, X, false);
                                                    String p12 = p(b10, E, hashMap6);
                                                    if (p12 != null) {
                                                        int i24 = e0.f26436a;
                                                        String[] split3 = p12.split("@", -1);
                                                        j13 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j21 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j13 = -1;
                                                    }
                                                    if (j13 == -1) {
                                                        j21 = 0;
                                                    }
                                                    if (fVar5 == null && !treeMap.isEmpty()) {
                                                        f.b[] bVarArr = (f.b[]) treeMap.values().toArray(new f.b[0]);
                                                        f fVar7 = new f(str4, true, bVarArr);
                                                        if (fVar4 == null) {
                                                            fVar4 = c(str4, bVarArr);
                                                        }
                                                        fVar5 = fVar7;
                                                    }
                                                    arrayList9.add(new e.b(q14, dVar7, e10, i14, j17, fVar5, str18, d10, j21, j13, k12, k11, false));
                                                    j17 += e10;
                                                    if (j13 != -1) {
                                                        j21 += j13;
                                                    }
                                                } else {
                                                    arrayList4 = arrayList6;
                                                    hashMap = hashMap8;
                                                    if (!b10.startsWith("#")) {
                                                        String d11 = d(j10, str18, str5);
                                                        j18 = j10 + 1;
                                                        String r10 = r(b10, hashMap6);
                                                        e.d dVar13 = (e.d) hashMap2.get(r10);
                                                        if (j25 == -1) {
                                                            j12 = 0;
                                                        } else {
                                                            if (z17 && dVar7 == null && dVar13 == null) {
                                                                dVar13 = new e.d(r10, 0, j16, (String) null, (String) null);
                                                                hashMap2.put(r10, dVar13);
                                                            }
                                                            j12 = j16;
                                                        }
                                                        if (fVar5 != null || treeMap.isEmpty()) {
                                                            fVar = fVar5;
                                                        } else {
                                                            f.b[] bVarArr2 = (f.b[]) treeMap.values().toArray(new f.b[0]);
                                                            fVar = new f(str4, true, bVarArr2);
                                                            if (fVar4 == null) {
                                                                fVar4 = c(str4, bVarArr2);
                                                            }
                                                        }
                                                        arrayList2 = arrayList4;
                                                        arrayList2.add(new e.d(r10, dVar7 != null ? dVar7 : dVar13, str12, j20, i14, j19, fVar, str18, d11, j12, j25, z16, arrayList9));
                                                        j19 += j20;
                                                        ArrayList arrayList11 = new ArrayList();
                                                        if (j25 != -1) {
                                                            j12 += j25;
                                                        }
                                                        arrayList9 = arrayList11;
                                                        j16 = j12;
                                                        fVar5 = fVar;
                                                        j20 = 0;
                                                        j25 = -1;
                                                        str12 = str3;
                                                        j17 = j19;
                                                        z16 = false;
                                                        eVar3 = eVar;
                                                        eVar2 = eVar3;
                                                        dVar2 = dVar;
                                                        str2 = str5;
                                                        str13 = str18;
                                                        str15 = str4;
                                                        hashMap7 = hashMap2;
                                                        arrayList6 = arrayList2;
                                                        hashMap8 = hashMap;
                                                        str11 = str3;
                                                        str14 = str2;
                                                        arrayList8 = arrayList;
                                                        bVar5 = bVar2;
                                                        eVar4 = eVar2;
                                                        z14 = z10;
                                                        dVar6 = dVar2;
                                                        d dVar8222 = dVar;
                                                    }
                                                }
                                                arrayList2 = arrayList4;
                                                j18 = j10;
                                                eVar3 = eVar;
                                                eVar2 = eVar3;
                                                dVar2 = dVar;
                                                str2 = str5;
                                                str13 = str18;
                                                str15 = str4;
                                                hashMap7 = hashMap2;
                                                arrayList6 = arrayList2;
                                                hashMap8 = hashMap;
                                                str11 = str3;
                                                str14 = str2;
                                                arrayList8 = arrayList;
                                                bVar5 = bVar2;
                                                eVar4 = eVar2;
                                                z14 = z10;
                                                dVar6 = dVar2;
                                                d dVar82222 = dVar;
                                            } else if (bVar3 == null && "PART".equals(q(b10, N, hashMap6))) {
                                                String q15 = q(b10, K, hashMap6);
                                                long n11 = n(b10, F, -1);
                                                long n12 = n(b10, G, -1);
                                                long j30 = j18;
                                                str7 = str2;
                                                String d12 = d(j30, str18, str7);
                                                if (fVar5 != null || treeMap.isEmpty()) {
                                                    j11 = j30;
                                                } else {
                                                    j11 = j30;
                                                    f.b[] bVarArr3 = (f.b[]) treeMap.values().toArray(new f.b[0]);
                                                    f fVar8 = new f(str4, true, bVarArr3);
                                                    if (fVar4 == null) {
                                                        fVar4 = c(str4, bVarArr3);
                                                    }
                                                    fVar5 = fVar8;
                                                }
                                                if (n11 == -1 || n12 != -1) {
                                                    bVar3 = new e.b(q15, dVar7, 0, i14, j17, fVar5, str18, d12, n11 != -1 ? n11 : 0, n12, false, false, true);
                                                }
                                                str15 = str4;
                                                str14 = str7;
                                                str6 = str18;
                                                bVar5 = bVar3;
                                                dVar4 = dVar;
                                                hashMap7 = hashMap2;
                                                j18 = j11;
                                                z14 = z10;
                                                str11 = str3;
                                                arrayList8 = arrayList3;
                                            }
                                        }
                                        arrayList2 = arrayList6;
                                        hashMap = hashMap8;
                                        j10 = j18;
                                        str5 = str2;
                                        j18 = j10;
                                        eVar3 = eVar;
                                        eVar2 = eVar3;
                                        dVar2 = dVar;
                                        str2 = str5;
                                        str13 = str18;
                                        str15 = str4;
                                        hashMap7 = hashMap2;
                                        arrayList6 = arrayList2;
                                        hashMap8 = hashMap;
                                        str11 = str3;
                                        str14 = str2;
                                        arrayList8 = arrayList;
                                        bVar5 = bVar2;
                                        eVar4 = eVar2;
                                        z14 = z10;
                                        dVar6 = dVar2;
                                        d dVar822222 = dVar;
                                    }
                                    dVar6 = dVar4;
                                } else if (j14 == 0) {
                                    j14 = x4.f.b(e0.M(b10.substring(b10.indexOf(58) + 1))) - j19;
                                }
                                j11 = j18;
                                str7 = str2;
                                str15 = str4;
                                str14 = str7;
                                str6 = str18;
                                bVar5 = bVar3;
                                dVar4 = dVar;
                                hashMap7 = hashMap2;
                                j18 = j11;
                                z14 = z10;
                                str11 = str3;
                                arrayList8 = arrayList3;
                                dVar6 = dVar4;
                            }
                            eVar4 = eVar;
                        }
                        arrayList2 = arrayList6;
                        hashMap = hashMap8;
                        j10 = j18;
                        str5 = str2;
                        j18 = j10;
                        eVar3 = eVar;
                        eVar2 = eVar3;
                        dVar2 = dVar;
                        str2 = str5;
                        str13 = str18;
                        str15 = str4;
                        hashMap7 = hashMap2;
                        arrayList6 = arrayList2;
                        hashMap8 = hashMap;
                        str11 = str3;
                        str14 = str2;
                        arrayList8 = arrayList;
                        bVar5 = bVar2;
                        eVar4 = eVar2;
                        z14 = z10;
                        dVar6 = dVar2;
                        d dVar8222222 = dVar;
                    }
                    bVar3 = bVar5;
                    arrayList3 = arrayList8;
                    hashMap = hashMap8;
                    dVar2 = dVar6;
                    str5 = str2;
                    z10 = z14;
                    hashMap2 = hashMap7;
                    eVar2 = eVar4;
                    str4 = str15;
                    str3 = str11;
                    arrayList2 = arrayList6;
                    str2 = str5;
                    str13 = str18;
                    str15 = str4;
                    hashMap7 = hashMap2;
                    arrayList6 = arrayList2;
                    hashMap8 = hashMap;
                    str11 = str3;
                    str14 = str2;
                    arrayList8 = arrayList;
                    bVar5 = bVar2;
                    eVar4 = eVar2;
                    z14 = z10;
                    dVar6 = dVar2;
                    d dVar82222222 = dVar;
                }
                str2 = str14;
                dVar3 = dVar6;
                z11 = z14;
                hashMap3 = hashMap7;
                hashMap4 = hashMap8;
                eVar2 = eVar4;
                str4 = str15;
                str3 = str11;
                arrayList2 = arrayList6;
                str15 = str4;
                hashMap7 = hashMap2;
                arrayList6 = arrayList2;
                hashMap8 = hashMap;
                str11 = str3;
                str14 = str2;
                arrayList8 = arrayList;
                bVar5 = bVar2;
                eVar4 = eVar2;
                z14 = z10;
                dVar6 = dVar2;
                d dVar822222222 = dVar;
            }
        }
        boolean z19 = z14;
        e.b bVar7 = bVar5;
        ArrayList arrayList12 = arrayList8;
        ArrayList arrayList13 = arrayList6;
        HashMap hashMap9 = hashMap8;
        if (bVar7 != null) {
            arrayList9.add(bVar7);
        }
        return new e(i11, str, arrayList12, j22, j14, z19, i12, j15, i13, j23, j24, z13, z15, j14 != 0, fVar4, arrayList13, arrayList9, fVar3, hashMap9);
    }

    public static boolean k(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    public static double l(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d10;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static int m(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i10;
        }
        String group = matcher.group(1);
        group.getClass();
        return Integer.parseInt(group);
    }

    public static long n(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j10;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String o(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : r(str2, map);
    }

    public static String p(String str, Pattern pattern, Map<String, String> map) {
        return o(str, pattern, (String) null, map);
    }

    public static String q(String str, Pattern pattern, Map<String, String> map) throws m0 {
        String o10 = o(str, pattern, (String) null, map);
        if (o10 != null) {
            return o10;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Couldn't match ");
        a10.append(pattern.pattern());
        a10.append(" in ");
        a10.append(str);
        throw new m0(a10.toString());
    }

    public static String r(String str, Map<String, String> map) {
        Matcher matcher = f18219a0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int s(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !e0.I(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ all -> 0x00ef }, LOOP:1: B:18:0x0050->B:69:0x0050, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7 A[SYNTHETIC, Splitter:B:58:0x00e7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r8)
            r0.<init>(r1)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x00ef }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x00ef }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x004e
            int r1 = r0.read()     // Catch:{ all -> 0x00ef }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x004e
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x00ef }
        L_0x002d:
            r2 = 1
            int r1 = s(r0, r2, r1)     // Catch:{ all -> 0x00ef }
            r2 = 7
            r4 = 0
        L_0x0034:
            if (r4 >= r2) goto L_0x0046
            java.lang.String r5 = "#EXTM3U"
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x00ef }
            if (r1 == r5) goto L_0x003f
            goto L_0x004e
        L_0x003f:
            int r1 = r0.read()     // Catch:{ all -> 0x00ef }
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0046:
            int r1 = s(r0, r3, r1)     // Catch:{ all -> 0x00ef }
            boolean r3 = v6.e0.I(r1)     // Catch:{ all -> 0x00ef }
        L_0x004e:
            if (r3 == 0) goto L_0x00e7
        L_0x0050:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x00ef }
            if (r1 == 0) goto L_0x00da
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x00ef }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x0061
            goto L_0x0050
        L_0x0061:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x007f
            r8.add(r1)     // Catch:{ all -> 0x00ef }
            f6.g$b r1 = new f6.g$b     // Catch:{ all -> 0x00ef }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
            f6.d r7 = i(r1, r7)     // Catch:{ all -> 0x00ef }
        L_0x0079:
            int r8 = v6.e0.f26436a
            r0.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00d9
        L_0x007f:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            r8.add(r1)     // Catch:{ all -> 0x00ef }
            goto L_0x0050
        L_0x00c4:
            r8.add(r1)     // Catch:{ all -> 0x00ef }
            f6.d r1 = r6.f18244a     // Catch:{ all -> 0x00ef }
            f6.e r2 = r6.f18245b     // Catch:{ all -> 0x00ef }
            f6.g$b r3 = new f6.g$b     // Catch:{ all -> 0x00ef }
            r3.<init>(r8, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
            f6.e r7 = j(r1, r2, r3, r7)     // Catch:{ all -> 0x00ef }
            goto L_0x0079
        L_0x00d9:
            return r7
        L_0x00da:
            int r7 = v6.e0.f26436a
            r0.close()     // Catch:{ IOException -> 0x00df }
        L_0x00df:
            x4.m0 r7 = new x4.m0
            java.lang.String r8 = "Failed to parse the playlist, could not identify any tags."
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x00e7:
            z5.h0 r8 = new z5.h0     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r8.<init>(r1, r7)     // Catch:{ all -> 0x00ef }
            throw r8     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r7 = move-exception
            int r8 = v6.e0.f26436a
            r0.close()     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
            goto L_0x00f7
        L_0x00f6:
            throw r7
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.g.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    public g(d dVar, e eVar) {
        this.f18244a = dVar;
        this.f18245b = eVar;
    }
}
