package q3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k3.e;
import q3.m;

/* compiled from: UriLoader */
public class u<Data> implements m<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f24139b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f24140a;

    /* compiled from: UriLoader */
    public static final class a implements n<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f24141a;

        public a(ContentResolver contentResolver) {
            this.f24141a = contentResolver;
        }

        public m<Uri, AssetFileDescriptor> a(q qVar) {
            return new u(this);
        }

        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f24141a, uri);
        }
    }

    /* compiled from: UriLoader */
    public static class b implements n<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f24142a;

        public b(ContentResolver contentResolver) {
            this.f24142a = contentResolver;
        }

        public m<Uri, ParcelFileDescriptor> a(q qVar) {
            return new u(this);
        }

        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new i(this.f24142a, uri);
        }
    }

    /* compiled from: UriLoader */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* compiled from: UriLoader */
    public static class d implements n<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f24143a;

        public d(ContentResolver contentResolver) {
            this.f24143a = contentResolver;
        }

        public m<Uri, InputStream> a(q qVar) {
            return new u(this);
        }

        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new n(this.f24143a, uri);
        }
    }

    public u(c<Data> cVar) {
        this.f24140a = cVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        return new m.a(new f4.b(uri), this.f24140a.b(uri));
    }

    public boolean b(Object obj) {
        return f24139b.contains(((Uri) obj).getScheme());
    }
}
