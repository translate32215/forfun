package x6;

/* compiled from: Projection */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f27860a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27861b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27862c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27863d;

    /* compiled from: Projection */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f27864a;

        public a(b... bVarArr) {
            this.f27864a = bVarArr;
        }
    }

    /* compiled from: Projection */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27865a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27866b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f27867c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f27868d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f27865a = i10;
            v6.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f27867c = fArr;
            this.f27868d = fArr2;
            this.f27866b = i11;
        }
    }

    public d(a aVar, int i10) {
        this.f27860a = aVar;
        this.f27861b = aVar;
        this.f27862c = i10;
        this.f27863d = true;
    }

    public d(a aVar, a aVar2, int i10) {
        this.f27860a = aVar;
        this.f27861b = aVar2;
        this.f27862c = i10;
        this.f27863d = aVar == aVar2;
    }
}
