package gf;

import gf.l;
import java.util.List;
import java.util.Map;
import jf.e;
import jf.f;
import kd.k;

/* compiled from: KodeinTree.kt */
public interface w {
    <C, A, T> List<k<l.e<Object, A, T>, u<Object, A, T>, e<C, Object>>> a(l.e<? super C, ? super A, ? extends T> eVar, int i10, boolean z10);

    List<k<l.e<?, ?, ?>, List<u<?, ?, ?>>, e<?, ?>>> b(b0 b0Var);

    List<f> c();

    Map<l.e<?, ?, ?>, List<u<?, ?, ?>>> d();

    <C, A, T> k<l.e<Object, A, T>, List<u<Object, A, T>>, e<C, Object>> e(l.e<? super C, ? super A, ? extends T> eVar);
}
