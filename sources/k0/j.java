package k0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f19872a;

    public j(Object obj) {
        this.f19872a = (LocaleList) obj;
    }

    public Object a() {
        return this.f19872a;
    }

    public boolean equals(Object obj) {
        return this.f19872a.equals(((i) obj).a());
    }

    public Locale get(int i10) {
        return this.f19872a.get(i10);
    }

    public int hashCode() {
        return this.f19872a.hashCode();
    }

    public String toString() {
        return this.f19872a.toString();
    }
}
