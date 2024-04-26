package k0;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper */
public final class h implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final Locale[] f19870b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f19871a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i10 = f.f19868b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f19871a = f19870b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < localeArr.length) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
                i10++;
            } else {
                throw new NullPointerException(g.a("list[", i10, "] is null"));
            }
        }
        this.f19871a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f19871a;
        if (this.f19871a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f19871a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f19871a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale hashCode : this.f19871a) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f19871a;
            if (i10 < localeArr.length) {
                a10.append(localeArr[i10]);
                if (i10 < this.f19871a.length - 1) {
                    a10.append(',');
                }
                i10++;
            } else {
                a10.append("]");
                return a10.toString();
            }
        }
    }
}
