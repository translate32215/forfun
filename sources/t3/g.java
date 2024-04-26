package t3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import k3.e;
import m3.w;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class g implements f<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f25621a = new c();

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        return this.f25621a.a(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, eVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
