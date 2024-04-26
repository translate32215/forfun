package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class u implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f5887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f5888b;

    public u(b bVar, int i10) {
        this.f5888b = bVar;
        this.f5887a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar;
        b bVar = this.f5888b;
        if (iBinder == null) {
            b.A(bVar, 16);
            return;
        }
        synchronized (bVar.f5829h) {
            b bVar2 = this.f5888b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                gVar = new p(iBinder);
            } else {
                gVar = (g) queryLocalInterface;
            }
            bVar2.f5830i = gVar;
        }
        b bVar3 = this.f5888b;
        int i10 = this.f5887a;
        Handler handler = bVar3.f5827f;
        handler.sendMessage(handler.obtainMessage(7, i10, -1, new w(bVar3, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f5888b.f5829h) {
            bVar = this.f5888b;
            bVar.f5830i = null;
        }
        Handler handler = bVar.f5827f;
        handler.sendMessage(handler.obtainMessage(6, this.f5887a, 1));
    }
}
