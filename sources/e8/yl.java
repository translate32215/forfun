package e8;

import com.google.android.gms.internal.ads.qe;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yl implements xl {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f17637a;

    /* renamed from: b  reason: collision with root package name */
    public final e30 f17638b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17639c;

    public yl(qe qeVar, e30 e30) {
        this.f17637a = qeVar.f7962o;
        this.f17638b = e30;
    }

    public final void a() {
        if (!this.f17639c) {
            this.f17638b.b(this.f17637a);
            this.f17639c = true;
        }
    }
}
