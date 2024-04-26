package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.vv;
import d7.l;
import e8.b20;
import e8.j10;
import e8.l10;
import e8.m10;
import e8.n10;
import e8.r10;
import e8.s10;
import e8.t;
import e8.ti0;
import e8.xk;
import e8.yk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ye implements l10 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<r10, j10> f8604a;

    /* renamed from: b  reason: collision with root package name */
    public ze f8605b;

    /* renamed from: c  reason: collision with root package name */
    public m10 f8606c = new m10();

    public ye(ze zeVar) {
        this.f8604a = new ConcurrentHashMap<>(zeVar.f8701e);
        this.f8605b = zeVar;
    }

    public final void a() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.D3)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f8605b.f8699c);
            sb2.append(" PoolCollection");
            m10 m10 = this.f8606c;
            m10.getClass();
            sb2.append("\n\tPool does not exist: " + m10.f15448d + "\n\tNew pools created: " + m10.f15446b + "\n\tPools removed: " + m10.f15447c + "\n\tEntries added: " + m10.f15450f + "\n\tNo entries retrieved: " + m10.f15449e + "\n");
            int i10 = 0;
            for (Map.Entry next : this.f8604a.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(next.getValue());
                sb2.append("#");
                sb2.append(((r10) next.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((j10) next.getValue()).a(); i11++) {
                    sb2.append("[O]");
                }
                for (int a10 = ((j10) next.getValue()).a(); a10 < this.f8605b.f8701e; a10++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                b20 b20 = ((j10) next.getValue()).f15088d;
                b20.getClass();
                sb2.append("Created: " + b20.f13869a + " Last accessed: " + b20.f13871c + " Accesses: " + b20.f13872d + "\nEntries retrieved: Valid: " + b20.f13873e + " Stale: " + b20.f13874f);
                sb2.append("\n");
            }
            while (i10 < this.f8605b.f8700d) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            e.E(sb2.toString());
        }
    }

    public final void b(s10<?> s10, ef efVar) {
        if (s10 != null) {
            vv.b z10 = vv.z();
            vv.a.C0087a B = vv.a.B();
            B.p(vv.c.IN_MEMORY);
            vv.d.a A = vv.d.A();
            boolean z11 = efVar.f6281a;
            if (A.f5971c) {
                A.n();
                A.f5971c = false;
            }
            vv.d.z((vv.d) A.f5970b, z11);
            int i10 = efVar.f6282b;
            if (A.f5971c) {
                A.n();
                A.f5971c = false;
            }
            vv.d.y((vv.d) A.f5970b, i10);
            B.o(A);
            z10.o(B);
            s10.f16364a.f15517f.I0(new yk((vv) ((aq) z10.j()), 0));
        }
        a();
    }

    public final synchronized boolean c(r10 r10, s10<?> s10) {
        boolean z10;
        j10 j10 = this.f8604a.get(r10);
        s10.f16367d = l.B.f13193j.b();
        if (j10 == null) {
            ze zeVar = this.f8605b;
            j10 = new j10(zeVar.f8701e, zeVar.f8702f * 1000);
            int size = this.f8604a.size();
            ze zeVar2 = this.f8605b;
            if (size == zeVar2.f8700d) {
                int i10 = n10.f15579a[zeVar2.f8705i - 1];
                long j11 = Long.MAX_VALUE;
                r10 r102 = null;
                if (i10 == 1) {
                    for (Map.Entry next : this.f8604a.entrySet()) {
                        if (((j10) next.getValue()).f15088d.f13869a < j11) {
                            j11 = ((j10) next.getValue()).f15088d.f13869a;
                            r102 = (r10) next.getKey();
                        }
                    }
                    if (r102 != null) {
                        this.f8604a.remove(r102);
                    }
                } else if (i10 == 2) {
                    for (Map.Entry next2 : this.f8604a.entrySet()) {
                        if (((j10) next2.getValue()).f15088d.f13871c < j11) {
                            j11 = ((j10) next2.getValue()).f15088d.f13871c;
                            r102 = (r10) next2.getKey();
                        }
                    }
                    if (r102 != null) {
                        this.f8604a.remove(r102);
                    }
                } else if (i10 == 3) {
                    int i11 = Integer.MAX_VALUE;
                    for (Map.Entry next3 : this.f8604a.entrySet()) {
                        if (((j10) next3.getValue()).f15088d.f13872d < i11) {
                            i11 = ((j10) next3.getValue()).f15088d.f13872d;
                            r102 = (r10) next3.getKey();
                        }
                    }
                    if (r102 != null) {
                        this.f8604a.remove(r102);
                    }
                }
                m10 m10 = this.f8606c;
                m10.f15447c++;
                m10.f15445a.f5961b = true;
            }
            this.f8604a.put(r10, j10);
            m10 m102 = this.f8606c;
            m102.f15446b++;
            m102.f15445a.f5960a = true;
        }
        b20 b20 = j10.f15088d;
        b20.getClass();
        b20.f13871c = l.B.f13193j.b();
        b20.f13872d++;
        j10.c();
        if (j10.f15085a.size() == j10.f15086b) {
            z10 = false;
        } else {
            j10.f15085a.add(s10);
            z10 = true;
        }
        m10 m103 = this.f8606c;
        m103.f15450f++;
        af afVar = (af) m103.f15445a.clone();
        af afVar2 = m103.f15445a;
        afVar2.f5960a = false;
        afVar2.f5961b = false;
        b20 b202 = j10.f15088d;
        ef efVar = (ef) b202.f13870b.clone();
        ef efVar2 = b202.f13870b;
        efVar2.f6281a = false;
        efVar2.f6282b = 0;
        vv.b z11 = vv.z();
        vv.a.C0087a B = vv.a.B();
        B.p(vv.c.IN_MEMORY);
        vv.e.a B2 = vv.e.B();
        boolean z12 = afVar.f5960a;
        if (B2.f5971c) {
            B2.n();
            B2.f5971c = false;
        }
        vv.e.z((vv.e) B2.f5970b, z12);
        boolean z13 = afVar.f5961b;
        if (B2.f5971c) {
            B2.n();
            B2.f5971c = false;
        }
        vv.e.A((vv.e) B2.f5970b, z13);
        int i12 = efVar.f6282b;
        if (B2.f5971c) {
            B2.n();
            B2.f5971c = false;
        }
        vv.e.y((vv.e) B2.f5970b, i12);
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        vv.a.A((vv.a) B.f5970b, (vv.e) ((aq) B2.j()));
        z11.o(B);
        s10.f16364a.f15517f.I0(new xk((vv) ((aq) z11.j()), 0));
        a();
        return z10;
    }
}
