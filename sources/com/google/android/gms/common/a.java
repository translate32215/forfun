package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5734a = false;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue f5735b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        i.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f5734a) {
            this.f5734a = true;
            IBinder iBinder = (IBinder) this.f5735b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5735b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
