package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import o0.c0;
import p9.c;
import q.a;
import s9.f;
import s9.i;

/* compiled from: CalendarItemStyle */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f9141a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f9142b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f9143c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f9144d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9145e;

    /* renamed from: f  reason: collision with root package name */
    public final i f9146f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, i iVar, Rect rect) {
        a.d(rect.left);
        a.d(rect.top);
        a.d(rect.right);
        a.d(rect.bottom);
        this.f9141a = rect;
        this.f9142b = colorStateList2;
        this.f9143c = colorStateList;
        this.f9144d = colorStateList3;
        this.f9145e = i10;
        this.f9146f = iVar;
    }

    public static b a(Context context, int i10) {
        a.c(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, t8.a.f25852s);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        i a13 = i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, a13, rect);
    }

    public void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        fVar.setShapeAppearanceModel(this.f9146f);
        fVar2.setShapeAppearanceModel(this.f9146f);
        fVar.r(this.f9143c);
        fVar.v((float) this.f9145e, this.f9144d);
        textView.setTextColor(this.f9142b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f9142b.withAlpha(30), fVar, fVar2) : fVar;
        Rect rect = this.f9141a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(textView, insetDrawable);
    }
}
