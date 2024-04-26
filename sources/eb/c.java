package eb;

import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import s8.h;
import s8.i;
import s8.l;

public final /* synthetic */ class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f17816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f17817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f17818c;

    public /* synthetic */ c(a aVar, boolean z10, b bVar) {
        this.f17816a = aVar;
        this.f17817b = z10;
        this.f17818c = bVar;
    }

    public final i f(Object obj) {
        a aVar = this.f17816a;
        boolean z10 = this.f17817b;
        b bVar = this.f17818c;
        Void voidR = (Void) obj;
        aVar.getClass();
        if (z10) {
            synchronized (aVar) {
                aVar.f9774c = l.e(bVar);
            }
        }
        return l.e(bVar);
    }
}
