package com.google.android.gms.internal.ads;

import b7.a;
import com.google.android.gms.internal.ads.ma;
import e8.lb0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class or extends is {
    public or(fr frVar, String str, String str2, ma.a aVar, int i10) {
        super(frVar, str, str2, aVar, i10, 24);
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f7101a.f6491m) {
            c();
            return;
        }
        synchronized (this.f7104d) {
            this.f7104d.p((String) this.f7105e.invoke((Object) null, new Object[]{this.f7101a.f6479a}));
        }
    }

    public final Void b() throws Exception {
        fr frVar = this.f7101a;
        if (frVar.f6494p) {
            super.call();
            return null;
        }
        if (frVar.f6491m) {
            c();
        }
        return null;
    }

    public final void c() {
        fr frVar = this.f7101a;
        a aVar = null;
        if (frVar.f6485g) {
            if (frVar.f6484f != null) {
                aVar = frVar.f6484f;
            } else {
                Future future = frVar.f6486h;
                if (future != null) {
                    try {
                        future.get(2000, TimeUnit.MILLISECONDS);
                        frVar.f6486h = null;
                    } catch (InterruptedException | ExecutionException unused) {
                    } catch (TimeoutException unused2) {
                        frVar.f6486h.cancel(true);
                    }
                }
                aVar = frVar.f6484f;
            }
        }
        if (aVar != null) {
            try {
                a.C0050a f10 = aVar.f(-1);
                String str = f10.f3648a;
                int i10 = lb0.f15378a;
                if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(str);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    str = uc.a(bArr, true);
                }
                if (str != null) {
                    synchronized (this.f7104d) {
                        this.f7104d.p(str);
                        ma.a aVar2 = this.f7104d;
                        boolean z10 = f10.f3649b;
                        if (aVar2.f5971c) {
                            aVar2.n();
                            aVar2.f5971c = false;
                        }
                        ma.G((ma) aVar2.f5970b, z10);
                        ma.a aVar3 = this.f7104d;
                        ma.c cVar = ma.c.DEVICE_IDENTIFIER_ANDROID_AD_ID;
                        if (aVar3.f5971c) {
                            aVar3.n();
                            aVar3.f5971c = false;
                        }
                        ma.B((ma) aVar3.f5970b, cVar);
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }

    public final Object call() throws Exception {
        fr frVar = this.f7101a;
        if (frVar.f6494p) {
            super.call();
            return null;
        } else if (!frVar.f6491m) {
            return null;
        } else {
            c();
            return null;
        }
    }
}
