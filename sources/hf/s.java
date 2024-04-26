package hf;

import android.accounts.AccountManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class s extends l implements td.l<i<? extends Context>, AccountManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final s f19045b = new s();

    public s() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("account");
        if (systemService != null) {
            return (AccountManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.accounts.AccountManager");
    }
}
