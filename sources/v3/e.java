package v3;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.f;
import java.io.IOException;
import m3.w;

/* compiled from: UnitDrawableDecoder */
public class e implements f<Drawable, Drawable> {
    public w a(Object obj, int i10, int i11, k3.e eVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, k3.e eVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
