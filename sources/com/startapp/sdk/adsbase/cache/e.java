package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.cache.h;
import java.util.Iterator;

/* compiled from: Sta */
public class e implements h.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f12268a;

    public e(d dVar) {
        this.f12268a = dVar;
    }

    public void a(h hVar) {
        synchronized (this.f12268a.f12251a) {
            Iterator<h> it = this.f12268a.f12251a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == hVar) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
