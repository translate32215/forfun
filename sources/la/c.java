package la;

import androidx.appcompat.widget.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f21185a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<m> f21186b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21187c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21188d;

    /* renamed from: e  reason: collision with root package name */
    public final f<T> f21189e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f21190f;

    /* compiled from: Component */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<? super T>> f21191a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<m> f21192b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public int f21193c;

        /* renamed from: d  reason: collision with root package name */
        public int f21194d;

        /* renamed from: e  reason: collision with root package name */
        public f<T> f21195e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f21196f;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f21191a = hashSet;
            this.f21193c = 0;
            this.f21194d = 0;
            this.f21196f = new HashSet();
            if (cls != null) {
                hashSet.add(cls);
                for (Class d10 : clsArr) {
                    p.d(d10, "Null interface");
                }
                Collections.addAll(this.f21191a, clsArr);
                return;
            }
            throw new NullPointerException("Null interface");
        }

        public b<T> a(m mVar) {
            if (!this.f21191a.contains(mVar.f21217a)) {
                this.f21192b.add(mVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public c<T> b() {
            if (this.f21195e != null) {
                return new c(new HashSet(this.f21191a), new HashSet(this.f21192b), this.f21193c, this.f21194d, this.f21195e, this.f21196f, (a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final b<T> c(int i10) {
            if (this.f21193c == 0) {
                this.f21193c = i10;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public c(Set set, Set set2, int i10, int i11, f fVar, Set set3, a aVar) {
        this.f21185a = Collections.unmodifiableSet(set);
        this.f21186b = Collections.unmodifiableSet(set2);
        this.f21187c = i10;
        this.f21188d = i11;
        this.f21189e = fVar;
        this.f21190f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> c<T> c(T t10, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, (a) null);
        bVar.f21195e = new b(t10);
        return bVar.b();
    }

    public boolean b() {
        return this.f21188d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f21185a.toArray()) + ">{" + this.f21187c + ", type=" + this.f21188d + ", deps=" + Arrays.toString(this.f21186b.toArray()) + "}";
    }
}
