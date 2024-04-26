package dev.pankaj.ytvclib.ui.dlna;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import pc.l;
import ud.k;
import wc.m;
import ze.e;

/* compiled from: DLNAService.kt */
public final class DLNAService extends Service {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f13432d = 0;

    /* renamed from: a  reason: collision with root package name */
    public e f13433a;

    /* renamed from: b  reason: collision with root package name */
    public m f13434b;

    /* renamed from: c  reason: collision with root package name */
    public a f13435c;

    /* compiled from: DLNAService.kt */
    public final class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            k.f(context, "c");
            k.f(intent, "intent");
            Bundle extras = intent.getExtras();
            k.c(extras);
            int i10 = extras.getInt("wifi_state");
            if (i10 == 1) {
                k.f("wifi disabled", "msg");
            } else if (i10 == 3) {
                k.f("wifi enable", "msg");
                DLNAService dLNAService = DLNAService.this;
                int i11 = DLNAService.f13432d;
                dLNAService.a();
            }
        }
    }

    public final void a() {
        m mVar = this.f13434b;
        if (mVar != null) {
            k.c(mVar);
            synchronized (mVar) {
                mVar.f27207d = 0;
            }
        } else {
            this.f13434b = new m(this.f13433a);
        }
        m mVar2 = this.f13434b;
        k.c(mVar2);
        if (mVar2.isAlive()) {
            m mVar3 = this.f13434b;
            k.c(mVar3);
            synchronized (mVar3.f27208e) {
                mVar3.f27208e.notifyAll();
            }
            return;
        }
        m mVar4 = this.f13434b;
        k.c(mVar4);
        mVar4.start();
    }

    public IBinder onBind(Intent intent) {
        k.f(intent, "intent");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f13433a = new e();
        l.g().f23983f = this.f13433a;
        this.f13434b = new m(this.f13433a);
        if (this.f13435c == null) {
            a aVar = new a();
            this.f13435c = aVar;
            registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        m mVar = this.f13434b;
        if (mVar != null) {
            k.c(mVar);
            mVar.f27205b = false;
            synchronized (mVar.f27208e) {
                mVar.f27208e.notifyAll();
            }
            e eVar = this.f13433a;
            k.c(eVar);
            eVar.k();
            this.f13434b = null;
            this.f13433a = null;
            k.f("stop dlna service", "msg");
        }
        a aVar = this.f13435c;
        if (aVar != null) {
            unregisterReceiver(aVar);
            this.f13435c = null;
        }
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        k.f(intent, "intent");
        a();
        return super.onStartCommand(intent, i10, i11);
    }
}
