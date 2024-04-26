package e8;

import android.content.Context;
import java.util.concurrent.Executor;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class og implements ta0<ul<ug0>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15795a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<yg> f15796b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Executor> f15797c;

    public og(g gVar, ab0 ab0, ab0 ab02, int i10) {
        this.f15795a = i10;
        if (i10 != 1) {
            this.f15796b = ab0;
            this.f15797c = ab02;
            return;
        }
        this.f15796b = ab0;
        this.f15797c = ab02;
    }

    public final Object get() {
        switch (this.f15795a) {
            case 0:
                return new ul(this.f15796b.get(), this.f15797c.get());
            default:
                return new j8((Context) this.f15796b.get(), ((w00) this.f15797c.get()).f17192f);
        }
    }
}
