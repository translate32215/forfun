package d6;

import android.support.v4.media.a;
import v6.c0;

/* compiled from: RangedUri */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f13118a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13119b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13120c;

    /* renamed from: d  reason: collision with root package name */
    public int f13121d;

    public h(String str, long j10, long j11) {
        this.f13120c = str == null ? "" : str;
        this.f13118a = j10;
        this.f13119b = j11;
    }

    public h a(h hVar, String str) {
        String c10 = c0.c(str, this.f13120c);
        if (hVar != null && c10.equals(c0.c(str, hVar.f13120c))) {
            long j10 = this.f13119b;
            if (j10 != -1) {
                long j11 = this.f13118a;
                if (j11 + j10 == hVar.f13118a) {
                    long j12 = hVar.f13119b;
                    return new h(c10, j11, j12 == -1 ? -1 : j10 + j12);
                }
            }
            long j13 = hVar.f13119b;
            if (j13 != -1) {
                long j14 = hVar.f13118a;
                if (j14 + j13 == this.f13118a) {
                    return new h(c10, j14, j10 == -1 ? -1 : j13 + j10);
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13118a == hVar.f13118a && this.f13119b == hVar.f13119b && this.f13120c.equals(hVar.f13120c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f13121d == 0) {
            this.f13121d = this.f13120c.hashCode() + ((((527 + ((int) this.f13118a)) * 31) + ((int) this.f13119b)) * 31);
        }
        return this.f13121d;
    }

    public String toString() {
        StringBuilder a10 = a.a("RangedUri(referenceUri=");
        a10.append(this.f13120c);
        a10.append(", start=");
        a10.append(this.f13118a);
        a10.append(", length=");
        a10.append(this.f13119b);
        a10.append(")");
        return a10.toString();
    }
}
