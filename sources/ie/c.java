package ie;

import android.support.v4.media.a;
import de.y;
import md.f;

/* compiled from: Scopes.kt */
public final class c implements y {

    /* renamed from: a  reason: collision with root package name */
    public final f f19365a;

    public c(f fVar) {
        this.f19365a = fVar;
    }

    public f i() {
        return this.f19365a;
    }

    public String toString() {
        StringBuilder a10 = a.a("CoroutineScope(coroutineContext=");
        a10.append(this.f19365a);
        a10.append(')');
        return a10.toString();
    }
}
