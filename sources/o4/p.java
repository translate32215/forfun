package o4;

import java.util.concurrent.Executor;
import jd.a;
import p4.d;
import r4.b;
import r4.c;
import s4.h;
import s4.j;
import s4.k;

/* compiled from: TransportRuntime_Factory */
public final class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22967a;

    /* renamed from: b  reason: collision with root package name */
    public final a<v4.a> f22968b;

    /* renamed from: c  reason: collision with root package name */
    public final a<v4.a> f22969c;

    /* renamed from: d  reason: collision with root package name */
    public final a<c> f22970d;

    /* renamed from: e  reason: collision with root package name */
    public final a<h> f22971e;

    /* renamed from: f  reason: collision with root package name */
    public final a<j> f22972f;

    public p(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i10) {
        this.f22967a = i10;
        if (i10 != 1) {
            this.f22968b = aVar;
            this.f22969c = aVar2;
            this.f22970d = aVar3;
            this.f22971e = aVar4;
            this.f22972f = aVar5;
            return;
        }
        this.f22968b = aVar;
        this.f22969c = aVar2;
        this.f22970d = aVar3;
        this.f22971e = aVar4;
        this.f22972f = aVar5;
    }

    public Object get() {
        switch (this.f22967a) {
            case 0:
                return new n(this.f22968b.get(), this.f22969c.get(), this.f22970d.get(), this.f22971e.get(), this.f22972f.get());
            default:
                return new b((Executor) this.f22968b.get(), (d) this.f22969c.get(), (k) this.f22970d.get(), (t4.c) this.f22971e.get(), (u4.b) this.f22972f.get());
        }
    }
}
