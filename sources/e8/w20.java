package e8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w20 {

    /* renamed from: a  reason: collision with root package name */
    public final b f17205a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<String>> f17206b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Long> f17207c = new HashMap();

    public w20(b bVar) {
        this.f17205a = bVar;
    }

    public final void a(String str, String str2) {
        if (!this.f17206b.containsKey(str)) {
            this.f17206b.put(str, new ArrayList());
        }
        this.f17206b.get(str).add(str2);
    }
}
