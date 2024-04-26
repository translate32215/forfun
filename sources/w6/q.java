package w6;

import v6.e0;
import w6.s;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27123a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f27124b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f27125c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f27126d;

    public /* synthetic */ q(s.a aVar, int i10, long j10) {
        this.f27124b = aVar;
        this.f27126d = i10;
        this.f27125c = j10;
    }

    public /* synthetic */ q(s.a aVar, long j10, int i10) {
        this.f27124b = aVar;
        this.f27125c = j10;
        this.f27126d = i10;
    }

    public final void run() {
        switch (this.f27123a) {
            case 0:
                s.a aVar = this.f27124b;
                long j10 = this.f27125c;
                int i10 = this.f27126d;
                s sVar = aVar.f27133b;
                int i11 = e0.f26436a;
                sVar.W(j10, i10);
                return;
            default:
                s.a aVar2 = this.f27124b;
                int i12 = this.f27126d;
                long j11 = this.f27125c;
                s sVar2 = aVar2.f27133b;
                int i13 = e0.f26436a;
                sVar2.T(i12, j11);
                return;
        }
    }
}
