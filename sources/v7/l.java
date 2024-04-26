package v7;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class l extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f26585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f26586b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f26587c;

    public l(Intent intent, Activity activity, int i10) {
        this.f26585a = intent;
        this.f26586b = activity;
        this.f26587c = i10;
    }

    public final void a() {
        Intent intent = this.f26585a;
        if (intent != null) {
            this.f26586b.startActivityForResult(intent, this.f26587c);
        }
    }
}
