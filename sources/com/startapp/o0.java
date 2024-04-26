package com.startapp;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: Sta */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f11486a;

    /* renamed from: b  reason: collision with root package name */
    public String f11487b;

    public o0(Context context, AttributeSet attributeSet) {
        this.f11486a = context;
        this.f11487b = a(attributeSet, "adTag");
    }

    public final String a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue((String) null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f11486a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue((String) null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
