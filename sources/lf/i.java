package lf;

import java.util.concurrent.CompletableFuture;
import lf.g;

/* compiled from: CompletableFutureCallAdapterFactory */
public class i implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CompletableFuture f21343a;

    public i(g.b bVar, CompletableFuture completableFuture) {
        this.f21343a = completableFuture;
    }

    public void a(b<Object> bVar, d0<Object> d0Var) {
        this.f21343a.complete(d0Var);
    }

    public void b(b<Object> bVar, Throwable th) {
        this.f21343a.completeExceptionally(th);
    }
}
