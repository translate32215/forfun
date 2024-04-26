package e8;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xb implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f17457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f17458b;

    public xb(JsPromptResult jsPromptResult, EditText editText) {
        this.f17457a = jsPromptResult;
        this.f17458b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f17457a.confirm(this.f17458b.getText().toString());
    }
}
