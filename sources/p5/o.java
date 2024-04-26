package p5;

import java.util.Comparator;
import p5.p;

public final /* synthetic */ class o implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p.g f23923a;

    public /* synthetic */ o(p.g gVar) {
        this.f23923a = gVar;
    }

    public final int compare(Object obj, Object obj2) {
        p.g gVar = this.f23923a;
        return gVar.c(obj2) - gVar.c(obj);
    }
}
