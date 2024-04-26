package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class ib extends b {
    public ib(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        jb b10 = ComponentLocator.a(this.context).f12470l.b();
        b.a aVar = this.callback;
        if (aVar != null) {
            b10.f10725e.post(new kb(b10, aVar, this));
        } else {
            b10.f10725e.post(b10.f10730j);
        }
    }
}
