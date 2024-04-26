package f;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.o;

/* compiled from: AppCompatDialogFragment */
public class t extends o {
    public t() {
    }

    public Dialog t0(Bundle bundle) {
        return new s(q(), this.f1769s0);
    }

    public void v0(Dialog dialog, int i10) {
        if (dialog instanceof s) {
            s sVar = (s) dialog;
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            sVar.j(1);
            return;
        }
        super.v0(dialog, i10);
    }

    public t(int i10) {
        super(i10);
    }
}
