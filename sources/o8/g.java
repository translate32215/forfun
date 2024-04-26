package o8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f23209c = new g((Boolean) null, (Boolean) null);

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f23210a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f23211b;

    public g(Boolean bool, Boolean bool2) {
        this.f23210a = bool;
        this.f23211b = bool2;
    }

    public static g a(Bundle bundle) {
        if (bundle == null) {
            return f23209c;
        }
        return new g(k(bundle.getString("ad_storage")), k(bundle.getString("analytics_storage")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o8.g b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0038
            int r1 = r7.length()
            r2 = 49
            r3 = 48
            r4 = 3
            if (r1 < r4) goto L_0x001e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r3) goto L_0x001b
            if (r1 == r2) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x001f
        L_0x001b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L_0x0035
            char r7 = r7.charAt(r4)
            if (r7 == r3) goto L_0x0032
            if (r7 == r2) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L_0x0034
        L_0x0032:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L_0x0034:
            r0 = r7
        L_0x0035:
            r7 = r0
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r7 = r0
        L_0x0039:
            o8.g r1 = new o8.g
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.g.b(java.lang.String):o8.g");
    }

    public static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z10 = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public static boolean h(int i10, int i11) {
        return i10 <= i11;
    }

    public static final int j(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final g c(g gVar) {
        return new g(d(this.f23210a, gVar.f23210a), d(this.f23211b, gVar.f23211b));
    }

    public final String e() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G1");
        Boolean bool = this.f23210a;
        char c11 = '0';
        if (bool == null) {
            c10 = '-';
        } else {
            c10 = bool.booleanValue() ? '1' : '0';
        }
        sb2.append(c10);
        Boolean bool2 = this.f23211b;
        if (bool2 == null) {
            c11 = '-';
        } else if (bool2.booleanValue()) {
            c11 = '1';
        }
        sb2.append(c11);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j(this.f23210a) == j(gVar.f23210a) && j(this.f23211b) == j(gVar.f23211b)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        Boolean bool = this.f23210a;
        return bool == null || bool.booleanValue();
    }

    public final boolean g() {
        Boolean bool = this.f23211b;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return j(this.f23211b) + ((j(this.f23210a) + 527) * 31);
    }

    public final boolean i(g gVar) {
        Boolean bool = this.f23210a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || gVar.f23210a == bool2) {
            return this.f23211b == bool2 && gVar.f23211b != bool2;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ConsentSettings: ");
        sb2.append("adStorage=");
        Boolean bool = this.f23210a;
        String str2 = "denied";
        if (bool == null) {
            sb2.append("uninitialized");
        } else {
            if (true != bool.booleanValue()) {
                str = str2;
            } else {
                str = "granted";
            }
            sb2.append(str);
        }
        sb2.append(", analyticsStorage=");
        Boolean bool2 = this.f23211b;
        if (bool2 == null) {
            sb2.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str2 = "granted";
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }
}
