package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p2.g;

/* compiled from: WorkDatabaseMigrations */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static u1.a f3264a = new C0041a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static u1.a f3265b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static u1.a f3266c = new c(4, 5);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* compiled from: WorkDatabaseMigrations */
    public static class C0041a extends u1.a {
        public C0041a(int i10, int i11) {
            super(i10, i11);
        }

        public void a(x1.a aVar) {
            ((y1.a) aVar).f27981a.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y1.a aVar2 = (y1.a) aVar;
            aVar2.f27981a.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar2.f27981a.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar2.f27981a.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class b extends u1.a {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        public void a(x1.a aVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((y1.a) aVar).f27981a.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class c extends u1.a {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        public void a(x1.a aVar) {
            ((y1.a) aVar).f27981a.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((y1.a) aVar).f27981a.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class d extends u1.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f3267c;

        public d(Context context, int i10, int i11) {
            super(i10, i11);
            this.f3267c = context;
        }

        public void a(x1.a aVar) {
            SharedPreferences sharedPreferences;
            Context context = this.f3267c;
            synchronized (g.class) {
                sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences.edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
