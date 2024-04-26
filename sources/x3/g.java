package x3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c4.f;
import com.bumptech.glide.h;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.List;
import m3.k;
import n3.e;

/* compiled from: GifFrameLoader */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final j3.a f27317a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f27318b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f27319c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final i f27320d;

    /* renamed from: e  reason: collision with root package name */
    public final e f27321e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27322f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27323g;

    /* renamed from: h  reason: collision with root package name */
    public h<Bitmap> f27324h;

    /* renamed from: i  reason: collision with root package name */
    public a f27325i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27326j;

    /* renamed from: k  reason: collision with root package name */
    public a f27327k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f27328l;

    /* renamed from: m  reason: collision with root package name */
    public k3.g<Bitmap> f27329m;

    /* renamed from: n  reason: collision with root package name */
    public a f27330n;

    /* renamed from: o  reason: collision with root package name */
    public int f27331o;

    /* renamed from: p  reason: collision with root package name */
    public int f27332p;

    /* renamed from: q  reason: collision with root package name */
    public int f27333q;

    /* compiled from: GifFrameLoader */
    public static class a extends d4.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f27334d;

        /* renamed from: e  reason: collision with root package name */
        public final int f27335e;

        /* renamed from: f  reason: collision with root package name */
        public final long f27336f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f27337g;

        public a(Handler handler, int i10, long j10) {
            this.f27334d = handler;
            this.f27335e = i10;
            this.f27336f = j10;
        }

        public void d(Object obj, e4.b bVar) {
            this.f27337g = (Bitmap) obj;
            this.f27334d.sendMessageAtTime(this.f27334d.obtainMessage(1, this), this.f27336f);
        }

        public void h(Drawable drawable) {
            this.f27337g = null;
        }
    }

    /* compiled from: GifFrameLoader */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader */
    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                g.this.f27320d.i((a) message.obj);
                return false;
            }
        }
    }

    public g(com.bumptech.glide.b bVar, j3.a aVar, int i10, int i11, k3.g<Bitmap> gVar, Bitmap bitmap) {
        e eVar = bVar.f4883a;
        i d10 = com.bumptech.glide.b.d(bVar.f4885c.getBaseContext());
        i d11 = com.bumptech.glide.b.d(bVar.f4885c.getBaseContext());
        d11.getClass();
        h<Bitmap> u10 = new h(d11.f4938a, d11, Bitmap.class, d11.f4939b).a(i.f4937s).a(((f) ((f) ((f) new f().d(k.f21588a)).r(true)).o(true)).h(i10, i11));
        this.f27320d = d10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f27321e = eVar;
        this.f27318b = handler;
        this.f27324h = u10;
        this.f27317a = aVar;
        c(gVar, bitmap);
    }

    public final void a() {
        if (this.f27322f && !this.f27323g) {
            a aVar = this.f27330n;
            if (aVar != null) {
                this.f27330n = null;
                b(aVar);
                return;
            }
            this.f27323g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f27317a.e());
            this.f27317a.c();
            this.f27327k = new a(this.f27318b, this.f27317a.a(), uptimeMillis);
            h<Bitmap> A = this.f27324h.a((f) new f().n(new f4.b(Double.valueOf(Math.random())))).A(this.f27317a);
            A.y(this.f27327k, (c4.e<Bitmap>) null, A, g4.e.f18454a);
        }
    }

    public void b(a aVar) {
        this.f27323g = false;
        if (this.f27326j) {
            this.f27318b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f27322f) {
            this.f27330n = aVar;
        } else {
            if (aVar.f27337g != null) {
                Bitmap bitmap = this.f27328l;
                if (bitmap != null) {
                    this.f27321e.b(bitmap);
                    this.f27328l = null;
                }
                a aVar2 = this.f27325i;
                this.f27325i = aVar;
                int size = this.f27319c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f27319c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f27318b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [k3.g, k3.g<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(k3.g<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            if (r4 == 0) goto L_0x0035
            r3.f27329m = r4
            if (r5 == 0) goto L_0x002f
            r3.f27328l = r5
            com.bumptech.glide.h<android.graphics.Bitmap> r0 = r3.f27324h
            c4.f r1 = new c4.f
            r1.<init>()
            r2 = 1
            c4.a r4 = r1.q(r4, r2)
            com.bumptech.glide.h r4 = r0.a(r4)
            r3.f27324h = r4
            int r4 = g4.j.d(r5)
            r3.f27331o = r4
            int r4 = r5.getWidth()
            r3.f27332p = r4
            int r4 = r5.getHeight()
            r3.f27333q = r4
            return
        L_0x002f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
        L_0x0035:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.g.c(k3.g, android.graphics.Bitmap):void");
    }
}
