package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum mb implements x70 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7473a;

    /* access modifiers changed from: public */
    mb(int i10) {
        this.f7473a = i10;
    }

    public final int g() {
        return this.f7473a;
    }

    public final String toString() {
        return "<" + mb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7473a + " name=" + name() + '>';
    }
}
