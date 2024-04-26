package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.i4;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.t;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdvertisingIdResolver f12458a;

    public a(AdvertisingIdResolver advertisingIdResolver) {
        this.f12458a = advertisingIdResolver;
    }

    public void run() {
        AdvertisingIdResolver advertisingIdResolver;
        AdvertisingIdResolver advertisingIdResolver2;
        AtomicReference<t> atomicReference;
        Context context;
        t tVar;
        try {
            this.f12458a.f12452d.lock();
            try {
                advertisingIdResolver2 = this.f12458a;
                atomicReference = advertisingIdResolver2.f12454f;
                context = advertisingIdResolver2.f12449a;
                tVar = AdvertisingIdResolver.a(context);
            } catch (AdvertisingIdResolver.InternalException e10) {
                advertisingIdResolver2.b(e10.infoEventFlags);
            } catch (Throwable th) {
                try {
                    if (this.f12458a.a(64)) {
                        i4.a(th);
                    }
                    advertisingIdResolver = this.f12458a;
                } catch (Throwable th2) {
                    this.f12458a.f12455g = 2;
                    this.f12458a.f12453e.signalAll();
                    this.f12458a.f12452d.unlock();
                    throw th2;
                }
            }
            atomicReference.set(tVar);
            advertisingIdResolver = this.f12458a;
            advertisingIdResolver.f12455g = 2;
            this.f12458a.f12453e.signalAll();
            this.f12458a.f12452d.unlock();
            try {
                tVar = AdvertisingIdResolver.b(context);
            } catch (AdvertisingIdResolver.InternalException e11) {
                advertisingIdResolver2.b(e11.infoEventFlags);
                tVar = t.f12590d;
                atomicReference.set(tVar);
                advertisingIdResolver = this.f12458a;
                advertisingIdResolver.f12455g = 2;
                this.f12458a.f12453e.signalAll();
                this.f12458a.f12452d.unlock();
            } catch (Throwable th3) {
                if (advertisingIdResolver2.a(256)) {
                    i4.a(th3);
                }
                tVar = t.f12590d;
                atomicReference.set(tVar);
                advertisingIdResolver = this.f12458a;
                advertisingIdResolver.f12455g = 2;
                this.f12458a.f12453e.signalAll();
                this.f12458a.f12452d.unlock();
            }
            atomicReference.set(tVar);
            advertisingIdResolver = this.f12458a;
            advertisingIdResolver.f12455g = 2;
            this.f12458a.f12453e.signalAll();
            this.f12458a.f12452d.unlock();
        } catch (Throwable th4) {
            this.f12458a.f12455g = 2;
            if (this.f12458a.a(16384)) {
                i4.a(th4);
            }
        }
    }
}
