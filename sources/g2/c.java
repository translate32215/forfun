package g2;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f18404a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f18405a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18406b;

        public a(Uri uri, boolean z10) {
            this.f18405a = uri;
            this.f18406b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f18406b != aVar.f18406b || !this.f18405a.equals(aVar.f18405a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f18405a.hashCode() * 31) + (this.f18406b ? 1 : 0);
        }
    }

    public int a() {
        return this.f18404a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f18404a.equals(((c) obj).f18404a);
    }

    public int hashCode() {
        return this.f18404a.hashCode();
    }
}
