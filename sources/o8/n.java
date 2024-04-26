package o8;

import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f23352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23353b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23354c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23355d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23356e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23357f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23358g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f23359h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f23360i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f23361j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f23362k;

    public n(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        i.e(str);
        i.e(str2);
        boolean z10 = true;
        i.a(j15 >= 0);
        i.a(j16 >= 0);
        i.a(j17 >= 0);
        i.a(j18 < 0 ? false : z10);
        this.f23352a = str;
        this.f23353b = str2;
        this.f23354c = j15;
        this.f23355d = j16;
        this.f23356e = j17;
        this.f23357f = j13;
        this.f23358g = j18;
        this.f23359h = l10;
        this.f23360i = l11;
        this.f23361j = l12;
        this.f23362k = bool;
    }

    public final n a(Long l10, Long l11, Boolean bool) {
        return new n(this.f23352a, this.f23353b, this.f23354c, this.f23355d, this.f23356e, this.f23357f, this.f23358g, this.f23359h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final n b(long j10, long j11) {
        return new n(this.f23352a, this.f23353b, this.f23354c, this.f23355d, this.f23356e, this.f23357f, j10, Long.valueOf(j11), this.f23360i, this.f23361j, this.f23362k);
    }

    public final n c(long j10) {
        return new n(this.f23352a, this.f23353b, this.f23354c, this.f23355d, this.f23356e, j10, this.f23358g, this.f23359h, this.f23360i, this.f23361j, this.f23362k);
    }
}
