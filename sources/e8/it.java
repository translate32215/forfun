package e8;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class it implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f15072a;

    public it(a aVar) {
        this.f15072a = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f15072a;
        if (aVar != null) {
            aVar.s6();
        }
    }
}
