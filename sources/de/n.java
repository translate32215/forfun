package de;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
public class n {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13312b = AtomicIntegerFieldUpdater.newUpdater(n.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f13313a;

    public n(Throwable th, boolean z10) {
        this.f13313a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f13313a + ']';
    }

    public n(Throwable th, boolean z10, int i10) {
        z10 = (i10 & 2) != 0 ? false : z10;
        this.f13313a = th;
        this._handled = z10 ? 1 : 0;
    }
}
