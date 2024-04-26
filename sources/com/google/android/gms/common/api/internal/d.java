package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class d implements a.C0082a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5778a;

    public d(b bVar) {
        this.f5778a = bVar;
    }

    public final void a(boolean z10) {
        Handler handler = this.f5778a.f5770v;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
