package oc;

import android.content.DialogInterface;
import td.l;
import ud.k;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f23680a;

    public /* synthetic */ c(l lVar) {
        this.f23680a = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        l lVar = this.f23680a;
        k.f(lVar, "$proceed");
        lVar.c(Boolean.FALSE);
    }
}
