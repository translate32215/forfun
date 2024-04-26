package r3;

import android.content.Context;
import android.net.Uri;
import e.d;
import f4.b;
import java.io.InputStream;
import k3.e;
import l3.a;
import q3.m;
import q3.n;
import q3.q;
import t3.b0;

/* compiled from: MediaStoreVideoThumbLoader */
public class c implements m<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24509a;

    /* compiled from: MediaStoreVideoThumbLoader */
    public static class a implements n<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f24510a;

        public a(Context context) {
            this.f24510a = context;
        }

        public m<Uri, InputStream> a(q qVar) {
            return new c(this.f24510a);
        }
    }

    public c(Context context) {
        this.f24509a = context.getApplicationContext();
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        if (d.j(i10, i11)) {
            Long l10 = (Long) eVar.c(b0.f25608d);
            if (l10 != null && l10.longValue() == -1) {
                b bVar = new b(uri);
                Context context = this.f24509a;
                return new m.a(bVar, l3.a.c(context, uri, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    public boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return d.i(uri) && uri.getPathSegments().contains("video");
    }
}
