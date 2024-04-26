package ab;

import android.graphics.Bitmap;
import android.util.Log;
import j8.n;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import s8.i;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class r implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f240a;

    /* renamed from: b  reason: collision with root package name */
    public i<Bitmap> f241b;

    /* renamed from: c  reason: collision with root package name */
    public volatile InputStream f242c;

    public r(URL url) {
        this.f240a = url;
    }

    public void close() {
        try {
            InputStream inputStream = this.f242c;
            Logger logger = n.f19672a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    n.f19672a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e10);
                }
            }
        } catch (IOException e11) {
            throw new AssertionError(e11);
        } catch (NullPointerException e12) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e12);
        }
    }
}
