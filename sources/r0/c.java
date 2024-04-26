package r0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import r0.f;

/* compiled from: InputConnectionCompat */
public class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f24480a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, boolean z10, e eVar) {
        super(inputConnection, z10);
        this.f24480a = eVar;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        e eVar = this.f24480a;
        f fVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fVar = new f(new f.a(inputContentInfo));
        }
        if (((b) eVar).b(fVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
