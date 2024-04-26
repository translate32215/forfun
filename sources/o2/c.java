package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import t1.b;
import t1.e;
import t1.g;

/* compiled from: DependencyDao_Impl */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final e f22853a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22854b;

    /* compiled from: DependencyDao_Impl */
    public class a extends b<a> {
        public a(c cVar, e eVar) {
            super(eVar);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public void d(y1.e eVar, Object obj) {
            a aVar = (a) obj;
            String str = aVar.f22851a;
            if (str == null) {
                eVar.f27989a.bindNull(1);
            } else {
                eVar.f27989a.bindString(1, str);
            }
            String str2 = aVar.f22852b;
            if (str2 == null) {
                eVar.f27989a.bindNull(2);
            } else {
                eVar.f27989a.bindString(2, str2);
            }
        }
    }

    public c(e eVar) {
        this.f22853a = eVar;
        this.f22854b = new a(this, eVar);
    }

    public List<String> a(String str) {
        g i10 = g.i("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22853a.b();
        Cursor a10 = v1.a.a(this.f22853a, i10, false);
        try {
            ArrayList arrayList = new ArrayList(a10.getCount());
            while (a10.moveToNext()) {
                arrayList.add(a10.getString(0));
            }
            return arrayList;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public boolean b(String str) {
        boolean z10 = true;
        g i10 = g.i("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22853a.b();
        boolean z11 = false;
        Cursor a10 = v1.a.a(this.f22853a, i10, false);
        try {
            if (a10.moveToFirst()) {
                if (a10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            a10.close();
            i10.u();
        }
    }
}
