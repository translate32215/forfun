package b6;

import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.ug;
import e8.p50;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: ChunkHolder */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Object f3598a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3599b;

    public g(boolean z10, ug ugVar) {
        this.f3599b = z10;
        this.f3598a = ugVar;
    }

    public <C> p50<C> a(Callable<C> callable, Executor executor) {
        return new rh((ug) this.f3598a, this.f3599b, executor, callable);
    }

    public g(boolean z10, String str) {
        this.f3599b = z10;
        this.f3598a = str;
    }

    public g() {
    }
}
