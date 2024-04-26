package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public enum u6 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(p5.class, p5.class, p5.f20407b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f20497a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20498b;

    /* access modifiers changed from: public */
    u6(Class<?> cls, Class<?> cls2, Object obj) {
        this.f20497a = cls2;
        this.f20498b = obj;
    }
}
