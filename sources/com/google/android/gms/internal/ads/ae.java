package com.google.android.gms.internal.ads;

import e8.a00;
import e8.a20;
import e8.fi0;
import e8.pi0;
import e8.r10;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ae<R> implements a20 {

    /* renamed from: a  reason: collision with root package name */
    public final a00<R> f5953a;

    /* renamed from: b  reason: collision with root package name */
    public final je f5954b;

    /* renamed from: c  reason: collision with root package name */
    public final fi0 f5955c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5956d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f5957e;

    /* renamed from: f  reason: collision with root package name */
    public final pi0 f5958f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final r10 f5959g;

    public ae(a00<R> a00, je jeVar, fi0 fi0, String str, Executor executor, pi0 pi0, @Nullable r10 r10) {
        this.f5953a = a00;
        this.f5954b = jeVar;
        this.f5955c = fi0;
        this.f5956d = str;
        this.f5957e = executor;
        this.f5958f = pi0;
        this.f5959g = r10;
    }

    @Nullable
    public final r10 a() {
        return this.f5959g;
    }

    public final a20 b() {
        return new ae(this.f5953a, this.f5954b, this.f5955c, this.f5956d, this.f5957e, this.f5958f, this.f5959g);
    }

    public final Executor c() {
        return this.f5957e;
    }
}
