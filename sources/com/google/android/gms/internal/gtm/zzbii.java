package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public abstract class zzbii {
    public final Unsafe zza;

    public zzbii(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public final int zzh(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }
}
