package t3;

import android.graphics.Bitmap;
import g4.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.e;
import m3.w;

/* compiled from: ByteBufferBitmapDecoder */
public class f implements com.bumptech.glide.load.f<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f25620a;

    public f(l lVar) {
        this.f25620a = lVar;
    }

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        AtomicReference<byte[]> atomicReference = a.f18442a;
        return this.f25620a.a(new a.C0144a((ByteBuffer) obj), i10, i11, eVar, l.f25641k);
    }

    public boolean b(Object obj, e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f25620a.getClass();
        return true;
    }
}
