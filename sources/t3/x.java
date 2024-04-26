package t3;

import android.graphics.Bitmap;
import com.bumptech.glide.load.f;
import g4.d;
import g4.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import m3.w;
import n3.b;
import n3.e;
import t3.l;

/* compiled from: StreamBitmapDecoder */
public class x implements f<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f25682a;

    /* renamed from: b  reason: collision with root package name */
    public final b f25683b;

    /* compiled from: StreamBitmapDecoder */
    public static class a implements l.b {

        /* renamed from: a  reason: collision with root package name */
        public final v f25684a;

        /* renamed from: b  reason: collision with root package name */
        public final d f25685b;

        public a(v vVar, d dVar) {
            this.f25684a = vVar;
            this.f25685b = dVar;
        }

        public void a(e eVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f25685b.f18453b;
            if (iOException != null) {
                if (bitmap != null) {
                    eVar.b(bitmap);
                }
                throw iOException;
            }
        }

        public void b() {
            v vVar = this.f25684a;
            synchronized (vVar) {
                vVar.f25676c = vVar.f25674a.length;
            }
        }
    }

    public x(l lVar, b bVar) {
        this.f25682a = lVar;
        this.f25683b = bVar;
    }

    public w a(Object obj, int i10, int i11, k3.e eVar) throws IOException {
        v vVar;
        boolean z10;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof v) {
            vVar = (v) inputStream;
            z10 = false;
        } else {
            vVar = new v(inputStream, this.f25683b);
            z10 = true;
        }
        Queue<d> queue = d.f18451c;
        synchronized (queue) {
            dVar = (d) ((ArrayDeque) queue).poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f18452a = vVar;
        try {
            return this.f25682a.a(new h(dVar), i10, i11, eVar, new a(vVar, dVar));
        } finally {
            dVar.a();
            if (z10) {
                vVar.d();
            }
        }
    }

    public boolean b(Object obj, k3.e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        this.f25682a.getClass();
        return true;
    }
}
