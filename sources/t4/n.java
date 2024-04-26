package t4;

import android.database.sqlite.SQLiteDatabase;
import j5.d;
import java.util.List;
import l4.b;
import t4.s;
import v5.g;

public final /* synthetic */ class n implements s.b, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ n f25713a = new n(1);

    public /* synthetic */ n(int i10) {
    }

    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        g.a aVar = d.f19539u;
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    public Object apply(Object obj) {
        b bVar = s.f25725e;
        return (List) s.t(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), p.f25716a);
    }
}
