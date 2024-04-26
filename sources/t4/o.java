package t4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import cb.g;
import com.google.firebase.FirebaseCommonRegistrar;
import d5.i;
import d5.n;
import java.util.Map;
import l4.b;
import n5.a;
import t4.s;
import v6.g;

public final /* synthetic */ class o implements s.b, g, d5.o, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f25714a = new o(2);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ o f25715b = new o(3);

    public /* synthetic */ o(int i10) {
    }

    public String a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = s.f25725e;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public i[] b() {
        return new i[]{new a()};
    }

    public /* synthetic */ i[] d(Uri uri, Map map) {
        return n.a(this, uri, map);
    }
}
