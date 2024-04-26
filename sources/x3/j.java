package x3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k3.e;
import m3.w;
import n3.b;

/* compiled from: StreamGifDecoder */
public class j implements f<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f27342a;

    /* renamed from: b  reason: collision with root package name */
    public final f<ByteBuffer, c> f27343b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27344c;

    public j(List<ImageHeaderParser> list, f<ByteBuffer, c> fVar, b bVar) {
        this.f27342a = list;
        this.f27343b = fVar;
        this.f27344c = bVar;
    }

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f27343b.a(ByteBuffer.wrap(bArr), i10, i11, eVar);
    }

    public boolean b(Object obj, e eVar) throws IOException {
        return !((Boolean) eVar.c(i.f27341b)).booleanValue() && d.b(this.f27342a, (InputStream) obj, this.f27344c) == ImageHeaderParser.ImageType.GIF;
    }
}
