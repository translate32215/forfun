package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import f.t;

/* compiled from: BottomSheetDialogFragment */
public class b extends t {
    public void r0() {
        Dialog dialog = this.f1775y0;
        if (dialog instanceof a) {
            a aVar = (a) dialog;
            if (aVar.f9011e == null) {
                aVar.k();
            }
            boolean z10 = aVar.f9011e.G;
        }
        s0(false, false, false);
    }

    public Dialog t0(Bundle bundle) {
        return new a(q(), this.f1769s0);
    }
}
