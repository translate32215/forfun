package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum ln implements x70 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7402a;

    /* access modifiers changed from: public */
    ln(int i10) {
        this.f7402a = i10;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f7402a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(ln.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(g());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }
}
