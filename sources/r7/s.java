package r7;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import s8.a;
import s8.i;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class s implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24731a = new s();

    public final Object e(i iVar) {
        int i10 = d.f24687h;
        if (iVar.l()) {
            return (Bundle) iVar.h();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.g());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.g());
    }
}
