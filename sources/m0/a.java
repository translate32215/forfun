package m0;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import m0.d;
import m0.e;

/* compiled from: BidiFormatter */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f21464d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f21465e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f21466f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final a f21467g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f21468h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21469a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21470b;

    /* renamed from: c  reason: collision with root package name */
    public final c f21471c;

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static class C0189a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f21472e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f21473a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21474b;

        /* renamed from: c  reason: collision with root package name */
        public int f21475c;

        /* renamed from: d  reason: collision with root package name */
        public char f21476d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f21472e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0189a(CharSequence charSequence, boolean z10) {
            this.f21473a = charSequence;
            this.f21474b = charSequence.length();
        }

        public byte a() {
            char charAt = this.f21473a.charAt(this.f21475c - 1);
            this.f21476d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f21473a, this.f21475c);
                this.f21475c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f21475c--;
            char c10 = this.f21476d;
            return c10 < 1792 ? f21472e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        c cVar = d.f21483c;
        f21464d = cVar;
        f21467g = new a(false, 2, cVar);
        f21468h = new a(true, 2, cVar);
    }

    public a(boolean z10, int i10, c cVar) {
        this.f21469a = z10;
        this.f21470b = i10;
        this.f21471c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            m0.a$a r0 = new m0.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f21475c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.f21475c
            int r7 = r0.f21474b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f21473a
            char r6 = r7.charAt(r6)
            r0.f21476d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f21473a
            int r7 = r0.f21475c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f21475c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f21475c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f21475c
            int r6 = r6 + r2
            r0.f21475c = r6
            char r6 = r0.f21476d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = m0.a.C0189a.f21472e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f21475c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = 1
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = -1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r6 = r6 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            m0.a$a r0 = new m0.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f21474b
            r0.f21475c = r6
            r6 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f21475c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r6) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r2 != r6) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r6 = r6 + -1
            goto L_0x000c
        L_0x0032:
            if (r6 != 0) goto L_0x0036
        L_0x0034:
            r1 = 1
            goto L_0x0041
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r6 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r2 != 0) goto L_0x000c
        L_0x003f:
            r2 = r6
            goto L_0x000c
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = e.f21488a;
        boolean z10 = true;
        if (e.a.a(locale) != 1) {
            z10 = false;
        }
        c cVar = f21464d;
        if (cVar == f21464d) {
            return z10 ? f21468h : f21467g;
        }
        return new a(z10, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z10) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.f21470b & 2) != 0) && z10) {
            boolean b11 = ((d.c) (b10 ? d.f21482b : d.f21481a)).b(charSequence, 0, charSequence.length());
            if (this.f21469a || (!b11 && a(charSequence) != 1)) {
                str = (!this.f21469a || (b11 && a(charSequence) != -1)) ? str2 : f21466f;
            } else {
                str = f21465e;
            }
            spannableStringBuilder.append(str);
        }
        if (b10 != this.f21469a) {
            spannableStringBuilder.append(b10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            boolean b12 = ((d.c) (b10 ? d.f21482b : d.f21481a)).b(charSequence, 0, charSequence.length());
            if (!this.f21469a && (b12 || b(charSequence) == 1)) {
                str2 = f21465e;
            } else if (this.f21469a && (!b12 || b(charSequence) == -1)) {
                str2 = f21466f;
            }
            spannableStringBuilder.append(str2);
        }
        return spannableStringBuilder;
    }
}
