package y6;

import android.content.Context;
import android.util.DisplayMetrics;
import e8.li0;
import e8.ti0;
import e8.y8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f28110f = new d(320, 50, "320x50_mb");

    /* renamed from: g  reason: collision with root package name */
    public static final d f28111g = new d(468, 60, "468x60_as");

    /* renamed from: h  reason: collision with root package name */
    public static final d f28112h = new d(320, 100, "320x100_as");

    /* renamed from: i  reason: collision with root package name */
    public static final d f28113i = new d(728, 90, "728x90_as");

    /* renamed from: j  reason: collision with root package name */
    public static final d f28114j = new d(300, 250, "300x250_as");

    /* renamed from: k  reason: collision with root package name */
    public static final d f28115k = new d(160, 600, "160x600_as");

    /* renamed from: l  reason: collision with root package name */
    public static final d f28116l = new d(-1, -2, "smart_banner");

    /* renamed from: m  reason: collision with root package name */
    public static final d f28117m = new d(-3, -4, "fluid");

    /* renamed from: n  reason: collision with root package name */
    public static final d f28118n = new d(0, 0, "invalid");

    /* renamed from: o  reason: collision with root package name */
    public static final d f28119o = new d(50, 50, "50x50_mb");

    /* renamed from: a  reason: collision with root package name */
    public final int f28120a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28121b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28122c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28123d;

    /* renamed from: e  reason: collision with root package name */
    public int f28124e;

    static {
        new d(-3, 0, "search_v2");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x000a:
            r1 = -2
            if (r6 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x0014:
            r2 = 4
            int r2 = androidx.appcompat.widget.o.a(r0, r2)
            int r2 = androidx.appcompat.widget.o.a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d.<init>(int, int):void");
    }

    public final int a(Context context) {
        int i10 = this.f28121b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 != -2) {
            y8 y8Var = ti0.f16763j.f16764a;
            return y8.a(context.getResources().getDisplayMetrics(), i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((float) li0.i(displayMetrics)) * displayMetrics.density);
    }

    public final int b(Context context) {
        int i10 = this.f28120a;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -1) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        return y8.a(context.getResources().getDisplayMetrics(), i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f28120a == dVar.f28120a && this.f28121b == dVar.f28121b && this.f28122c.equals(dVar.f28122c);
    }

    public final int hashCode() {
        return this.f28122c.hashCode();
    }

    public final String toString() {
        return this.f28122c;
    }

    public d(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(l0.d.a(37, "Invalid width for AdSize: ", i10));
        } else if (i11 >= 0 || i11 == -2 || i11 == -4) {
            this.f28120a = i10;
            this.f28121b = i11;
            this.f28122c = str;
        } else {
            throw new IllegalArgumentException(l0.d.a(38, "Invalid height for AdSize: ", i11));
        }
    }
}
