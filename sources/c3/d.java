package c3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import g3.c;
import g3.g;
import java.io.IOException;
import o1.p;
import u2.e;
import u2.f;
import u2.j;
import x2.a;
import x2.o;
import y2.b;

/* compiled from: ImageLayer */
public class d extends b {
    public a<ColorFilter, ColorFilter> A;

    /* renamed from: x  reason: collision with root package name */
    public final Paint f4161x = new v2.a(3);

    /* renamed from: y  reason: collision with root package name */
    public final Rect f4162y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public final Rect f4163z = new Rect();

    public d(e eVar, e eVar2) {
        super(eVar, eVar2);
    }

    public <T> void b(T t10, p pVar) {
        this.f4156v.c(t10, pVar);
        if (t10 != j.C) {
            return;
        }
        if (pVar == null) {
            this.A = null;
        } else {
            this.A = new o(pVar, null);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        Bitmap s10 = s();
        if (s10 != null) {
            rectF.set(0.0f, 0.0f, g.c() * ((float) s10.getWidth()), g.c() * ((float) s10.getHeight()));
            this.f4147m.mapRect(rectF);
        }
    }

    public void l(Canvas canvas, Matrix matrix, int i10) {
        Bitmap s10 = s();
        if (s10 != null && !s10.isRecycled()) {
            float c10 = g.c();
            this.f4161x.setAlpha(i10);
            a<ColorFilter, ColorFilter> aVar = this.A;
            if (aVar != null) {
                this.f4161x.setColorFilter(aVar.e());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f4162y.set(0, 0, s10.getWidth(), s10.getHeight());
            this.f4163z.set(0, 0, (int) (((float) s10.getWidth()) * c10), (int) (((float) s10.getHeight()) * c10));
            canvas.drawBitmap(s10, this.f4162y, this.f4163z, this.f4161x);
            canvas.restore();
        }
    }

    public final Bitmap s() {
        b bVar;
        f fVar;
        String str = this.f4149o.f4170g;
        e eVar = this.f4148n;
        if (eVar.getCallback() == null) {
            bVar = null;
        } else {
            b bVar2 = eVar.f25942i;
            if (bVar2 != null) {
                Drawable.Callback callback = eVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && bVar2.f27997a == null) || bVar2.f27997a.equals(context))) {
                    eVar.f25942i = null;
                }
            }
            if (eVar.f25942i == null) {
                eVar.f25942i = new b(eVar.getCallback(), eVar.f25943r, eVar.f25944s, eVar.f25935b.f25922d);
            }
            bVar = eVar.f25942i;
        }
        if (bVar == null || (fVar = bVar.f28000d.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = fVar.f25984e;
        if (bitmap != null) {
            return bitmap;
        }
        u2.b bVar3 = bVar.f27999c;
        if (bVar3 != null) {
            Bitmap a10 = bVar3.a(fVar);
            if (a10 == null) {
                return a10;
            }
            bVar.a(str, a10);
            return a10;
        }
        String str2 = fVar.f25983d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(bVar.f27998b)) {
                    Bitmap e10 = g.e(BitmapFactory.decodeStream(bVar.f27997a.getAssets().open(bVar.f27998b + str2), (Rect) null, options), fVar.f25980a, fVar.f25981b);
                    bVar.a(str, e10);
                    return e10;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e11) {
                c.b("Unable to open asset.", e11);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                bVar.a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e12) {
                c.b("data URL did not have correct base64 format.", e12);
                return null;
            }
        }
    }
}
