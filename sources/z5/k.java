package z5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import u6.e;

/* compiled from: LoadEventInfo */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicLong f28598b = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f28599a;

    public k(long j10, e eVar, long j11) {
        Uri uri = eVar.f26048a;
        Collections.emptyMap();
        this.f28599a = 0;
    }

    public static long a() {
        return f28598b.getAndIncrement();
    }

    public k(long j10, e eVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f28599a = j12;
    }
}
