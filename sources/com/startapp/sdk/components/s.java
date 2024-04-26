package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.c3;
import com.startapp.h4;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;

/* compiled from: Sta */
public class s implements c3<Context, List<String>, TrackingParams, h4> {
    public s(ComponentLocator.h0 h0Var) {
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new h4(context, list, trackingParams, new r(this));
    }
}
