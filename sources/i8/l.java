package i8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class l implements Iterator {
    @CheckForNull

    /* renamed from: a  reason: collision with root package name */
    public Object f19332a;

    /* renamed from: b  reason: collision with root package name */
    public int f19333b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f19334c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19335d;

    /* renamed from: e  reason: collision with root package name */
    public int f19336e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f19337f;

    public l(m mVar, CharSequence charSequence) {
        j jVar = mVar.f19338a;
        this.f19335d = mVar.f19339b;
        this.f19337f = Integer.MAX_VALUE;
        this.f19334c = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r2 < 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r10 < 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r0 = i8.n.a("%s (%s) must not be greater than size (%s)", "index", java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.d0.a("negative size: ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r0 = i8.n.a("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        throw new java.lang.IndexOutOfBoundsException(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r12 = this;
            int r0 = r12.f19333b
            r1 = 4
            if (r0 == r1) goto L_0x00eb
            int r2 = r0 + -1
            r3 = 0
            if (r0 == 0) goto L_0x00ea
            r0 = 1
            if (r2 == 0) goto L_0x00e9
            r4 = 2
            r5 = 0
            if (r2 == r4) goto L_0x00e8
            r12.f19333b = r1
            int r1 = r12.f19336e
        L_0x0015:
            int r2 = r12.f19336e
            r6 = 3
            r7 = -1
            if (r2 == r7) goto L_0x00dd
            r8 = r12
            i8.k r8 = (i8.k) r8
            cb.d r9 = r8.f19331g
            java.util.Set<cb.e> r9 = r9.f4374b
            i8.j r9 = (i8.j) r9
            java.lang.CharSequence r8 = r8.f19334c
            int r10 = r8.length()
            if (r2 < 0) goto L_0x009e
            if (r2 <= r10) goto L_0x0030
            goto L_0x009e
        L_0x0030:
            if (r2 >= r10) goto L_0x003f
            char r11 = r8.charAt(r2)
            boolean r11 = r9.a(r11)
            if (r11 != 0) goto L_0x0040
            int r2 = r2 + 1
            goto L_0x0030
        L_0x003f:
            r2 = -1
        L_0x0040:
            if (r2 != r7) goto L_0x004c
            java.lang.CharSequence r2 = r12.f19334c
            int r2 = r2.length()
            r12.f19336e = r7
            r8 = -1
            goto L_0x0050
        L_0x004c:
            int r8 = r2 + 1
            r12.f19336e = r8
        L_0x0050:
            if (r8 != r1) goto L_0x0061
            int r8 = r8 + 1
            r12.f19336e = r8
            java.lang.CharSequence r2 = r12.f19334c
            int r2 = r2.length()
            if (r8 <= r2) goto L_0x0015
            r12.f19336e = r7
            goto L_0x0015
        L_0x0061:
            if (r1 >= r2) goto L_0x0068
            java.lang.CharSequence r8 = r12.f19334c
            r8.charAt(r1)
        L_0x0068:
            if (r1 >= r2) goto L_0x0071
            java.lang.CharSequence r8 = r12.f19334c
            int r9 = r2 + -1
            r8.charAt(r9)
        L_0x0071:
            boolean r8 = r12.f19335d
            if (r8 == 0) goto L_0x007a
            if (r1 != r2) goto L_0x007a
            int r1 = r12.f19336e
            goto L_0x0015
        L_0x007a:
            int r3 = r12.f19337f
            if (r3 != r0) goto L_0x0090
            java.lang.CharSequence r2 = r12.f19334c
            int r2 = r2.length()
            r12.f19336e = r7
            if (r2 <= r1) goto L_0x0093
            java.lang.CharSequence r3 = r12.f19334c
            int r4 = r2 + -1
            r3.charAt(r4)
            goto L_0x0093
        L_0x0090:
            int r3 = r3 + r7
            r12.f19337f = r3
        L_0x0093:
            java.lang.CharSequence r3 = r12.f19334c
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            java.lang.String r3 = r1.toString()
            goto L_0x00df
        L_0x009e:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "index"
            if (r2 < 0) goto L_0x00c9
            if (r10 < 0) goto L_0x00bd
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r0] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r4] = r0
            java.lang.String r0 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = i8.n.a(r0, r6)
            goto L_0x00d9
        L_0x00bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative size: "
            java.lang.String r1 = androidx.appcompat.widget.d0.a(r1, r10)
            r0.<init>(r1)
            throw r0
        L_0x00c9:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r0] = r2
            java.lang.String r0 = "%s (%s) must not be negative"
            java.lang.String r0 = i8.n.a(r0, r4)
        L_0x00d9:
            r1.<init>(r0)
            throw r1
        L_0x00dd:
            r12.f19333b = r6
        L_0x00df:
            r12.f19332a = r3
            int r1 = r12.f19333b
            if (r1 == r6) goto L_0x00e8
            r12.f19333b = r0
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            return r0
        L_0x00ea:
            throw r3
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            goto L_0x00f2
        L_0x00f1:
            throw r0
        L_0x00f2:
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.l.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.f19333b = 2;
            Object obj = this.f19332a;
            this.f19332a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
