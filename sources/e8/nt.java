package e8;

import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.yh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nt<DelegateT, AdapterT> implements lt<AdapterT> {

    /* renamed from: a  reason: collision with root package name */
    public final lt<DelegateT> f15714a;

    /* renamed from: b  reason: collision with root package name */
    public final mg<DelegateT, AdapterT> f15715b;

    public nt(lt<DelegateT> ltVar, mg<DelegateT, AdapterT> mgVar) {
        this.f15714a = ltVar;
        this.f15715b = mgVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        return this.f15714a.a(t00, qeVar);
    }

    public final p50<AdapterT> b(t00 t00, qe qeVar) {
        return yh.i(this.f15714a.b(t00, qeVar), this.f15715b, h9.f14881a);
    }
}
