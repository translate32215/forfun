package s3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import java.io.IOException;
import k3.d;
import m3.w;
import t3.c;
import t3.k;
import t3.l;
import t3.q;

/* compiled from: ImageDecoderResourceDecoder */
public abstract class a<T> implements f<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final q f24904a = q.a();

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* compiled from: ImageDecoderResourceDecoder */
    public class C0240a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24905a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f24906b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f24907c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f24908d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k f24909e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f24910f;

        /* renamed from: s3.a$a$a  reason: collision with other inner class name */
        /* compiled from: ImageDecoderResourceDecoder */
        public class C0241a implements ImageDecoder.OnPartialImageListener {
            public C0241a(C0240a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0240a(int i10, int i11, boolean z10, b bVar, k kVar, e eVar) {
            this.f24905a = i10;
            this.f24906b = i11;
            this.f24907c = z10;
            this.f24908d = bVar;
            this.f24909e = kVar;
            this.f24910f = eVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z10 = false;
            if (a.this.f24904a.b(this.f24905a, this.f24906b, this.f24907c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f24908d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0241a(this));
            Size size = imageInfo.getSize();
            int i10 = this.f24905a;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getWidth();
            }
            int i11 = this.f24906b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getHeight();
            }
            float b10 = this.f24909e.b(size.getWidth(), size.getHeight(), i10, i11);
            int round = Math.round(((float) size.getWidth()) * b10);
            int round2 = Math.round(((float) size.getHeight()) * b10);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder a10 = android.support.v4.media.a.a("Resizing from [");
                a10.append(size.getWidth());
                a10.append("x");
                a10.append(size.getHeight());
                a10.append("] to [");
                a10.append(round);
                a10.append("x");
                a10.append(round2);
                a10.append("] scaleFactor: ");
                a10.append(b10);
                Log.v("ImageDecoder", a10.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (this.f24910f == e.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i12 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, k3.e eVar) throws IOException {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final w<T> a(ImageDecoder.Source source, int i10, int i11, k3.e eVar) throws IOException {
        b bVar = (b) eVar.c(l.f25636f);
        k kVar = (k) eVar.c(k.f25634f);
        d dVar = l.f25639i;
        boolean z10 = eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue();
        c cVar = (c) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C0240a(i10, i11, z10, bVar, kVar, (e) eVar.c(l.f25637g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder a10 = android.support.v4.media.a.a("Decoded [");
            a10.append(decodeBitmap.getWidth());
            a10.append("x");
            a10.append(decodeBitmap.getHeight());
            a10.append("] for [");
            a10.append(i10);
            a10.append("x");
            a10.append(i11);
            a10.append("]");
            Log.v("BitmapImageDecoder", a10.toString());
        }
        return new t3.d(decodeBitmap, cVar.f25616b);
    }
}
