package mb;

import android.view.View;
import com.google.android.material.datepicker.c;
import e8.bt;

public abstract class a {
    public static a b(bt btVar, c cVar) {
        if (kb.a.f20579a.f20581a) {
            return new h(btVar, cVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, d dVar, String str);

    public abstract void c(View view);

    public abstract void d();
}
