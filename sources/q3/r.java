package q3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import k3.e;
import q3.m;

/* compiled from: ResourceLoader */
public class r<Data> implements m<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final m<Uri, Data> f24129a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f24130b;

    /* compiled from: ResourceLoader */
    public static final class a implements n<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f24131a;

        public a(Resources resources) {
            this.f24131a = resources;
        }

        public m<Integer, AssetFileDescriptor> a(q qVar) {
            return new r(this.f24131a, qVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class b implements n<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f24132a;

        public b(Resources resources) {
            this.f24132a = resources;
        }

        public m<Integer, ParcelFileDescriptor> a(q qVar) {
            return new r(this.f24132a, qVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class c implements n<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f24133a;

        public c(Resources resources) {
            this.f24133a = resources;
        }

        public m<Integer, InputStream> a(q qVar) {
            return new r(this.f24133a, qVar.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class d implements n<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f24134a;

        public d(Resources resources) {
            this.f24134a = resources;
        }

        public m<Integer, Uri> a(q qVar) {
            return new r(this.f24134a, t.f24136a);
        }
    }

    public r(Resources resources, m<Uri, Data> mVar) {
        this.f24130b = resources;
        this.f24129a = mVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f24130b.getResourcePackageName(num.intValue()) + '/' + this.f24130b.getResourceTypeName(num.intValue()) + '/' + this.f24130b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f24129a.a(uri, i10, i11, eVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
