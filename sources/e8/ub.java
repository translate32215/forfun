package e8;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ub implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f16868a;

    public ub(JsPromptResult jsPromptResult) {
        this.f16868a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f16868a.cancel();
    }
}
