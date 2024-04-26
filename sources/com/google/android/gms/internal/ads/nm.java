package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum nm implements x70 {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7597a;

    /* access modifiers changed from: public */
    nm(int i10) {
        this.f7597a = i10;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f7597a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(nm.class.getName());
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
