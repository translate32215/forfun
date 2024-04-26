package od;

import md.d;
import md.f;

/* compiled from: ContinuationImpl.kt */
public final class b implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f23684a = new b();

    public void g(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
