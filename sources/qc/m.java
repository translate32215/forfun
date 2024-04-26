package qc;

import ud.f;
import ud.k;

/* compiled from: CoreApiService.kt */
public abstract class m<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f24279a;

    /* compiled from: CoreApiService.kt */
    public static final class a<T> extends m<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object obj, int i10) {
            super((Object) null, str, (f) null);
            k.f(str, "message");
        }
    }

    /* compiled from: CoreApiService.kt */
    public static final class b<T> extends m<T> {
        public b(Object obj, int i10) {
            super((Object) null, (String) null, 2);
        }
    }

    /* compiled from: CoreApiService.kt */
    public static final class c<T> extends m<T> {
        public c(T t10) {
            super((Object) t10, (String) null, 2);
        }
    }

    public m(T t10, String str, int i10) {
        this.f24279a = (i10 & 1) != 0 ? null : t10;
    }

    public m(Object obj, String str, f fVar) {
        this.f24279a = obj;
    }
}
