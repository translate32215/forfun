package t3;

import android.graphics.Bitmap;
import com.bumptech.glide.load.f;
import g4.j;
import java.io.IOException;
import k3.e;
import m3.w;

/* compiled from: UnitBitmapDecoder */
public final class z implements f<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder */
    public static final class a implements w<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f25688a;

        public a(Bitmap bitmap) {
            this.f25688a = bitmap;
        }

        public int a() {
            return j.d(this.f25688a);
        }

        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        public void c() {
        }

        public Object get() {
            return this.f25688a;
        }
    }

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        return new a((Bitmap) obj);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, e eVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
