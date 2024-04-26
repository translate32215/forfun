package q3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import k3.e;
import q3.m;

/* compiled from: StringLoader */
public class s<Data> implements m<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final m<Uri, Data> f24135a;

    /* compiled from: StringLoader */
    public static final class a implements n<String, AssetFileDescriptor> {
        public m<String, AssetFileDescriptor> a(q qVar) {
            return new s(qVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class b implements n<String, ParcelFileDescriptor> {
        public m<String, ParcelFileDescriptor> a(q qVar) {
            return new s(qVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class c implements n<String, InputStream> {
        public m<String, InputStream> a(q qVar) {
            return new s(qVar.b(Uri.class, InputStream.class));
        }
    }

    public s(m<Uri, Data> mVar) {
        this.f24135a = mVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.f24135a.b(uri)) {
            return null;
        }
        return this.f24135a.a(uri, i10, i11, eVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
