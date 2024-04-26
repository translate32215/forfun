package ke;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: CacheControl */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20648a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20649b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20650c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20651d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20652e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20653f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f20654g;

    /* renamed from: h  reason: collision with root package name */
    public final int f20655h;

    /* renamed from: i  reason: collision with root package name */
    public final int f20656i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f20657j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f20658k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f20659l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f20660m;

    /* compiled from: CacheControl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20661a;

        /* renamed from: b  reason: collision with root package name */
        public int f20662b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f20663c;
    }

    static {
        a aVar = new a();
        aVar.f20661a = true;
        new c(aVar);
        a aVar2 = new a();
        aVar2.f20663c = true;
        int i10 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        aVar2.f20662b = i10;
        new c(aVar2);
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f20648a = z10;
        this.f20649b = z11;
        this.f20650c = i10;
        this.f20651d = i11;
        this.f20652e = z12;
        this.f20653f = z13;
        this.f20654g = z14;
        this.f20655h = i12;
        this.f20656i = i13;
        this.f20657j = z15;
        this.f20658k = z16;
        this.f20659l = z17;
        this.f20660m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ke.c a(ke.r r22) {
        /*
            r0 = r22
            int r1 = r22.g()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0150
            java.lang.String r2 = r0.d(r6)
            java.lang.String r4 = r0.h(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0149
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0149
            java.lang.String r3 = "=,;"
            int r3 = oe.e.e(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x00a9
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x00a9
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0079
            goto L_0x00a9
        L_0x0066:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x007c
            char r0 = r4.charAt(r3)
            r5 = 32
            if (r0 == r5) goto L_0x0079
            r5 = 9
            if (r0 == r5) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0066
        L_0x007c:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 34
            if (r0 != r5) goto L_0x0099
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = oe.e.e(r4, r3, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            r5 = 1
            int r0 = r0 + r5
            goto L_0x00ae
        L_0x0099:
            r5 = 1
            java.lang.String r0 = ",;"
            int r0 = oe.e.e(r4, r3, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00ae
        L_0x00a9:
            r5 = 1
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00ae:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ba
            r5 = -1
            r9 = 1
            goto L_0x0144
        L_0x00ba:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c6
            r5 = -1
            r10 = 1
            goto L_0x0144
        L_0x00c6:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d5
            r5 = -1
            int r11 = oe.e.c(r3, r5)
            goto L_0x0144
        L_0x00d5:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e3
            r5 = -1
            int r12 = oe.e.c(r3, r5)
            goto L_0x0144
        L_0x00e3:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ee
            r5 = -1
            r13 = 1
            goto L_0x0144
        L_0x00ee:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f9
            r5 = -1
            r14 = 1
            goto L_0x0144
        L_0x00f9:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r5 = -1
            r15 = 1
            goto L_0x0144
        L_0x0104:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0115
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = oe.e.c(r3, r2)
            r5 = -1
            goto L_0x0144
        L_0x0115:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0123
            r5 = -1
            int r17 = oe.e.c(r3, r5)
            goto L_0x0144
        L_0x0123:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x012f
            r18 = 1
            goto L_0x0144
        L_0x012f:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x013a
            r19 = 1
            goto L_0x0144
        L_0x013a:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0144
            r20 = 1
        L_0x0144:
            r2 = r0
            r0 = r22
            goto L_0x003b
        L_0x0149:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0150:
            if (r7 != 0) goto L_0x0155
            r21 = 0
            goto L_0x0157
        L_0x0155:
            r21 = r8
        L_0x0157:
            ke.c r0 = new ke.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.c.a(ke.r):ke.c");
    }

    public String toString() {
        String str = this.f20660m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f20648a) {
                sb2.append("no-cache, ");
            }
            if (this.f20649b) {
                sb2.append("no-store, ");
            }
            if (this.f20650c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f20650c);
                sb2.append(", ");
            }
            if (this.f20651d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f20651d);
                sb2.append(", ");
            }
            if (this.f20652e) {
                sb2.append("private, ");
            }
            if (this.f20653f) {
                sb2.append("public, ");
            }
            if (this.f20654g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f20655h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f20655h);
                sb2.append(", ");
            }
            if (this.f20656i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f20656i);
                sb2.append(", ");
            }
            if (this.f20657j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f20658k) {
                sb2.append("no-transform, ");
            }
            if (this.f20659l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                str = "";
            } else {
                sb2.delete(sb2.length() - 2, sb2.length());
                str = sb2.toString();
            }
            this.f20660m = str;
        }
        return str;
    }

    public c(a aVar) {
        this.f20648a = aVar.f20661a;
        this.f20649b = false;
        this.f20650c = -1;
        this.f20651d = -1;
        this.f20652e = false;
        this.f20653f = false;
        this.f20654g = false;
        this.f20655h = aVar.f20662b;
        this.f20656i = -1;
        this.f20657j = aVar.f20663c;
        this.f20658k = false;
        this.f20659l = false;
    }
}
