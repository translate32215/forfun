package lf;

import java.util.concurrent.CompletableFuture;
import lf.g;

/* compiled from: CompletableFutureCallAdapterFactory */
public class f implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CompletableFuture f21331a;

    public f(g.a aVar, CompletableFuture completableFuture) {
        this.f21331a = completableFuture;
    }

    public void a(b<Object> bVar, d0<Object> d0Var) {
        if (d0Var.b()) {
            this.f21331a.complete(d0Var.f21324b);
        } else {
            this.f21331a.completeExceptionally(new l(d0Var));
        }
    }

    public void b(b<Object> bVar, Throwable th) {
        this.f21331a.completeExceptionally(th);
    }
}
