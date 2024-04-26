package q3;

import android.util.Base64;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import k3.e;
import q3.m;

/* compiled from: DataUrlLoader */
public final class d<Model, Data> implements m<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f24071a;

    /* compiled from: DataUrlLoader */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f24072a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f24073b;

        /* renamed from: c  reason: collision with root package name */
        public Data f24074c;

        public b(String str, a<Data> aVar) {
            this.f24072a = str;
            this.f24073b = aVar;
        }

        public Class<Data> a() {
            ((c.a) this.f24073b).getClass();
            return InputStream.class;
        }

        public void b() {
            try {
                a<Data> aVar = this.f24073b;
                Data data = this.f24074c;
                ((c.a) aVar).getClass();
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super Data> aVar) {
            try {
                Data a10 = ((c.a) this.f24073b).a(this.f24072a);
                this.f24074c = a10;
                aVar.d(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* compiled from: DataUrlLoader */
    public static final class c<Model> implements n<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a<InputStream> f24075a = new a(this);

        /* compiled from: DataUrlLoader */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public m<Model, InputStream> a(q qVar) {
            return new d(this.f24075a);
        }
    }

    public d(a<Data> aVar) {
        this.f24071a = aVar;
    }

    public m.a<Data> a(Model model, int i10, int i11, e eVar) {
        return new m.a<>(new f4.b(model), new b(model.toString(), this.f24071a));
    }

    public boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
