package lf;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* compiled from: ParameterHandler */
public class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f21397a;

    public w(x xVar) {
        this.f21397a = xVar;
    }

    public void a(z zVar, @Nullable Object obj) throws IOException {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                this.f21397a.a(zVar, Array.get(obj, i10));
            }
        }
    }
}
