package t4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import cb.g;
import d5.i;
import d5.n;
import d5.o;
import java.util.Map;
import l4.b;
import t4.s;

public final /* synthetic */ class k implements s.b, o, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k f25707a = new k(1);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ k f25708b = new k(2);

    public /* synthetic */ k(int i10) {
    }

    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = s.f25725e;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public i[] b() {
        return new i[]{new k5.i(0)};
    }

    public /* synthetic */ i[] d(Uri uri, Map map) {
        return n.a(this, uri, map);
    }
}
