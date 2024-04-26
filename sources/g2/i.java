package g2;

import androidx.work.ListenableWorker;
import g2.f;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import o2.j;

/* compiled from: WorkRequest */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public UUID f18413a;

    /* renamed from: b  reason: collision with root package name */
    public j f18414b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f18415c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a, W extends i> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f18416a = UUID.randomUUID();

        /* renamed from: b  reason: collision with root package name */
        public j f18417b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f18418c = new HashSet();

        public a(Class<? extends ListenableWorker> cls) {
            this.f18417b = new j(this.f18416a.toString(), cls.getName());
            this.f18418c.add(cls.getName());
        }

        public final W a() {
            W fVar = new f((f.a) this);
            this.f18416a = UUID.randomUUID();
            j jVar = new j(this.f18417b);
            this.f18417b = jVar;
            jVar.f22864a = this.f18416a.toString();
            return fVar;
        }
    }

    public i(UUID uuid, j jVar, Set<String> set) {
        this.f18413a = uuid;
        this.f18414b = jVar;
        this.f18415c = set;
    }

    public String a() {
        return this.f18413a.toString();
    }
}
