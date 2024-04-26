package com.startapp;

import com.startapp.ee;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class ke implements ee.a {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f10806a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<ee> f10807b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public ee f10808c = null;

    public void a(ee eeVar) {
        eeVar.f10337a = this;
        this.f10807b.add(eeVar);
        if (this.f10808c == null) {
            ee poll = this.f10807b.poll();
            this.f10808c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f10806a, new Object[0]);
            }
        }
    }
}
