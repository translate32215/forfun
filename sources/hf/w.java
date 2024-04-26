package hf;

import android.content.Context;
import android.media.AudioManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class w extends l implements td.l<i<? extends Context>, AudioManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final w f19057b = new w();

    public w() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("audio");
        if (systemService != null) {
            return (AudioManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.AudioManager");
    }
}
