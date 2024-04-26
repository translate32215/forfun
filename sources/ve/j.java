package ve;

import java.io.IOException;

/* compiled from: ForwardingSink */
public abstract class j implements x {

    /* renamed from: a  reason: collision with root package name */
    public final x f26747a;

    public j(x xVar) {
        if (xVar != null) {
            this.f26747a = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f26747a.close();
    }

    public z e() {
        return this.f26747a.e();
    }

    public void flush() throws IOException {
        this.f26747a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f26747a.toString() + ")";
    }
}
