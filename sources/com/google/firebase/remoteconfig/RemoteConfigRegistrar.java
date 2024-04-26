package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.a;
import db.i;
import db.j;
import ga.c;
import java.util.Arrays;
import java.util.List;
import la.c;
import la.d;
import la.g;
import la.m;

@Keep
public class RemoteConfigRegistrar implements g {
    /* access modifiers changed from: private */
    public static i lambda$getComponents$0(d dVar) {
        c cVar;
        Context context = (Context) dVar.a(Context.class);
        a aVar = (a) dVar.a(a.class);
        va.c cVar2 = (va.c) dVar.a(va.c.class);
        ha.a aVar2 = (ha.a) dVar.a(ha.a.class);
        synchronized (aVar2) {
            if (!aVar2.f18967a.containsKey("frc")) {
                aVar2.f18967a.put("frc", new c(aVar2.f18968b, "frc"));
            }
            cVar = aVar2.f18967a.get("frc");
        }
        return new i(context, aVar, cVar2, cVar, dVar.c(ja.a.class));
    }

    public List<la.c<?>> getComponents() {
        c.b<i> a10 = la.c.a(i.class);
        a10.a(new m(Context.class, 1, 0));
        a10.a(new m(a.class, 1, 0));
        a10.a(new m(va.c.class, 1, 0));
        a10.a(new m(ha.a.class, 1, 0));
        a10.a(new m(ja.a.class, 0, 1));
        a10.f21195e = j.f13240a;
        a10.c(2);
        return Arrays.asList(new la.c[]{a10.b(), cb.g.a("fire-rc", "21.0.1")});
    }
}
