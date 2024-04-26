package i6;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import h6.b;
import h6.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v6.e0;
import v6.v;

/* compiled from: Cea608Decoder */
public final class a extends d {
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f19238y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f19239z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g  reason: collision with root package name */
    public final v f19240g = new v();

    /* renamed from: h  reason: collision with root package name */
    public final int f19241h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19242i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19243j;

    /* renamed from: k  reason: collision with root package name */
    public final long f19244k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<C0161a> f19245l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public C0161a f19246m = new C0161a(0, 4);

    /* renamed from: n  reason: collision with root package name */
    public List<b> f19247n;

    /* renamed from: o  reason: collision with root package name */
    public List<b> f19248o;

    /* renamed from: p  reason: collision with root package name */
    public int f19249p;

    /* renamed from: q  reason: collision with root package name */
    public int f19250q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19251r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f19252s;

    /* renamed from: t  reason: collision with root package name */
    public byte f19253t;

    /* renamed from: u  reason: collision with root package name */
    public byte f19254u;

    /* renamed from: v  reason: collision with root package name */
    public int f19255v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f19256w;

    /* renamed from: x  reason: collision with root package name */
    public long f19257x;

    /* renamed from: i6.a$a  reason: collision with other inner class name */
    /* compiled from: Cea608Decoder */
    public static final class C0161a {

        /* renamed from: a  reason: collision with root package name */
        public final List<C0162a> f19258a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<SpannableString> f19259b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final StringBuilder f19260c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        public int f19261d;

        /* renamed from: e  reason: collision with root package name */
        public int f19262e;

        /* renamed from: f  reason: collision with root package name */
        public int f19263f;

        /* renamed from: g  reason: collision with root package name */
        public int f19264g;

        /* renamed from: h  reason: collision with root package name */
        public int f19265h;

        /* renamed from: i6.a$a$a  reason: collision with other inner class name */
        /* compiled from: Cea608Decoder */
        public static class C0162a {

            /* renamed from: a  reason: collision with root package name */
            public final int f19266a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f19267b;

            /* renamed from: c  reason: collision with root package name */
            public int f19268c;

            public C0162a(int i10, boolean z10, int i11) {
                this.f19266a = i10;
                this.f19267b = z10;
                this.f19268c = i11;
            }
        }

        public C0161a(int i10, int i11) {
            f(i10);
            this.f19265h = i11;
        }

        public void a(char c10) {
            if (this.f19260c.length() < 32) {
                this.f19260c.append(c10);
            }
        }

        public void b() {
            int length = this.f19260c.length();
            if (length > 0) {
                this.f19260c.delete(length - 1, length);
                int size = this.f19258a.size() - 1;
                while (size >= 0) {
                    C0162a aVar = this.f19258a.get(size);
                    int i10 = aVar.f19268c;
                    if (i10 == length) {
                        aVar.f19268c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public b c(int i10) {
            int i11;
            float f10;
            int i12 = this.f19262e + this.f19263f;
            int i13 = 32 - i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < this.f19259b.size(); i14++) {
                CharSequence charSequence = this.f19259b.get(i14);
                int i15 = e0.f26436a;
                if (charSequence.length() > i13) {
                    charSequence = charSequence.subSequence(0, i13);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append(10);
            }
            SpannableString d10 = d();
            int i16 = e0.f26436a;
            int length = d10.length();
            CharSequence charSequence2 = d10;
            if (length > i13) {
                charSequence2 = d10.subSequence(0, i13);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i13 - spannableStringBuilder.length();
            int i17 = i12 - length2;
            int i18 = i10;
            if (i18 != Integer.MIN_VALUE) {
                i11 = i18;
            } else if (this.f19264g != 2 || (Math.abs(i17) >= 3 && length2 >= 0)) {
                i11 = (this.f19264g != 2 || i17 <= 0) ? 0 : 2;
            } else {
                i11 = 1;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i12 = 32 - length2;
                }
                f10 = ((((float) i12) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i19 = this.f19261d;
            if (i19 > 7) {
                i19 = (i19 - 15) - 2;
            } else if (this.f19264g == 1) {
                i19 -= this.f19265h - 1;
            }
            return new b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (Bitmap) null, (float) i19, 1, Integer.MIN_VALUE, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, (b.a) null);
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19260c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            boolean z10 = false;
            int i15 = -1;
            while (i10 < this.f19258a.size()) {
                C0162a aVar = this.f19258a.get(i10);
                boolean z11 = aVar.f19267b;
                int i16 = aVar.f19266a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f19268c;
                i10++;
                if (i17 != (i10 < this.f19258a.size() ? this.f19258a.get(i10).f19268c : length)) {
                    if (i11 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        if (i14 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                        }
                        i13 = i17;
                        i14 = i15;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (!(i12 == -1 || i12 == length)) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
            if (!(i13 == length || i14 == -1)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean e() {
            return this.f19258a.isEmpty() && this.f19259b.isEmpty() && this.f19260c.length() == 0;
        }

        public void f(int i10) {
            this.f19264g = i10;
            this.f19258a.clear();
            this.f19259b.clear();
            this.f19260c.setLength(0);
            this.f19261d = 15;
            this.f19262e = 0;
            this.f19263f = 0;
        }
    }

    public a(String str, int i10, long j10) {
        this.f19244k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f19241h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f19243j = 0;
            this.f19242i = 0;
        } else if (i10 == 2) {
            this.f19243j = 1;
            this.f19242i = 0;
        } else if (i10 == 3) {
            this.f19243j = 0;
            this.f19242i = 1;
        } else if (i10 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f19243j = 0;
            this.f19242i = 0;
        } else {
            this.f19243j = 1;
            this.f19242i = 1;
        }
        m(0);
        l();
        this.f19256w = true;
        this.f19257x = -9223372036854775807L;
    }

    public void a() {
    }

    public e f() {
        List<b> list = this.f19247n;
        this.f19248o = list;
        list.getClass();
        return new e(list, 0);
    }

    public void flush() {
        super.flush();
        this.f19247n = null;
        this.f19248o = null;
        m(0);
        n(4);
        l();
        this.f19251r = false;
        this.f19252s = false;
        this.f19253t = 0;
        this.f19254u = 0;
        this.f19255v = 0;
        this.f19256w = true;
        this.f19257x = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(h6.i r14) {
        /*
            r13 = this;
            java.nio.ByteBuffer r14 = r14.f86c
            r14.getClass()
            v6.v r0 = r13.f19240g
            byte[] r1 = r14.array()
            int r14 = r14.limit()
            r0.B(r1, r14)
            r14 = 0
            r0 = 1
            r1 = 0
        L_0x0015:
            v6.v r2 = r13.f19240g
            int r2 = r2.a()
            int r3 = r13.f19241h
            r4 = 3
            if (r2 < r3) goto L_0x02b8
            r2 = 2
            if (r3 != r2) goto L_0x0025
            r3 = -4
            goto L_0x002c
        L_0x0025:
            v6.v r3 = r13.f19240g
            int r3 = r3.s()
            byte r3 = (byte) r3
        L_0x002c:
            v6.v r5 = r13.f19240g
            int r5 = r5.s()
            v6.v r6 = r13.f19240g
            int r6 = r6.s()
            r7 = r3 & 2
            if (r7 == 0) goto L_0x003d
            goto L_0x0015
        L_0x003d:
            r7 = r3 & 1
            int r8 = r13.f19242i
            if (r7 == r8) goto L_0x0044
            goto L_0x0015
        L_0x0044:
            r7 = r5 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            if (r7 != 0) goto L_0x004f
            if (r8 != 0) goto L_0x004f
            goto L_0x0015
        L_0x004f:
            boolean r9 = r13.f19251r
            r3 = r3 & 4
            r10 = 4
            if (r3 != r10) goto L_0x0062
            boolean[] r3 = F
            boolean r5 = r3[r5]
            if (r5 == 0) goto L_0x0062
            boolean r3 = r3[r6]
            if (r3 == 0) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            r13.f19251r = r3
            r5 = 16
            if (r3 == 0) goto L_0x0089
            r6 = r7 & 240(0xf0, float:3.36E-43)
            if (r6 != r5) goto L_0x006f
            r6 = 1
            goto L_0x0070
        L_0x006f:
            r6 = 0
        L_0x0070:
            if (r6 == 0) goto L_0x0089
            boolean r6 = r13.f19252s
            if (r6 == 0) goto L_0x0082
            byte r6 = r13.f19253t
            if (r6 != r7) goto L_0x0082
            byte r6 = r13.f19254u
            if (r6 != r8) goto L_0x0082
            r13.f19252s = r14
            r6 = 1
            goto L_0x008c
        L_0x0082:
            r13.f19252s = r0
            r13.f19253t = r7
            r13.f19254u = r8
            goto L_0x008b
        L_0x0089:
            r13.f19252s = r14
        L_0x008b:
            r6 = 0
        L_0x008c:
            if (r6 == 0) goto L_0x008f
            goto L_0x0015
        L_0x008f:
            if (r3 != 0) goto L_0x0098
            if (r9 == 0) goto L_0x0015
            r13.l()
            goto L_0x02b5
        L_0x0098:
            if (r0 > r7) goto L_0x00a0
            r3 = 15
            if (r7 > r3) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r6 = 20
            r9 = 32
            if (r3 == 0) goto L_0x00aa
            r13.f19256w = r14
            goto L_0x00c5
        L_0x00aa:
            r3 = r7 & 247(0xf7, float:3.46E-43)
            if (r3 != r6) goto L_0x00b0
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            if (r3 == 0) goto L_0x00c5
            if (r8 == r9) goto L_0x00c3
            r3 = 47
            if (r8 == r3) goto L_0x00c3
            switch(r8) {
                case 37: goto L_0x00c3;
                case 38: goto L_0x00c3;
                case 39: goto L_0x00c3;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            switch(r8) {
                case 41: goto L_0x00c3;
                case 42: goto L_0x00c0;
                case 43: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00c5
        L_0x00c0:
            r13.f19256w = r14
            goto L_0x00c5
        L_0x00c3:
            r13.f19256w = r0
        L_0x00c5:
            boolean r3 = r13.f19256w
            if (r3 != 0) goto L_0x00cb
            goto L_0x0015
        L_0x00cb:
            r3 = r7 & 224(0xe0, float:3.14E-43)
            if (r3 != 0) goto L_0x00d1
            r11 = 1
            goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            if (r11 == 0) goto L_0x00d9
            int r11 = r7 >> 3
            r11 = r11 & r0
            r13.f19255v = r11
        L_0x00d9:
            int r11 = r13.f19255v
            int r12 = r13.f19243j
            if (r11 != r12) goto L_0x00e1
            r11 = 1
            goto L_0x00e2
        L_0x00e1:
            r11 = 0
        L_0x00e2:
            if (r11 != 0) goto L_0x00e6
            goto L_0x0015
        L_0x00e6:
            if (r3 != 0) goto L_0x00ea
            r1 = 1
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            if (r1 == 0) goto L_0x0297
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r3 = 17
            if (r1 != r3) goto L_0x00fb
            r11 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r11 != r12) goto L_0x00fb
            r11 = 1
            goto L_0x00fc
        L_0x00fb:
            r11 = 0
        L_0x00fc:
            if (r11 == 0) goto L_0x010c
            i6.a$a r1 = r13.f19246m
            r2 = r8 & 15
            int[] r3 = C
            r2 = r3[r2]
            char r2 = (char) r2
            r1.a(r2)
            goto L_0x02b5
        L_0x010c:
            r11 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r11 != r12) goto L_0x0118
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x0118
            r12 = 1
            goto L_0x0119
        L_0x0118:
            r12 = 0
        L_0x0119:
            if (r12 == 0) goto L_0x0139
            i6.a$a r1 = r13.f19246m
            r1.b()
            i6.a$a r1 = r13.f19246m
            r2 = r7 & 1
            if (r2 != 0) goto L_0x012d
            r2 = r8 & 31
            int[] r3 = D
            r2 = r3[r2]
            goto L_0x0133
        L_0x012d:
            r2 = r8 & 31
            int[] r3 = E
            r2 = r3[r2]
        L_0x0133:
            char r2 = (char) r2
            r1.a(r2)
            goto L_0x02b5
        L_0x0139:
            if (r1 != r3) goto L_0x0141
            r3 = r8 & 240(0xf0, float:3.36E-43)
            if (r3 != r9) goto L_0x0141
            r3 = 1
            goto L_0x0142
        L_0x0141:
            r3 = 0
        L_0x0142:
            if (r3 == 0) goto L_0x0168
            i6.a$a r1 = r13.f19246m
            r1.a(r9)
            r1 = r8 & 1
            if (r1 != r0) goto L_0x014f
            r1 = 1
            goto L_0x0150
        L_0x014f:
            r1 = 0
        L_0x0150:
            int r2 = r8 >> 1
            r2 = r2 & 7
            i6.a$a r3 = r13.f19246m
            java.util.List<i6.a$a$a> r4 = r3.f19258a
            i6.a$a$a r5 = new i6.a$a$a
            java.lang.StringBuilder r3 = r3.f19260c
            int r3 = r3.length()
            r5.<init>(r2, r1, r3)
            r4.add(r5)
            goto L_0x02b5
        L_0x0168:
            r3 = r7 & 240(0xf0, float:3.36E-43)
            if (r3 != r5) goto L_0x0174
            r3 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r3 != r12) goto L_0x0174
            r3 = 1
            goto L_0x0175
        L_0x0174:
            r3 = 0
        L_0x0175:
            if (r3 == 0) goto L_0x01e2
            int[] r1 = f19238y
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 == 0) goto L_0x0183
            r2 = 1
            goto L_0x0184
        L_0x0183:
            r2 = 0
        L_0x0184:
            if (r2 == 0) goto L_0x0188
            int r1 = r1 + 1
        L_0x0188:
            i6.a$a r2 = r13.f19246m
            int r3 = r2.f19261d
            if (r1 == r3) goto L_0x01ac
            int r3 = r13.f19249p
            if (r3 == r0) goto L_0x01a8
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x01a8
            i6.a$a r2 = new i6.a$a
            int r3 = r13.f19249p
            int r4 = r13.f19250q
            r2.<init>(r3, r4)
            r13.f19246m = r2
            java.util.ArrayList<i6.a$a> r3 = r13.f19245l
            r3.add(r2)
        L_0x01a8:
            i6.a$a r2 = r13.f19246m
            r2.f19261d = r1
        L_0x01ac:
            r1 = r8 & 16
            if (r1 != r5) goto L_0x01b2
            r1 = 1
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = r8 & 1
            if (r2 != r0) goto L_0x01b9
            r2 = 1
            goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            int r3 = r8 >> 1
            r3 = r3 & 7
            i6.a$a r4 = r13.f19246m
            if (r1 == 0) goto L_0x01c5
            r5 = 8
            goto L_0x01c6
        L_0x01c5:
            r5 = r3
        L_0x01c6:
            java.util.List<i6.a$a$a> r6 = r4.f19258a
            i6.a$a$a r7 = new i6.a$a$a
            java.lang.StringBuilder r4 = r4.f19260c
            int r4 = r4.length()
            r7.<init>(r5, r2, r4)
            r6.add(r7)
            if (r1 == 0) goto L_0x02b5
            i6.a$a r1 = r13.f19246m
            int[] r2 = f19239z
            r2 = r2[r3]
            r1.f19262e = r2
            goto L_0x02b5
        L_0x01e2:
            r3 = 23
            r5 = 33
            if (r1 != r3) goto L_0x01f0
            if (r8 < r5) goto L_0x01f0
            r1 = 35
            if (r8 > r1) goto L_0x01f0
            r1 = 1
            goto L_0x01f1
        L_0x01f0:
            r1 = 0
        L_0x01f1:
            if (r1 == 0) goto L_0x01fb
            i6.a$a r1 = r13.f19246m
            int r8 = r8 + -32
            r1.f19263f = r8
            goto L_0x02b5
        L_0x01fb:
            if (r11 != r6) goto L_0x0203
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L_0x0203
            r1 = 1
            goto L_0x0204
        L_0x0203:
            r1 = 0
        L_0x0204:
            if (r1 == 0) goto L_0x02b5
            if (r8 == r9) goto L_0x0293
            r1 = 41
            if (r8 == r1) goto L_0x028f
            switch(r8) {
                case 37: goto L_0x0225;
                case 38: goto L_0x021d;
                case 39: goto L_0x0215;
                default: goto L_0x020f;
            }
        L_0x020f:
            int r1 = r13.f19249p
            if (r1 != 0) goto L_0x022d
            goto L_0x02b5
        L_0x0215:
            r13.m(r0)
            r13.n(r10)
            goto L_0x02b5
        L_0x021d:
            r13.m(r0)
            r13.n(r4)
            goto L_0x02b5
        L_0x0225:
            r13.m(r0)
            r13.n(r2)
            goto L_0x02b5
        L_0x022d:
            if (r8 == r5) goto L_0x0289
            switch(r8) {
                case 44: goto L_0x0279;
                case 45: goto L_0x0244;
                case 46: goto L_0x023f;
                case 47: goto L_0x0234;
                default: goto L_0x0232;
            }
        L_0x0232:
            goto L_0x02b5
        L_0x0234:
            java.util.List r1 = r13.k()
            r13.f19247n = r1
            r13.l()
            goto L_0x02b5
        L_0x023f:
            r13.l()
            goto L_0x02b5
        L_0x0244:
            if (r1 != r0) goto L_0x02b5
            i6.a$a r1 = r13.f19246m
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x02b5
            i6.a$a r1 = r13.f19246m
            java.util.List<android.text.SpannableString> r2 = r1.f19259b
            android.text.SpannableString r3 = r1.d()
            r2.add(r3)
            java.lang.StringBuilder r2 = r1.f19260c
            r2.setLength(r14)
            java.util.List<i6.a$a$a> r2 = r1.f19258a
            r2.clear()
            int r2 = r1.f19265h
            int r3 = r1.f19261d
            int r2 = java.lang.Math.min(r2, r3)
        L_0x026b:
            java.util.List<android.text.SpannableString> r3 = r1.f19259b
            int r3 = r3.size()
            if (r3 < r2) goto L_0x02b5
            java.util.List<android.text.SpannableString> r3 = r1.f19259b
            r3.remove(r14)
            goto L_0x026b
        L_0x0279:
            java.util.List r1 = java.util.Collections.emptyList()
            r13.f19247n = r1
            int r1 = r13.f19249p
            if (r1 == r0) goto L_0x0285
            if (r1 != r4) goto L_0x02b5
        L_0x0285:
            r13.l()
            goto L_0x02b5
        L_0x0289:
            i6.a$a r1 = r13.f19246m
            r1.b()
            goto L_0x02b5
        L_0x028f:
            r13.m(r4)
            goto L_0x02b5
        L_0x0293:
            r13.m(r2)
            goto L_0x02b5
        L_0x0297:
            i6.a$a r1 = r13.f19246m
            r2 = r7 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            int[] r3 = B
            r2 = r3[r2]
            char r2 = (char) r2
            r1.a(r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x02b5
            i6.a$a r1 = r13.f19246m
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            r2 = r3[r2]
            char r2 = (char) r2
            r1.a(r2)
        L_0x02b5:
            r1 = 1
            goto L_0x0015
        L_0x02b8:
            if (r1 == 0) goto L_0x02ca
            int r14 = r13.f19249p
            if (r14 == r0) goto L_0x02c0
            if (r14 != r4) goto L_0x02ca
        L_0x02c0:
            java.util.List r14 = r13.k()
            r13.f19247n = r14
            long r0 = r13.f19318e
            r13.f19257x = r0
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a.g(h6.i):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.j d() throws h6.g {
        /*
            r11 = this;
            h6.j r0 = super.d()
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            long r0 = r11.f19244k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            long r5 = r11.f19257x
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x001a
            goto L_0x0023
        L_0x001a:
            long r7 = r11.f19318e
            long r7 = r7 - r5
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x004e
            java.util.ArrayDeque<h6.j> r0 = r11.f19315b
            java.lang.Object r0 = r0.pollFirst()
            h6.j r0 = (h6.j) r0
            if (r0 == 0) goto L_0x004e
            java.util.List r1 = java.util.Collections.emptyList()
            r11.f19247n = r1
            r11.f19257x = r2
            r11.f19248o = r1
            i6.e r8 = new i6.e
            r1.getClass()
            r8.<init>(r1, r4)
            long r6 = r11.f19318e
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r0
            r5.v(r6, r8, r9)
            return r0
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a.d():h6.j");
    }

    public boolean i() {
        return this.f19247n != this.f19248o;
    }

    public final List<b> k() {
        int size = this.f19245l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            b c10 = this.f19245l.get(i11).c(Integer.MIN_VALUE);
            arrayList.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f18929h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f18929h != i10) {
                    bVar = this.f19245l.get(i12).c(i10);
                    bVar.getClass();
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void l() {
        this.f19246m.f(this.f19249p);
        this.f19245l.clear();
        this.f19245l.add(this.f19246m);
    }

    public final void m(int i10) {
        int i11 = this.f19249p;
        if (i11 != i10) {
            this.f19249p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f19245l.size(); i12++) {
                    this.f19245l.get(i12).f19264g = i10;
                }
                return;
            }
            l();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f19247n = Collections.emptyList();
            }
        }
    }

    public final void n(int i10) {
        this.f19250q = i10;
        this.f19246m.f19265h = i10;
    }
}
