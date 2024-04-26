package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zc {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, a4> f8694a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final gb f8695b;

    public zc(gb gbVar) {
        this.f8695b = gbVar;
    }

    @CheckForNull
    public final a4 a(String str) {
        if (this.f8694a.containsKey(str)) {
            return this.f8694a.get(str);
        }
        return null;
    }
}
