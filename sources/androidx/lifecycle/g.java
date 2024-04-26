package androidx.lifecycle;

import de.y;
import e.a;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import md.f;
import ud.k;

/* compiled from: ViewModel.kt */
public final class g implements Closeable, y {

    /* renamed from: a  reason: collision with root package name */
    public final f f2655a;

    public g(f fVar) {
        k.f(fVar, "context");
        this.f2655a = fVar;
    }

    public void close() {
        a.b(this.f2655a, (CancellationException) null, 1, (Object) null);
    }

    public f i() {
        return this.f2655a;
    }
}
