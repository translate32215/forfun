package aa;

import aa.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Splitter */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final b f183a;

    /* renamed from: b  reason: collision with root package name */
    public final b f184b;

    /* renamed from: c  reason: collision with root package name */
    public final int f185c = Integer.MAX_VALUE;

    /* compiled from: Splitter */
    public static abstract class a extends a<String> {

        /* renamed from: c  reason: collision with root package name */
        public final CharSequence f186c;

        /* renamed from: d  reason: collision with root package name */
        public final b f187d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f188e;

        /* renamed from: f  reason: collision with root package name */
        public int f189f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f190g;

        public a(k kVar, CharSequence charSequence) {
            this.f187d = kVar.f183a;
            this.f188e = false;
            this.f190g = kVar.f185c;
            this.f186c = charSequence;
        }
    }

    /* compiled from: Splitter */
    public interface b {
    }

    public k(b bVar) {
        b.d dVar = b.d.f175b;
        this.f184b = bVar;
        this.f183a = dVar;
    }

    public List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        j jVar = (j) this.f184b;
        jVar.getClass();
        i iVar = new i(jVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add(iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
