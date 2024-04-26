package x7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import u7.b;
import u7.g;
import v7.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class d extends e<a> {
    public final i I;

    public d(Context context, Looper looper, c cVar, i iVar, b bVar, g gVar) {
        super(context, looper, 270, cVar, bVar, gVar);
        this.I = iVar;
    }

    public final int g() {
        return 203400000;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final s7.c[] r() {
        return g8.d.f18597b;
    }

    public final Bundle t() {
        i iVar = this.I;
        iVar.getClass();
        Bundle bundle = new Bundle();
        String str = iVar.f26584a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean y() {
        return true;
    }
}
