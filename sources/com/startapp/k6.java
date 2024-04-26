package com.startapp;

import android.content.Context;
import android.hardware.SensorEvent;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class k6 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final BlockingDeque<SensorEvent> f10795a;

    /* renamed from: b  reason: collision with root package name */
    public final fb f10796b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicLong f10797c = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f10798d = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: e  reason: collision with root package name */
    public final AtomicLong f10799e = new AtomicLong(0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k6(String str, Context context, MotionMetadata motionMetadata, int i10, double d10, long j10) {
        super(str);
        fb fbVar = new fb(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f10796b = fbVar;
        fbVar.a(d10, j10);
        this.f10795a = new LinkedBlockingDeque(i10);
    }

    public void run() {
        while (true) {
            try {
                SensorEvent take = this.f10795a.take();
                if (take != null) {
                    fb fbVar = this.f10796b;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = take.timestamp;
                    float[] fArr = take.values;
                    fbVar.a(currentTimeMillis, j10, (double) fArr[0], (double) fArr[1], (double) fArr[2]);
                    this.f10797c.set(Double.doubleToRawLongBits(this.f10796b.f10397k.f12721i));
                    this.f10798d.set(Double.doubleToRawLongBits(this.f10796b.f10397k.f12719g));
                    this.f10799e.set(this.f10796b.f10397k.f12720h);
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                i4.a(th);
                return;
            }
        }
    }
}
