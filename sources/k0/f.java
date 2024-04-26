package k0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f19868b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final i f19869a;

    /* compiled from: LocaleListCompat */
    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    static {
        a(new Locale[0]);
    }

    public f(i iVar) {
        this.f19869a = iVar;
    }

    public static f a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new f(new j(a.a(localeArr)));
        }
        return new f(new h(localeArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f19869a.equals(((f) obj).f19869a);
    }

    public int hashCode() {
        return this.f19869a.hashCode();
    }

    public String toString() {
        return this.f19869a.toString();
    }
}
