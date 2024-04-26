package o1;

import ud.k;

/* compiled from: NavOptions.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22826a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22827b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22828c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22829d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22830e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22831f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22832g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22833h;

    /* renamed from: i  reason: collision with root package name */
    public final int f22834i;

    /* renamed from: j  reason: collision with root package name */
    public String f22835j;

    /* compiled from: NavOptions.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22836a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22837b;

        /* renamed from: c  reason: collision with root package name */
        public int f22838c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f22839d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22840e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22841f;

        /* renamed from: g  reason: collision with root package name */
        public int f22842g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f22843h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f22844i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f22845j = -1;

        public final x a() {
            String str = this.f22839d;
            if (str != null) {
                boolean z10 = this.f22836a;
                boolean z11 = this.f22837b;
                boolean z12 = this.f22840e;
                boolean z13 = this.f22841f;
                int i10 = this.f22842g;
                int i11 = this.f22843h;
                int i12 = this.f22844i;
                int i13 = this.f22845j;
                r rVar = r.f22798r;
                x xVar = new x(z10, z11, r.i(str).hashCode(), z12, z13, i10, i11, i12, i13);
                xVar.f22835j = str;
                return xVar;
            }
            return new x(this.f22836a, this.f22837b, this.f22838c, this.f22840e, this.f22841f, this.f22842g, this.f22843h, this.f22844i, this.f22845j);
        }

        public final a b(int i10, boolean z10, boolean z11) {
            this.f22838c = i10;
            this.f22839d = null;
            this.f22840e = z10;
            this.f22841f = z11;
            return this;
        }
    }

    public x(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f22826a = z10;
        this.f22827b = z11;
        this.f22828c = i10;
        this.f22829d = z12;
        this.f22830e = z13;
        this.f22831f = i11;
        this.f22832g = i12;
        this.f22833h = i13;
        this.f22834i = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.a(x.class, obj.getClass())) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f22826a == xVar.f22826a && this.f22827b == xVar.f22827b && this.f22828c == xVar.f22828c && k.a(this.f22835j, xVar.f22835j) && this.f22829d == xVar.f22829d && this.f22830e == xVar.f22830e && this.f22831f == xVar.f22831f && this.f22832g == xVar.f22832g && this.f22833h == xVar.f22833h && this.f22834i == xVar.f22834i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((this.f22826a ? 1 : 0) * true) + (this.f22827b ? 1 : 0)) * 31) + this.f22828c) * 31;
        String str = this.f22835j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f22829d ? 1 : 0)) * 31) + (this.f22830e ? 1 : 0)) * 31) + this.f22831f) * 31) + this.f22832g) * 31) + this.f22833h) * 31) + this.f22834i;
    }
}
