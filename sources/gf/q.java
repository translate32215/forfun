package gf;

import gf.l;
import kd.o;

/* compiled from: KodeinContainer.kt */
public interface q {

    /* compiled from: KodeinContainer.kt */
    public static final class a {
        public static /* synthetic */ td.a a(q qVar, l.e eVar, Object obj, int i10, int i11, Object obj2) {
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return qVar.a(eVar, obj, i10);
        }
    }

    <C, T> td.a<T> a(l.e<? super C, ? super o, ? extends T> eVar, C c10, int i10);
}
