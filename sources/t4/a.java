package t4;

import v.e;

/* compiled from: AutoValue_EventStoreConfig */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final long f25689b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25690c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25691d;

    /* renamed from: e  reason: collision with root package name */
    public final long f25692e;

    /* renamed from: f  reason: collision with root package name */
    public final int f25693f;

    public a(long j10, int i10, int i11, long j11, int i12, C0246a aVar) {
        this.f25689b = j10;
        this.f25690c = i10;
        this.f25691d = i11;
        this.f25692e = j11;
        this.f25693f = i12;
    }

    public int a() {
        return this.f25691d;
    }

    public long b() {
        return this.f25692e;
    }

    public int c() {
        return this.f25690c;
    }

    public int d() {
        return this.f25693f;
    }

    public long e() {
        return this.f25689b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25689b == dVar.e() && this.f25690c == dVar.c() && this.f25691d == dVar.a() && this.f25692e == dVar.b() && this.f25693f == dVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25689b;
        long j11 = this.f25692e;
        return this.f25693f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f25690c) * 1000003) ^ this.f25691d) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("EventStoreConfig{maxStorageSizeInBytes=");
        a10.append(this.f25689b);
        a10.append(", loadBatchSize=");
        a10.append(this.f25690c);
        a10.append(", criticalSectionEnterTimeoutMs=");
        a10.append(this.f25691d);
        a10.append(", eventCleanUpAge=");
        a10.append(this.f25692e);
        a10.append(", maxBlobByteSizePerRow=");
        return e.a(a10, this.f25693f, "}");
    }
}
