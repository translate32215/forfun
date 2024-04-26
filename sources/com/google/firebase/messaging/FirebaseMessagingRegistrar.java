package com.google.firebase.messaging;

import ab.o;
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
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessagingRegistrar implements g {
    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(d dVar) {
        return new FirebaseMessaging((a) dVar.a(a.class), (ta.a) dVar.a(ta.a.class), dVar.c(h.class), dVar.c(e.class), (c) dVar.a(c.class), (l4.g) dVar.a(l4.g.class), (ra.d) dVar.a(ra.d.class));
    }

    @Keep
    public List<la.c<?>> getComponents() {
        c.b<FirebaseMessaging> a10 = la.c.a(FirebaseMessaging.class);
        a10.a(new m(a.class, 1, 0));
        a10.a(new m(ta.a.class, 0, 0));
        a10.a(new m(h.class, 0, 1));
        a10.a(new m(e.class, 0, 1));
        a10.a(new m(l4.g.class, 0, 0));
        a10.a(new m(va.c.class, 1, 0));
        a10.a(new m(ra.d.class, 1, 0));
        a10.f21195e = o.f232a;
        a10.c(1);
        return Arrays.asList(new la.c[]{a10.b(), cb.g.a("fire-fcm", "22.0.0")});
    }
}
