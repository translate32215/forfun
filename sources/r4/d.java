package r4;

import android.content.Context;
import android.os.Build;
import jd.a;
import t4.c;
import t4.s;
import t4.x;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24539a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Context> f24540b;

    /* renamed from: c  reason: collision with root package name */
    public final a<c> f24541c;

    /* renamed from: d  reason: collision with root package name */
    public final a<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> f24542d;

    /* renamed from: e  reason: collision with root package name */
    public final a<v4.a> f24543e;

    public d(a aVar, a aVar2, a aVar3, a aVar4, int i10) {
        this.f24539a = i10;
        if (i10 != 1) {
            this.f24540b = aVar;
            this.f24541c = aVar2;
            this.f24542d = aVar3;
            this.f24543e = aVar4;
            return;
        }
        this.f24540b = aVar;
        this.f24541c = aVar2;
        this.f24542d = aVar3;
        this.f24543e = aVar4;
    }

    public Object get() {
        switch (this.f24539a) {
            case 0:
                Context context = this.f24540b.get();
                c cVar = this.f24541c.get();
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = this.f24542d.get();
                v4.a aVar = this.f24543e.get();
                if (Build.VERSION.SDK_INT >= 21) {
                    return new s4.c(context, cVar, cVar2);
                }
                return new s4.a(context, cVar, aVar, cVar2);
            default:
                return new s((v4.a) this.f24540b.get(), (v4.a) this.f24541c.get(), (t4.d) this.f24542d.get(), (x) this.f24543e.get());
        }
    }
}
