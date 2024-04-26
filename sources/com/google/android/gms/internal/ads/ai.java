package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.gh;
import e8.p50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class ai<V> implements p50<V> {

    /* renamed from: b  reason: collision with root package name */
    public static final p50<?> f5965b = new ai((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f5966c = Logger.getLogger(ai.class.getName());
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public final V f5967a;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static final class a<V> extends gh.i<V> {
        public a(Throwable th) {
            j(th);
        }
    }

    public ai(@NullableDecl V v10) {
        this.f5967a = v10;
    }

    public void a(Runnable runnable, Executor executor) {
        pg.b(runnable, "Runnable was null.");
        pg.b(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f5966c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb2.toString(), e10);
        }
    }

    public boolean cancel(boolean z10) {
        return false;
    }

    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f5967a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f5967a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + o.a(obj, 27));
        sb2.append(obj);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(valueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    public V get() {
        return this.f5967a;
    }
}
