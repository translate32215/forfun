package w4;

import android.util.SparseArray;
import androidx.appcompat.widget.d0;
import java.util.HashMap;
import l4.d;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<d> f27000a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f27001b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f27001b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f27001b.put(d.VERY_LOW, 1);
        f27001b.put(d.HIGHEST, 2);
        for (d next : f27001b.keySet()) {
            f27000a.append(f27001b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f27001b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f27000a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(d0.a("Unknown Priority for value ", i10));
    }
}
