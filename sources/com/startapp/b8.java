package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class b8 extends b {

    /* compiled from: Sta */
    public class a implements v7 {
        public a() {
        }

        public void a(Object obj) {
            b8.this.callback.a(b8.this, false);
        }
    }

    public b8(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        try {
            MetaData.c(this.context);
            MetaData.f12393k.f12396b = true;
            if (MetaData.f12393k.U()) {
                ComponentLocator.a(this.context).u().b();
                StartAppSDKInternal.a(true, (v7) new a());
                return;
            }
            this.callback.a(this, false);
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
