package k8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public final Double f20230a;

    public h(Double d10) {
        if (d10 == null) {
            this.f20230a = Double.valueOf(Double.NaN);
        } else {
            this.f20230a = d10;
        }
    }

    public final Double a() {
        return this.f20230a;
    }

    public final Iterator<o> c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f20230a.equals(((h) obj).f20230a);
    }

    public final o f() {
        return new h(this.f20230a);
    }

    public final int hashCode() {
        return this.f20230a.hashCode();
    }

    public final Boolean j() {
        boolean z10 = false;
        if (!Double.isNaN(this.f20230a.doubleValue()) && this.f20230a.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final String q() {
        int i10;
        if (Double.isNaN(this.f20230a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f20230a.doubleValue())) {
            return this.f20230a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f20230a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i10 = stripTrailingZeros.precision();
        } else {
            i10 = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i10 - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    public final o s(String str, g gVar, List<o> list) {
        if ("toString".equals(str)) {
            return new r(q());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{q(), str}));
    }

    public final String toString() {
        return q();
    }
}
