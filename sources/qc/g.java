package qc;

import md.d;
import nf.f;
import nf.s;
import rc.b;

/* compiled from: CoreApiService.kt */
public interface g {
    @f("event/{id}")
    Object a(@s("id") String str, d<? super b> dVar);

    @f("channel/{id}")
    Object b(@s("id") String str, d<? super b> dVar);
}
