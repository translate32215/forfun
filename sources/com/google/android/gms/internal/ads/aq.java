package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.aq.b;
import e8.a70;
import e8.c80;
import e8.c90;
import e8.d90;
import e8.f80;
import e8.ft;
import e8.j90;
import e8.q70;
import e8.w70;
import e8.y60;
import e8.y70;
import e8.y90;
import e8.z60;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class aq<MessageType extends aq<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends z60<MessageType, BuilderType> {
    private static Map<Object, aq<?, ?>> zziow = new ConcurrentHashMap();
    public nq zziou = nq.f7603f;
    private int zziov = -1;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static class a<T extends aq<T, ?>> extends a70<T> {
        public a(T t10) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static abstract class b<MessageType extends aq<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends y60<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f5969a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f5970b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5971c = false;

        public b(MessageType messagetype) {
            this.f5969a = messagetype;
            this.f5970b = (aq) messagetype.q(4, (Object) null, (Object) null);
        }

        public static void l(MessageType messagetype, MessageType messagetype2) {
            j90.f15105c.a(messagetype).c(messagetype, messagetype2);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.f5969a.q(5, (Object) null, (Object) null);
            bVar.m((aq) h());
            return bVar;
        }

        public final /* synthetic */ cq e() {
            return this.f5969a;
        }

        public cq h() {
            if (this.f5971c) {
                return this.f5970b;
            }
            MessageType messagetype = this.f5970b;
            j90.f15105c.a(messagetype).g(messagetype);
            this.f5971c = true;
            return this.f5970b;
        }

        public cq j() {
            aq aqVar = (aq) h();
            if (aqVar.isInitialized()) {
                return aqVar;
            }
            throw new y90();
        }

        public final y60 k(byte[] bArr, int i10, int i11, up upVar) throws f80 {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            try {
                j90.f15105c.a(this.f5970b).f(this.f5970b, bArr, 0, i11, new ft(upVar));
                return this;
            } catch (f80 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw f80.a();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        public final BuilderType m(MessageType messagetype) {
            if (this.f5971c) {
                n();
                this.f5971c = false;
            }
            l(this.f5970b, messagetype);
            return this;
        }

        public void n() {
            MessageType messagetype = (aq) this.f5970b.q(4, (Object) null, (Object) null);
            j90.f15105c.a(messagetype).c(messagetype, this.f5970b);
            this.f5970b = messagetype;
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class c implements q70<c> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int g() {
            throw new NoSuchMethodError();
        }

        public final boolean h() {
            throw new NoSuchMethodError();
        }

        public final d90 j(d90 d90, d90 d902) {
            throw new NoSuchMethodError();
        }

        public final uq k() {
            throw new NoSuchMethodError();
        }

        public final vq l() {
            throw new NoSuchMethodError();
        }

        public final boolean n() {
            throw new NoSuchMethodError();
        }

        public final y60 p(y60 y60, cq cqVar) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends aq<MessageType, BuilderType> implements c90 {
        public xp<c> zzipb = xp.f8564d;

        public final xp<c> y() {
            xp<c> xpVar = this.zzipb;
            if (xpVar.f8566b) {
                this.zzipb = (xp) xpVar.clone();
            }
            return this.zzipb;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5972a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f5972a.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static class f<ContainingType extends cq, Type> extends cp {
    }

    public static <T extends aq<T, ?>> T k(T t10) throws f80 {
        if (t10.isInitialized()) {
            return t10;
        }
        throw new f80(new y90().getMessage());
    }

    public static <T extends aq<T, ?>> T l(T t10, mp mpVar, up upVar) throws f80 {
        T u10 = u(t10, mpVar, upVar);
        k(u10);
        return u10;
    }

    public static <T extends aq<T, ?>> T m(T t10, op opVar, up upVar) throws f80 {
        T t11 = (aq) t10.q(4, (Object) null, (Object) null);
        try {
            iq a10 = j90.f15105c.a(t11);
            rp rpVar = opVar.f7700d;
            if (rpVar == null) {
                rpVar = new rp(opVar);
            }
            a10.h(t11, rpVar, upVar);
            a10.g(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof f80) {
                throw ((f80) e10.getCause());
            }
            throw new f80(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof f80) {
                throw ((f80) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends aq<T, ?>> aq n(aq aqVar, byte[] bArr, int i10, up upVar) throws f80 {
        aq aqVar2 = (aq) aqVar.q(4, (Object) null, (Object) null);
        try {
            iq a10 = j90.f15105c.a(aqVar2);
            a10.f(aqVar2, bArr, 0, i10, new ft(upVar));
            a10.g(aqVar2);
            if (aqVar2.zzijw == 0) {
                return aqVar2;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof f80) {
                throw ((f80) e10.getCause());
            }
            throw new f80(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw f80.a();
        }
    }

    public static y70 o(y70 y70) {
        int i10 = ((w70) y70).f17226c;
        return ((w70) y70).r(i10 == 0 ? 10 : i10 << 1);
    }

    public static <E> c80<E> p(c80<E> c80) {
        int size = c80.size();
        return c80.r(size == 0 ? 10 : size << 1);
    }

    public static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <T extends aq<?, ?>> void t(Class<T> cls, T t10) {
        zziow.put(cls, t10);
    }

    public static <T extends aq<T, ?>> T u(T t10, mp mpVar, up upVar) throws f80 {
        try {
            op z10 = mpVar.z();
            T m10 = m(t10, z10, upVar);
            z10.w(0);
            return m10;
        } catch (f80 e10) {
            throw e10;
        } catch (f80 e11) {
            throw e11;
        }
    }

    public static <T extends aq<?, ?>> T x(Class<T> cls) {
        T t10 = (aq) zziow.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (aq) zziow.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (aq) ((aq) oq.l(cls)).q(6, (Object) null, (Object) null);
            if (t10 != null) {
                zziow.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public final void a(sp spVar) throws IOException {
        iq a10 = j90.f15105c.a(this);
        tp tpVar = spVar.f8139a;
        if (tpVar == null) {
            tpVar = new tp(spVar);
        }
        a10.d(this, tpVar);
    }

    public final /* synthetic */ y60 b() {
        return (b) q(5, (Object) null, (Object) null);
    }

    public final int c() {
        if (this.zziov == -1) {
            this.zziov = j90.f15105c.a(this).i(this);
        }
        return this.zziov;
    }

    public final /* synthetic */ y60 d() {
        b bVar = (b) q(5, (Object) null, (Object) null);
        bVar.m(this);
        return bVar;
    }

    public final /* synthetic */ cq e() {
        return (aq) q(6, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return j90.f15105c.a(this).j(this, (aq) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.zzijw;
        if (i10 != 0) {
            return i10;
        }
        int l10 = j90.f15105c.a(this).l(this);
        this.zzijw = l10;
        return l10;
    }

    public final int i() {
        return this.zziov;
    }

    public final boolean isInitialized() {
        byte byteValue = ((Byte) q(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e10 = j90.f15105c.a(this).e(this);
        q(2, e10 ? this : null, (Object) null);
        return e10;
    }

    public final void j(int i10) {
        this.zziov = i10;
    }

    public abstract Object q(int i10, Object obj, Object obj2);

    public String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        dq.a(this, sb2, 0);
        return sb2.toString();
    }

    public final <MessageType extends aq<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType v() {
        return (b) q(5, (Object) null, (Object) null);
    }

    public final BuilderType w() {
        BuilderType buildertype = (b) q(5, (Object) null, (Object) null);
        buildertype.m(this);
        return buildertype;
    }
}
