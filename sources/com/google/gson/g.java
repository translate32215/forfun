package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
public final class g extends j implements Iterable<j> {

    /* renamed from: a  reason: collision with root package name */
    public final List<j> f9832a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f9832a.equals(this.f9832a));
    }

    public int hashCode() {
        return this.f9832a.hashCode();
    }

    public Iterator<j> iterator() {
        return this.f9832a.iterator();
    }

    public void s(j jVar) {
        if (jVar == null) {
            jVar = l.f9992a;
        }
        this.f9832a.add(jVar);
    }
}
