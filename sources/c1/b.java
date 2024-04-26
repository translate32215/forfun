package c1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import c1.d;
import java.util.Arrays;
import java.util.List;
import la.j;
import la.u;
import la.v;
import la.w;
import t6.f;
import ua.a;
import v6.e0;
import w6.s;
import x4.a1;
import x4.c1;
import x4.r0;
import x4.t0;
import x4.y;
import z4.k;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4015a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4016b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4017c;

    public /* synthetic */ b(d.c cVar, h hVar) {
        this.f4016b = cVar;
        this.f4017c = hVar;
    }

    public /* synthetic */ b(w wVar, a aVar) {
        this.f4016b = wVar;
        this.f4017c = aVar;
    }

    public /* synthetic */ b(f fVar, SurfaceTexture surfaceTexture) {
        this.f4016b = fVar;
        this.f4017c = surfaceTexture;
    }

    public /* synthetic */ b(s.a aVar, a5.d dVar) {
        this.f4016b = aVar;
        this.f4017c = dVar;
    }

    public /* synthetic */ b(x4.w wVar, y.d dVar) {
        this.f4016b = wVar;
        this.f4017c = dVar;
    }

    public /* synthetic */ b(k.a aVar, a5.d dVar) {
        this.f4016b = aVar;
        this.f4017c = dVar;
    }

    public final void run() {
        u uVar;
        switch (this.f4015a) {
            case 0:
                d.c cVar = (d.c) this.f4016b;
                h hVar = (h) this.f4017c;
                ud.k.f(cVar, "$policy");
                ud.k.f(hVar, "$violation");
                cVar.f4034b.a(hVar);
                return;
            case 1:
                x4.w wVar = (x4.w) this.f4016b;
                y.d dVar = (y.d) this.f4017c;
                int i10 = wVar.f27751s - dVar.f27794c;
                wVar.f27751s = i10;
                boolean z10 = true;
                if (dVar.f27795d) {
                    wVar.f27752t = true;
                    wVar.f27753u = dVar.f27796e;
                }
                if (dVar.f27797f) {
                    wVar.f27754v = dVar.f27798g;
                }
                if (i10 == 0) {
                    c1 c1Var = dVar.f27793b.f27679a;
                    if (!wVar.f27756x.f27679a.q() && c1Var.q()) {
                        wVar.f27757y = -1;
                        wVar.f27758z = 0;
                    }
                    if (!c1Var.q()) {
                        List asList = Arrays.asList(((t0) c1Var).f27729i);
                        if (asList.size() != wVar.f27742j.size()) {
                            z10 = false;
                        }
                        v6.a.d(z10);
                        for (int i11 = 0; i11 < asList.size(); i11++) {
                            wVar.f27742j.get(i11).f27760b = (c1) asList.get(i11);
                        }
                    }
                    boolean z11 = wVar.f27752t;
                    wVar.f27752t = false;
                    wVar.Q(dVar.f27793b, z11, wVar.f27753u, 1, wVar.f27754v, false);
                    return;
                }
                return;
            case 2:
                k.a aVar = (k.a) this.f4016b;
                a5.d dVar2 = (a5.d) this.f4017c;
                aVar.getClass();
                synchronized (dVar2) {
                }
                k kVar = aVar.f28366b;
                int i12 = e0.f26436a;
                kVar.j(dVar2);
                return;
            case 3:
                f fVar = (f) this.f4016b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f4017c;
                SurfaceTexture surfaceTexture2 = fVar.f25796g;
                Surface surface = fVar.f25797h;
                fVar.f25796g = surfaceTexture;
                Surface surface2 = new Surface(surfaceTexture);
                fVar.f25797h = surface2;
                r0.d dVar3 = fVar.f25798i;
                if (dVar3 != null) {
                    ((a1) dVar3).R(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 4:
                s.a aVar2 = (s.a) this.f4016b;
                a5.d dVar4 = (a5.d) this.f4017c;
                aVar2.getClass();
                synchronized (dVar4) {
                }
                s sVar = aVar2.f27133b;
                int i13 = e0.f26436a;
                sVar.J(dVar4);
                return;
            default:
                w wVar2 = (w) this.f4016b;
                a<T> aVar3 = (a) this.f4017c;
                int i14 = j.f21203g;
                if (wVar2.f21233b == v.f21230a) {
                    synchronized (wVar2) {
                        uVar = wVar2.f21232a;
                        wVar2.f21232a = null;
                        wVar2.f21233b = aVar3;
                    }
                    uVar.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }
}
