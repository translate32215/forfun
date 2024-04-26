package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wc {

    /* renamed from: a  reason: collision with root package name */
    public final int f17237a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17238b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17239c;

    public wc(int i10, int i11, int i12, int i13) {
        if (i13 != 1) {
            this.f17237a = i10;
            this.f17239c = i11;
            this.f17238b = i12;
            return;
        }
        this.f17237a = i10;
        this.f17238b = i11;
        this.f17239c = i12;
    }

    public static wc a() {
        return new wc(0, 0, 0, 0);
    }

    public static wc c(li0 li0) {
        if (li0.f15397d) {
            return new wc(3, 0, 0, 0);
        }
        if (li0.f15402i) {
            return new wc(2, 0, 0, 0);
        }
        if (li0.f15401h) {
            return a();
        }
        return d(li0.f15399f, li0.f15396c);
    }

    public static wc d(int i10, int i11) {
        return new wc(1, i10, i11, 0);
    }

    public boolean b() {
        return this.f17237a == 3;
    }
}
