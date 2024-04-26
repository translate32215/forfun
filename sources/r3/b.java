package r3;

import android.content.Context;
import android.net.Uri;
import e.d;
import java.io.InputStream;
import k3.e;
import l3.a;
import q3.m;
import q3.n;
import q3.q;

/* compiled from: MediaStoreImageThumbLoader */
public class b implements m<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24507a;

    /* compiled from: MediaStoreImageThumbLoader */
    public static class a implements n<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f24508a;

        public a(Context context) {
            this.f24508a = context;
        }

        public m<Uri, InputStream> a(q qVar) {
            return new b(this.f24508a);
        }
    }

    public b(Context context) {
        this.f24507a = context.getApplicationContext();
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        if (!d.j(i10, i11)) {
            return null;
        }
        f4.b bVar = new f4.b(uri);
        Context context = this.f24507a;
        return new m.a(bVar, l3.a.c(context, uri, new a.C0181a(context.getContentResolver())));
    }

    public boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return d.i(uri) && !uri.getPathSegments().contains("video");
    }
}
