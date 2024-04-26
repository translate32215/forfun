package com.google.firebase.messaging;

import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import s.a;
import s8.i;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9721a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, i<String>> f9722b = new a();

    public c(Executor executor) {
        this.f9721a = executor;
    }
}
