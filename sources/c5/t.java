package c5;

import android.util.Log;
import c5.q;
import java.util.UUID;

public final /* synthetic */ class t implements q.c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ t f4347a = new t();

    public final q a(UUID uuid) {
        int i10 = u.f4348d;
        try {
            return u.m(uuid);
        } catch (z unused) {
            Log.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new n();
        }
    }
}
