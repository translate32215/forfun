package ga;

import android.os.Bundle;
import android.text.TextUtils;
import ja.a;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ua.a;

/* compiled from: FirebaseABTesting */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final a<ja.a> f18611a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18612b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f18613c = null;

    public c(a aVar, String str) {
        this.f18611a = aVar;
        this.f18612b = str;
    }

    public final List<a.C0168a> a() {
        return this.f18611a.get().b(this.f18612b, "");
    }

    public final void b(Collection<a.C0168a> collection) {
        for (a.C0168a aVar : collection) {
            this.f18611a.get().clearConditionalUserProperty(aVar.f19682b, (String) null, (Bundle) null);
        }
    }

    public void c(List<Map<String, String>> list) throws a {
        String str;
        if (this.f18611a.get() != null) {
            ArrayList arrayList = new ArrayList();
            for (Map next : list) {
                String[] strArr = b.f18603g;
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : b.f18603g) {
                    if (!next.containsKey(str2)) {
                        arrayList2.add(str2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    try {
                        arrayList.add(new b((String) next.get("experimentId"), (String) next.get("variantId"), next.containsKey("triggerEvent") ? (String) next.get("triggerEvent") : "", b.f18604h.parse((String) next.get("experimentStartTime")), Long.parseLong((String) next.get("triggerTimeoutMillis")), Long.parseLong((String) next.get("timeToLiveMillis"))));
                    } catch (ParseException e10) {
                        throw new a("Could not process experiment: parsing experiment start time failed.", e10);
                    } catch (NumberFormatException e11) {
                        throw new a("Could not process experiment: one of the durations could not be converted into a long.", e11);
                    }
                } else {
                    throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList2}));
                }
            }
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(((b) it.next()).f18605a);
                }
                List<a.C0168a> a10 = a();
                HashSet hashSet2 = new HashSet();
                for (a.C0168a aVar : a10) {
                    hashSet2.add(aVar.f19682b);
                }
                ArrayList arrayList3 = new ArrayList();
                for (a.C0168a next2 : a10) {
                    if (!hashSet.contains(next2.f19682b)) {
                        arrayList3.add(next2);
                    }
                }
                b(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    if (!hashSet2.contains(bVar.f18605a)) {
                        arrayList4.add(bVar);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(a());
                if (this.f18613c == null) {
                    this.f18613c = Integer.valueOf(this.f18611a.get().e(this.f18612b));
                }
                int intValue = this.f18613c.intValue();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    b bVar2 = (b) it3.next();
                    while (true) {
                        str = null;
                        if (arrayDeque.size() < intValue) {
                            break;
                        }
                        this.f18611a.get().clearConditionalUserProperty(((a.C0168a) arrayDeque.pollFirst()).f19682b, (String) null, (Bundle) null);
                    }
                    String str3 = this.f18612b;
                    bVar2.getClass();
                    a.C0168a aVar2 = new a.C0168a();
                    aVar2.f19681a = str3;
                    aVar2.f19693m = bVar2.f18608d.getTime();
                    aVar2.f19682b = bVar2.f18605a;
                    aVar2.f19683c = bVar2.f18606b;
                    if (!TextUtils.isEmpty(bVar2.f18607c)) {
                        str = bVar2.f18607c;
                    }
                    aVar2.f19684d = str;
                    aVar2.f19685e = bVar2.f18609e;
                    aVar2.f19690j = bVar2.f18610f;
                    this.f18611a.get().c(aVar2);
                    arrayDeque.offer(aVar2);
                }
            } else if (this.f18611a.get() != null) {
                b(a());
            } else {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
