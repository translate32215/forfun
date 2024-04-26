package p4;

import android.content.Context;
import jd.a;
import t4.x;

/* compiled from: CreationContextFactory_Factory */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23822a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Context> f23823b;

    /* renamed from: c  reason: collision with root package name */
    public final a<v4.a> f23824c;

    /* renamed from: d  reason: collision with root package name */
    public final a<v4.a> f23825d;

    public f(a aVar, a aVar2, a aVar3, int i10) {
        this.f23822a = i10;
        if (i10 != 1) {
            this.f23823b = aVar;
            this.f23824c = aVar2;
            this.f23825d = aVar3;
            return;
        }
        this.f23823b = aVar;
        this.f23824c = aVar2;
        this.f23825d = aVar3;
    }

    public Object get() {
        switch (this.f23822a) {
            case 0:
                return new e(this.f23823b.get(), this.f23824c.get(), this.f23825d.get());
            default:
                return new x(this.f23823b.get(), (String) this.f23824c.get(), ((Integer) this.f23825d.get()).intValue());
        }
    }
}
