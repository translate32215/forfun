package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Sta */
public class y9 extends u2 {
    public static final Parcelable.Creator<y9> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public float f12881f;

    /* renamed from: g  reason: collision with root package name */
    public float f12882g;

    /* compiled from: Sta */
    public class a implements Parcelable.Creator<y9> {
        public Object createFromParcel(Parcel parcel) {
            return new y9(parcel);
        }

        public Object[] newArray(int i10) {
            return new y9[i10];
        }
    }

    public y9(float f10, float f11) {
        this.f12881f = f10;
        this.f12882g = f11;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return super.toString() + ", Friction: [" + this.f12881f + "], Snap:[" + this.f12882g + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f12643a);
        parcel.writeFloat(this.f12644b);
        parcel.writeFloat(this.f12645c);
        parcel.writeFloat(this.f12646d);
        parcel.writeFloat(this.f12881f);
        parcel.writeFloat(this.f12882g);
    }

    public y9(Parcel parcel) {
        super(parcel);
        this.f12881f = parcel.readFloat();
        this.f12882g = parcel.readFloat();
    }
}
