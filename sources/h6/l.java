package h6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.a;
import h6.h;
import java.util.Collections;
import java.util.List;
import m3.t;
import v6.e0;
import v6.p;
import v6.s;
import x4.b0;
import x4.e;

/* compiled from: TextRenderer */
public final class l extends e implements Handler.Callback {
    public int A;
    public b0 B;
    public f C;
    public i D;
    public j E;
    public j F;
    public int G;
    public long H;

    /* renamed from: t  reason: collision with root package name */
    public final Handler f18959t;

    /* renamed from: u  reason: collision with root package name */
    public final k f18960u;

    /* renamed from: v  reason: collision with root package name */
    public final h f18961v;

    /* renamed from: w  reason: collision with root package name */
    public final t f18962w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18963x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f18964y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f18965z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(k kVar, Looper looper) {
        super(3);
        Handler handler;
        h hVar = h.f18955a;
        kVar.getClass();
        this.f18960u = kVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = e0.f26436a;
            handler = new Handler(looper, this);
        }
        this.f18959t = handler;
        this.f18961v = hVar;
        this.f18962w = new t(2);
        this.H = -9223372036854775807L;
    }

    public void C() {
        this.B = null;
        this.H = -9223372036854775807L;
        K();
        O();
        f fVar = this.C;
        fVar.getClass();
        fVar.a();
        this.C = null;
        this.A = 0;
    }

    public void E(long j10, boolean z10) {
        K();
        this.f18963x = false;
        this.f18964y = false;
        this.H = -9223372036854775807L;
        if (this.A != 0) {
            P();
            return;
        }
        O();
        f fVar = this.C;
        fVar.getClass();
        fVar.flush();
    }

    public void I(b0[] b0VarArr, long j10, long j11) {
        this.B = b0VarArr[0];
        if (this.C != null) {
            this.A = 1;
        } else {
            N();
        }
    }

    public final void K() {
        List emptyList = Collections.emptyList();
        Handler handler = this.f18959t;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f18960u.t(emptyList);
        }
    }

    public final long L() {
        if (this.G == -1) {
            return Long.MAX_VALUE;
        }
        this.E.getClass();
        int i10 = this.G;
        e eVar = this.E.f18957c;
        eVar.getClass();
        if (i10 >= eVar.f()) {
            return Long.MAX_VALUE;
        }
        j jVar = this.E;
        int i11 = this.G;
        e eVar2 = jVar.f18957c;
        eVar2.getClass();
        return eVar2.b(i11) + jVar.f18958d;
    }

    public final void M(g gVar) {
        StringBuilder a10 = a.a("Subtitle decoding failed. streamFormat=");
        a10.append(this.B);
        p.b("TextRenderer", a10.toString(), gVar);
        K();
        P();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r1.equals("application/pgs") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        r5.C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N() {
        /*
            r5 = this;
            r0 = 1
            r5.f18965z = r0
            h6.h r1 = r5.f18961v
            x4.b0 r2 = r5.B
            r2.getClass()
            h6.h$a r1 = (h6.h.a) r1
            r1.getClass()
            java.lang.String r1 = r2.f27408t
            if (r1 == 0) goto L_0x00ed
            int r3 = r1.hashCode()
            switch(r3) {
                case -1351681404: goto L_0x0091;
                case -1248334819: goto L_0x0088;
                case -1026075066: goto L_0x007d;
                case -1004728940: goto L_0x0072;
                case 691401887: goto L_0x0067;
                case 822864842: goto L_0x005c;
                case 930165504: goto L_0x0051;
                case 1566015601: goto L_0x0046;
                case 1566016562: goto L_0x0038;
                case 1668750253: goto L_0x002a;
                case 1693976202: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x009c
        L_0x001c:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x009c
        L_0x0026:
            r0 = 10
            goto L_0x009d
        L_0x002a:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x009c
        L_0x0034:
            r0 = 9
            goto L_0x009d
        L_0x0038:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x009c
        L_0x0042:
            r0 = 8
            goto L_0x009d
        L_0x0046:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x009c
        L_0x004f:
            r0 = 7
            goto L_0x009d
        L_0x0051:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x009c
        L_0x005a:
            r0 = 6
            goto L_0x009d
        L_0x005c:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            r0 = 5
            goto L_0x009d
        L_0x0067:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0070
            goto L_0x009c
        L_0x0070:
            r0 = 4
            goto L_0x009d
        L_0x0072:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007b
            goto L_0x009c
        L_0x007b:
            r0 = 3
            goto L_0x009d
        L_0x007d:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0086
            goto L_0x009c
        L_0x0086:
            r0 = 2
            goto L_0x009d
        L_0x0088:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x009d
            goto L_0x009c
        L_0x0091:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r0 = 0
            goto L_0x009d
        L_0x009c:
            r0 = -1
        L_0x009d:
            switch(r0) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00a7;
                case 10: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x00ed
        L_0x00a1:
            o6.c r0 = new o6.c
            r0.<init>()
            goto L_0x00ea
        L_0x00a7:
            n6.a r0 = new n6.a
            r0.<init>()
            goto L_0x00ea
        L_0x00ad:
            i6.c r0 = new i6.c
            int r1 = r2.L
            java.util.List<byte[]> r2 = r2.f27410v
            r0.<init>(r1, r2)
            goto L_0x00ea
        L_0x00b7:
            i6.a r0 = new i6.a
            int r2 = r2.L
            r3 = 16000(0x3e80, double:7.905E-320)
            r0.<init>(r1, r2, r3)
            goto L_0x00ea
        L_0x00c1:
            m6.a r0 = new m6.a
            java.util.List<byte[]> r1 = r2.f27410v
            r0.<init>(r1)
            goto L_0x00ea
        L_0x00c9:
            p6.a r0 = new p6.a
            java.util.List<byte[]> r1 = r2.f27410v
            r0.<init>(r1)
            goto L_0x00ea
        L_0x00d1:
            q6.g r0 = new q6.g
            r0.<init>()
            goto L_0x00ea
        L_0x00d7:
            q6.b r0 = new q6.b
            r0.<init>()
            goto L_0x00ea
        L_0x00dd:
            k6.a r0 = new k6.a
            r0.<init>()
            goto L_0x00ea
        L_0x00e3:
            j6.a r0 = new j6.a
            java.util.List<byte[]> r1 = r2.f27410v
            r0.<init>(r1)
        L_0x00ea:
            r5.C = r0
            return
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = j.f.a(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.l.N():void");
    }

    public final void O() {
        this.D = null;
        this.G = -1;
        j jVar = this.E;
        if (jVar != null) {
            jVar.t();
            this.E = null;
        }
        j jVar2 = this.F;
        if (jVar2 != null) {
            jVar2.t();
            this.F = null;
        }
    }

    public final void P() {
        O();
        f fVar = this.C;
        fVar.getClass();
        fVar.a();
        this.C = null;
        this.A = 0;
        N();
    }

    public String a() {
        return "TextRenderer";
    }

    public boolean d() {
        return this.f18964y;
    }

    public int h(b0 b0Var) {
        ((h.a) this.f18961v).getClass();
        String str = b0Var.f27408t;
        if (!("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str))) {
            return s.l(b0Var.f27408t) ? 1 : 0;
        }
        return (b0Var.M == null ? 4 : 2) | 0 | 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f18960u.t((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) {
        boolean z10;
        if (this.f27501r) {
            long j12 = this.H;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                O();
                this.f18964y = true;
            }
        }
        if (!this.f18964y) {
            if (this.F == null) {
                f fVar = this.C;
                fVar.getClass();
                fVar.b(j10);
                try {
                    f fVar2 = this.C;
                    fVar2.getClass();
                    this.F = (j) fVar2.d();
                } catch (g e10) {
                    M(e10);
                    return;
                }
            }
            if (this.f27496e == 2) {
                if (this.E != null) {
                    long L = L();
                    z10 = false;
                    while (L <= j10) {
                        this.G++;
                        L = L();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.F;
                if (jVar != null) {
                    if (jVar.r()) {
                        if (!z10 && L() == Long.MAX_VALUE) {
                            if (this.A == 2) {
                                P();
                            } else {
                                O();
                                this.f18964y = true;
                            }
                        }
                    } else if (jVar.f97b <= j10) {
                        j jVar2 = this.E;
                        if (jVar2 != null) {
                            jVar2.t();
                        }
                        e eVar = jVar.f18957c;
                        eVar.getClass();
                        this.G = eVar.a(j10 - jVar.f18958d);
                        this.E = jVar;
                        this.F = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.E.getClass();
                    j jVar3 = this.E;
                    e eVar2 = jVar3.f18957c;
                    eVar2.getClass();
                    List<b> c10 = eVar2.c(j10 - jVar3.f18958d);
                    Handler handler = this.f18959t;
                    if (handler != null) {
                        handler.obtainMessage(0, c10).sendToTarget();
                    } else {
                        this.f18960u.t(c10);
                    }
                }
                if (this.A != 2) {
                    while (!this.f18963x) {
                        try {
                            i iVar = this.D;
                            if (iVar == null) {
                                f fVar3 = this.C;
                                fVar3.getClass();
                                iVar = (i) fVar3.e();
                                if (iVar != null) {
                                    this.D = iVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.A == 1) {
                                iVar.f61a = 4;
                                f fVar4 = this.C;
                                fVar4.getClass();
                                fVar4.c(iVar);
                                this.D = null;
                                this.A = 2;
                                return;
                            }
                            int J = J(this.f18962w, iVar, false);
                            if (J == -4) {
                                if (iVar.r()) {
                                    this.f18963x = true;
                                    this.f18965z = false;
                                } else {
                                    b0 b0Var = (b0) this.f18962w.f21666b;
                                    if (b0Var != null) {
                                        iVar.f18956i = b0Var.f27412x;
                                        iVar.w();
                                        this.f18965z &= !iVar.s();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f18965z) {
                                    f fVar5 = this.C;
                                    fVar5.getClass();
                                    fVar5.c(iVar);
                                    this.D = null;
                                }
                            } else if (J == -3) {
                                return;
                            }
                        } catch (g e11) {
                            M(e11);
                            return;
                        }
                    }
                }
            }
        }
    }
}
