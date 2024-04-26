package je;

import androidx.appcompat.widget.p;
import ie.s;
import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f19778a = p.m("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f19779b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19780c = p.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final long f19781d = TimeUnit.SECONDS.toNanos(p.m("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static g f19782e = e.f19768a;

    /* renamed from: f  reason: collision with root package name */
    public static final i f19783f = new j(0);

    /* renamed from: g  reason: collision with root package name */
    public static final i f19784g = new j(1);

    static {
        int i10 = s.f19397a;
        f19779b = p.l("kotlinx.coroutines.scheduler.core.pool.size", i10 < 2 ? 2 : i10, 1, 0, 8, (Object) null);
    }
}
