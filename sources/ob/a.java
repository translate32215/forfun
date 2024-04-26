package ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import mb.h;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f23656c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<h> f23657a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<h> f23658b = new ArrayList<>();

    public Collection<h> a() {
        return Collections.unmodifiableCollection(this.f23657a);
    }

    public Collection<h> b() {
        return Collections.unmodifiableCollection(this.f23658b);
    }

    public boolean c() {
        return this.f23658b.size() > 0;
    }
}
