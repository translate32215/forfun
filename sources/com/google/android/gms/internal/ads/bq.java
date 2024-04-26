package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum bq {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(mp.class, mp.class, mp.f7494b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f6051a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6052b;

    /* access modifiers changed from: public */
    bq(Class<?> cls, Class<?> cls2, Object obj) {
        this.f6051a = cls2;
        this.f6052b = obj;
    }
}
