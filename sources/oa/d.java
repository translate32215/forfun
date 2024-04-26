package oa;

import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23654a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f23655b;

    public d(String str, Map<Class<?>, Object> map) {
        this.f23654a = str;
        this.f23655b = map;
    }

    public static d a(String str) {
        return new d(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f23654a.equals(dVar.f23654a) || !this.f23655b.equals(dVar.f23655b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f23655b.hashCode() + (this.f23654a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("FieldDescriptor{name=");
        a10.append(this.f23654a);
        a10.append(", properties=");
        a10.append(this.f23655b.values());
        a10.append("}");
        return a10.toString();
    }

    public d(String str, Map map, a aVar) {
        this.f23654a = str;
        this.f23655b = map;
    }
}
