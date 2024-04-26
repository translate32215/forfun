package c6;

import android.net.Uri;
import d6.h;
import d6.i;
import java.util.Collections;
import java.util.Map;
import u6.e;
import v6.a;
import v6.c0;

/* compiled from: DashUtil */
public final class c {
    public static e a(i iVar, h hVar, int i10) {
        h hVar2 = hVar;
        Map emptyMap = Collections.emptyMap();
        Uri d10 = c0.d(iVar.f13123b, hVar2.f13120c);
        long j10 = hVar2.f13118a;
        long j11 = hVar2.f13119b;
        String a10 = iVar.a();
        a.g(d10, "The uri must be set.");
        return new e(d10, 0, 1, (byte[]) null, emptyMap, j10, j11, a10, i10, (Object) null);
    }
}
