package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum xb implements x70 {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f8531a;

    /* access modifiers changed from: public */
    xb(int i10) {
        this.f8531a = i10;
    }

    public final int g() {
        return this.f8531a;
    }

    public final String toString() {
        return "<" + xb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8531a + " name=" + name() + '>';
    }
}
