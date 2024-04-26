package f6;

import android.net.Uri;
import java.io.IOException;
import z5.v;

/* compiled from: HlsPlaylistTracker */
public interface i {

    /* compiled from: HlsPlaylistTracker */
    public interface a {
    }

    /* compiled from: HlsPlaylistTracker */
    public interface b {
        void b();

        boolean h(Uri uri, long j10);
    }

    /* compiled from: HlsPlaylistTracker */
    public static final class c extends IOException {
        public c(Uri uri) {
        }
    }

    /* compiled from: HlsPlaylistTracker */
    public static final class d extends IOException {
        public d(Uri uri) {
        }
    }

    /* compiled from: HlsPlaylistTracker */
    public interface e {
    }

    boolean a();

    d b();

    boolean c(Uri uri);

    void d() throws IOException;

    void e(b bVar);

    void f(Uri uri) throws IOException;

    void g(b bVar);

    void h(Uri uri);

    e i(Uri uri, boolean z10);

    void j(Uri uri, v.a aVar, e eVar);

    long l();

    void stop();
}
