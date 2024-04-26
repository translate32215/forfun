package com.google.android.gms.internal.ads;

import f7.q;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yi<P> {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f8608d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap<String, List<q>> f8609a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public q f8610b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<P> f8611c;

    public yi(Class<P> cls) {
        this.f8611c = cls;
    }
}
