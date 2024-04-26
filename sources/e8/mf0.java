package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mf0 {

    /* renamed from: a  reason: collision with root package name */
    public final bf0 f15501a;

    /* renamed from: b  reason: collision with root package name */
    public final lf0 f15502b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15503c;

    /* renamed from: d  reason: collision with root package name */
    public final ec0[] f15504d;

    public mf0(bf0 bf0, lf0 lf0, Object obj, ec0[] ec0Arr) {
        this.f15501a = bf0;
        this.f15502b = lf0;
        this.f15503c = obj;
        this.f15504d = ec0Arr;
    }

    public final boolean a(mf0 mf0, int i10) {
        if (mf0 != null && eg0.d(this.f15502b.f15384b[i10], mf0.f15502b.f15384b[i10]) && eg0.d(this.f15504d[i10], mf0.f15504d[i10])) {
            return true;
        }
        return false;
    }
}
