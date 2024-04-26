package v7;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.v;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class x extends o {

    /* renamed from: a  reason: collision with root package name */
    public b f26603a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26604b;

    public x(b bVar, int i10) {
        this.f26603a = bVar;
        this.f26604b = i10;
    }

    public final void Y(int i10, IBinder iBinder, Bundle bundle) {
        i.i(this.f26603a, "onPostInitComplete can be called only once per call to getRemoteService");
        b bVar = this.f26603a;
        int i11 = this.f26604b;
        Handler handler = bVar.f5827f;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new v(bVar, i10, iBinder, bundle)));
        this.f26603a = null;
    }
}
