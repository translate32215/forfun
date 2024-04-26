package com.google.android.gms.internal.ads;

import e8.r70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum yp {
    DOUBLE_LIST_PACKED(35, r4, r8),
    SINT64_LIST_PACKED(48, r4, r12);
    

    /* renamed from: d  reason: collision with root package name */
    public static final yp[] f8616d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f8618a;

    /* access modifiers changed from: public */
    static {
        int i10;
        yp[] values = values();
        f8616d = new yp[values.length];
        for (yp ypVar : values) {
            f8616d[ypVar.f8618a] = ypVar;
        }
    }

    /* access modifiers changed from: public */
    yp(int i10, zp zpVar, bq bqVar) {
        this.f8618a = i10;
        int i11 = r70.f16247a[zpVar.ordinal()];
        if (i11 == 1) {
            bqVar.getClass();
        } else if (i11 == 2) {
            bqVar.getClass();
        }
        if (zpVar == zp.SCALAR) {
            int i12 = r70.f16248b[bqVar.ordinal()];
        }
    }
}
