package q8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import p8.d;
import t7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class a extends e<g> implements d {
    public final boolean I = true;
    public final c J;
    public final Bundle K;
    public final Integer L;

    public a(Context context, Looper looper, c cVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.J = cVar;
        this.K = bundle;
        this.L = cVar.f5848h;
    }

    public final int g() {
        return 12451000;
    }

    public final boolean m() {
        return this.I;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    public final Bundle t() {
        if (!this.f5824c.getPackageName().equals(this.J.f5845e)) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.f5845e);
        }
        return this.K;
    }

    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
