package q3;

import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import k3.e;
import q3.m;

/* compiled from: ByteBufferFileLoader */
public class c implements m<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader */
    public static final class a implements d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        public final File f24070a;

        public a(File file) {
            this.f24070a = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(g4.a.a(this.f24070a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader */
    public static class b implements n<File, ByteBuffer> {
        public m<File, ByteBuffer> a(q qVar) {
            return new c();
        }
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        File file = (File) obj;
        return new m.a(new f4.b(file), new a(file));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
