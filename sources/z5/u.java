package z5;

import java.io.IOException;
import z5.v;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v.a f28642a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f28643b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f28644c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f28645d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IOException f28646e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f28647f;

    public /* synthetic */ u(v.a aVar, v vVar, k kVar, n nVar, IOException iOException, boolean z10) {
        this.f28642a = aVar;
        this.f28643b = vVar;
        this.f28644c = kVar;
        this.f28645d = nVar;
        this.f28646e = iOException;
        this.f28647f = z10;
    }

    public final void run() {
        v.a aVar = this.f28642a;
        this.f28643b.H(aVar.f28648a, aVar.f28649b, this.f28644c, this.f28645d, this.f28646e, this.f28647f);
    }
}
