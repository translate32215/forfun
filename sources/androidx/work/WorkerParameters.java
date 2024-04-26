package androidx.work;

import android.net.Network;
import android.net.Uri;
import g2.k;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f3224a;

    /* renamed from: b  reason: collision with root package name */
    public b f3225b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f3226c;

    /* renamed from: d  reason: collision with root package name */
    public a f3227d;

    /* renamed from: e  reason: collision with root package name */
    public int f3228e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f3229f;

    /* renamed from: g  reason: collision with root package name */
    public r2.a f3230g;

    /* renamed from: h  reason: collision with root package name */
    public k f3231h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f3232a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f3233b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f3234c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, Executor executor, r2.a aVar2, k kVar) {
        this.f3224a = uuid;
        this.f3225b = bVar;
        this.f3226c = new HashSet(collection);
        this.f3227d = aVar;
        this.f3228e = i10;
        this.f3229f = executor;
        this.f3230g = aVar2;
        this.f3231h = kVar;
    }
}
