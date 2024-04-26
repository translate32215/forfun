package m6;

import h6.b;
import h6.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v6.e0;
import v6.v;

/* compiled from: SsaDecoder */
public final class a extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f21722s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n  reason: collision with root package name */
    public final boolean f21723n;

    /* renamed from: o  reason: collision with root package name */
    public final b f21724o;

    /* renamed from: p  reason: collision with root package name */
    public Map<String, c> f21725p;

    /* renamed from: q  reason: collision with root package name */
    public float f21726q = -3.4028235E38f;

    /* renamed from: r  reason: collision with root package name */
    public float f21727r = -3.4028235E38f;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f21723n = false;
            this.f21724o = null;
            return;
        }
        this.f21723n = true;
        String o10 = e0.o(list.get(0));
        v6.a.a(o10.startsWith("Format:"));
        b a10 = b.a(o10);
        a10.getClass();
        this.f21724o = a10;
        n(new v(list.get(1)));
    }

    public static int l(long j10, List<Long> list, List<List<b>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 != 0) {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    public static float m(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static long o(String str) {
        Matcher matcher = f21722s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = e0.f26436a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:35|36|37|(1:39)|40|41|(1:43)(1:44)|45|(2:47|122)(1:123)|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0205, code lost:
        android.util.Log.w("SsaDecoder", androidx.appcompat.widget.d0.a("Unknown alignment: ", r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0208, code lost:
        r21 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        if (r11 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        if (r10 == -3.4028235E38f) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0217, code lost:
        if (r6 == -3.4028235E38f) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0219, code lost:
        r0 = r11.x / r6;
        r3 = r11.y / r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        r0 = m(r23);
        r3 = m(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0228, code lost:
        r15 = new h6.b(r15, r17, (android.graphics.Bitmap) null, r3, 0, r21, r0, r23, r24, r25, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, (h6.b.a) null);
        r3 = l(r8, r2, r1);
        r4 = l(r33, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0249, code lost:
        if (r3 >= r4) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024b, code lost:
        ((java.util.List) r1.get(r3)).add(r15);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d4, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d6, code lost:
        switch(r12) {
            case com.startapp.nd.j :int: goto L_0x01ed;
            case 0: goto L_0x01d9;
            case 1: goto L_0x01e6;
            case 2: goto L_0x01e2;
            case 3: goto L_0x01de;
            case 4: goto L_0x01e6;
            case 5: goto L_0x01e2;
            case 6: goto L_0x01de;
            case 7: goto L_0x01e6;
            case com.startapp.b4.f :int: goto L_0x01e2;
            case 9: goto L_0x01de;
            default: goto L_0x01d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01de, code lost:
        r23 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e2, code lost:
        r23 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e6, code lost:
        r23 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ea, code lost:
        android.util.Log.w("SsaDecoder", androidx.appcompat.widget.d0.a("Unknown alignment: ", r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ed, code lost:
        r23 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f1, code lost:
        switch(r12) {
            case com.startapp.nd.j :int: goto L_0x0208;
            case 0: goto L_0x01f4;
            case 1: goto L_0x0201;
            case 2: goto L_0x0201;
            case 3: goto L_0x0201;
            case 4: goto L_0x01fd;
            case 5: goto L_0x01fd;
            case 6: goto L_0x01fd;
            case 7: goto L_0x01f9;
            case com.startapp.b4.f :int: goto L_0x01f9;
            case 9: goto L_0x01f9;
            default: goto L_0x01f4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f9, code lost:
        r21 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fd, code lost:
        r21 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0201, code lost:
        r21 = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00ce */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[Catch:{ RuntimeException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.e k(byte[] r36, int r37, boolean r38) {
        /*
            r35 = this;
            r0 = r35
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            v6.v r3 = new v6.v
            r4 = r36
            r5 = r37
            r3.<init>(r4, r5)
            boolean r4 = r0.f21723n
            if (r4 != 0) goto L_0x001c
            r0.n(r3)
        L_0x001c:
            boolean r4 = r0.f21723n
            if (r4 == 0) goto L_0x0023
            m6.b r4 = r0.f21724o
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.lang.String r5 = r3.g()
            if (r5 == 0) goto L_0x0263
            java.lang.String r6 = "Format:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0037
            m6.b r4 = m6.b.a(r5)
            goto L_0x0024
        L_0x0037:
            java.lang.String r6 = "Dialogue:"
            boolean r7 = r5.startsWith(r6)
            if (r7 == 0) goto L_0x0257
            java.lang.String r7 = "SsaDecoder"
            if (r4 != 0) goto L_0x004a
            java.lang.String r6 = "Skipping dialogue line before complete format: "
            androidx.appcompat.widget.z0.a(r6, r5, r7)
            goto L_0x0257
        L_0x004a:
            boolean r6 = r5.startsWith(r6)
            v6.a.a(r6)
            r6 = 9
            java.lang.String r6 = r5.substring(r6)
            int r8 = r4.f21732e
            java.lang.String r9 = ","
            java.lang.String[] r6 = r6.split(r9, r8)
            int r8 = r6.length
            int r9 = r4.f21732e
            if (r8 == r9) goto L_0x006b
            java.lang.String r6 = "Skipping dialogue line with fewer columns than format: "
            androidx.appcompat.widget.z0.a(r6, r5, r7)
            goto L_0x0257
        L_0x006b:
            int r8 = r4.f21728a
            r8 = r6[r8]
            long r8 = o(r8)
            java.lang.String r10 = "Skipping invalid timing: "
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0083
            androidx.appcompat.widget.z0.a(r10, r5, r7)
            goto L_0x0257
        L_0x0083:
            int r13 = r4.f21729b
            r13 = r6[r13]
            long r13 = o(r13)
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0094
            androidx.appcompat.widget.z0.a(r10, r5, r7)
            goto L_0x0257
        L_0x0094:
            java.util.Map<java.lang.String, m6.c> r5 = r0.f21725p
            r10 = -1
            if (r5 == 0) goto L_0x00aa
            int r11 = r4.f21730c
            if (r11 == r10) goto L_0x00aa
            r10 = r6[r11]
            java.lang.String r10 = r10.trim()
            java.lang.Object r5 = r5.get(r10)
            m6.c r5 = (m6.c) r5
            goto L_0x00ab
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            int r10 = r4.f21731d
            r6 = r6[r10]
            java.util.regex.Pattern r10 = m6.c.b.f21746a
            java.util.regex.Matcher r10 = r10.matcher(r6)
            r11 = 0
            r12 = -1
        L_0x00b7:
            boolean r15 = r10.find()
            r38 = r3
            r3 = 1
            if (r15 == 0) goto L_0x00ef
            java.lang.String r3 = r10.group(r3)
            r3.getClass()
            android.graphics.PointF r15 = m6.c.b.a(r3)     // Catch:{ RuntimeException -> 0x00ce }
            if (r15 == 0) goto L_0x00ce
            r11 = r15
        L_0x00ce:
            java.util.regex.Pattern r15 = m6.c.b.f21749d     // Catch:{ RuntimeException -> 0x00ec }
            java.util.regex.Matcher r3 = r15.matcher(r3)     // Catch:{ RuntimeException -> 0x00ec }
            boolean r15 = r3.find()     // Catch:{ RuntimeException -> 0x00ec }
            if (r15 == 0) goto L_0x00e7
            r15 = 1
            java.lang.String r3 = r3.group(r15)     // Catch:{ RuntimeException -> 0x00ec }
            r3.getClass()     // Catch:{ RuntimeException -> 0x00ec }
            int r3 = m6.c.a(r3)     // Catch:{ RuntimeException -> 0x00ec }
            goto L_0x00e8
        L_0x00e7:
            r3 = -1
        L_0x00e8:
            r15 = -1
            if (r3 == r15) goto L_0x00ec
            r12 = r3
        L_0x00ec:
            r3 = r38
            goto L_0x00b7
        L_0x00ef:
            m6.c$b r3 = new m6.c$b
            java.util.regex.Pattern r3 = m6.c.b.f21746a
            java.util.regex.Matcher r3 = r3.matcher(r6)
            java.lang.String r6 = ""
            java.lang.String r3 = r3.replaceAll(r6)
            java.lang.String r6 = "\n"
            java.lang.String r10 = "\\N"
            java.lang.String r3 = r3.replace(r10, r6)
            java.lang.String r10 = "\\n"
            java.lang.String r3 = r3.replace(r10, r6)
            java.lang.String r6 = "\\h"
            java.lang.String r10 = " "
            java.lang.String r3 = r3.replace(r6, r10)
            float r6 = r0.f21726q
            float r10 = r0.f21727r
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r3)
            r18 = 0
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = 0
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r5 == 0) goto L_0x01a5
            java.lang.Integer r3 = r5.f21735c
            if (r3 == 0) goto L_0x0145
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r0 = r5.f21735c
            int r0 = r0.intValue()
            r3.<init>(r0)
            int r0 = r15.length()
            r37 = r4
            r4 = 33
            r33 = r13
            r13 = 0
            r15.setSpan(r3, r13, r0, r4)
            goto L_0x0149
        L_0x0145:
            r37 = r4
            r33 = r13
        L_0x0149:
            float r0 = r5.f21736d
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0159
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0159
            float r0 = r0 / r10
            r3 = 1
            goto L_0x015e
        L_0x0159:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x015e:
            boolean r4 = r5.f21737e
            if (r4 == 0) goto L_0x0179
            boolean r13 = r5.f21738f
            if (r13 == 0) goto L_0x0179
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r13 = 3
            r4.<init>(r13)
            int r13 = r15.length()
            r14 = 0
            r16 = r0
            r0 = 33
            r15.setSpan(r4, r14, r13, r0)
            goto L_0x019f
        L_0x0179:
            r16 = r0
            r0 = 0
            r13 = 33
            if (r4 == 0) goto L_0x018e
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r14 = 1
            r4.<init>(r14)
            int r14 = r15.length()
            r15.setSpan(r4, r0, r14, r13)
            goto L_0x019f
        L_0x018e:
            boolean r4 = r5.f21738f
            if (r4 == 0) goto L_0x019f
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r14 = 2
            r4.<init>(r14)
            int r14 = r15.length()
            r15.setSpan(r4, r0, r14, r13)
        L_0x019f:
            r0 = -1
            r24 = r3
            r25 = r16
            goto L_0x01b4
        L_0x01a5:
            r37 = r4
            r33 = r13
            r0 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01b4:
            if (r12 == r0) goto L_0x01b7
            goto L_0x01bd
        L_0x01b7:
            if (r5 == 0) goto L_0x01bc
            int r12 = r5.f21734b
            goto L_0x01bd
        L_0x01bc:
            r12 = r0
        L_0x01bd:
            java.lang.String r0 = "Unknown alignment: "
            switch(r12) {
                case -1: goto L_0x01d3;
                case 0: goto L_0x01c2;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01ca;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01c7;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01ca;
                case 9: goto L_0x01c7;
                default: goto L_0x01c2;
            }
        L_0x01c2:
            java.lang.String r3 = androidx.appcompat.widget.d0.a(r0, r12)
            goto L_0x01d0
        L_0x01c7:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01d4
        L_0x01ca:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01d4
        L_0x01cd:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01d4
        L_0x01d0:
            android.util.Log.w(r7, r3)
        L_0x01d3:
            r3 = 0
        L_0x01d4:
            r17 = r3
            switch(r12) {
                case -1: goto L_0x01ed;
                case 0: goto L_0x01d9;
                case 1: goto L_0x01e6;
                case 2: goto L_0x01e2;
                case 3: goto L_0x01de;
                case 4: goto L_0x01e6;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01de;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01de;
                default: goto L_0x01d9;
            }
        L_0x01d9:
            java.lang.String r3 = androidx.appcompat.widget.d0.a(r0, r12)
            goto L_0x01ea
        L_0x01de:
            r3 = 2
            r23 = 2
            goto L_0x01f1
        L_0x01e2:
            r3 = 1
            r23 = 1
            goto L_0x01f1
        L_0x01e6:
            r3 = 0
            r23 = 0
            goto L_0x01f1
        L_0x01ea:
            android.util.Log.w(r7, r3)
        L_0x01ed:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01f1:
            switch(r12) {
                case -1: goto L_0x0208;
                case 0: goto L_0x01f4;
                case 1: goto L_0x0201;
                case 2: goto L_0x0201;
                case 3: goto L_0x0201;
                case 4: goto L_0x01fd;
                case 5: goto L_0x01fd;
                case 6: goto L_0x01fd;
                case 7: goto L_0x01f9;
                case 8: goto L_0x01f9;
                case 9: goto L_0x01f9;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            java.lang.String r0 = androidx.appcompat.widget.d0.a(r0, r12)
            goto L_0x0205
        L_0x01f9:
            r0 = 0
            r21 = 0
            goto L_0x020c
        L_0x01fd:
            r0 = 1
            r21 = 1
            goto L_0x020c
        L_0x0201:
            r0 = 2
            r21 = 2
            goto L_0x020c
        L_0x0205:
            android.util.Log.w(r7, r0)
        L_0x0208:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x020c:
            if (r11 == 0) goto L_0x0220
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0220
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0220
            float r0 = r11.x
            float r0 = r0 / r6
            float r3 = r11.y
            float r3 = r3 / r10
            goto L_0x0228
        L_0x0220:
            float r0 = m(r23)
            float r3 = m(r21)
        L_0x0228:
            r22 = r0
            r19 = r3
            h6.b r0 = new h6.b
            r3 = r15
            r15 = r0
            r32 = 0
            r31 = 0
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 0
            r16 = r3
            r26 = r27
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r3 = l(r8, r2, r1)
            r4 = r33
            int r4 = l(r4, r2, r1)
        L_0x0249:
            if (r3 >= r4) goto L_0x025b
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x0249
        L_0x0257:
            r38 = r3
            r37 = r4
        L_0x025b:
            r0 = r35
            r4 = r37
            r3 = r38
            goto L_0x0024
        L_0x0263:
            m6.d r0 = new m6.d
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.k(byte[], int, boolean):h6.e");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ee A[Catch:{ RuntimeException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fb A[Catch:{ RuntimeException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0202 A[Catch:{ RuntimeException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020f A[Catch:{ RuntimeException -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(v6.v r29) {
        /*
            r28 = this;
            r1 = r28
        L_0x0002:
            java.lang.String r0 = r29.g()
            if (r0 == 0) goto L_0x0259
            java.lang.String r2 = "[Script Info]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            r3 = 91
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x006b
        L_0x0015:
            java.lang.String r0 = r29.g()
            if (r0 == 0) goto L_0x0002
            int r2 = r29.a()
            if (r2 == 0) goto L_0x0027
            int r2 = r29.c()
            if (r2 == r3) goto L_0x0002
        L_0x0027:
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            if (r2 == r4) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            r2 = r0[r6]
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = v6.e0.V(r2)
            r2.getClass()
            java.lang.String r7 = "playresx"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x005c
            java.lang.String r7 = "playresy"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x004f
            goto L_0x0015
        L_0x004f:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0069 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0069 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0069 }
            r1.f21727r = r0     // Catch:{ NumberFormatException -> 0x0069 }
            goto L_0x0015
        L_0x005c:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0069 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0069 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0069 }
            r1.f21726q = r0     // Catch:{ NumberFormatException -> 0x0069 }
            goto L_0x0015
        L_0x0069:
            goto L_0x0015
        L_0x006b:
            java.lang.String r2 = "[V4+ Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            java.lang.String r7 = "SsaDecoder"
            if (r2 == 0) goto L_0x0242
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x007a:
            r9 = 0
        L_0x007b:
            java.lang.String r10 = r29.g()
            if (r10 == 0) goto L_0x023e
            int r0 = r29.a()
            if (r0 == 0) goto L_0x008d
            int r0 = r29.c()
            if (r0 == r3) goto L_0x023e
        L_0x008d:
            java.lang.String r0 = "Format:"
            boolean r0 = r10.startsWith(r0)
            java.lang.String r3 = ","
            r11 = 3
            r12 = -1
            if (r0 == 0) goto L_0x0143
            r0 = 7
            java.lang.String r0 = r10.substring(r0)
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r3)
            r3 = 0
            r9 = -1
            r10 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = -1
        L_0x00b4:
            int r9 = r0.length
            if (r3 >= r9) goto L_0x0130
            r9 = r0[r3]
            java.lang.String r9 = r9.trim()
            java.lang.String r9 = v6.e0.V(r9)
            r9.getClass()
            int r10 = r9.hashCode()
            r13 = 5
            r8 = 4
            switch(r10) {
                case -1178781136: goto L_0x0105;
                case -70925746: goto L_0x00fa;
                case 3029637: goto L_0x00ef;
                case 3373707: goto L_0x00e4;
                case 366554320: goto L_0x00d9;
                case 1767875043: goto L_0x00ce;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x0110
        L_0x00ce:
            java.lang.String r10 = "alignment"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00d7
            goto L_0x0110
        L_0x00d7:
            r9 = 5
            goto L_0x0111
        L_0x00d9:
            java.lang.String r10 = "fontsize"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00e2
            goto L_0x0110
        L_0x00e2:
            r9 = 4
            goto L_0x0111
        L_0x00e4:
            java.lang.String r10 = "name"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00ed
            goto L_0x0110
        L_0x00ed:
            r9 = 3
            goto L_0x0111
        L_0x00ef:
            java.lang.String r10 = "bold"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00f8
            goto L_0x0110
        L_0x00f8:
            r9 = 2
            goto L_0x0111
        L_0x00fa:
            java.lang.String r10 = "primarycolour"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            r9 = 1
            goto L_0x0111
        L_0x0105:
            java.lang.String r10 = "italic"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r9 = 0
            goto L_0x0111
        L_0x0110:
            r9 = -1
        L_0x0111:
            if (r9 == 0) goto L_0x012b
            if (r9 == r5) goto L_0x0128
            if (r9 == r4) goto L_0x0125
            if (r9 == r11) goto L_0x0123
            if (r9 == r8) goto L_0x0120
            if (r9 == r13) goto L_0x011e
            goto L_0x012d
        L_0x011e:
            r15 = r3
            goto L_0x012d
        L_0x0120:
            r17 = r3
            goto L_0x012d
        L_0x0123:
            r14 = r3
            goto L_0x012d
        L_0x0125:
            r18 = r3
            goto L_0x012d
        L_0x0128:
            r16 = r3
            goto L_0x012d
        L_0x012b:
            r19 = r3
        L_0x012d:
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x0130:
            if (r14 == r12) goto L_0x013f
            m6.c$a r9 = new m6.c$a
            int r0 = r0.length
            r13 = r9
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r3 = 91
            goto L_0x007b
        L_0x013f:
            r3 = 91
            goto L_0x007a
        L_0x0143:
            java.lang.String r0 = "Style:"
            boolean r8 = r10.startsWith(r0)
            if (r8 == 0) goto L_0x0238
            if (r9 != 0) goto L_0x0154
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            androidx.appcompat.widget.z0.a(r0, r10, r7)
            goto L_0x0238
        L_0x0154:
            java.lang.String r8 = "'"
            boolean r0 = r10.startsWith(r0)
            v6.a.a(r0)
            r0 = 6
            java.lang.String r0 = r10.substring(r0)
            java.lang.String[] r3 = android.text.TextUtils.split(r0, r3)
            int r0 = r3.length
            int r13 = r9.f21745g
            java.lang.String r14 = "SsaStyle"
            if (r0 == r13) goto L_0x0189
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r0[r6] = r8
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r5] = r3
            r0[r4] = r10
            java.lang.String r3 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = v6.e0.n(r3, r0)
            android.util.Log.w(r14, r0)
            goto L_0x0230
        L_0x0189:
            m6.c r4 = new m6.c     // Catch:{ RuntimeException -> 0x0218 }
            int r0 = r9.f21739a     // Catch:{ RuntimeException -> 0x0218 }
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r22 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            int r0 = r9.f21740b     // Catch:{ RuntimeException -> 0x0218 }
            if (r0 == r12) goto L_0x01a4
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            int r0 = m6.c.a(r0)     // Catch:{ RuntimeException -> 0x0218 }
            r23 = r0
            goto L_0x01a7
        L_0x01a4:
            r0 = -1
            r23 = -1
        L_0x01a7:
            int r0 = r9.f21741c     // Catch:{ RuntimeException -> 0x0218 }
            if (r0 == r12) goto L_0x01b8
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.Integer r0 = m6.c.c(r0)     // Catch:{ RuntimeException -> 0x0218 }
            r24 = r0
            goto L_0x01ba
        L_0x01b8:
            r24 = 0
        L_0x01ba:
            int r0 = r9.f21742d     // Catch:{ RuntimeException -> 0x0218 }
            if (r0 == r12) goto L_0x01e4
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r5 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            float r0 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x01cb }
            r25 = r0
            goto L_0x01ea
        L_0x01cb:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0218 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r13 = "Failed to parse font size: '"
            r0.append(r13)     // Catch:{ RuntimeException -> 0x0218 }
            r0.append(r5)     // Catch:{ RuntimeException -> 0x0218 }
            r0.append(r8)     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x0218 }
            v6.p.d(r14, r0, r11)     // Catch:{ RuntimeException -> 0x0218 }
        L_0x01e4:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01ea:
            int r0 = r9.f21743e     // Catch:{ RuntimeException -> 0x0218 }
            if (r0 == r12) goto L_0x01fb
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            boolean r0 = m6.c.b(r0)     // Catch:{ RuntimeException -> 0x0218 }
            r26 = r0
            goto L_0x01fe
        L_0x01fb:
            r0 = 0
            r26 = 0
        L_0x01fe:
            int r0 = r9.f21744f     // Catch:{ RuntimeException -> 0x0218 }
            if (r0 == r12) goto L_0x020f
            r0 = r3[r0]     // Catch:{ RuntimeException -> 0x0218 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x0218 }
            boolean r0 = m6.c.b(r0)     // Catch:{ RuntimeException -> 0x0218 }
            r27 = r0
            goto L_0x0212
        L_0x020f:
            r0 = 0
            r27 = 0
        L_0x0212:
            r21 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x0218 }
            goto L_0x0231
        L_0x0218:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skipping malformed 'Style:' line: '"
            r3.append(r4)
            r3.append(r10)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            v6.p.d(r14, r3, r0)
        L_0x0230:
            r4 = 0
        L_0x0231:
            if (r4 == 0) goto L_0x0238
            java.lang.String r0 = r4.f21733a
            r2.put(r0, r4)
        L_0x0238:
            r3 = 91
            r4 = 2
            r5 = 1
            goto L_0x007b
        L_0x023e:
            r1.f21725p = r2
            goto L_0x0002
        L_0x0242:
            java.lang.String r2 = "[V4 Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L_0x0251
            java.lang.String r0 = "[V4 Styles] are not supported"
            android.util.Log.i(r7, r0)
            goto L_0x0002
        L_0x0251:
            java.lang.String r2 = "[Events]"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0002
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.n(v6.v):void");
    }
}
