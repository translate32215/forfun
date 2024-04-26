package t3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.f;
import java.io.IOException;
import n3.e;
import v3.b;
import v3.d;

/* compiled from: ResourceBitmapDecoder */
public class w implements f<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f25680a;

    /* renamed from: b  reason: collision with root package name */
    public final e f25681b;

    public w(d dVar, e eVar) {
        this.f25680a = dVar;
        this.f25681b = eVar;
    }

    public m3.w a(Object obj, int i10, int i11, k3.e eVar) throws IOException {
        m3.w c10 = this.f25680a.c((Uri) obj);
        if (c10 == null) {
            return null;
        }
        return m.a(this.f25681b, (Drawable) ((b) c10).get(), i10, i11);
    }

    public boolean b(Object obj, k3.e eVar) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
