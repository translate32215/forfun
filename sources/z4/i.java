package z4;

import v6.e0;
import w6.s;
import z4.k;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28358a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f28359b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f28360c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28361d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f28362e;

    public /* synthetic */ i(s.a aVar, String str, long j10, long j11) {
        this.f28359b = aVar;
        this.f28360c = str;
        this.f28361d = j10;
        this.f28362e = j11;
    }

    public /* synthetic */ i(k.a aVar, String str, long j10, long j11) {
        this.f28359b = aVar;
        this.f28360c = str;
        this.f28361d = j10;
        this.f28362e = j11;
    }

    public final void run() {
        switch (this.f28358a) {
            case 0:
                String str = this.f28360c;
                long j10 = this.f28361d;
                long j11 = this.f28362e;
                k kVar = ((k.a) this.f28359b).f28366b;
                int i10 = e0.f26436a;
                kVar.L(str, j10, j11);
                return;
            default:
                String str2 = this.f28360c;
                long j12 = this.f28361d;
                long j13 = this.f28362e;
                s sVar = ((s.a) this.f28359b).f27133b;
                int i11 = e0.f26436a;
                sVar.m(str2, j12, j13);
                return;
        }
    }
}
