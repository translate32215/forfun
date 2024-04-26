package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum nb implements x70 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7568a;

    /* access modifiers changed from: public */
    nb(int i10) {
        this.f7568a = i10;
    }

    public final int g() {
        return this.f7568a;
    }

    public final String toString() {
        return "<" + nb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7568a + " name=" + name() + '>';
    }
}
