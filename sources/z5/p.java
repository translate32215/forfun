package z5;

/* compiled from: MediaPeriodId */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f28627a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28628b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28629c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28630d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28631e;

    public p(p pVar) {
        this.f28627a = pVar.f28627a;
        this.f28628b = pVar.f28628b;
        this.f28629c = pVar.f28629c;
        this.f28630d = pVar.f28630d;
        this.f28631e = pVar.f28631e;
    }

    public boolean a() {
        return this.f28628b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f28627a.equals(pVar.f28627a) && this.f28628b == pVar.f28628b && this.f28629c == pVar.f28629c && this.f28630d == pVar.f28630d && this.f28631e == pVar.f28631e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f28627a.hashCode() + 527) * 31) + this.f28628b) * 31) + this.f28629c) * 31) + ((int) this.f28630d)) * 31) + this.f28631e;
    }

    public p(Object obj) {
        this.f28627a = obj;
        this.f28628b = -1;
        this.f28629c = -1;
        this.f28630d = -1;
        this.f28631e = -1;
    }

    public p(Object obj, int i10, int i11, long j10) {
        this.f28627a = obj;
        this.f28628b = i10;
        this.f28629c = i11;
        this.f28630d = j10;
        this.f28631e = -1;
    }

    public p(Object obj, int i10, int i11, long j10, int i12) {
        this.f28627a = obj;
        this.f28628b = i10;
        this.f28629c = i11;
        this.f28630d = j10;
        this.f28631e = i12;
    }

    public p(Object obj, long j10, int i10) {
        this.f28627a = obj;
        this.f28628b = -1;
        this.f28629c = -1;
        this.f28630d = j10;
        this.f28631e = i10;
    }
}
