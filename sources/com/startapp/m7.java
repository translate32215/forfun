package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public final class m7 extends b {

    /* compiled from: Sta */
    public class a implements NetworkTester.b {
        public a() {
        }

        public void a(boolean z10) {
            m7.this.callback.a(m7.this, z10);
        }
    }

    public m7(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        NetworkTester.runTests(this.context, new a());
    }
}
