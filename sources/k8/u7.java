package k8;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class u7 {

    /* renamed from: c  reason: collision with root package name */
    public static final u7 f20499c = new u7();

    /* renamed from: a  reason: collision with root package name */
    public final y7 f20500a = new e7();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, x7<?>> f20501b = new ConcurrentHashMap();

    public final <T> x7<T> a(Class<T> cls) {
        q7 q7Var;
        Class<?> cls2;
        Charset charset = r6.f20450a;
        if (cls != null) {
            x7<T> x7Var = (x7) this.f20501b.get(cls);
            if (x7Var == null) {
                e7 e7Var = (e7) this.f20500a;
                e7Var.getClass();
                Class<k6> cls3 = k6.class;
                Class<?> cls4 = z7.f20565a;
                if (cls3.isAssignableFrom(cls) || (cls2 = z7.f20565a) == null || cls2.isAssignableFrom(cls)) {
                    k7 a10 = e7Var.f20188a.a(cls);
                    if (a10.d()) {
                        if (cls3.isAssignableFrom(cls)) {
                            l8<?, ?> l8Var = z7.f20568d;
                            y5<?> y5Var = a6.f20063a;
                            q7Var = new q7(l8Var, a6.f20063a, a10.zza());
                        } else {
                            l8<?, ?> l8Var2 = z7.f20566b;
                            y5<?> y5Var2 = a6.f20064b;
                            if (y5Var2 != null) {
                                q7Var = new q7(l8Var2, y5Var2, a10.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        x7Var = q7Var;
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        boolean z10 = false;
                        if (isAssignableFrom) {
                            if (a10.e() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                r7 r7Var = s7.f20462b;
                                a7 a7Var = a7.f20066b;
                                l8<?, ?> l8Var3 = z7.f20568d;
                                y5<?> y5Var3 = a6.f20063a;
                                x7Var = p7.C(a10, r7Var, a7Var, l8Var3, a6.f20063a, j7.f20276b);
                            } else {
                                x7Var = p7.C(a10, s7.f20462b, a7.f20066b, z7.f20568d, (y5) null, j7.f20276b);
                            }
                        } else {
                            if (a10.e() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                r7 r7Var2 = s7.f20461a;
                                a7 a7Var2 = a7.f20065a;
                                l8<?, ?> l8Var4 = z7.f20566b;
                                y5<?> y5Var4 = a6.f20064b;
                                if (y5Var4 != null) {
                                    x7Var = p7.C(a10, r7Var2, a7Var2, l8Var4, y5Var4, j7.f20275a);
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                x7Var = p7.C(a10, s7.f20461a, a7.f20065a, z7.f20567c, (y5) null, j7.f20275a);
                            }
                        }
                    }
                    x7<T> putIfAbsent = this.f20501b.putIfAbsent(cls, x7Var);
                    return putIfAbsent == null ? x7Var : putIfAbsent;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
