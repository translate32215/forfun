package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import e8.s70;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class up {

    /* renamed from: b  reason: collision with root package name */
    public static volatile up f8251b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile up f8252c;

    /* renamed from: d  reason: collision with root package name */
    public static final up f8253d = new up(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, aq.f<?, ?>> f8254a;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f8255a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8256b;

        public a(Object obj, int i10) {
            this.f8255a = obj;
            this.f8256b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8255a == aVar.f8255a && this.f8256b == aVar.f8256b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f8255a) * 65535) + this.f8256b;
        }
    }

    public up() {
        this.f8254a = new HashMap();
    }

    public static up a() {
        up upVar = f8251b;
        if (upVar == null) {
            synchronized (up.class) {
                upVar = f8251b;
                if (upVar == null) {
                    upVar = f8253d;
                    f8251b = upVar;
                }
            }
        }
        return upVar;
    }

    public static up b() {
        Class<up> cls = up.class;
        up upVar = f8252c;
        if (upVar != null) {
            return upVar;
        }
        synchronized (cls) {
            up upVar2 = f8252c;
            if (upVar2 != null) {
                return upVar2;
            }
            up b10 = s70.b(cls);
            f8252c = b10;
            return b10;
        }
    }

    public up(boolean z10) {
        this.f8254a = Collections.emptyMap();
    }
}
