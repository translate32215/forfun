package hf;

import android.content.Context;
import android.media.midi.MidiManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class y1 extends l implements td.l<i<? extends Context>, MidiManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final y1 f19065b = new y1();

    public y1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("midi");
        if (systemService != null) {
            return (MidiManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.midi.MidiManager");
    }
}
