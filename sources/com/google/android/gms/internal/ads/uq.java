package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public enum uq {
    DOUBLE(vq.DOUBLE, 1),
    FLOAT(vq.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(vq.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(r11, 0),
    ENUM(vq.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a  reason: collision with root package name */
    public final vq f8273a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8274b;

    /* access modifiers changed from: public */
    uq(vq vqVar, int i10) {
        this.f8273a = vqVar;
        this.f8274b = i10;
    }

    /* access modifiers changed from: public */
    uq(vq vqVar, int i10, uc ucVar) {
        this.f8273a = vqVar;
        this.f8274b = i10;
    }
}
