package ve;

import java.io.IOException;

/* compiled from: ForwardingSource */
public abstract class k implements y {

    /* renamed from: a  reason: collision with root package name */
    public final y f26748a;

    public k(y yVar) {
        if (yVar != null) {
            this.f26748a = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f26748a.close();
    }

    public z e() {
        return this.f26748a.e();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f26748a.toString() + ")";
    }
}
