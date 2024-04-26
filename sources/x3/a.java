package x3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import g4.j;
import j3.c;
import j3.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import m3.w;
import n3.e;
import x3.c;

/* compiled from: ByteBufferGifDecoder */
public class a implements f<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0276a f27295f = new C0276a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f27296g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f27297a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f27298b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27299c;

    /* renamed from: d  reason: collision with root package name */
    public final C0276a f27300d;

    /* renamed from: e  reason: collision with root package name */
    public final b f27301e;

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferGifDecoder */
    public static class C0276a {
    }

    /* compiled from: ByteBufferGifDecoder */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<d> f27302a = new ArrayDeque(0);

        public b() {
            char[] cArr = j.f18467a;
        }

        public synchronized void a(d dVar) {
            dVar.f19508b = null;
            dVar.f19509c = null;
            this.f27302a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, e eVar, n3.b bVar) {
        b bVar2 = f27296g;
        C0276a aVar = f27295f;
        this.f27297a = context.getApplicationContext();
        this.f27298b = list;
        this.f27300d = aVar;
        this.f27301e = new b(eVar, bVar);
        this.f27299c = bVar2;
    }

    public static int d(c cVar, int i10, int i11) {
        int i12;
        int min = Math.min(cVar.f19502g / i11, cVar.f19501f / i10);
        if (min == 0) {
            i12 = 0;
        } else {
            i12 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i12);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.f19501f + "x" + cVar.f19502g + "]");
        }
        return max;
    }

    public w a(Object obj, int i10, int i11, k3.e eVar) throws IOException {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f27299c;
        synchronized (bVar) {
            d poll = bVar.f27302a.poll();
            if (poll == null) {
                poll = new d();
            }
            dVar = poll;
            dVar.f19508b = null;
            Arrays.fill(dVar.f19507a, (byte) 0);
            dVar.f19509c = new c();
            dVar.f19510d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f19508b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f19508b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer, i10, i11, dVar, eVar);
        } finally {
            this.f27299c.a(dVar);
        }
    }

    public boolean b(Object obj, k3.e eVar) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) eVar.c(i.f27341b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f27298b;
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a10;
                    break;
                }
                i10++;
            }
        }
        if (imageType == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, d dVar, k3.e eVar) {
        Bitmap.Config config;
        int i12 = g4.f.f18457b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c b10 = dVar.b();
            if (b10.f19498c > 0) {
                if (b10.f19497b == 0) {
                    if (eVar.c(i.f27340a) == com.bumptech.glide.load.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int d10 = d(b10, i10, i11);
                    C0276a aVar = this.f27300d;
                    b bVar = this.f27301e;
                    aVar.getClass();
                    j3.e eVar2 = new j3.e(bVar, b10, byteBuffer, d10);
                    eVar2.i(config);
                    eVar2.f19521k = (eVar2.f19521k + 1) % eVar2.f19522l.f19498c;
                    Bitmap b11 = eVar2.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder a10 = android.support.v4.media.a.a("Decoded GIF from stream in ");
                            a10.append(g4.f.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", a10.toString());
                        }
                        return null;
                    }
                    g gVar = r9;
                    g gVar2 = new g(com.bumptech.glide.b.b(this.f27297a), eVar2, i10, i11, (s3.b) s3.b.f24912b, b11);
                    return new e(new c(new c.a(gVar)));
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder a11 = android.support.v4.media.a.a("Decoded GIF from stream in ");
                a11.append(g4.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", a11.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder a12 = android.support.v4.media.a.a("Decoded GIF from stream in ");
                a12.append(g4.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", a12.toString());
            }
        }
    }
}
