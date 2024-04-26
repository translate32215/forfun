package com.google.gson;

import com.google.gson.internal.s;
import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject */
public final class m extends j {

    /* renamed from: a  reason: collision with root package name */
    public final s<String, j> f9993a = new s<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f9993a.equals(this.f9993a));
    }

    public int hashCode() {
        return this.f9993a.hashCode();
    }

    public void s(String str, V v10) {
        if (v10 == null) {
            v10 = l.f9992a;
        }
        s<String, j> sVar = this.f9993a;
        if (str != null) {
            s.e<String, j> a10 = sVar.a(str, true);
            V v11 = a10.f9981g;
            a10.f9981g = v10;
            return;
        }
        throw new NullPointerException("key == null");
    }

    public Set<Map.Entry<String, j>> x() {
        return this.f9993a.entrySet();
    }
}
