package com.google.firebase.installations;

import androidx.annotation.Keep;
import cb.h;
import com.google.firebase.a;
import java.util.Arrays;
import java.util.List;
import la.c;
import la.d;
import la.g;
import la.m;
import sa.e;
import va.c;

@Keep
public class FirebaseInstallationsRegistrar implements g {
    /* access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(d dVar) {
        return new a((a) dVar.a(a.class), dVar.c(h.class), dVar.c(e.class));
    }

    public List<la.c<?>> getComponents() {
        c.b<va.c> a10 = la.c.a(va.c.class);
        a10.a(new m(a.class, 1, 0));
        a10.a(new m(e.class, 0, 1));
        a10.a(new m(h.class, 0, 1));
        a10.f21195e = va.e.f26691a;
        return Arrays.asList(new la.c[]{a10.b(), cb.g.a("fire-installations", "17.0.0")});
    }
}
