package q6;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v6.v;

/* compiled from: WebvttCueParser */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f24183a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f24184b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Integer> f24185c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, Integer> f24186d;

    /* compiled from: WebvttCueParser */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int f24187c = 0;

        /* renamed from: a  reason: collision with root package name */
        public final c f24188a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24189b;

        public b(c cVar, int i10, a aVar) {
            this.f24188a = cVar;
            this.f24189b = i10;
        }
    }

    /* compiled from: WebvttCueParser */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f24190a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24191b;

        /* renamed from: c  reason: collision with root package name */
        public final String f24192c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f24193d;

        public c(String str, int i10, String str2, Set<String> set) {
            this.f24191b = i10;
            this.f24190a = str;
            this.f24192c = str2;
            this.f24193d = set;
        }
    }

    /* compiled from: WebvttCueParser */
    public static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final int f24194a;

        /* renamed from: b  reason: collision with root package name */
        public final c f24195b;

        public d(int i10, c cVar) {
            this.f24194a = i10;
            this.f24195b = cVar;
        }

        public int compareTo(Object obj) {
            int i10 = this.f24194a;
            int i11 = ((d) obj).f24194a;
            if (i10 == i11) {
                return 0;
            }
            return i10 < i11 ? -1 : 1;
        }
    }

    /* renamed from: q6.e$e  reason: collision with other inner class name */
    /* compiled from: WebvttCueParser */
    public static final class C0225e {

        /* renamed from: a  reason: collision with root package name */
        public long f24196a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f24197b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f24198c;

        /* renamed from: d  reason: collision with root package name */
        public int f24199d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f24200e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f24201f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f24202g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f24203h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f24204i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f24205j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f24206k = Integer.MIN_VALUE;

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
            if (r6 == 0) goto L_0x0076;
         */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h6.b.C0156b a() {
            /*
                r13 = this;
                float r0 = r13.f24203h
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 0
                r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 5
                r6 = 4
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x0011
                goto L_0x001e
            L_0x0011:
                int r0 = r13.f24199d
                if (r0 == r6) goto L_0x001d
                if (r0 == r5) goto L_0x001a
                r0 = 1056964608(0x3f000000, float:0.5)
                goto L_0x001e
            L_0x001a:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L_0x001e
            L_0x001d:
                r0 = 0
            L_0x001e:
                int r7 = r13.f24204i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r7 == r8) goto L_0x0028
                goto L_0x0037
            L_0x0028:
                int r7 = r13.f24199d
                if (r7 == r11) goto L_0x0036
                if (r7 == r9) goto L_0x0034
                if (r7 == r6) goto L_0x0036
                if (r7 == r5) goto L_0x0034
                r7 = 1
                goto L_0x0037
            L_0x0034:
                r7 = 2
                goto L_0x0037
            L_0x0036:
                r7 = 0
            L_0x0037:
                h6.b$b r8 = new h6.b$b
                r8.<init>()
                int r12 = r13.f24199d
                if (r12 == r11) goto L_0x0057
                if (r12 == r10) goto L_0x0054
                if (r12 == r9) goto L_0x0051
                if (r12 == r6) goto L_0x0057
                if (r12 == r5) goto L_0x0051
                java.lang.String r5 = "Unknown textAlignment: "
                java.lang.String r6 = "WebvttCueParser"
                f0.j.a(r5, r12, r6)
                r5 = 0
                goto L_0x0059
            L_0x0051:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0059
            L_0x0054:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0059
            L_0x0057:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0059:
                r8.f18940c = r5
                float r5 = r13.f24200e
                int r6 = r13.f24201f
                int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r9 == 0) goto L_0x006e
                if (r6 != 0) goto L_0x006e
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 < 0) goto L_0x0076
                int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x006e
                goto L_0x0076
            L_0x006e:
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x0074
                r3 = r5
                goto L_0x0078
            L_0x0074:
                if (r6 != 0) goto L_0x0078
            L_0x0076:
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x0078:
                r8.f18941d = r3
                r8.f18942e = r6
                int r2 = r13.f24202g
                r8.f18943f = r2
                r8.f18944g = r0
                r8.f18945h = r7
                float r2 = r13.f24205j
                if (r7 == 0) goto L_0x00a4
                if (r7 == r11) goto L_0x0097
                if (r7 != r10) goto L_0x008d
                goto L_0x00a6
            L_0x008d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r7)
                r0.<init>(r1)
                throw r0
            L_0x0097:
                r3 = 1073741824(0x40000000, float:2.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00a0
                float r0 = r0 * r3
                goto L_0x00a6
            L_0x00a0:
                float r4 = r4 - r0
                float r0 = r4 * r3
                goto L_0x00a6
            L_0x00a4:
                float r0 = r4 - r0
            L_0x00a6:
                float r0 = java.lang.Math.min(r2, r0)
                r8.f18948k = r0
                int r0 = r13.f24206k
                r8.f18952o = r0
                java.lang.CharSequence r0 = r13.f24198c
                if (r0 == 0) goto L_0x00b6
                r8.f18938a = r0
            L_0x00b6:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.e.C0225e.a():h6.b$b");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24185c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24186d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0242 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r19, q6.e.c r20, java.util.List<q6.e.b> r21, android.text.SpannableStringBuilder r22, java.util.List<q6.c> r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            int r4 = r1.f24191b
            int r5 = r22.length()
            java.lang.String r6 = r1.f24190a
            r6.getClass()
            int r7 = r6.hashCode()
            r9 = 2
            r10 = -1
            if (r7 == 0) goto L_0x0087
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x007c
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L_0x0071
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L_0x0066
            r13 = 98
            if (r7 == r13) goto L_0x005b
            r13 = 99
            if (r7 == r13) goto L_0x0050
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L_0x0045
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L_0x003a
            goto L_0x008f
        L_0x003a:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0043
            goto L_0x008f
        L_0x0043:
            r6 = 5
            goto L_0x0092
        L_0x0045:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            r6 = 4
            goto L_0x0092
        L_0x0050:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0059
            goto L_0x008f
        L_0x0059:
            r6 = 2
            goto L_0x0092
        L_0x005b:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0064
            goto L_0x008f
        L_0x0064:
            r6 = 1
            goto L_0x0092
        L_0x0066:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x006f
            goto L_0x008f
        L_0x006f:
            r6 = 7
            goto L_0x0092
        L_0x0071:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            r6 = 6
            goto L_0x0092
        L_0x007c:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            r6 = 3
            goto L_0x0092
        L_0x0087:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0091
        L_0x008f:
            r6 = -1
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            r7 = 33
            switch(r6) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0165;
                case 2: goto L_0x011d;
                case 3: goto L_0x0114;
                case 4: goto L_0x010b;
                case 5: goto L_0x016e;
                case 6: goto L_0x016e;
                case 7: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            return
        L_0x0098:
            int r6 = c(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r21.size()
            r13.<init>(r14)
            r14 = r21
            r13.addAll(r14)
            int r14 = q6.e.b.f24187c
            q6.f r14 = q6.f.f24207a
            java.util.Collections.sort(r13, r14)
            int r14 = r1.f24191b
            r15 = 0
            r16 = 0
        L_0x00b6:
            int r11 = r13.size()
            if (r15 >= r11) goto L_0x016e
            java.lang.Object r11 = r13.get(r15)
            q6.e$b r11 = (q6.e.b) r11
            q6.e$c r11 = r11.f24188a
            java.lang.String r11 = r11.f24190a
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00cf
            goto L_0x0107
        L_0x00cf:
            java.lang.Object r8 = r13.get(r15)
            q6.e$b r8 = (q6.e.b) r8
            q6.e$c r11 = r8.f24188a
            int r11 = c(r3, r0, r11)
            if (r11 == r10) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            if (r6 == r10) goto L_0x00e2
            r11 = r6
            goto L_0x00e3
        L_0x00e2:
            r11 = 1
        L_0x00e3:
            q6.e$c r10 = r8.f24188a
            int r10 = r10.f24191b
            int r10 = r10 - r16
            int r8 = r8.f24189b
            int r8 = r8 - r16
            java.lang.CharSequence r17 = r2.subSequence(r10, r8)
            r2.delete(r10, r8)
            l6.b r8 = new l6.b
            java.lang.String r12 = r17.toString()
            r8.<init>(r12, r11)
            r2.setSpan(r8, r14, r10, r7)
            int r8 = r17.length()
            int r16 = r8 + r16
            r14 = r10
        L_0x0107:
            int r15 = r15 + 1
            r10 = -1
            goto L_0x00b6
        L_0x010b:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x016e
        L_0x0114:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r9)
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x016e
        L_0x011d:
            java.util.Set<java.lang.String> r6 = r1.f24193d
            java.util.Iterator r6 = r6.iterator()
        L_0x0123:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x016e
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f24185c
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x014a
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            r10.<init>(r8)
            r2.setSpan(r10, r4, r5, r7)
            goto L_0x0123
        L_0x014a:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f24186d
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x0123
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.BackgroundColorSpan r10 = new android.text.style.BackgroundColorSpan
            r10.<init>(r8)
            r2.setSpan(r10, r4, r5, r7)
            goto L_0x0123
        L_0x0165:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
            r2.setSpan(r6, r4, r5, r7)
        L_0x016e:
            java.util.List r0 = b(r3, r0, r1)
            r1 = 0
        L_0x0173:
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r6 = r3.size()
            if (r1 >= r6) goto L_0x0242
            java.lang.Object r3 = r3.get(r1)
            q6.e$d r3 = (q6.e.d) r3
            q6.c r3 = r3.f24195b
            if (r3 != 0) goto L_0x018b
            r8 = -1
            r11 = 3
            r12 = 1
            goto L_0x023e
        L_0x018b:
            int r6 = r3.a()
            r8 = -1
            if (r6 == r8) goto L_0x019e
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            int r10 = r3.a()
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
        L_0x019e:
            int r6 = r3.f24173j
            r10 = 1
            if (r6 != r10) goto L_0x01a6
            r18 = 1
            goto L_0x01a8
        L_0x01a6:
            r18 = 0
        L_0x01a8:
            if (r18 == 0) goto L_0x01b2
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
        L_0x01b2:
            int r6 = r3.f24174k
            if (r6 != r10) goto L_0x01b8
            r6 = 1
            goto L_0x01b9
        L_0x01b8:
            r6 = 0
        L_0x01b9:
            if (r6 == 0) goto L_0x01c3
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
        L_0x01c3:
            boolean r6 = r3.f24170g
            if (r6 == 0) goto L_0x01de
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            boolean r10 = r3.f24170g
            if (r10 == 0) goto L_0x01d6
            int r10 = r3.f24169f
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
            goto L_0x01de
        L_0x01d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x01de:
            boolean r6 = r3.f24172i
            if (r6 == 0) goto L_0x01f9
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            boolean r10 = r3.f24172i
            if (r10 == 0) goto L_0x01f1
            int r10 = r3.f24171h
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
            goto L_0x01f9
        L_0x01f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x01f9:
            java.lang.String r6 = r3.f24168e
            if (r6 == 0) goto L_0x0207
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            java.lang.String r10 = r3.f24168e
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
        L_0x0207:
            int r6 = r3.f24177n
            r10 = 0
            r11 = 1
            if (r6 == r11) goto L_0x0227
            if (r6 == r9) goto L_0x021c
            r11 = 3
            if (r6 == r11) goto L_0x0213
            goto L_0x0225
        L_0x0213:
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
            goto L_0x0225
        L_0x021c:
            r11 = 3
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            r6.<init>(r10)
            e.b.a(r2, r6, r4, r5, r7)
        L_0x0225:
            r12 = 1
            goto L_0x0232
        L_0x0227:
            r11 = 3
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            int r10 = (int) r10
            r12 = 1
            r6.<init>(r10, r12)
            e.b.a(r2, r6, r4, r5, r7)
        L_0x0232:
            boolean r3 = r3.f24179p
            if (r3 == 0) goto L_0x023e
            l6.a r3 = new l6.a
            r3.<init>()
            r2.setSpan(r3, r4, r5, r7)
        L_0x023e:
            int r1 = r1 + 1
            goto L_0x0173
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.e.a(java.lang.String, q6.e$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static List<d> b(List<c> list, String str, c cVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar2 = list.get(i11);
            String str2 = cVar.f24190a;
            Set<String> set = cVar.f24193d;
            String str3 = cVar.f24192c;
            if (!cVar2.f24164a.isEmpty() || !cVar2.f24165b.isEmpty() || !cVar2.f24166c.isEmpty() || !cVar2.f24167d.isEmpty()) {
                int b10 = c.b(c.b(c.b(0, cVar2.f24164a, str, 1073741824), cVar2.f24165b, str2, 2), cVar2.f24167d, str3, 4);
                i10 = (b10 == -1 || !set.containsAll(cVar2.f24166c)) ? 0 : b10 + (cVar2.f24166c.size() * 4);
            } else {
                i10 = TextUtils.isEmpty(str2);
            }
            if (i10 > 0) {
                arrayList.add(new d(i10, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<c> list, String str, c cVar) {
        List<d> b10 = b(list, str, cVar);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) b10;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            int i11 = ((d) arrayList.get(i10)).f24195b.f24178o;
            if (i11 != -1) {
                return i11;
            }
            i10++;
        }
    }

    public static d d(String str, Matcher matcher, v vVar, List<c> list) {
        C0225e eVar = new C0225e();
        try {
            String group = matcher.group(1);
            group.getClass();
            eVar.f24196a = h.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            eVar.f24197b = h.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, eVar);
            StringBuilder sb2 = new StringBuilder();
            String g10 = vVar.g();
            while (!TextUtils.isEmpty(g10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(g10.trim());
                g10 = vVar.g();
            }
            eVar.f24198c = f(str, sb2.toString(), list);
            return new d(eVar.a().a(), eVar.f24196a, eVar.f24197b);
        } catch (NumberFormatException unused) {
            StringBuilder a10 = android.support.v4.media.a.a("Skipping cue with bad header: ");
            a10.append(matcher.group());
            Log.w("WebvttCueParser", a10.toString());
            return null;
        }
    }

    public static void e(String str, C0225e eVar) {
        Matcher matcher = f24184b.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, eVar);
                } else if ("align".equals(group)) {
                    group2.hashCode();
                    char c10 = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i10 = 3;
                            break;
                        case 3:
                            i10 = 4;
                            break;
                        case 4:
                            i10 = 5;
                            break;
                        case 5:
                            break;
                        default:
                            Log.w("WebvttCueParser", "Invalid alignment value: " + group2);
                            break;
                    }
                    i10 = 2;
                    eVar.f24199d = i10;
                    continue;
                } else if ("position".equals(group)) {
                    h(group2, eVar);
                } else if ("size".equals(group)) {
                    eVar.f24205j = h.b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i10 = 2;
                    } else if (!group2.equals("rl")) {
                        Log.w("WebvttCueParser", "Invalid 'vertical' value: " + group2);
                        i10 = Integer.MIN_VALUE;
                    }
                    eVar.f24206k = i10;
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder a10 = android.support.v4.media.a.a("Skipping bad cue setting: ");
                a10.append(matcher.group());
                Log.w("WebvttCueParser", a10.toString());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString f(java.lang.String r17, java.lang.String r18, java.util.List<q6.c> r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 >= r8) goto L_0x021a
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r13 = 60
            r14 = 38
            r15 = 2
            r12 = -1
            r16 = 1
            if (r8 == r14) goto L_0x0187
            if (r8 == r13) goto L_0x003a
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x0217
        L_0x003a:
            int r8 = r7 + 1
            int r13 = r18.length()
            if (r8 < r13) goto L_0x0045
        L_0x0042:
            r7 = r8
            goto L_0x0217
        L_0x0045:
            char r13 = r1.charAt(r8)
            r14 = 47
            if (r13 != r14) goto L_0x004f
            r13 = 1
            goto L_0x0050
        L_0x004f:
            r13 = 0
        L_0x0050:
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r12) goto L_0x005b
            int r8 = r18.length()
            goto L_0x005d
        L_0x005b:
            int r8 = r8 + 1
        L_0x005d:
            int r11 = r8 + -2
            char r12 = r1.charAt(r11)
            if (r12 != r14) goto L_0x0067
            r12 = 1
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            if (r13 == 0) goto L_0x006c
            r14 = 2
            goto L_0x006d
        L_0x006c:
            r14 = 1
        L_0x006d:
            int r7 = r7 + r14
            if (r12 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            int r11 = r8 + -1
        L_0x0073:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0083
            goto L_0x0106
        L_0x0083:
            java.lang.String r11 = r7.trim()
            boolean r14 = r11.isEmpty()
            r14 = r14 ^ 1
            v6.a.a(r14)
            int r14 = v6.e0.f26436a
            java.lang.String r14 = "[ \\.]"
            java.lang.String[] r11 = r11.split(r14, r15)
            r11 = r11[r6]
            r11.getClass()
            int r14 = r11.hashCode()
            switch(r14) {
                case 98: goto L_0x00f4;
                case 99: goto L_0x00e9;
                case 105: goto L_0x00de;
                case 117: goto L_0x00d3;
                case 118: goto L_0x00c8;
                case 3650: goto L_0x00bd;
                case 3314158: goto L_0x00b2;
                case 3511770: goto L_0x00a7;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r14 = -1
            goto L_0x00fe
        L_0x00a7:
            java.lang.String r14 = "ruby"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00b0
            goto L_0x00a4
        L_0x00b0:
            r14 = 7
            goto L_0x00fe
        L_0x00b2:
            java.lang.String r14 = "lang"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00bb
            goto L_0x00a4
        L_0x00bb:
            r14 = 6
            goto L_0x00fe
        L_0x00bd:
            java.lang.String r14 = "rt"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00c6
            goto L_0x00a4
        L_0x00c6:
            r14 = 5
            goto L_0x00fe
        L_0x00c8:
            java.lang.String r14 = "v"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00d1
            goto L_0x00a4
        L_0x00d1:
            r14 = 4
            goto L_0x00fe
        L_0x00d3:
            java.lang.String r14 = "u"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00dc
            goto L_0x00a4
        L_0x00dc:
            r14 = 3
            goto L_0x00fe
        L_0x00de:
            java.lang.String r14 = "i"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00e7
            goto L_0x00a4
        L_0x00e7:
            r14 = 2
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r14 = "c"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00f2
            goto L_0x00a4
        L_0x00f2:
            r14 = 1
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r14 = "b"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00fd
            goto L_0x00a4
        L_0x00fd:
            r14 = 0
        L_0x00fe:
            switch(r14) {
                case 0: goto L_0x0103;
                case 1: goto L_0x0103;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x0103;
                case 5: goto L_0x0103;
                case 6: goto L_0x0103;
                case 7: goto L_0x0103;
                default: goto L_0x0101;
            }
        L_0x0101:
            r14 = 0
            goto L_0x0104
        L_0x0103:
            r14 = 1
        L_0x0104:
            if (r14 != 0) goto L_0x0109
        L_0x0106:
            r7 = r8
            goto L_0x0017
        L_0x0109:
            if (r13 == 0) goto L_0x013d
        L_0x010b:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0113
            goto L_0x0042
        L_0x0113:
            java.lang.Object r7 = r4.pop()
            q6.e$c r7 = (q6.e.c) r7
            a(r0, r7, r5, r3, r2)
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0130
            q6.e$b r9 = new q6.e$b
            int r10 = r3.length()
            r12 = 0
            r9.<init>(r7, r10, r12)
            r5.add(r9)
            goto L_0x0133
        L_0x0130:
            r5.clear()
        L_0x0133:
            java.lang.String r7 = r7.f24190a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x010b
            goto L_0x0042
        L_0x013d:
            if (r12 != 0) goto L_0x0042
            int r11 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r12 = r7.isEmpty()
            r12 = r12 ^ 1
            v6.a.a(r12)
            int r10 = r7.indexOf(r10)
            r12 = -1
            if (r10 != r12) goto L_0x0158
            goto L_0x0164
        L_0x0158:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.String r7 = r7.substring(r6, r10)
        L_0x0164:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = v6.e0.R(r7, r10)
            r10 = r7[r6]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r13 = 1
        L_0x0172:
            int r14 = r7.length
            if (r13 >= r14) goto L_0x017d
            r14 = r7[r13]
            r12.add(r14)
            int r13 = r13 + 1
            goto L_0x0172
        L_0x017d:
            q6.e$c r7 = new q6.e$c
            r7.<init>(r10, r11, r9, r12)
            r4.push(r7)
            goto L_0x0042
        L_0x0187:
            r9 = 59
            int r7 = r7 + 1
            int r9 = r1.indexOf(r9, r7)
            r12 = 32
            int r15 = r1.indexOf(r12, r7)
            r6 = -1
            if (r9 != r6) goto L_0x019a
            r9 = r15
            goto L_0x01a1
        L_0x019a:
            if (r15 != r6) goto L_0x019d
            goto L_0x01a1
        L_0x019d:
            int r9 = java.lang.Math.min(r9, r15)
        L_0x01a1:
            if (r9 == r6) goto L_0x0214
            java.lang.String r7 = r1.substring(r7, r9)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 3309: goto L_0x01d3;
                case 3464: goto L_0x01c8;
                case 96708: goto L_0x01bd;
                case 3374865: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x01dd
        L_0x01b2:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01bb
            goto L_0x01dd
        L_0x01bb:
            r6 = 3
            goto L_0x01dd
        L_0x01bd:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01c6
            goto L_0x01dd
        L_0x01c6:
            r6 = 2
            goto L_0x01dd
        L_0x01c8:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01d1
            goto L_0x01dd
        L_0x01d1:
            r6 = 1
            goto L_0x01dd
        L_0x01d3:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x01dc
            goto L_0x01dd
        L_0x01dc:
            r6 = 0
        L_0x01dd:
            switch(r6) {
                case 0: goto L_0x0208;
                case 1: goto L_0x0204;
                case 2: goto L_0x0200;
                case 3: goto L_0x01fc;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "ignoring unsupported entity: '&"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = ";'"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "WebvttCueParser"
            android.util.Log.w(r7, r6)
            goto L_0x020b
        L_0x01fc:
            r3.append(r12)
            goto L_0x020b
        L_0x0200:
            r3.append(r14)
            goto L_0x020b
        L_0x0204:
            r3.append(r13)
            goto L_0x020b
        L_0x0208:
            r3.append(r11)
        L_0x020b:
            if (r9 != r15) goto L_0x0210
            r3.append(r10)
        L_0x0210:
            int r9 = r9 + 1
            r7 = r9
            goto L_0x0217
        L_0x0214:
            r3.append(r8)
        L_0x0217:
            r6 = 0
            goto L_0x0017
        L_0x021a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x022a
            java.lang.Object r1 = r4.pop()
            q6.e$c r1 = (q6.e.c) r1
            a(r0, r1, r5, r3, r2)
            goto L_0x021a
        L_0x022a:
            q6.e$c r1 = new q6.e$c
            java.util.Set r4 = java.util.Collections.emptySet()
            r5 = 0
            r1.<init>(r9, r5, r9, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            a(r0, r1, r4, r3, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.e.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, C0225e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            substring.hashCode();
            int i10 = 2;
            char c10 = 65535;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    z0.a("Invalid anchor value: ", substring, "WebvttCueParser");
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            eVar.f24202g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f24200e = h.b(str);
            eVar.f24201f = 0;
            return;
        }
        eVar.f24200e = (float) Integer.parseInt(str);
        eVar.f24201f = 1;
    }

    public static void h(String str, C0225e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            substring.hashCode();
            int i10 = 2;
            char c10 = 65535;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 5:
                    i10 = 0;
                    break;
                case 1:
                case 3:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    z0.a("Invalid anchor value: ", substring, "WebvttCueParser");
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            eVar.f24204i = i10;
            str = str.substring(0, indexOf);
        }
        eVar.f24203h = h.b(str);
    }
}
