package androidx.work.impl;

import android.content.Context;
import java.util.HashMap;
import o2.b;
import o2.e;
import o2.h;
import o2.i;
import o2.k;
import o2.l;
import o2.n;
import o2.o;
import t1.d;
import t1.f;
import y1.c;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f3257q = 0;

    /* renamed from: l  reason: collision with root package name */
    public volatile k f3258l;

    /* renamed from: m  reason: collision with root package name */
    public volatile b f3259m;

    /* renamed from: n  reason: collision with root package name */
    public volatile n f3260n;

    /* renamed from: o  reason: collision with root package name */
    public volatile e f3261o;

    /* renamed from: p  reason: collision with root package name */
    public volatile h f3262p;

    public class a extends f.a {
        public a(int i10) {
            super(i10);
        }

        public void a(x1.a aVar) {
            ((y1.a) aVar).f27981a.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            y1.a aVar2 = (y1.a) aVar;
            aVar2.f27981a.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar2.f27981a.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar2.f27981a.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.f27981a.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.f27981a.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar2.f27981a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
        }
    }

    public d e() {
        return new d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    public x1.b f(t1.a aVar) {
        f fVar = new f(aVar, new a(6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        Context context = aVar.f25339b;
        String str = aVar.f25340c;
        if (context != null) {
            ((c) aVar.f25338a).getClass();
            return new y1.b(context, str, fVar);
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    public b k() {
        b bVar;
        if (this.f3259m != null) {
            return this.f3259m;
        }
        synchronized (this) {
            if (this.f3259m == null) {
                this.f3259m = new o2.c(this);
            }
            bVar = this.f3259m;
        }
        return bVar;
    }

    public e l() {
        e eVar;
        if (this.f3261o != null) {
            return this.f3261o;
        }
        synchronized (this) {
            if (this.f3261o == null) {
                this.f3261o = new o2.f(this);
            }
            eVar = this.f3261o;
        }
        return eVar;
    }

    public h m() {
        h hVar;
        if (this.f3262p != null) {
            return this.f3262p;
        }
        synchronized (this) {
            if (this.f3262p == null) {
                this.f3262p = new i(this);
            }
            hVar = this.f3262p;
        }
        return hVar;
    }

    public k n() {
        k kVar;
        if (this.f3258l != null) {
            return this.f3258l;
        }
        synchronized (this) {
            if (this.f3258l == null) {
                this.f3258l = new l(this);
            }
            kVar = this.f3258l;
        }
        return kVar;
    }

    public n o() {
        n nVar;
        if (this.f3260n != null) {
            return this.f3260n;
        }
        synchronized (this) {
            if (this.f3260n == null) {
                this.f3260n = new o(this);
            }
            nVar = this.f3260n;
        }
        return nVar;
    }
}
