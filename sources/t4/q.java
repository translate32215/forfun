package t4;

import android.database.Cursor;
import android.net.Uri;
import com.google.firebase.remoteconfig.internal.b;
import d5.i;
import d5.n;
import d5.o;
import java.util.Map;
import n5.c;
import s8.h;
import s8.l;
import t4.s;
import v6.g;

public final /* synthetic */ class q implements s.b, g, o, h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ q f25720a = new q(0);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ q f25721b = new q(2);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ q f25722c = new q(3);

    public /* synthetic */ q(int i10) {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }

    public i[] b() {
        return new i[]{new c()};
    }

    public /* synthetic */ i[] d(Uri uri, Map map) {
        return n.a(this, uri, map);
    }

    public s8.i f(Object obj) {
        b bVar = (b) obj;
        return l.e(null);
    }
}
