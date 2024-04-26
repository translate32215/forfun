package t3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.f;
import g4.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.e;
import m3.w;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class s implements f<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f25670a = new c();

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.f18442a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.f18442a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.f18442a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f25670a.a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i10, i11, eVar);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
