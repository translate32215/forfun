package o6;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import h6.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: TtmlNode */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23038a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23039b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23040c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23041d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23042e;

    /* renamed from: f  reason: collision with root package name */
    public final f f23043f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f23044g;

    /* renamed from: h  reason: collision with root package name */
    public final String f23045h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23046i;

    /* renamed from: j  reason: collision with root package name */
    public final d f23047j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Integer> f23048k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Integer> f23049l;

    /* renamed from: m  reason: collision with root package name */
    public List<d> f23050m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        this.f23038a = str;
        this.f23039b = str2;
        this.f23046i = str4;
        this.f23043f = fVar;
        this.f23044g = strArr;
        this.f23040c = str2 != null;
        this.f23041d = j10;
        this.f23042e = j11;
        str3.getClass();
        this.f23045h = str3;
        this.f23047j = dVar;
        this.f23048k = new HashMap<>();
        this.f23049l = new HashMap<>();
    }

    public static d b(String str) {
        return new d((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (f) null, (String[]) null, "", (String) null, (d) null);
    }

    public static SpannableStringBuilder f(String str, Map<String, b.C0156b> map) {
        if (!map.containsKey(str)) {
            b.C0156b bVar = new b.C0156b();
            bVar.f18938a = new SpannableStringBuilder();
            map.put(str, bVar);
        }
        CharSequence charSequence = map.get(str).f18938a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public void a(d dVar) {
        if (this.f23050m == null) {
            this.f23050m = new ArrayList();
        }
        this.f23050m.add(dVar);
    }

    public d c(int i10) {
        List<d> list = this.f23050m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int d() {
        List<d> list = this.f23050m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f23038a);
        boolean equals2 = "div".equals(this.f23038a);
        if (z10 || equals || (equals2 && this.f23046i != null)) {
            long j10 = this.f23041d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f23042e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f23050m != null) {
            for (int i10 = 0; i10 < this.f23050m.size(); i10++) {
                this.f23050m.get(i10).e(treeSet, z10 || equals);
            }
        }
    }

    public boolean g(long j10) {
        long j11 = this.f23041d;
        return (j11 == -9223372036854775807L && this.f23042e == -9223372036854775807L) || (j11 <= j10 && this.f23042e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f23042e) || (j11 <= j10 && j10 < this.f23042e));
    }

    public final void h(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f23045h)) {
            str = this.f23045h;
        }
        if (!g(j10) || !"div".equals(this.f23038a) || this.f23046i == null) {
            for (int i10 = 0; i10 < d(); i10++) {
                c(i10).h(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f23046i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(long r18, java.util.Map<java.lang.String, o6.f> r20, java.util.Map<java.lang.String, o6.e> r21, java.lang.String r22, java.util.Map<java.lang.String, h6.b.C0156b> r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            boolean r1 = r17.g(r18)
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r1 = r0.f23045h
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0018
            r9 = r22
            goto L_0x001b
        L_0x0018:
            java.lang.String r1 = r0.f23045h
            r9 = r1
        L_0x001b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f23049l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0244
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f23048k
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x004c
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f23048k
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 == r2) goto L_0x023a
            r10 = r23
            java.lang.Object r4 = r10.get(r4)
            h6.b$b r4 = (h6.b.C0156b) r4
            r4.getClass()
            r11 = r21
            java.lang.Object r6 = r11.get(r9)
            o6.e r6 = (o6.e) r6
            r6.getClass()
            int r6 = r6.f23060j
            o6.f r7 = r0.f23043f
            java.lang.String[] r12 = r0.f23044g
            o6.f r7 = e.d.l(r7, r12, r8)
            java.lang.CharSequence r12 = r4.f18938a
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
            if (r12 != 0) goto L_0x0086
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r4.f18938a = r12
        L_0x0086:
            if (r7 == 0) goto L_0x023e
            o6.d r13 = r0.f23047j
            int r14 = r7.b()
            r15 = 33
            r3 = -1
            if (r14 == r3) goto L_0x009f
            android.text.style.StyleSpan r14 = new android.text.style.StyleSpan
            int r3 = r7.b()
            r14.<init>(r3)
            r12.setSpan(r14, r5, r2, r15)
        L_0x009f:
            int r3 = r7.f23066f
            r14 = 1
            if (r3 != r14) goto L_0x00a6
            r3 = 1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b1
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r15)
        L_0x00b1:
            int r3 = r7.f23067g
            if (r3 != r14) goto L_0x00b7
            r3 = 1
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            if (r3 == 0) goto L_0x00c2
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r15)
        L_0x00c2:
            boolean r3 = r7.f23063c
            if (r3 == 0) goto L_0x00dd
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            boolean r14 = r7.f23063c
            if (r14 == 0) goto L_0x00d5
            int r14 = r7.f23062b
            r3.<init>(r14)
            e.b.a(r12, r3, r5, r2, r15)
            goto L_0x00dd
        L_0x00d5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Font color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x00dd:
            boolean r3 = r7.f23065e
            if (r3 == 0) goto L_0x00f8
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            boolean r14 = r7.f23065e
            if (r14 == 0) goto L_0x00f0
            int r14 = r7.f23064d
            r3.<init>(r14)
            e.b.a(r12, r3, r5, r2, r15)
            goto L_0x00f8
        L_0x00f0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Background color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x00f8:
            java.lang.String r3 = r7.f23061a
            if (r3 == 0) goto L_0x0106
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            java.lang.String r14 = r7.f23061a
            r3.<init>(r14)
            e.b.a(r12, r3, r5, r2, r15)
        L_0x0106:
            o6.b r3 = r7.f23077q
            r14 = 2
            if (r3 == 0) goto L_0x0131
            int r15 = r3.f23019a
            r16 = r1
            r1 = -1
            if (r15 != r1) goto L_0x011e
            if (r6 == r14) goto L_0x011a
            r1 = 1
            if (r6 != r1) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r1 = 1
            goto L_0x011b
        L_0x011a:
            r1 = 3
        L_0x011b:
            r15 = r1
            r1 = 1
            goto L_0x0120
        L_0x011e:
            int r1 = r3.f23020b
        L_0x0120:
            int r3 = r3.f23021c
            r6 = -2
            if (r3 != r6) goto L_0x0126
            r3 = 1
        L_0x0126:
            l6.c r6 = new l6.c
            r6.<init>(r15, r1, r3)
            r1 = 33
            e.b.a(r12, r6, r5, r2, r1)
            goto L_0x0133
        L_0x0131:
            r16 = r1
        L_0x0133:
            int r1 = r7.f23073m
            if (r1 == r14) goto L_0x0149
            r3 = 3
            if (r1 == r3) goto L_0x013e
            r3 = 4
            if (r1 == r3) goto L_0x013e
            goto L_0x019d
        L_0x013e:
            o6.a r1 = new o6.a
            r1.<init>()
            r3 = 33
            r12.setSpan(r1, r5, r2, r3)
            goto L_0x019d
        L_0x0149:
            if (r13 == 0) goto L_0x015e
            o6.f r3 = r13.f23043f
            java.lang.String[] r6 = r13.f23044g
            o6.f r3 = e.d.l(r3, r6, r8)
            if (r3 == 0) goto L_0x015b
            int r3 = r3.f23073m
            r6 = 1
            if (r3 != r6) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            o6.d r13 = r13.f23047j
            goto L_0x0149
        L_0x015e:
            r13 = 0
        L_0x015f:
            if (r13 != 0) goto L_0x0162
            goto L_0x019d
        L_0x0162:
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r3.push(r13)
        L_0x016a:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x019a
            java.lang.Object r6 = r3.pop()
            o6.d r6 = (o6.d) r6
            o6.f r15 = r6.f23043f
            java.lang.String[] r1 = r6.f23044g
            o6.f r1 = e.d.l(r15, r1, r8)
            if (r1 == 0) goto L_0x0187
            int r1 = r1.f23073m
            r15 = 3
            if (r1 != r15) goto L_0x0187
            r1 = r6
            goto L_0x019b
        L_0x0187:
            int r1 = r6.d()
            r15 = -1
            int r1 = r1 + r15
        L_0x018d:
            if (r1 < 0) goto L_0x016a
            o6.d r15 = r6.c(r1)
            r3.push(r15)
            int r1 = r1 + -1
            r15 = -1
            goto L_0x018d
        L_0x019a:
            r1 = 0
        L_0x019b:
            if (r1 != 0) goto L_0x019f
        L_0x019d:
            r3 = 0
            goto L_0x01d2
        L_0x019f:
            int r3 = r1.d()
            r6 = 1
            if (r3 != r6) goto L_0x01ca
            r3 = 0
            o6.d r6 = r1.c(r3)
            java.lang.String r6 = r6.f23039b
            if (r6 == 0) goto L_0x01cb
            o6.d r1 = r1.c(r3)
            java.lang.String r1 = r1.f23039b
            int r6 = v6.e0.f26436a
            o6.f r6 = r13.f23043f
            if (r6 == 0) goto L_0x01be
            int r6 = r6.f23074n
            goto L_0x01bf
        L_0x01be:
            r6 = -1
        L_0x01bf:
            l6.b r13 = new l6.b
            r13.<init>(r1, r6)
            r1 = 33
            r12.setSpan(r13, r5, r2, r1)
            goto L_0x01d2
        L_0x01ca:
            r3 = 0
        L_0x01cb:
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r6 = "Skipping rubyText node without exactly one text child."
            android.util.Log.i(r1, r6)
        L_0x01d2:
            int r1 = r7.f23076p
            r6 = 1
            if (r1 != r6) goto L_0x01d8
            r3 = 1
        L_0x01d8:
            if (r3 == 0) goto L_0x01e4
            l6.a r1 = new l6.a
            r1.<init>()
            r3 = 33
            e.b.a(r12, r1, r5, r2, r3)
        L_0x01e4:
            int r1 = r7.f23070j
            r3 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r6) goto L_0x020b
            if (r1 == r14) goto L_0x01fe
            r6 = 3
            if (r1 == r6) goto L_0x01f0
            goto L_0x0219
        L_0x01f0:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r6 = r7.f23071k
            float r6 = r6 / r3
            r1.<init>(r6)
            r6 = 33
            e.b.a(r12, r1, r5, r2, r6)
            goto L_0x0219
        L_0x01fe:
            r6 = 33
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r13 = r7.f23071k
            r1.<init>(r13)
            e.b.a(r12, r1, r5, r2, r6)
            goto L_0x0219
        L_0x020b:
            r6 = 33
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r13 = r7.f23071k
            int r13 = (int) r13
            r14 = 1
            r1.<init>(r13, r14)
            e.b.a(r12, r1, r5, r2, r6)
        L_0x0219:
            float r1 = r7.f23078r
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0235
            java.lang.String r1 = r0.f23038a
            java.lang.String r2 = "p"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0235
            float r1 = r7.f23078r
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            float r1 = r1 / r3
            r4.f18953p = r1
        L_0x0235:
            android.text.Layout$Alignment r1 = r7.f23075o
            r4.f18940c = r1
            goto L_0x0240
        L_0x023a:
            r11 = r21
            r10 = r23
        L_0x023e:
            r16 = r1
        L_0x0240:
            r1 = r16
            goto L_0x0025
        L_0x0244:
            r11 = r21
            r10 = r23
            r3 = 0
            r12 = 0
        L_0x024a:
            int r1 = r17.d()
            if (r12 >= r1) goto L_0x0263
            o6.d r1 = r0.c(r12)
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r9
            r7 = r23
            r1.i(r2, r4, r5, r6, r7)
            int r12 = r12 + 1
            goto L_0x024a
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d.i(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final void j(long j10, boolean z10, String str, Map<String, b.C0156b> map) {
        this.f23048k.clear();
        this.f23049l.clear();
        if (!"metadata".equals(this.f23038a)) {
            if (!"".equals(this.f23045h)) {
                str = this.f23045h;
            }
            if (this.f23040c && z10) {
                SpannableStringBuilder f10 = f(str, map);
                String str2 = this.f23039b;
                str2.getClass();
                f10.append(str2);
            } else if ("br".equals(this.f23038a) && z10) {
                f(str, map).append(10);
            } else if (g(j10)) {
                for (Map.Entry next : map.entrySet()) {
                    CharSequence charSequence = ((b.C0156b) next.getValue()).f18938a;
                    charSequence.getClass();
                    this.f23048k.put((String) next.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(this.f23038a);
                for (int i10 = 0; i10 < d(); i10++) {
                    c(i10).j(j10, z10 || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder f11 = f(str, map);
                    int length = f11.length();
                    do {
                        length--;
                        if (length < 0 || f11.charAt(length) != ' ') {
                            if (length >= 0 && f11.charAt(length) != 10) {
                                f11.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (f11.charAt(length) != ' ');
                    f11.append(10);
                }
                for (Map.Entry next2 : map.entrySet()) {
                    CharSequence charSequence2 = ((b.C0156b) next2.getValue()).f18938a;
                    charSequence2.getClass();
                    this.f23049l.put((String) next2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
