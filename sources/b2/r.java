package b2;

import android.support.v4.media.a;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import t.f;

/* compiled from: TransitionValues */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f3441a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f3442b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<j> f3443c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f3442b == rVar.f3442b && this.f3441a.equals(rVar.f3441a);
    }

    public int hashCode() {
        return this.f3441a.hashCode() + (this.f3442b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("TransitionValues@");
        a10.append(Integer.toHexString(hashCode()));
        a10.append(":\n");
        StringBuilder a11 = f.a(a10.toString(), "    view = ");
        a11.append(this.f3442b);
        a11.append("\n");
        String a12 = j.f.a(a11.toString(), "    values:");
        for (String next : this.f3441a.keySet()) {
            a12 = a12 + "    " + next + ": " + this.f3441a.get(next) + "\n";
        }
        return a12;
    }

    public r(View view) {
        this.f3442b = view;
    }
}
