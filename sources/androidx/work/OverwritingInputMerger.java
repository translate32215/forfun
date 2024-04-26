package androidx.work;

import androidx.work.b;
import g2.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends d {
    public b a(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(bVar.f3240a));
        }
        aVar.b(hashMap);
        return aVar.a();
    }
}
