package o6;

import android.text.Layout;

/* compiled from: TtmlStyle */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f23061a;

    /* renamed from: b  reason: collision with root package name */
    public int f23062b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23063c;

    /* renamed from: d  reason: collision with root package name */
    public int f23064d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23065e;

    /* renamed from: f  reason: collision with root package name */
    public int f23066f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f23067g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f23068h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f23069i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f23070j = -1;

    /* renamed from: k  reason: collision with root package name */
    public float f23071k;

    /* renamed from: l  reason: collision with root package name */
    public String f23072l;

    /* renamed from: m  reason: collision with root package name */
    public int f23073m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f23074n = -1;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f23075o;

    /* renamed from: p  reason: collision with root package name */
    public int f23076p = -1;

    /* renamed from: q  reason: collision with root package name */
    public b f23077q;

    /* renamed from: r  reason: collision with root package name */
    public float f23078r = Float.MAX_VALUE;

    public f a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        String str;
        if (fVar != null) {
            if (!this.f23063c && fVar.f23063c) {
                this.f23062b = fVar.f23062b;
                this.f23063c = true;
            }
            if (this.f23068h == -1) {
                this.f23068h = fVar.f23068h;
            }
            if (this.f23069i == -1) {
                this.f23069i = fVar.f23069i;
            }
            if (this.f23061a == null && (str = fVar.f23061a) != null) {
                this.f23061a = str;
            }
            if (this.f23066f == -1) {
                this.f23066f = fVar.f23066f;
            }
            if (this.f23067g == -1) {
                this.f23067g = fVar.f23067g;
            }
            if (this.f23074n == -1) {
                this.f23074n = fVar.f23074n;
            }
            if (this.f23075o == null && (alignment = fVar.f23075o) != null) {
                this.f23075o = alignment;
            }
            if (this.f23076p == -1) {
                this.f23076p = fVar.f23076p;
            }
            if (this.f23070j == -1) {
                this.f23070j = fVar.f23070j;
                this.f23071k = fVar.f23071k;
            }
            if (this.f23077q == null) {
                this.f23077q = fVar.f23077q;
            }
            if (this.f23078r == Float.MAX_VALUE) {
                this.f23078r = fVar.f23078r;
            }
            if (!this.f23065e && fVar.f23065e) {
                this.f23064d = fVar.f23064d;
                this.f23065e = true;
            }
            if (this.f23073m == -1 && (i10 = fVar.f23073m) != -1) {
                this.f23073m = i10;
            }
        }
        return this;
    }

    public int b() {
        int i10 = this.f23068h;
        if (i10 == -1 && this.f23069i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f23069i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }
}
