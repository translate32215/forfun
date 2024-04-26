package e8;

import android.content.Context;
import c8.b;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.ue;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class tu implements t9 {

    /* renamed from: a  reason: collision with root package name */
    public final mt f16812a;

    public tu(mt mtVar) {
        this.f16812a = mtVar;
    }

    public final void a(boolean z10, Context context) {
        mt mtVar = this.f16812a;
        try {
            ((ue) mtVar.f15550b).b(z10);
            ue ueVar = (ue) mtVar.f15550b;
            ueVar.getClass();
            ueVar.f8245a.v3(new b(context));
        } catch (b10 e10) {
            throw new um(e10.getCause());
        } catch (Throwable th) {
            throw new b10(th);
        }
    }
}
