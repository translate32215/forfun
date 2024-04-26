package k8;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class l5 extends m5 {

    /* renamed from: a  reason: collision with root package name */
    public int f20305a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f20306b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p5 f20307c;

    public l5(p5 p5Var) {
        this.f20307c = p5Var;
        this.f20306b = p5Var.h();
    }

    public final byte a() {
        int i10 = this.f20305a;
        if (i10 < this.f20306b) {
            this.f20305a = i10 + 1;
            return this.f20307c.f(i10);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f20305a < this.f20306b;
    }
}
