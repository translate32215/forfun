package v6;

import android.util.SparseBooleanArray;

/* compiled from: MutableFlags */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f26497a = new SparseBooleanArray();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f26497a.equals(((t) obj).f26497a);
    }

    public int hashCode() {
        return this.f26497a.hashCode();
    }
}
