package q3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import k3.e;
import q3.m;

/* compiled from: MediaStoreFileLoader */
public final class j implements m<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24094a;

    /* compiled from: MediaStoreFileLoader */
    public static final class a implements n<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f24095a;

        public a(Context context) {
            this.f24095a = context;
        }

        public m<Uri, File> a(q qVar) {
            return new j(this.f24095a);
        }
    }

    /* compiled from: MediaStoreFileLoader */
    public static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f24096c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f24097a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f24098b;

        public b(Context context, Uri uri) {
            this.f24097a = context;
            this.f24098b = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super File> aVar) {
            Cursor query = this.f24097a.getContentResolver().query(this.f24098b, f24096c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder a10 = android.support.v4.media.a.a("Failed to find file path for: ");
                a10.append(this.f24098b);
                aVar.c(new FileNotFoundException(a10.toString()));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public j(Context context) {
        this.f24094a = context;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri = (Uri) obj;
        return new m.a(new f4.b(uri), new b(this.f24094a, uri));
    }

    public boolean b(Object obj) {
        return e.d.i((Uri) obj);
    }
}
