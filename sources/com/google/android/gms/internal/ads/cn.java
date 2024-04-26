package com.google.android.gms.internal.ads;

import e8.x70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public enum cn implements x70 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f6133a;

    /* access modifiers changed from: public */
    cn(int i10) {
        this.f6133a = i10;
    }

    public static cn a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 != 4) {
            return null;
        }
        return SHA512;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f6133a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(cn.class.getName());
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
