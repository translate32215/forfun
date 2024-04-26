package e8;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vb implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f17040a;

    public vb(JsPromptResult jsPromptResult) {
        this.f17040a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f17040a.cancel();
    }
}
