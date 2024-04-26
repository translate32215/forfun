package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import h0.b;

/* compiled from: AppCompatProgressBarHelper */
public class u {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1105c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1106a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1107b;

    public u(ProgressBar progressBar) {
        this.f1106a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        g1 r10 = g1.r(this.f1106a.getContext(), attributeSet, f1105c, i10, 0);
        Drawable h10 = r10.h(0);
        if (h10 != null) {
            ProgressBar progressBar = this.f1106a;
            if (h10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable b10 = b(animationDrawable.getFrame(i11), true);
                    b10.setLevel(10000);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                h10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h10);
        }
        Drawable h11 = r10.h(1);
        if (h11 != null) {
            this.f1106a.setProgressDrawable(b(h11, false));
        }
        r10.f924b.recycle();
    }

    public Drawable b(Drawable drawable, boolean z10) {
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable b10 = bVar.b();
            if (b10 != null) {
                bVar.a(b(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                drawableArr[i10] = b(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                if (Build.VERSION.SDK_INT >= 23) {
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1107b == null) {
                this.f1107b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
