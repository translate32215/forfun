package o8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.measurement.internal.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class y2 extends b<d> {
    public y2(Context context, Looper looper, b.a aVar, b.C0083b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final int g() {
        return 12451000;
    }

    public final /* bridge */ /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new com.google.android.gms.measurement.internal.b(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String x() {
        return "com.google.android.gms.measurement.START";
    }
}
