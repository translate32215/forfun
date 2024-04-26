package o8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.l;
import k8.x0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.2 */
public final class a6 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f23107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f23108b;

    public a6(AppMeasurementDynamiteService appMeasurementDynamiteService, x0 x0Var) {
        this.f23108b = appMeasurementDynamiteService;
        this.f23107a = x0Var;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f23107a.i1(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            l lVar = this.f23108b.f8778a;
            if (lVar != null) {
                lVar.d().f8800i.b("Event listener threw exception", e10);
            }
        }
    }
}
