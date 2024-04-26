package o2;

import androidx.work.b;
import androidx.work.d;
import g2.e;
import o1.q;

/* compiled from: WorkSpec */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public String f22864a;

    /* renamed from: b  reason: collision with root package name */
    public d f22865b = d.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f22866c;

    /* renamed from: d  reason: collision with root package name */
    public String f22867d;

    /* renamed from: e  reason: collision with root package name */
    public b f22868e;

    /* renamed from: f  reason: collision with root package name */
    public b f22869f;

    /* renamed from: g  reason: collision with root package name */
    public long f22870g;

    /* renamed from: h  reason: collision with root package name */
    public long f22871h;

    /* renamed from: i  reason: collision with root package name */
    public long f22872i;

    /* renamed from: j  reason: collision with root package name */
    public g2.b f22873j;

    /* renamed from: k  reason: collision with root package name */
    public int f22874k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f22875l;

    /* renamed from: m  reason: collision with root package name */
    public long f22876m;

    /* renamed from: n  reason: collision with root package name */
    public long f22877n;

    /* renamed from: o  reason: collision with root package name */
    public long f22878o;

    /* renamed from: p  reason: collision with root package name */
    public long f22879p;

    /* compiled from: WorkSpec */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f22880a;

        /* renamed from: b  reason: collision with root package name */
        public d f22881b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22881b != aVar.f22881b) {
                return false;
            }
            return this.f22880a.equals(aVar.f22880a);
        }

        public int hashCode() {
            return this.f22881b.hashCode() + (this.f22880a.hashCode() * 31);
        }
    }

    static {
        e.e("WorkSpec");
    }

    public j(String str, String str2) {
        b bVar = b.f3239c;
        this.f22868e = bVar;
        this.f22869f = bVar;
        this.f22873j = g2.b.f18393i;
        this.f22875l = androidx.work.a.EXPONENTIAL;
        this.f22876m = 30000;
        this.f22879p = -1;
        this.f22864a = str;
        this.f22866c = str2;
    }

    public long a() {
        long j10;
        long j11;
        long j12;
        boolean z10 = false;
        if (c()) {
            if (this.f22875l == androidx.work.a.LINEAR) {
                z10 = true;
            }
            if (z10) {
                j12 = this.f22876m * ((long) this.f22874k);
            } else {
                j12 = (long) Math.scalb((float) this.f22876m, this.f22874k - 1);
            }
            j11 = this.f22877n;
            j10 = Math.min(18000000, j12);
        } else {
            long j13 = 0;
            if (d()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j14 = this.f22877n;
                long j15 = j14 == 0 ? currentTimeMillis + this.f22870g : j14;
                long j16 = this.f22872i;
                long j17 = this.f22871h;
                if (j16 != j17) {
                    z10 = true;
                }
                if (z10) {
                    if (j14 == 0) {
                        j13 = j16 * -1;
                    }
                    return j15 + j17 + j13;
                }
                if (j14 != 0) {
                    j13 = j17;
                }
                return j15 + j13;
            }
            j10 = this.f22877n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            j11 = this.f22870g;
        }
        return j10 + j11;
    }

    public boolean b() {
        return !g2.b.f18393i.equals(this.f22873j);
    }

    public boolean c() {
        return this.f22865b == d.ENQUEUED && this.f22874k > 0;
    }

    public boolean d() {
        return this.f22871h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f22870g != jVar.f22870g || this.f22871h != jVar.f22871h || this.f22872i != jVar.f22872i || this.f22874k != jVar.f22874k || this.f22876m != jVar.f22876m || this.f22877n != jVar.f22877n || this.f22878o != jVar.f22878o || this.f22879p != jVar.f22879p || !this.f22864a.equals(jVar.f22864a) || this.f22865b != jVar.f22865b || !this.f22866c.equals(jVar.f22866c)) {
            return false;
        }
        String str = this.f22867d;
        if (str == null ? jVar.f22867d != null : !str.equals(jVar.f22867d)) {
            return false;
        }
        if (this.f22868e.equals(jVar.f22868e) && this.f22869f.equals(jVar.f22869f) && this.f22873j.equals(jVar.f22873j) && this.f22875l == jVar.f22875l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int a10 = q.a(this.f22866c, (this.f22865b.hashCode() + (this.f22864a.hashCode() * 31)) * 31, 31);
        String str = this.f22867d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f22868e.hashCode();
        int hashCode3 = this.f22869f.hashCode();
        long j10 = this.f22870g;
        long j11 = this.f22871h;
        long j12 = this.f22872i;
        int hashCode4 = this.f22873j.hashCode();
        int hashCode5 = this.f22875l.hashCode();
        long j13 = this.f22876m;
        long j14 = this.f22877n;
        long j15 = this.f22878o;
        long j16 = this.f22879p;
        return ((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((a10 + hashCode) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f22874k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)));
    }

    public String toString() {
        return androidx.activity.e.a(android.support.v4.media.a.a("{WorkSpec: "), this.f22864a, "}");
    }

    public j(j jVar) {
        b bVar = b.f3239c;
        this.f22868e = bVar;
        this.f22869f = bVar;
        this.f22873j = g2.b.f18393i;
        this.f22875l = androidx.work.a.EXPONENTIAL;
        this.f22876m = 30000;
        this.f22879p = -1;
        this.f22864a = jVar.f22864a;
        this.f22866c = jVar.f22866c;
        this.f22865b = jVar.f22865b;
        this.f22867d = jVar.f22867d;
        this.f22868e = new b(jVar.f22868e);
        this.f22869f = new b(jVar.f22869f);
        this.f22870g = jVar.f22870g;
        this.f22871h = jVar.f22871h;
        this.f22872i = jVar.f22872i;
        this.f22873j = new g2.b(jVar.f22873j);
        this.f22874k = jVar.f22874k;
        this.f22875l = jVar.f22875l;
        this.f22876m = jVar.f22876m;
        this.f22877n = jVar.f22877n;
        this.f22878o = jVar.f22878o;
        this.f22879p = jVar.f22879p;
    }
}
