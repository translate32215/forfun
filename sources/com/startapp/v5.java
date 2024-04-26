package com.startapp;

import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.ads.list3d.List3DView;

/* compiled from: Sta */
public class v5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f12697a;

    public v5(List3DView list3DView) {
        this.f12697a = list3DView;
    }

    public void run() {
        int b10;
        List3DView list3DView = this.f12697a;
        if (list3DView.f11830b == 1 && (b10 = list3DView.b(list3DView.f11831c, list3DView.f11832d)) != -1) {
            List3DView list3DView2 = this.f12697a;
            View childAt = list3DView2.getChildAt(b10);
            int i10 = list3DView2.f11837i + b10;
            long itemId = list3DView2.f11829a.getItemId(i10);
            AdapterView.OnItemLongClickListener onItemLongClickListener = list3DView2.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                onItemLongClickListener.onItemLongClick(list3DView2, childAt, i10, itemId);
            }
        }
    }
}
