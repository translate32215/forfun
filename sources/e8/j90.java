package e8;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.iq;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.ads.lq;
import com.google.android.gms.internal.ads.vp;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class j90 {

    /* renamed from: c  reason: collision with root package name */
    public static final j90 f15105c = new j90();

    /* renamed from: a  reason: collision with root package name */
    public final n90 f15106a = new p80();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, iq<?>> f15107b = new ConcurrentHashMap();

    public final <T> iq<T> a(T t10) {
        return b(t10.getClass());
    }

    public final <T> iq<T> b(Class<T> cls) {
        iq<T> iqVar;
        fq fqVar;
        Class<?> cls2;
        Charset charset = v70.f17029a;
        if (cls != null) {
            iq<T> iqVar2 = (iq) this.f15107b.get(cls);
            if (iqVar2 != null) {
                return iqVar2;
            }
            p80 p80 = (p80) this.f15106a;
            p80.getClass();
            Class<aq> cls3 = aq.class;
            Class<?> cls4 = kq.f7265a;
            if (cls3.isAssignableFrom(cls) || (cls2 = kq.f7265a) == null || cls2.isAssignableFrom(cls)) {
                b90 b10 = p80.f15878a.b(cls);
                if (b10.a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        lq<?, ?> lqVar = kq.f7268d;
                        vp<?> vpVar = o70.f15746a;
                        fqVar = new fq(lqVar, o70.f15746a, b10.b());
                    } else {
                        lq<?, ?> lqVar2 = kq.f7266b;
                        vp<?> vpVar2 = o70.f15747b;
                        if (vpVar2 != null) {
                            fqVar = new fq(lqVar2, vpVar2, b10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    iqVar = fqVar;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z10 = false;
                    if (isAssignableFrom) {
                        if (b10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            e90 e90 = g90.f14738b;
                            m80 m80 = m80.f15471b;
                            lq<?, ?> lqVar3 = kq.f7268d;
                            vp<?> vpVar3 = o70.f15746a;
                            iqVar = eq.o(b10, e90, m80, lqVar3, o70.f15746a, x80.f17452b);
                        } else {
                            iqVar = eq.o(b10, g90.f14738b, m80.f15471b, kq.f7268d, (vp) null, x80.f17452b);
                        }
                    } else {
                        if (b10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            e90 e902 = g90.f14737a;
                            m80 m802 = m80.f15470a;
                            lq<?, ?> lqVar4 = kq.f7266b;
                            vp<?> vpVar4 = o70.f15747b;
                            if (vpVar4 != null) {
                                iqVar = eq.o(b10, e902, m802, lqVar4, vpVar4, x80.f17451a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            iqVar = eq.o(b10, g90.f14737a, m80.f15470a, kq.f7267c, (vp) null, x80.f17451a);
                        }
                    }
                }
                iq<T> putIfAbsent = this.f15107b.putIfAbsent(cls, iqVar);
                return putIfAbsent != null ? putIfAbsent : iqVar;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
