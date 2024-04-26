package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import l4.d;

@AutoValue
/* compiled from: SchedulerConfig */
public abstract class c {

    @AutoValue
    /* compiled from: SchedulerConfig */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a$a  reason: collision with other inner class name */
        /* compiled from: SchedulerConfig */
        public static abstract class C0074a {
            public abstract a a();

            public abstract C0074a b(long j10);

            public abstract C0074a c(long j10);
        }

        public static C0074a a() {
            b.C0073b bVar = new b.C0073b();
            Set<b> emptySet = Collections.emptySet();
            if (emptySet != null) {
                bVar.f5021c = emptySet;
                return bVar;
            }
            throw new NullPointerException("Null flags");
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    /* compiled from: SchedulerConfig */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract v4.a a();

    public long b(d dVar, long j10, int i10) {
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long b10 = aVar.b();
        int i11 = i10 - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b10 > 1 ? b10 : 2) * ((long) i11))));
        double pow = Math.pow(3.0d, (double) i11);
        double d10 = (double) b10;
        Double.isNaN(d10);
        Double.isNaN(d10);
        return Math.min(Math.max((long) (pow * d10 * max), a10), aVar.d());
    }

    public abstract Map<d, a> c();
}
