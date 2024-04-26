package y3;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import k3.e;
import m3.w;
import u3.b;

/* compiled from: BitmapBytesTranscoder */
public class a implements c<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f28001a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f28002b = 100;

    public w<byte[]> m(w<Bitmap> wVar, e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f28001a, this.f28002b, byteArrayOutputStream);
        wVar.c();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
