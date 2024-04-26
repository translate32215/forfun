package q3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import k3.e;
import q3.m;

/* compiled from: AssetUriLoader */
public class a<Data> implements m<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f24063a;

    /* renamed from: b  reason: collision with root package name */
    public final C0219a<Data> f24064b;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    /* compiled from: AssetUriLoader */
    public interface C0219a<Data> {
        d<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader */
    public static class b implements n<Uri, ParcelFileDescriptor>, C0219a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f24065a;

        public b(AssetManager assetManager) {
            this.f24065a = assetManager;
        }

        public m<Uri, ParcelFileDescriptor> a(q qVar) {
            return new a(this.f24065a, this);
        }

        public d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    /* compiled from: AssetUriLoader */
    public static class c implements n<Uri, InputStream>, C0219a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f24066a;

        public c(AssetManager assetManager) {
            this.f24066a = assetManager;
        }

        public m<Uri, InputStream> a(q qVar) {
            return new a(this.f24066a, this);
        }

        public d<InputStream> b(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0219a<Data> aVar) {
        this.f24063a = assetManager;
        this.f24064b = aVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        return new m.a(new f4.b(uri), this.f24064b.b(this.f24063a, uri.toString().substring(22)));
    }

    public boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
