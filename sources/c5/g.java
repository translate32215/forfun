package c5;

import c5.j;
import java.io.IOException;
import java.util.UUID;

/* compiled from: DrmSession */
public interface g {

    /* compiled from: DrmSession */
    public static class a extends IOException {
        public a(Throwable th) {
            super(th);
        }
    }

    boolean a();

    UUID b();

    p c();

    void d(j.a aVar);

    void e(j.a aVar);

    a f();

    int getState();
}
