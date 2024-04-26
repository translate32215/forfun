package com.startapp.sdk.components;

import com.startapp.d3;
import com.startapp.sdk.components.ComponentLocator;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Sta */
public class i implements d3<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f12532a;

    public i(ComponentLocator.m mVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f12532a = threadPoolExecutor;
    }

    public Object call() {
        return Integer.valueOf(this.f12532a.getMaximumPoolSize() - this.f12532a.getActiveCount());
    }
}
