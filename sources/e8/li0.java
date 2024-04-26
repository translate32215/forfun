package e8;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.activity.j;
import w7.a;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class li0 extends a {
    public static final Parcelable.Creator<li0> CREATOR = new ki0();

    /* renamed from: a  reason: collision with root package name */
    public final String f15394a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15395b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15396c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15397d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15398e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15399f;

    /* renamed from: g  reason: collision with root package name */
    public final li0[] f15400g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15401h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15402i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15403r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15404s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15405t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15406u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15407v;

    public li0() {
        this("interstitial_mb", 0, 0, true, 0, 0, (li0[]) null, false, false, false, false, false, false, false);
    }

    public static int i(DisplayMetrics displayMetrics) {
        int i10 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public static li0 j() {
        return new li0("320x50_mb", 0, 0, false, 0, 0, (li0[]) null, true, false, false, false, false, false, false);
    }

    public static li0 q() {
        return new li0("reward_mb", 0, 0, true, 0, 0, (li0[]) null, false, false, false, false, false, false, false);
    }

    public static li0 s() {
        return new li0("invalid", 0, 0, false, 0, 0, (li0[]) null, false, false, false, true, false, false, false);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f15394a, false);
        int i11 = this.f15395b;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        int i12 = this.f15396c;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        boolean z10 = this.f15397d;
        parcel.writeInt(262149);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.f15398e;
        parcel.writeInt(262150);
        parcel.writeInt(i13);
        int i14 = this.f15399f;
        parcel.writeInt(262151);
        parcel.writeInt(i14);
        j.j(parcel, 8, this.f15400g, i10, false);
        boolean z11 = this.f15401h;
        parcel.writeInt(262153);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f15402i;
        parcel.writeInt(262154);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f15403r;
        parcel.writeInt(262155);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f15404s;
        parcel.writeInt(262156);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.f15405t;
        parcel.writeInt(262157);
        parcel.writeInt(z15 ? 1 : 0);
        boolean z16 = this.f15406u;
        parcel.writeInt(262158);
        parcel.writeInt(z16 ? 1 : 0);
        boolean z17 = this.f15407v;
        parcel.writeInt(262159);
        parcel.writeInt(z17 ? 1 : 0);
        j.m(parcel, l10);
    }

    public li0(Context context, d dVar) {
        this(context, new d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public li0(android.content.Context r14, y6.d[] r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.f15397d = r0
            int r2 = r1.f28120a
            r3 = -3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            int r3 = r1.f28121b
            r5 = -4
            if (r3 != r5) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r13.f15402i = r3
            r13.f15406u = r0
            boolean r5 = r1.f28123d
            r13.f15407v = r5
            if (r3 == 0) goto L_0x002b
            y6.d r2 = y6.d.f28110f
            int r5 = r2.f28120a
            r13.f15398e = r5
            int r2 = r2.f28121b
            r13.f15395b = r2
            goto L_0x003a
        L_0x002b:
            if (r5 == 0) goto L_0x0034
            r13.f15398e = r2
            int r2 = r1.f28124e
            r13.f15395b = r2
            goto L_0x003a
        L_0x0034:
            r13.f15398e = r2
            int r2 = r1.f28121b
            r13.f15395b = r2
        L_0x003a:
            int r2 = r13.f15398e
            r5 = -1
            if (r2 != r5) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            int r5 = r13.f15395b
            r6 = -2
            if (r5 != r6) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            android.content.res.Resources r6 = r14.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            if (r2 == 0) goto L_0x00f0
            e8.ti0 r7 = e8.ti0.f16763j
            e8.y8 r7 = r7.f16764a
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L_0x0067
        L_0x0065:
            r7 = 0
            goto L_0x007b
        L_0x0067:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L_0x0065
            r7 = 1
        L_0x007b:
            if (r7 == 0) goto L_0x00d0
            e8.ti0 r7 = e8.ti0.f16763j
            e8.y8 r7 = r7.f16764a
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto L_0x00a9
            if (r7 != r10) goto L_0x00a9
            r7 = 1
            goto L_0x00aa
        L_0x00a9:
            r7 = 0
        L_0x00aa:
            if (r7 == 0) goto L_0x00d0
            int r7 = r6.widthPixels
            e8.ti0 r8 = e8.ti0.f16763j
            e8.y8 r8 = r8.f16764a
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto L_0x00cb
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto L_0x00cc
        L_0x00cb:
            r8 = 0
        L_0x00cc:
            int r7 = r7 - r8
            r13.f15399f = r7
            goto L_0x00d4
        L_0x00d0:
            int r7 = r6.widthPixels
            r13.f15399f = r7
        L_0x00d4:
            int r7 = r13.f15399f
            float r7 = (float) r7
            float r8 = r6.density
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r10)
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x00fc
            int r9 = r9 + 1
            goto L_0x00fc
        L_0x00f0:
            int r9 = r13.f15398e
            e8.ti0 r7 = e8.ti0.f16763j
            e8.y8 r7 = r7.f16764a
            int r7 = e8.y8.a(r6, r9)
            r13.f15399f = r7
        L_0x00fc:
            if (r5 == 0) goto L_0x0103
            int r7 = i(r6)
            goto L_0x0105
        L_0x0103:
            int r7 = r13.f15395b
        L_0x0105:
            e8.ti0 r8 = e8.ti0.f16763j
            e8.y8 r8 = r8.f16764a
            int r6 = e8.y8.a(r6, r7)
            r13.f15396c = r6
            java.lang.String r6 = "_as"
            java.lang.String r8 = "x"
            r10 = 26
            if (r2 != 0) goto L_0x0146
            if (r5 == 0) goto L_0x011a
            goto L_0x0146
        L_0x011a:
            boolean r2 = r13.f15407v
            if (r2 == 0) goto L_0x013a
            int r1 = r13.f15398e
            int r2 = r13.f15395b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            r13.f15394a = r1
            goto L_0x015d
        L_0x013a:
            if (r3 == 0) goto L_0x0141
            java.lang.String r1 = "320x50_mb"
            r13.f15394a = r1
            goto L_0x015d
        L_0x0141:
            java.lang.String r1 = r1.f28122c
            r13.f15394a = r1
            goto L_0x015d
        L_0x0146:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r13.f15394a = r1
        L_0x015d:
            int r1 = r15.length
            if (r1 <= r4) goto L_0x0177
            int r1 = r15.length
            e8.li0[] r1 = new e8.li0[r1]
            r13.f15400g = r1
            r1 = 0
        L_0x0166:
            int r2 = r15.length
            if (r1 >= r2) goto L_0x017a
            e8.li0[] r2 = r13.f15400g
            e8.li0 r3 = new e8.li0
            r4 = r15[r1]
            r3.<init>((android.content.Context) r14, (y6.d) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0166
        L_0x0177:
            r14 = 0
            r13.f15400g = r14
        L_0x017a:
            r13.f15401h = r0
            r13.f15403r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.li0.<init>(android.content.Context, y6.d[]):void");
    }

    public li0(String str, int i10, int i11, boolean z10, int i12, int i13, li0[] li0Arr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f15394a = str;
        this.f15395b = i10;
        this.f15396c = i11;
        this.f15397d = z10;
        this.f15398e = i12;
        this.f15399f = i13;
        this.f15400g = li0Arr;
        this.f15401h = z11;
        this.f15402i = z12;
        this.f15403r = z13;
        this.f15404s = z14;
        this.f15405t = z15;
        this.f15406u = z16;
        this.f15407v = z17;
    }
}
