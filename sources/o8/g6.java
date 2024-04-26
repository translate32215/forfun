package o8;

import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.q;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import k8.c2;
import k8.i2;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public abstract class g6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23224a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23225b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f23226c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f23227d;

    /* renamed from: e  reason: collision with root package name */
    public Long f23228e;

    /* renamed from: f  reason: collision with root package name */
    public Long f23229f;

    public g6(String str, int i10) {
        this.f23224a = str;
        this.f23225b = i10;
    }

    public static Boolean d(BigDecimal bigDecimal, c2 c2Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        if (c2Var != null) {
            if (c2Var.y()) {
                boolean z10 = true;
                if (c2Var.D() != 1) {
                    if (c2Var.D() == 5) {
                        if (!c2Var.C() || !c2Var.B()) {
                            return null;
                        }
                    } else if (!c2Var.z()) {
                        return null;
                    }
                    int D = c2Var.D();
                    if (c2Var.D() == 5) {
                        if (q.N(c2Var.w()) && q.N(c2Var.v())) {
                            try {
                                BigDecimal bigDecimal5 = new BigDecimal(c2Var.w());
                                bigDecimal3 = new BigDecimal(c2Var.v());
                                bigDecimal2 = bigDecimal5;
                                bigDecimal4 = null;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        return null;
                    } else if (!q.N(c2Var.u())) {
                        return null;
                    } else {
                        try {
                            bigDecimal4 = new BigDecimal(c2Var.u());
                            bigDecimal2 = null;
                            bigDecimal3 = null;
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    if (D == 5) {
                        if (bigDecimal2 == null) {
                            return null;
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    }
                    int i10 = D - 1;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4 || bigDecimal2 == null) {
                                    return null;
                                }
                                if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            } else if (bigDecimal4 == null) {
                                return null;
                            } else {
                                if (d10 != 0.0d) {
                                    if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                }
                                if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            }
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
            }
            return null;
        }
        throw new NullPointerException("null reference");
    }

    public static Boolean e(String str, i2 i2Var, h hVar) {
        String str2;
        List<String> list;
        if (i2Var == null) {
            throw new NullPointerException("null reference");
        } else if (str == null || !i2Var.A() || i2Var.B() == 1) {
            return null;
        } else {
            if (i2Var.B() == 7) {
                if (i2Var.s() == 0) {
                    return null;
                }
            } else if (!i2Var.z()) {
                return null;
            }
            int B = i2Var.B();
            boolean x10 = i2Var.x();
            if (x10 || B == 2 || B == 7) {
                str2 = i2Var.v();
            } else {
                str2 = i2Var.v().toUpperCase(Locale.ENGLISH);
            }
            if (i2Var.s() == 0) {
                list = null;
            } else {
                list = i2Var.w();
                if (!x10) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (String upperCase : list) {
                        arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
            }
            String str3 = B == 2 ? str2 : null;
            if (B == 7) {
                if (list == null || list.size() == 0) {
                    return null;
                }
            } else if (str2 == null) {
                return null;
            }
            if (!x10 && B != 2) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            switch (B - 1) {
                case 1:
                    if (str3 == null) {
                        return null;
                    }
                    try {
                        return Boolean.valueOf(Pattern.compile(str3, true != x10 ? 66 : 0).matcher(str).matches());
                    } catch (PatternSyntaxException unused) {
                        if (hVar == null) {
                            return null;
                        }
                        hVar.f8800i.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        return null;
                    }
                case 2:
                    return Boolean.valueOf(str.startsWith(str2));
                case 3:
                    return Boolean.valueOf(str.endsWith(str2));
                case 4:
                    return Boolean.valueOf(str.contains(str2));
                case 5:
                    return Boolean.valueOf(str.equals(str2));
                case 6:
                    if (list == null) {
                        return null;
                    }
                    return Boolean.valueOf(list.contains(str));
                default:
                    return null;
            }
        }
    }

    public static Boolean f(long j10, c2 c2Var) {
        try {
            return d(new BigDecimal(j10), c2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean g(String str, c2 c2Var) {
        if (!q.N(str)) {
            return null;
        }
        try {
            return d(new BigDecimal(str), c2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
