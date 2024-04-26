package v6;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import v6.o;

public final /* synthetic */ class m implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26473a;

    public /* synthetic */ m(o oVar) {
        this.f26473a = oVar;
    }

    public final boolean handleMessage(Message message) {
        o oVar = this.f26473a;
        oVar.getClass();
        int i10 = message.what;
        if (i10 == 0) {
            Iterator<o.c<T, E>> it = oVar.f26482e.iterator();
            while (it.hasNext()) {
                o.c next = it.next();
                aa.m<E> mVar = oVar.f26480c;
                o.b<T, E> bVar = oVar.f26481d;
                if (!next.f26489d && next.f26488c) {
                    E e10 = next.f26487b;
                    next.f26487b = (t) mVar.get();
                    next.f26488c = false;
                    bVar.c(next.f26486a, e10);
                }
                if (((Handler) oVar.f26479b.f3445b).hasMessages(0)) {
                    break;
                }
            }
        } else if (i10 == 1) {
            oVar.b(message.arg1, (o.a) message.obj);
            oVar.a();
            oVar.c();
        }
        return true;
    }
}
