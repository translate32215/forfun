package com.google.gson;

import com.google.gson.internal.a;
import com.google.gson.internal.r;
import java.math.BigInteger;

/* compiled from: JsonPrimitive */
public final class o extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f9994b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f9995a;

    public o(Boolean bool) {
        C(bool);
    }

    public static boolean A(o oVar) {
        Object obj = oVar.f9995a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        return this.f9995a instanceof Number;
    }

    public void C(Object obj) {
        boolean z10;
        if (obj instanceof Character) {
            this.f9995a = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z11 = true;
        if (!(obj instanceof Number)) {
            if (!(obj instanceof String)) {
                Class<?> cls = obj.getClass();
                Class<?>[] clsArr = f9994b;
                int length = clsArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    } else if (clsArr[i10].isAssignableFrom(cls)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                z11 = false;
            }
        }
        a.a(z11);
        this.f9995a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f9995a == null) {
            if (oVar.f9995a == null) {
                return true;
            }
            return false;
        } else if (!A(this) || !A(oVar)) {
            Object obj2 = this.f9995a;
            if (!(obj2 instanceof Number) || !(oVar.f9995a instanceof Number)) {
                return obj2.equals(oVar.f9995a);
            }
            double doubleValue = x().doubleValue();
            double doubleValue2 = oVar.x().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (x().longValue() == oVar.x().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f9995a == null) {
            return 31;
        }
        if (A(this)) {
            doubleToLongBits = x().longValue();
        } else {
            Object obj = this.f9995a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(x().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean s() {
        Object obj = this.f9995a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(y());
    }

    public Number x() {
        Object obj = this.f9995a;
        return obj instanceof String ? new r((String) obj) : (Number) obj;
    }

    public String y() {
        Object obj = this.f9995a;
        if (obj instanceof Number) {
            return x().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public boolean z() {
        return this.f9995a instanceof Boolean;
    }

    public o(Number number) {
        C(number);
    }

    public o(String str) {
        C(str);
    }
}
