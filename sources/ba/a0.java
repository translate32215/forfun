package ba;

/* compiled from: Iterators */
public final class a0<T> extends a<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a<Object> f3684e = new a0(new Object[0], 0, 0, 0);

    /* renamed from: c  reason: collision with root package name */
    public final T[] f3685c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3686d;

    public a0(T[] tArr, int i10, int i11, int i12) {
        super(i11, i12);
        this.f3685c = tArr;
        this.f3686d = i10;
    }

    public T a(int i10) {
        return this.f3685c[this.f3686d + i10];
    }
}
