package v7;

import android.content.Intent;
import u7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f26588a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f26589b;

    public m(Intent intent, d dVar) {
        this.f26588a = intent;
        this.f26589b = dVar;
    }

    public final void a() {
        Intent intent = this.f26588a;
        if (intent != null) {
            this.f26589b.startActivityForResult(intent, 2);
        }
    }
}
