package s7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class j extends o {
    public Dialog D0;
    public DialogInterface.OnCancelListener E0;
    public Dialog F0;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.E0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog t0(Bundle bundle) {
        Dialog dialog = this.D0;
        if (dialog != null) {
            return dialog;
        }
        this.f1771u0 = false;
        if (this.F0 == null) {
            Context q10 = q();
            i.h(q10);
            this.F0 = new AlertDialog.Builder(q10).create();
        }
        return this.F0;
    }

    public void w0(a0 a0Var, String str) {
        super.w0(a0Var, str);
    }
}
