package hf;

import android.content.Context;
import android.content.SharedPreferences;
import jf.c;
import td.p;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class j extends l implements p<c<? extends Context>, String, SharedPreferences> {

    /* renamed from: b  reason: collision with root package name */
    public static final j f19018b = new j();

    public j() {
        super(2);
    }

    public Object h(Object obj, Object obj2) {
        c cVar = (c) obj;
        String str = (String) obj2;
        k.g(cVar, "$receiver");
        k.g(str, "name");
        return ((Context) cVar.getContext()).getSharedPreferences(str, 0);
    }
}
