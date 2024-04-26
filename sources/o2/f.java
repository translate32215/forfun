package o2;

import android.database.Cursor;
import t1.e;
import t1.g;
import t1.h;

/* compiled from: SystemIdInfoDao_Impl */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f22857a;

    /* renamed from: b  reason: collision with root package name */
    public final t1.b f22858b;

    /* renamed from: c  reason: collision with root package name */
    public final h f22859c;

    /* compiled from: SystemIdInfoDao_Impl */
    public class a extends t1.b<d> {
        public a(f fVar, e eVar) {
            super(eVar);
        }

        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        public void d(y1.e eVar, Object obj) {
            d dVar = (d) obj;
            String str = dVar.f22855a;
            if (str == null) {
                eVar.f27989a.bindNull(1);
            } else {
                eVar.f27989a.bindString(1, str);
            }
            eVar.f27989a.bindLong(2, (long) dVar.f22856b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    public class b extends h {
        public b(f fVar, e eVar) {
            super(eVar);
        }

        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public f(e eVar) {
        this.f22857a = eVar;
        this.f22858b = new a(this, eVar);
        this.f22859c = new b(this, eVar);
    }

    public d a(String str) {
        g i10 = g.i("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22857a.b();
        Cursor a10 = v1.a.a(this.f22857a, i10, false);
        try {
            return a10.moveToFirst() ? new d(a10.getString(q.a.j(a10, "work_spec_id")), a10.getInt(q.a.j(a10, "system_id"))) : null;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public void b(d dVar) {
        this.f22857a.b();
        this.f22857a.c();
        try {
            this.f22858b.e(dVar);
            this.f22857a.j();
        } finally {
            this.f22857a.g();
        }
    }

    public void c(String str) {
        this.f22857a.b();
        y1.e a10 = this.f22859c.a();
        if (str == null) {
            a10.f27989a.bindNull(1);
        } else {
            a10.f27989a.bindString(1, str);
        }
        this.f22857a.c();
        try {
            a10.a();
            this.f22857a.j();
            this.f22857a.g();
            h hVar = this.f22859c;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
        } catch (Throwable th) {
            this.f22857a.g();
            this.f22859c.c(a10);
            throw th;
        }
    }
}
