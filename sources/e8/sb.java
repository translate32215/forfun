package e8;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sb implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f16387a;

    public sb(JsResult jsResult) {
        this.f16387a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f16387a.confirm();
    }
}
