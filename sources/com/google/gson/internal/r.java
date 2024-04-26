package com.google.gson.internal;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber */
public final class r extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f9960a;

    public r(String str) {
        this.f9960a = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f9960a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        String str = this.f9960a;
        String str2 = ((r) obj).f9960a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.f9960a);
    }

    public int hashCode() {
        return this.f9960a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f9960a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f9960a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f9960a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f9960a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f9960a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.r.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f9960a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f9960a).longValue();
        }
    }

    public String toString() {
        return this.f9960a;
    }
}
