package ke;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import le.c;
import o1.q;
import oe.d;

/* compiled from: Cookie */
public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f20749j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f20750k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f20751l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f20752m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f20753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20754b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20755c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20756d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20757e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20758f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f20759g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f20760h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f20761i;

    public j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20753a = str;
        this.f20754b = str2;
        this.f20755c = j10;
        this.f20756d = str3;
        this.f20757e = str4;
        this.f20758f = z10;
        this.f20759g = z11;
        this.f20761i = z12;
        this.f20760h = z13;
    }

    public static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static long b(String str, int i10, int i11) {
        int a10 = a(str, i10, i11, false);
        Matcher matcher = f20752m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (a10 < i11) {
            int a11 = a(str, a10 + 1, i11, true);
            matcher.region(a10, a11);
            if (i13 == -1 && matcher.usePattern(f20752m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 != -1 || !matcher.usePattern(f20751l).matches()) {
                if (i15 == -1) {
                    Pattern pattern = f20750k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f20749j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i14 = Integer.parseInt(matcher.group(1));
            }
            a10 = a(str, a11 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        } else if (i15 == -1) {
            throw new IllegalArgumentException();
        } else if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        } else if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        } else if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        } else if (i17 < 0 || i17 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f21274n);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f20753a.equals(this.f20753a) && jVar.f20754b.equals(this.f20754b) && jVar.f20756d.equals(this.f20756d) && jVar.f20757e.equals(this.f20757e) && jVar.f20755c == this.f20755c && jVar.f20758f == this.f20758f && jVar.f20759g == this.f20759g && jVar.f20760h == this.f20760h && jVar.f20761i == this.f20761i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int a10 = q.a(this.f20757e, q.a(this.f20756d, q.a(this.f20754b, q.a(this.f20753a, 527, 31), 31), 31), 31);
        long j10 = this.f20755c;
        return ((((((((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f20758f ^ true ? 1 : 0)) * 31) + (this.f20759g ^ true ? 1 : 0)) * 31) + (this.f20760h ^ true ? 1 : 0)) * 31) + (this.f20761i ^ true ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20753a);
        sb2.append('=');
        sb2.append(this.f20754b);
        if (this.f20760h) {
            if (this.f20755c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(d.f23696a.get().format(new Date(this.f20755c)));
            }
        }
        if (!this.f20761i) {
            sb2.append("; domain=");
            sb2.append(this.f20756d);
        }
        sb2.append("; path=");
        sb2.append(this.f20757e);
        if (this.f20758f) {
            sb2.append("; secure");
        }
        if (this.f20759g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
