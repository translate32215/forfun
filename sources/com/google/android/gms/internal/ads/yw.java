package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum yw implements x70 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f8664a;

    /* access modifiers changed from: public */
    yw(int i10) {
        this.f8664a = i10;
    }

    public static yw a(int i10) {
        if (i10 == 0) {
            return ENUM_FALSE;
        }
        if (i10 == 1) {
            return ENUM_TRUE;
        }
        if (i10 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public final int g() {
        return this.f8664a;
    }

    public final String toString() {
        return "<" + yw.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8664a + " name=" + name() + '>';
    }
}
