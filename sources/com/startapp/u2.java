package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* compiled from: Sta */
public abstract class u2 implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public float f12643a;

    /* renamed from: b  reason: collision with root package name */
    public float f12644b;

    /* renamed from: c  reason: collision with root package name */
    public float f12645c = Float.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public float f12646d = -3.4028235E38f;

    /* renamed from: e  reason: collision with root package name */
    public long f12647e = 0;

    public u2() {
    }

    public String toString() {
        StringBuilder a10 = b1.a("Position: [");
        a10.append(this.f12643a);
        a10.append("], Velocity:[");
        a10.append(this.f12644b);
        a10.append("], MaxPos: [");
        a10.append(this.f12645c);
        a10.append("], mMinPos: [");
        a10.append(this.f12646d);
        a10.append("] LastTime:[");
        a10.append(this.f12647e);
        a10.append("]");
        return a10.toString();
    }

    public u2(Parcel parcel) {
        this.f12643a = parcel.readFloat();
        this.f12644b = parcel.readFloat();
        this.f12645c = parcel.readFloat();
        this.f12646d = parcel.readFloat();
        this.f12647e = AnimationUtils.currentAnimationTimeMillis();
    }
}
