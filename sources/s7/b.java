package s7;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f25004a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f25005b;

    /* renamed from: c  reason: collision with root package name */
    public Dialog f25006c;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f25005b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f25004a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f25006c == null) {
            Activity activity = getActivity();
            i.h(activity);
            this.f25006c = new AlertDialog.Builder(activity).create();
        }
        return this.f25006c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
