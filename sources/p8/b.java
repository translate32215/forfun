package p8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import t7.a;
import t7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b extends a.C0249a<q8.a, a> {
    public final a.f a(Context context, Looper looper, c cVar, Object obj, d.a aVar, d.b bVar) {
        a aVar2 = (a) obj;
        Integer num = cVar.f5848h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.f5841a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new q8.a(context, looper, cVar, bundle, aVar, bVar);
    }
}
