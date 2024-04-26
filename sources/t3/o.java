package t3;

import a1.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n3.b;

/* compiled from: ExifInterfaceImageHeaderParser */
public final class o implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int c(InputStream inputStream, b bVar) throws IOException {
        a aVar = new a(inputStream);
        a.c e10 = aVar.e("Orientation");
        int i10 = 1;
        if (e10 != null) {
            try {
                i10 = e10.f(aVar.f23g);
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }
}
