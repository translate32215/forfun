package lf;

import java.util.concurrent.CompletableFuture;
import lf.g;

/* compiled from: CompletableFutureCallAdapterFactory */
public class e extends CompletableFuture<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f21326a;

    public e(g.a aVar, b bVar) {
        this.f21326a = bVar;
    }

    public boolean cancel(boolean z10) {
        if (z10) {
            this.f21326a.cancel();
        }
        return super.cancel(z10);
    }
}
