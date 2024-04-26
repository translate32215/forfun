package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.gh;
import e.g;
import e8.p50;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class kh<I, O, F, T> extends vh<O> implements Runnable {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f7249r = 0;
    @NullableDecl

    /* renamed from: h  reason: collision with root package name */
    public p50<? extends I> f7250h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    public F f7251i;

    public kh(p50<? extends I> p50, F f10) {
        p50.getClass();
        this.f7250h = p50;
        f10.getClass();
        this.f7251i = f10;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.kh] */
    public final void c() {
        g(this.f7250h);
        this.f7250h = null;
        this.f7251i = null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.kh] */
    public final String h() {
        String str;
        p50<? extends I> p50 = this.f7250h;
        F f10 = this.f7251i;
        String h10 = kh.super.h();
        if (p50 != null) {
            String valueOf = String.valueOf(p50);
            str = g.a(valueOf.length() + 16, "inputFuture=[", valueOf, "], ");
        } else {
            str = "";
        }
        if (f10 != null) {
            String valueOf2 = String.valueOf(f10);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + o.a(str, 11));
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (h10 == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return h10.length() != 0 ? valueOf3.concat(h10) : new String(valueOf3);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.kh] */
    public final void run() {
        p50<? extends I> p50 = this.f7250h;
        F f10 = this.f7251i;
        boolean z10 = true;
        boolean z11 = (this.f6648a instanceof gh.b) | (p50 == null);
        if (f10 != null) {
            z10 = false;
        }
        if (!z11 && !z10) {
            this.f7250h = null;
            if (p50.isCancelled()) {
                k(p50);
                return;
            }
            try {
                try {
                    Object x10 = x(f10, yh.f(p50));
                    this.f7251i = null;
                    w(x10);
                } catch (Throwable th) {
                    this.f7251i = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e10) {
                j(e10.getCause());
            } catch (RuntimeException e11) {
                j(e11);
            } catch (Error e12) {
                j(e12);
            }
        }
    }

    public abstract void w(@NullableDecl T t10);

    @NullableDecl
    public abstract T x(F f10, @NullableDecl I i10) throws Exception;
}
