package z5;

import java.util.logging.Logger;
import o4.f;
import o4.i;
import o4.k;
import p4.h;
import r4.a;
import r4.b;
import z5.v;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f28633b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f28634c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f28635d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f28636e;

    public /* synthetic */ s(b bVar, i iVar, k kVar, f fVar) {
        this.f28632a = 2;
        this.f28633b = bVar;
        this.f28634c = iVar;
        this.f28635d = kVar;
        this.f28636e = fVar;
    }

    public /* synthetic */ s(v.a aVar, v vVar, k kVar, n nVar, int i10) {
        this.f28632a = i10;
        this.f28633b = aVar;
        this.f28634c = vVar;
        this.f28635d = kVar;
        this.f28636e = nVar;
    }

    public final void run() {
        switch (this.f28632a) {
            case 0:
                v.a aVar = (v.a) this.f28633b;
                ((v) this.f28634c).u(aVar.f28648a, aVar.f28649b, (k) this.f28635d, (n) this.f28636e);
                return;
            case 1:
                v.a aVar2 = (v.a) this.f28633b;
                ((v) this.f28634c).i(aVar2.f28648a, aVar2.f28649b, (k) this.f28635d, (n) this.f28636e);
                return;
            default:
                b bVar = (b) this.f28633b;
                i iVar = (i) this.f28634c;
                k kVar = (k) this.f28635d;
                f fVar = (f) this.f28636e;
                Logger logger = b.f24533f;
                bVar.getClass();
                try {
                    h a10 = bVar.f24536c.a(iVar.b());
                    if (a10 == null) {
                        String format = String.format("Transport backend '%s' is not registered", new Object[]{iVar.b()});
                        b.f24533f.warning(format);
                        new IllegalArgumentException(format);
                        kVar.getClass();
                        return;
                    }
                    bVar.f24538e.a(new a(bVar, iVar, a10.b(fVar)));
                    kVar.getClass();
                    return;
                } catch (Exception e10) {
                    Logger logger2 = b.f24533f;
                    logger2.warning("Error scheduling event " + e10.getMessage());
                    kVar.getClass();
                    return;
                }
        }
    }
}
