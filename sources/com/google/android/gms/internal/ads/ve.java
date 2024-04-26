package com.google.android.gms.internal.ads;

import e8.o50;
import e8.p50;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ve<T> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final Deque<p50<T>> f8360a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    public final Callable<T> f8361b;

    /* renamed from: c  reason: collision with root package name */
    public final o50 f8362c;

    public ve(Callable<T> callable, o50 o50) {
        this.f8361b = callable;
        this.f8362c = o50;
    }

    public final synchronized void a(int i10) {
        int size = i10 - this.f8360a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f8360a.add(this.f8362c.i(this.f8361b));
        }
    }

    public final synchronized p50<T> b() {
        a(1);
        return this.f8360a.poll();
    }
}
