package ve;

import android.support.v4.media.a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: Okio */
public final class q extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f26764k;

    public q(Socket socket) {
        this.f26764k = socket;
    }

    public IOException l(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void m() {
        try {
            this.f26764k.close();
        } catch (Exception e10) {
            Logger logger = p.f26761a;
            Level level = Level.WARNING;
            StringBuilder a10 = a.a("Failed to close timed out socket ");
            a10.append(this.f26764k);
            logger.log(level, a10.toString(), e10);
        } catch (AssertionError e11) {
            if (p.a(e11)) {
                Logger logger2 = p.f26761a;
                Level level2 = Level.WARNING;
                StringBuilder a11 = a.a("Failed to close timed out socket ");
                a11.append(this.f26764k);
                logger2.log(level2, a11.toString(), e11);
                return;
            }
            throw e11;
        }
    }
}
