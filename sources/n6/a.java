package n6;

import h6.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SubripDecoder */
public final class a extends c {

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f22339p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f22340q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n  reason: collision with root package name */
    public final StringBuilder f22341n = new StringBuilder();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<String> f22342o = new ArrayList<>();

    public a() {
        super("SubripDecoder");
    }

    public static float l(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long m(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0;
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.e k(byte[] r26, int r27, boolean r28) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r1 = "SubripDecoder"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            v6.q r3 = new v6.q
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5)
            v6.v r5 = new v6.v
            r6 = r26
            r7 = r27
            r5.<init>(r6, r7)
        L_0x0019:
            java.lang.String r6 = r5.g()
            if (r6 == 0) goto L_0x023b
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0026
            goto L_0x0019
        L_0x0026:
            java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0229 }
            java.lang.String r6 = r5.g()
            if (r6 != 0) goto L_0x0036
            java.lang.String r4 = "Unexpected end"
            android.util.Log.w(r1, r4)
            goto L_0x023b
        L_0x0036:
            java.util.regex.Pattern r7 = f22339p
            java.util.regex.Matcher r7 = r7.matcher(r6)
            boolean r8 = r7.matches()
            if (r8 == 0) goto L_0x021f
            r6 = 1
            long r8 = m(r7, r6)
            r3.a(r8)
            r6 = 6
            long r6 = m(r7, r6)
            r3.a(r6)
            java.lang.StringBuilder r6 = r0.f22341n
            r6.setLength(r4)
            java.util.ArrayList<java.lang.String> r4 = r0.f22342o
            r4.clear()
            java.lang.String r4 = r5.g()
        L_0x0060:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00b4
            java.lang.StringBuilder r6 = r0.f22341n
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0075
            java.lang.StringBuilder r6 = r0.f22341n
            java.lang.String r7 = "<br>"
            r6.append(r7)
        L_0x0075:
            java.lang.StringBuilder r6 = r0.f22341n
            java.util.ArrayList<java.lang.String> r7 = r0.f22342o
            java.lang.String r4 = r4.trim()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r4)
            java.util.regex.Pattern r9 = f22340q
            java.util.regex.Matcher r4 = r9.matcher(r4)
            r9 = 0
        L_0x0089:
            boolean r10 = r4.find()
            if (r10 == 0) goto L_0x00a8
            java.lang.String r10 = r4.group()
            r7.add(r10)
            int r11 = r4.start()
            int r11 = r11 - r9
            int r10 = r10.length()
            int r12 = r11 + r10
            java.lang.String r13 = ""
            r8.replace(r11, r12, r13)
            int r9 = r9 + r10
            goto L_0x0089
        L_0x00a8:
            java.lang.String r4 = r8.toString()
            r6.append(r4)
            java.lang.String r4 = r5.g()
            goto L_0x0060
        L_0x00b4:
            java.lang.StringBuilder r4 = r0.f22341n
            java.lang.String r4 = r4.toString()
            android.text.Spanned r7 = android.text.Html.fromHtml(r4)
            r4 = 0
        L_0x00bf:
            java.util.ArrayList<java.lang.String> r6 = r0.f22342o
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x00db
            java.util.ArrayList<java.lang.String> r6 = r0.f22342o
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = "\\{\\\\an[1-9]\\}"
            boolean r8 = r6.matches(r8)
            if (r8 == 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            int r4 = r4 + 1
            goto L_0x00bf
        L_0x00db:
            r6 = 0
        L_0x00dc:
            r9 = 0
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = 0
            r20 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r22 = 0
            if (r6 != 0) goto L_0x010b
            h6.b r4 = new h6.b
            r6 = r4
            r23 = 0
            r22 = 0
            r8 = r9
            r10 = r18
            r11 = r21
            r12 = r21
            r13 = r18
            r14 = r21
            r15 = r21
            r16 = r18
            r17 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r24 = r3
            r28 = r5
            goto L_0x0216
        L_0x010b:
            int r4 = r6.hashCode()
            java.lang.String r8 = "{\\an9}"
            java.lang.String r9 = "{\\an8}"
            java.lang.String r10 = "{\\an7}"
            java.lang.String r11 = "{\\an6}"
            java.lang.String r12 = "{\\an5}"
            java.lang.String r13 = "{\\an4}"
            java.lang.String r14 = "{\\an3}"
            java.lang.String r15 = "{\\an2}"
            java.lang.String r0 = "{\\an1}"
            r28 = r5
            r5 = 2
            switch(r4) {
                case -685620710: goto L_0x0169;
                case -685620679: goto L_0x0161;
                case -685620648: goto L_0x0159;
                case -685620617: goto L_0x0151;
                case -685620586: goto L_0x0149;
                case -685620555: goto L_0x0141;
                case -685620524: goto L_0x0139;
                case -685620493: goto L_0x0130;
                case -685620462: goto L_0x0128;
                default: goto L_0x0127;
            }
        L_0x0127:
            goto L_0x0171
        L_0x0128:
            boolean r4 = r6.equals(r8)
            if (r4 == 0) goto L_0x0171
            r4 = 5
            goto L_0x0172
        L_0x0130:
            boolean r4 = r6.equals(r9)
            if (r4 == 0) goto L_0x0171
            r4 = 8
            goto L_0x0172
        L_0x0139:
            boolean r4 = r6.equals(r10)
            if (r4 == 0) goto L_0x0171
            r4 = 2
            goto L_0x0172
        L_0x0141:
            boolean r4 = r6.equals(r11)
            if (r4 == 0) goto L_0x0171
            r4 = 4
            goto L_0x0172
        L_0x0149:
            boolean r4 = r6.equals(r12)
            if (r4 == 0) goto L_0x0171
            r4 = 7
            goto L_0x0172
        L_0x0151:
            boolean r4 = r6.equals(r13)
            if (r4 == 0) goto L_0x0171
            r4 = 1
            goto L_0x0172
        L_0x0159:
            boolean r4 = r6.equals(r14)
            if (r4 == 0) goto L_0x0171
            r4 = 3
            goto L_0x0172
        L_0x0161:
            boolean r4 = r6.equals(r15)
            if (r4 == 0) goto L_0x0171
            r4 = 6
            goto L_0x0172
        L_0x0169:
            boolean r4 = r6.equals(r0)
            if (r4 == 0) goto L_0x0171
            r4 = 0
            goto L_0x0172
        L_0x0171:
            r4 = -1
        L_0x0172:
            r24 = r3
            if (r4 == 0) goto L_0x0188
            r3 = 1
            if (r4 == r3) goto L_0x0188
            if (r4 == r5) goto L_0x0188
            r3 = 3
            if (r4 == r3) goto L_0x0186
            r3 = 4
            if (r4 == r3) goto L_0x0186
            r3 = 5
            if (r4 == r3) goto L_0x0186
            r3 = 1
            goto L_0x0189
        L_0x0186:
            r3 = 2
            goto L_0x0189
        L_0x0188:
            r3 = 0
        L_0x0189:
            int r4 = r6.hashCode()
            switch(r4) {
                case -685620710: goto L_0x01d2;
                case -685620679: goto L_0x01ca;
                case -685620648: goto L_0x01c2;
                case -685620617: goto L_0x01ba;
                case -685620586: goto L_0x01b2;
                case -685620555: goto L_0x01a9;
                case -685620524: goto L_0x01a1;
                case -685620493: goto L_0x0199;
                case -685620462: goto L_0x0191;
                default: goto L_0x0190;
            }
        L_0x0190:
            goto L_0x01da
        L_0x0191:
            boolean r0 = r6.equals(r8)
            if (r0 == 0) goto L_0x01da
            r0 = 5
            goto L_0x01db
        L_0x0199:
            boolean r0 = r6.equals(r9)
            if (r0 == 0) goto L_0x01da
            r0 = 4
            goto L_0x01db
        L_0x01a1:
            boolean r0 = r6.equals(r10)
            if (r0 == 0) goto L_0x01da
            r0 = 3
            goto L_0x01db
        L_0x01a9:
            boolean r0 = r6.equals(r11)
            if (r0 == 0) goto L_0x01da
            r0 = 8
            goto L_0x01db
        L_0x01b2:
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x01da
            r0 = 7
            goto L_0x01db
        L_0x01ba:
            boolean r0 = r6.equals(r13)
            if (r0 == 0) goto L_0x01da
            r0 = 6
            goto L_0x01db
        L_0x01c2:
            boolean r0 = r6.equals(r14)
            if (r0 == 0) goto L_0x01da
            r0 = 2
            goto L_0x01db
        L_0x01ca:
            boolean r0 = r6.equals(r15)
            if (r0 == 0) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01d2:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01da
            r0 = 0
            goto L_0x01db
        L_0x01da:
            r0 = -1
        L_0x01db:
            if (r0 == 0) goto L_0x01f1
            r4 = 1
            if (r0 == r4) goto L_0x01f1
            if (r0 == r5) goto L_0x01f1
            r4 = 3
            if (r0 == r4) goto L_0x01ee
            r4 = 4
            if (r0 == r4) goto L_0x01ee
            r4 = 5
            if (r0 == r4) goto L_0x01ee
            r0 = 1
            r12 = 1
            goto L_0x01f3
        L_0x01ee:
            r0 = 0
            r12 = 0
            goto L_0x01f3
        L_0x01f1:
            r0 = 2
            r12 = 2
        L_0x01f3:
            float r13 = l(r3)
            float r10 = l(r12)
            r11 = 0
            h6.b r4 = new h6.b
            r6 = r4
            r23 = 0
            r9 = 0
            r8 = r9
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = r15
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = r17
            r18 = r17
            r19 = 0
            r20 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0216:
            r2.add(r4)
            h6.b r0 = h6.b.f18921q
            r2.add(r0)
            goto L_0x0232
        L_0x021f:
            r24 = r3
            r28 = r5
            java.lang.String r0 = "Skipping invalid timing: "
            androidx.appcompat.widget.z0.a(r0, r6, r1)
            goto L_0x0232
        L_0x0229:
            r24 = r3
            r28 = r5
            java.lang.String r0 = "Skipping invalid index: "
            androidx.appcompat.widget.z0.a(r0, r6, r1)
        L_0x0232:
            r4 = 0
            r0 = r25
            r5 = r28
            r3 = r24
            goto L_0x0019
        L_0x023b:
            r24 = r3
            r0 = 0
            h6.b[] r0 = new h6.b[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            h6.b[] r0 = (h6.b[]) r0
            r1 = r24
            java.lang.Object r2 = r1.f26492c
            long[] r2 = (long[]) r2
            int r1 = r1.f26491b
            long[] r1 = java.util.Arrays.copyOf(r2, r1)
            n6.b r2 = new n6.b
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.a.k(byte[], int, boolean):h6.e");
    }
}
