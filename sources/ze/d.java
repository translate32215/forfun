package ze;

import java.util.Vector;

/* compiled from: ArgumentList */
public class d extends Vector {
    public c c(int i10) {
        return (c) get(i10);
    }

    public c f(String str) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            c c10 = c(i10);
            String a10 = c10.a();
            if (a10 != null && a10.equals(str)) {
                return c10;
            }
        }
        return null;
    }

    public void h(d dVar) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            c c10 = c(i10);
            if (c10.c()) {
                String a10 = c10.a();
                c f10 = dVar.f(a10);
                if (f10 != null) {
                    c10.e(f10.b());
                } else {
                    throw new IllegalArgumentException("Argument \"" + a10 + "\" missing.");
                }
            }
        }
    }

    public void j(d dVar) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            c c10 = c(i10);
            if (c10.d()) {
                String a10 = c10.a();
                c f10 = dVar.f(a10);
                if (f10 != null) {
                    c10.e(f10.b());
                } else {
                    throw new IllegalArgumentException("Argument \"" + a10 + "\" missing.");
                }
            }
        }
    }
}
