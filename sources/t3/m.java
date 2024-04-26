package t3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import m3.w;
import n3.e;
import n3.f;

/* compiled from: DrawableToBitmapConverter */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final e f25649a = new a();

    /* compiled from: DrawableToBitmapConverter */
    public class a extends f {
        public void b(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static w<Bitmap> a(e eVar, Drawable drawable, int i10, int i11) {
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock lock = y.f25687b;
                    lock.lock();
                    Bitmap a10 = eVar.a(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(a10);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        lock.unlock();
                        bitmap = a10;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            z10 = true;
        }
        if (!z10) {
            eVar = f25649a;
        }
        return d.d(bitmap, eVar);
    }
}
