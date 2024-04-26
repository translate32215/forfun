package lf;

import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: ParameterHandler */
public class v extends x<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f21396a;

    public v(x xVar) {
        this.f21396a = xVar;
    }

    public void a(z zVar, @Nullable Object obj) throws IOException {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a10 : iterable) {
                this.f21396a.a(zVar, a10);
            }
        }
    }
}
