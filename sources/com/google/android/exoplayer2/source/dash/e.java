package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c5.j;
import c5.l;
import d5.a0;
import d5.z;
import java.io.IOException;
import java.util.TreeMap;
import m3.t;
import u6.f;
import v6.e0;
import v6.v;
import x4.b0;
import x4.m0;

/* compiled from: PlayerEmsgHandler */
public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final f f5115a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5116b;

    /* renamed from: c  reason: collision with root package name */
    public final s5.b f5117c = new s5.b();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f5118d = e0.m(this);

    /* renamed from: e  reason: collision with root package name */
    public final TreeMap<Long, Long> f5119e = new TreeMap<>();

    /* renamed from: f  reason: collision with root package name */
    public d6.b f5120f;

    /* renamed from: g  reason: collision with root package name */
    public long f5121g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5122h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5123i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5124r;

    /* compiled from: PlayerEmsgHandler */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f5125a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5126b;

        public a(long j10, long j11) {
            this.f5125a = j10;
            this.f5126b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler */
    public interface b {
    }

    /* compiled from: PlayerEmsgHandler */
    public final class c implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final z5.a0 f5127a;

        /* renamed from: b  reason: collision with root package name */
        public final t f5128b = new t(2);

        /* renamed from: c  reason: collision with root package name */
        public final q5.e f5129c = new q5.e();

        /* renamed from: d  reason: collision with root package name */
        public long f5130d = -9223372036854775807L;

        public c(f fVar) {
            this.f5127a = new z5.a0(fVar, (Looper) null, (l) null, (j.a) null);
        }

        public int a(com.google.android.exoplayer2.upstream.c cVar, int i10, boolean z10, int i11) throws IOException {
            return this.f5127a.f(cVar, i10, z10);
        }

        public /* synthetic */ void b(v vVar, int i10) {
            z.b(this, vVar, i10);
        }

        public void c(b0 b0Var) {
            this.f5127a.c(b0Var);
        }

        public void d(long j10, int i10, int i11, int i12, a0.a aVar) {
            long j11;
            q5.e eVar;
            long j12;
            this.f5127a.d(j10, i10, i11, i12, aVar);
            while (true) {
                boolean z10 = false;
                if (!this.f5127a.v(false)) {
                    break;
                }
                this.f5129c.t();
                if (this.f5127a.B(this.f5128b, this.f5129c, false, false) == -4) {
                    this.f5129c.w();
                    eVar = this.f5129c;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    long j13 = eVar.f88e;
                    q5.a a10 = e.this.f5117c.a(eVar);
                    if (a10 != null) {
                        s5.a aVar2 = (s5.a) a10.f24150a[0];
                        String str = aVar2.f24957a;
                        String str2 = aVar2.f24958b;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z10 = true;
                        }
                        if (z10) {
                            try {
                                j12 = e0.M(e0.o(aVar2.f24961e));
                            } catch (m0 unused) {
                                j12 = -9223372036854775807L;
                            }
                            if (j12 != -9223372036854775807L) {
                                a aVar3 = new a(j13, j12);
                                Handler handler = e.this.f5118d;
                                handler.sendMessage(handler.obtainMessage(1, aVar3));
                            }
                        }
                    }
                }
            }
            z5.a0 a0Var = this.f5127a;
            z5.z zVar = a0Var.f28515a;
            synchronized (a0Var) {
                int i13 = a0Var.f28534t;
                if (i13 == 0) {
                    j11 = -1;
                } else {
                    j11 = a0Var.g(i13);
                }
            }
            zVar.b(j11);
        }

        public void e(v vVar, int i10, int i11) {
            this.f5127a.b(vVar, i10);
        }

        public /* synthetic */ int f(com.google.android.exoplayer2.upstream.c cVar, int i10, boolean z10) {
            return z.a(this, cVar, i10, z10);
        }
    }

    public e(d6.b bVar, b bVar2, f fVar) {
        this.f5120f = bVar;
        this.f5116b = bVar2;
        this.f5115a = fVar;
    }

    public final void a() {
        if (this.f5122h) {
            this.f5123i = true;
            this.f5122h = false;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.J.removeCallbacks(dashMediaSource.C);
            dashMediaSource.F();
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f5124r) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        long j10 = aVar.f5125a;
        long j11 = aVar.f5126b;
        Long l10 = this.f5119e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f5119e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f5119e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}
