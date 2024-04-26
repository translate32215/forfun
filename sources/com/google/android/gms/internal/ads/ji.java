package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import l0.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ji {
    public static <V> V a(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static Object b(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(d.a(20, "at index ", i10));
    }

    public static ma c(Context context, String str, String str2) {
        ma maVar;
        try {
            maVar = new nf(context, str, str2).f7581d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            maVar = null;
        }
        return maVar == null ? nf.b() : maVar;
    }
}
