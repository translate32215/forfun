package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class s5 extends ArrayAdapter<w5> {

    /* renamed from: a  reason: collision with root package name */
    public String f11696a;

    /* renamed from: b  reason: collision with root package name */
    public String f11697b;

    public s5(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.f11696a = str;
        this.f11697b = str2;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        x5 x5Var;
        long j10;
        if (view == null) {
            x5Var = new x5(getContext());
            view2 = x5Var.f12790a;
        } else {
            view2 = view;
            x5Var = (x5) view.getTag();
        }
        w5 w5Var = (w5) getItem(i10);
        MetaDataStyle a10 = AdsCommonMetaData.f12098h.a(w5Var.f12759q);
        boolean z10 = true;
        if (x5Var.f12796g != a10) {
            x5Var.f12796g = a10;
            x5Var.f12790a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a10.e().intValue(), a10.d().intValue()}));
            x5Var.f12792c.setTextSize((float) a10.h().intValue());
            x5Var.f12792c.setTextColor(a10.f().intValue());
            qb.a(x5Var.f12792c, a10.g());
            x5Var.f12793d.setTextSize((float) a10.c().intValue());
            x5Var.f12793d.setTextColor(a10.a().intValue());
            qb.a(x5Var.f12793d, a10.b());
        }
        x5Var.f12792c.setText(w5Var.f12749g);
        x5Var.f12793d.setText(w5Var.f12750h);
        y5 a11 = z5.f12916b.a(this.f11697b);
        Bitmap a12 = a11.f12875a.a(i10, w5Var.f12743a, w5Var.f12751i);
        if (a12 == null) {
            x5Var.f12791b.setImageResource(17301651);
            x5Var.f12791b.setTag("tag_error");
        } else {
            x5Var.f12791b.setImageBitmap(a12);
            x5Var.f12791b.setTag("tag_ok");
        }
        x5Var.f12795f.setRating(w5Var.f12752j);
        if (w5Var.f12756n == null) {
            z10 = false;
        }
        x5Var.a(z10);
        y5 a13 = z5.f12916b.a(this.f11697b);
        Context context = getContext();
        String[] strArr = w5Var.f12745c;
        TrackingParams trackingParams = new TrackingParams(this.f11696a);
        Long l10 = w5Var.f12757o;
        if (l10 != null) {
            j10 = TimeUnit.SECONDS.toMillis(l10.longValue());
        } else {
            j10 = TimeUnit.SECONDS.toMillis(MetaData.f12393k.p());
        }
        long j11 = j10;
        g4 g4Var = a13.f12875a;
        String a14 = g4Var.a(strArr, a13.f12877c);
        if (!g4Var.f10427a.containsKey(a14)) {
            j9 j9Var = new j9(context, strArr, trackingParams, j11);
            g4Var.f10427a.put(a14, j9Var);
            j9Var.b();
        }
        return view2;
    }
}
