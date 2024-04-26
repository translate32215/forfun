package q3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import q3.m;

/* compiled from: FileLoader */
public class e<Data> implements m<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f24076a;

    /* compiled from: FileLoader */
    public static class a<Data> implements n<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f24077a;

        public a(d<Data> dVar) {
            this.f24077a = dVar;
        }

        public final m<File, Data> a(q qVar) {
            return new e(this.f24077a);
        }
    }

    /* compiled from: FileLoader */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader */
        public class a implements d<ParcelFileDescriptor> {
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public Object b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public void c(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f24078a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f24079b;

        /* renamed from: c  reason: collision with root package name */
        public Data f24080c;

        public c(File file, d<Data> dVar) {
            this.f24078a = file;
            this.f24079b = dVar;
        }

        public Class<Data> a() {
            return this.f24079b.a();
        }

        public void b() {
            Data data = this.f24080c;
            if (data != null) {
                try {
                    this.f24079b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f24079b.b(this.f24078a);
                this.f24080c = b10;
                aVar.d(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* compiled from: FileLoader */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    /* renamed from: q3.e$e  reason: collision with other inner class name */
    /* compiled from: FileLoader */
    public static class C0222e extends a<InputStream> {

        /* renamed from: q3.e$e$a */
        /* compiled from: FileLoader */
        public class a implements d<InputStream> {
            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            public void c(Object obj) throws IOException {
                ((InputStream) obj).close();
            }
        }

        public C0222e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f24076a = dVar;
    }

    public m.a a(Object obj, int i10, int i11, k3.e eVar) {
        File file = (File) obj;
        return new m.a(new f4.b(file), new c(file, this.f24076a));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
