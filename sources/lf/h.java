package lf;

import java.util.concurrent.CompletableFuture;
import lf.g;

/* compiled from: CompletableFutureCallAdapterFactory */
public class h extends CompletableFuture<d0<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f21342a;

    public h(g.b bVar, b bVar2) {
        this.f21342a = bVar2;
    }

    public boolean cancel(boolean z10) {
        if (z10) {
            this.f21342a.cancel();
        }
        return super.cancel(z10);
    }
}
