package ce;

import be.f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.g;
import td.p;
import ud.k;

/* compiled from: Strings.kt */
public final class c implements f<zd.c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4385a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4386b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4387c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, g<Integer, Integer>> f4388d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<zd.c>, vd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f4389a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f4390b;

        /* renamed from: c  reason: collision with root package name */
        public int f4391c;

        /* renamed from: d  reason: collision with root package name */
        public zd.c f4392d;

        /* renamed from: e  reason: collision with root package name */
        public int f4393e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f4394f;

        public a(c cVar) {
            this.f4394f = cVar;
            int i10 = cVar.f4386b;
            int length = cVar.f4385a.length();
            if (length >= 0) {
                if (i10 < 0) {
                    i10 = 0;
                } else if (i10 > length) {
                    i10 = length;
                }
                this.f4390b = i10;
                this.f4391c = i10;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum " + 0 + '.');
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f4391c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f4389a = r1
                r0 = 0
                r7.f4392d = r0
                goto L_0x008f
            L_0x000c:
                ce.c r2 = r7.f4394f
                int r3 = r2.f4387c
                r4 = 1
                r5 = -1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f4393e
                int r6 = r6 + r4
                r7.f4393e = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f4385a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                zd.c r0 = new zd.c
                int r1 = r7.f4390b
                ce.c r2 = r7.f4394f
                java.lang.CharSequence r2 = r2.f4385a
                int r2 = ce.k.k(r2)
                r0.<init>(r1, r2)
                r7.f4392d = r0
                r7.f4391c = r5
                goto L_0x008d
            L_0x0037:
                ce.c r0 = r7.f4394f
                td.p<java.lang.CharSequence, java.lang.Integer, kd.g<java.lang.Integer, java.lang.Integer>> r2 = r0.f4388d
                java.lang.CharSequence r0 = r0.f4385a
                int r3 = r7.f4391c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.h(r0, r3)
                kd.g r0 = (kd.g) r0
                if (r0 != 0) goto L_0x005f
                zd.c r0 = new zd.c
                int r1 = r7.f4390b
                ce.c r2 = r7.f4394f
                java.lang.CharSequence r2 = r2.f4385a
                int r2 = ce.k.k(r2)
                r0.<init>(r1, r2)
                r7.f4392d = r0
                r7.f4391c = r5
                goto L_0x008d
            L_0x005f:
                A r2 = r0.f20614a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f20615b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f4390b
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L_0x007a
                zd.c r3 = zd.c.f28846d
                zd.c r3 = zd.c.f28847e
                goto L_0x0082
            L_0x007a:
                zd.c r5 = new zd.c
                int r6 = r2 + -1
                r5.<init>(r3, r6)
                r3 = r5
            L_0x0082:
                r7.f4392d = r3
                int r2 = r2 + r0
                r7.f4390b = r2
                if (r0 != 0) goto L_0x008a
                r1 = 1
            L_0x008a:
                int r2 = r2 + r1
                r7.f4391c = r2
            L_0x008d:
                r7.f4389a = r4
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ce.c.a.a():void");
        }

        public boolean hasNext() {
            if (this.f4389a == -1) {
                a();
            }
            return this.f4389a == 1;
        }

        public Object next() {
            if (this.f4389a == -1) {
                a();
            }
            if (this.f4389a != 0) {
                zd.c cVar = this.f4392d;
                k.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f4392d = null;
                this.f4389a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, g<Integer, Integer>> pVar) {
        k.f(charSequence, "input");
        this.f4385a = charSequence;
        this.f4386b = i10;
        this.f4387c = i11;
        this.f4388d = pVar;
    }

    public Iterator<zd.c> iterator() {
        return new a(this);
    }
}
