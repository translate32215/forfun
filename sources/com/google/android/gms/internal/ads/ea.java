package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum ea implements x70 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f6269a;

    /* access modifiers changed from: public */
    ea(int i10) {
        this.f6269a = i10;
    }

    public static ea a(int i10) {
        if (i10 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i10 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i10 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i10 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i10 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public final int g() {
        return this.f6269a;
    }

    public final String toString() {
        return "<" + ea.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6269a + " name=" + name() + '>';
    }
}
