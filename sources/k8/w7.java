package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class w7 implements k7 {

    /* renamed from: a  reason: collision with root package name */
    public final m7 f20525a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20526b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f20527c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20528d;

    public w7(m7 m7Var, String str, Object[] objArr) {
        this.f20525a = m7Var;
        this.f20526b = str;
        this.f20527c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f20528d = charAt;
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
                this.f20528d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final boolean d() {
        return (this.f20528d & 2) == 2;
    }

    public final int e() {
        return (this.f20528d & 1) == 1 ? 1 : 2;
    }

    public final m7 zza() {
        return this.f20525a;
    }
}
