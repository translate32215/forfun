package jf;

import ud.l;

/* compiled from: references.kt */
public final class x implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final x f19829a = new x();

    /* compiled from: references.kt */
    public static final class a extends l implements td.a<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f19830b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(0);
            this.f19830b = obj;
        }

        public final T d() {
            return this.f19830b;
        }
    }

    public <T> o<T> a(td.a<? extends T> aVar) {
        Object d10 = ((u) aVar).d();
        return new o<>(d10, new a(d10));
    }
}
