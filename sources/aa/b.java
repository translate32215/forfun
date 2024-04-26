package aa;

/* compiled from: CharMatcher */
public abstract class b implements h<Character> {

    /* compiled from: CharMatcher */
    public static abstract class a extends b {
    }

    /* renamed from: aa.b$b  reason: collision with other inner class name */
    /* compiled from: CharMatcher */
    public static final class C0005b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final char f173a;

        public C0005b(char c10) {
            this.f173a = c10;
        }

        public boolean b(char c10) {
            return c10 == this.f173a;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("CharMatcher.is('");
            char c10 = this.f173a;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            a10.append(String.copyValueOf(cArr));
            a10.append("')");
            return a10.toString();
        }
    }

    /* compiled from: CharMatcher */
    public static abstract class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f174a;

        public c(String str) {
            this.f174a = str;
        }

        public final String toString() {
            return this.f174a;
        }
    }

    /* compiled from: CharMatcher */
    public static final class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final d f175b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        public int a(CharSequence charSequence, int i10) {
            g.d(i10, charSequence.length());
            return -1;
        }

        public boolean b(char c10) {
            return false;
        }
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        g.d(i10, length);
        while (i10 < length) {
            if (b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean b(char c10);
}
