package h2;

import androidx.work.impl.WorkDatabase;
import t1.e;
import x1.a;

/* compiled from: WorkDatabase */
public final class g extends e.b {
    public void a(a aVar) {
        ((y1.a) aVar).f27981a.beginTransaction();
        try {
            int i10 = WorkDatabase.f3256k;
            ((y1.a) aVar).f27981a.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f3255j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((y1.a) aVar).f27981a.setTransactionSuccessful();
        } finally {
            ((y1.a) aVar).f27981a.endTransaction();
        }
    }
}
