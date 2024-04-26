package w6;

import v6.e0;
import w6.s;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s.a f27127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f27128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f27129c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f27130d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ float f27131e;

    public /* synthetic */ r(s.a aVar, int i10, int i11, int i12, float f10) {
        this.f27127a = aVar;
        this.f27128b = i10;
        this.f27129c = i11;
        this.f27130d = i12;
        this.f27131e = f10;
    }

    public final void run() {
        s.a aVar = this.f27127a;
        int i10 = this.f27128b;
        int i11 = this.f27129c;
        int i12 = this.f27130d;
        float f10 = this.f27131e;
        s sVar = aVar.f27133b;
        int i13 = e0.f26436a;
        sVar.a(i10, i11, i12, f10);
    }
}
