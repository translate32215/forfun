package be;

import com.google.gson.internal.u;
import java.util.Iterator;
import ud.k;
import ud.l;

/* compiled from: Sequences.kt */
public class g extends u {

    /* compiled from: Sequences.kt */
    public static final class a implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f3912a;

        public a(Iterator it) {
            this.f3912a = it;
        }

        public Iterator<T> iterator() {
            return this.f3912a;
        }
    }

    /* compiled from: Sequences.kt */
    public static final class b extends l implements td.a<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f3913b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(T t10) {
            super(0);
            this.f3913b = t10;
        }

        public final T d() {
            return this.f3913b;
        }
    }

    public static final <T> f<T> b(Iterator<? extends T> it) {
        k.f(it, "<this>");
        a aVar = new a(it);
        k.f(aVar, "<this>");
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static final <T> f<T> c(T t10, td.l<? super T, ? extends T> lVar) {
        if (t10 == null) {
            return b.f3893a;
        }
        return new e(new b(t10), lVar);
    }
}
