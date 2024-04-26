package c5;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import k3.a;
import k3.e;

/* compiled from: UnsupportedMediaCrypto */
public class a0 implements p, a {
    public a0(int i10) {
    }

    public boolean k(Object obj, File file, e eVar) {
        try {
            g4.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
