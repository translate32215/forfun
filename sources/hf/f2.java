package hf;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class f2 extends l implements td.l<i<? extends Context>, SharedPreferences> {

    /* renamed from: b  reason: collision with root package name */
    public static final f2 f19006b = new f2();

    public f2() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return PreferenceManager.getDefaultSharedPreferences((Context) iVar.getContext());
    }
}
