package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum js implements x70 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(999);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7173a;

    /* access modifiers changed from: public */
    js(int i10) {
        this.f7173a = i10;
    }

    public final int g() {
        return this.f7173a;
    }

    public final String toString() {
        return "<" + js.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7173a + " name=" + name() + '>';
    }
}
