package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l4.b;
import la.c;
import la.d;
import la.g;
import la.m;
import m4.a;
import o4.b;
import o4.i;
import o4.j;
import o4.n;

@Keep
public class TransportRegistrar implements g {
    /* access modifiers changed from: private */
    public static l4.g lambda$getComponents$0(d dVar) {
        Set<T> set;
        n.b((Context) dVar.a(Context.class));
        n a10 = n.a();
        a aVar = a.f21698e;
        a10.getClass();
        if (aVar instanceof o4.d) {
            set = Collections.unmodifiableSet(aVar.c());
        } else {
            set = Collections.singleton(new b("proto"));
        }
        i.a a11 = i.a();
        aVar.getClass();
        a11.a("cct");
        b.C0204b bVar = (b.C0204b) a11;
        bVar.f22940b = aVar.b();
        return new j(set, bVar.b(), a10);
    }

    public List<c<?>> getComponents() {
        c.b<l4.g> a10 = c.a(l4.g.class);
        a10.a(new m(Context.class, 1, 0));
        a10.f21195e = ma.a.f21752a;
        return Collections.singletonList(a10.b());
    }
}
