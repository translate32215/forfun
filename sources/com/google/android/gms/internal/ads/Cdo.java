package com.google.android.gms.internal.ads;

import e8.x70;

/* renamed from: com.google.android.gms.internal.ads.do  reason: invalid class name */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum Cdo implements x70 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f6231a;

    /* access modifiers changed from: public */
    Cdo(int i10) {
        this.f6231a = i10;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f6231a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(Cdo.class.getName());
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
