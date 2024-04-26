package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.q;
import com.startapp.startappsdk.R;
import l9.c;
import o0.c0;

public class CheckableImageButton extends q implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f9311g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f9312d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9313e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9314f = true;

    public static class a extends u0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0097a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f9315c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public class C0097a implements Parcelable.ClassLoaderCreator<a> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new a[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f9315c ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9315c = parcel.readInt() != 1 ? false : true;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        c0.C(this, new c(this));
    }

    public boolean isChecked() {
        return this.f9312d;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f9312d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f9311g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f25915a);
        setChecked(aVar.f9315c);
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f9315c = this.f9312d;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f9313e != z10) {
            this.f9313e = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f9313e && this.f9312d != z10) {
            this.f9312d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f9314f = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f9314f) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f9312d);
    }
}
