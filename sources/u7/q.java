package u7;

import android.util.Log;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.f;
import s7.a;
import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f26123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f26124b;

    public q(r rVar, a aVar) {
        this.f26124b = rVar;
        this.f26123a = aVar;
    }

    public final void run() {
        f fVar;
        r rVar = this.f26124b;
        e eVar = rVar.f26130f.f5766r.get(rVar.f26126b);
        if (eVar != null) {
            if (this.f26123a.j()) {
                r rVar2 = this.f26124b;
                rVar2.f26129e = true;
                if (rVar2.f26125a.m()) {
                    r rVar3 = this.f26124b;
                    if (rVar3.f26129e && (fVar = rVar3.f26127c) != null) {
                        rVar3.f26125a.d(fVar, rVar3.f26128d);
                        return;
                    }
                    return;
                }
                try {
                    a.f fVar2 = this.f26124b.f26125a;
                    fVar2.d((f) null, fVar2.c());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f26124b.f26125a.e("Failed to get service from broker.");
                    eVar.r(new s7.a(10), (Exception) null);
                }
            } else {
                eVar.r(this.f26123a, (Exception) null);
            }
        }
    }
}
