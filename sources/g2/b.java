package g2;

import android.os.Build;
import androidx.work.c;

/* compiled from: Constraints */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f18393i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public c f18394a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18395b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18396c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18397d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18398e;

    /* renamed from: f  reason: collision with root package name */
    public long f18399f;

    /* renamed from: g  reason: collision with root package name */
    public long f18400g;

    /* renamed from: h  reason: collision with root package name */
    public c f18401h;

    /* compiled from: Constraints */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c f18402a = c.NOT_REQUIRED;

        /* renamed from: b  reason: collision with root package name */
        public c f18403b = new c();

        public b a() {
            return new b(this);
        }
    }

    public b() {
        this.f18394a = c.NOT_REQUIRED;
        this.f18399f = -1;
        this.f18400g = -1;
        this.f18401h = new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18395b == bVar.f18395b && this.f18396c == bVar.f18396c && this.f18397d == bVar.f18397d && this.f18398e == bVar.f18398e && this.f18399f == bVar.f18399f && this.f18400g == bVar.f18400g && this.f18394a == bVar.f18394a) {
            return this.f18401h.equals(bVar.f18401h);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18399f;
        long j11 = this.f18400g;
        return this.f18401h.hashCode() + (((((((((((((this.f18394a.hashCode() * 31) + (this.f18395b ? 1 : 0)) * 31) + (this.f18396c ? 1 : 0)) * 31) + (this.f18397d ? 1 : 0)) * 31) + (this.f18398e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public b(a aVar) {
        this.f18394a = c.NOT_REQUIRED;
        this.f18399f = -1;
        this.f18400g = -1;
        this.f18401h = new c();
        this.f18395b = false;
        int i10 = Build.VERSION.SDK_INT;
        this.f18396c = false;
        this.f18394a = aVar.f18402a;
        this.f18397d = false;
        this.f18398e = false;
        if (i10 >= 24) {
            this.f18401h = aVar.f18403b;
            this.f18399f = -1;
            this.f18400g = -1;
        }
    }

    public b(b bVar) {
        this.f18394a = c.NOT_REQUIRED;
        this.f18399f = -1;
        this.f18400g = -1;
        this.f18401h = new c();
        this.f18395b = bVar.f18395b;
        this.f18396c = bVar.f18396c;
        this.f18394a = bVar.f18394a;
        this.f18397d = bVar.f18397d;
        this.f18398e = bVar.f18398e;
        this.f18401h = bVar.f18401h;
    }
}
