package e8;

import android.os.Binder;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.c5;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.we;
import java.io.InputStream;
import l0.e;
import s7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class or implements b.a, b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public final d7<InputStream> f15833a = new d7<>();

    /* renamed from: b  reason: collision with root package name */
    public final Object f15834b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f15835c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15836d = false;

    /* renamed from: e  reason: collision with root package name */
    public l5 f15837e;

    /* renamed from: f  reason: collision with root package name */
    public c5 f15838f;

    public void Y(int i10) {
        e.E("Cannot connect to remote service, fallback to local instance.");
    }

    public final void a() {
        synchronized (this.f15834b) {
            this.f15836d = true;
            if (this.f15838f.b() || this.f15838f.h()) {
                this.f15838f.p();
            }
            Binder.flushPendingCommands();
        }
    }

    public void m(a aVar) {
        e.E("Disconnected from remote ad request service.");
        this.f15833a.c(new wr(we.INTERNAL_ERROR));
    }
}
