package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum xq implements x70 {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f8574a;

    /* access modifiers changed from: public */
    xq(int i10) {
        this.f8574a = i10;
    }

    public final int g() {
        return this.f8574a;
    }

    public final String toString() {
        return "<" + xq.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8574a + " name=" + name() + '>';
    }
}
