package w6;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public a f27040a = new a();

    /* renamed from: b  reason: collision with root package name */
    public a f27041b = new a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f27042c;

    /* renamed from: d  reason: collision with root package name */
    public long f27043d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public int f27044e;

    /* compiled from: FixedFrameRateEstimator */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f27045a;

        /* renamed from: b  reason: collision with root package name */
        public long f27046b;

        /* renamed from: c  reason: collision with root package name */
        public long f27047c;

        /* renamed from: d  reason: collision with root package name */
        public long f27048d;

        /* renamed from: e  reason: collision with root package name */
        public long f27049e;

        /* renamed from: f  reason: collision with root package name */
        public long f27050f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean[] f27051g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        public int f27052h;

        public boolean a() {
            return this.f27048d > 15 && this.f27052h == 0;
        }

        public void b(long j10) {
            long j11 = this.f27048d;
            if (j11 == 0) {
                this.f27045a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f27045a;
                this.f27046b = j12;
                this.f27050f = j12;
                this.f27049e = 1;
            } else {
                long j13 = j10 - this.f27047c;
                int i10 = (int) (j11 % 15);
                if (Math.abs(j13 - this.f27046b) <= 1000000) {
                    this.f27049e++;
                    this.f27050f += j13;
                    boolean[] zArr = this.f27051g;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f27052h--;
                    }
                } else {
                    boolean[] zArr2 = this.f27051g;
                    if (!zArr2[i10]) {
                        zArr2[i10] = true;
                        this.f27052h++;
                    }
                }
            }
            this.f27048d++;
            this.f27047c = j10;
        }

        public void c() {
            this.f27048d = 0;
            this.f27049e = 0;
            this.f27050f = 0;
            this.f27052h = 0;
            Arrays.fill(this.f27051g, false);
        }
    }

    public boolean a() {
        return this.f27040a.a();
    }
}
