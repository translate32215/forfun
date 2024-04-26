package qe;

import java.io.IOException;

/* compiled from: StreamResetException */
public final class u extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final b f24435a;

    public u(b bVar) {
        super("stream was reset: " + bVar);
        this.f24435a = bVar;
    }
}
