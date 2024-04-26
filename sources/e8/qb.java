package e8;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qb implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f16119a;

    public qb(JsResult jsResult) {
        this.f16119a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16119a.cancel();
    }
}
