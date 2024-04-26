package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ha.a;
import ha.b;
import java.util.Arrays;
import java.util.List;
import la.c;
import la.d;
import la.g;
import la.m;

@Keep
public class AbtRegistrar implements g {
    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.c(ja.a.class));
    }

    public List<c<?>> getComponents() {
        c.b<a> a10 = c.a(a.class);
        a10.a(new m(Context.class, 1, 0));
        a10.a(new m(ja.a.class, 0, 1));
        a10.f21195e = b.f18969a;
        return Arrays.asList(new c[]{a10.b(), cb.g.a("fire-abt", "21.0.0")});
    }
}
