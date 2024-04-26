package cb;

import androidx.activity.e;
import javax.annotation.Nonnull;

/* compiled from: AutoValue_LibraryVersion */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final String f4367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4368b;

    public a(String str, String str2) {
        if (str != null) {
            this.f4367a = str;
            if (str2 != null) {
                this.f4368b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    public String a() {
        return this.f4367a;
    }

    @Nonnull
    public String b() {
        return this.f4368b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f4367a.equals(eVar.a()) || !this.f4368b.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4367a.hashCode() ^ 1000003) * 1000003) ^ this.f4368b.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("LibraryVersion{libraryName=");
        a10.append(this.f4367a);
        a10.append(", version=");
        return e.a(a10, this.f4368b, "}");
    }
}
