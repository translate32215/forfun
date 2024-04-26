package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: Sta */
public class t2 {

    /* renamed from: c  reason: collision with root package name */
    private static final String f12603c = "t2";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object f12604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public InetAddress f12605b;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12606a;

        public a(String str) {
            this.f12606a = str;
        }

        public void run() {
            try {
                InetAddress byName = InetAddress.getByName(this.f12606a);
                synchronized (t2.this.f12604a) {
                    InetAddress unused = t2.this.f12605b = byName;
                }
            } catch (Throwable th) {
                x2.a(th);
            }
        }
    }

    public String a(String str, int i10) throws UnknownHostException {
        String hostAddress;
        this.f12604a = new Object();
        Thread thread = new Thread(new a(str));
        thread.start();
        try {
            thread.join((long) i10);
        } catch (Throwable th) {
            x2.a(th);
        }
        synchronized (this.f12604a) {
            InetAddress inetAddress = this.f12605b;
            if (inetAddress != null) {
                hostAddress = inetAddress.getHostAddress();
            } else {
                throw new UnknownHostException();
            }
        }
        return hostAddress;
    }
}
