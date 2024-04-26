package e8;

import com.google.android.gms.internal.ads.cq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class k90 implements b90 {

    /* renamed from: a  reason: collision with root package name */
    public final cq f15245a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15246b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f15247c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15248d;

    public k90(cq cqVar, String str, Object[] objArr) {
        this.f15245a = cqVar;
        this.f15246b = str;
        this.f15247c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15248d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f15248d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final boolean a() {
        return (this.f15248d & 2) == 2;
    }

    public final cq b() {
        return this.f15245a;
    }

    public final int c() {
        return (this.f15248d & 1) == 1 ? 1 : 2;
    }
}
