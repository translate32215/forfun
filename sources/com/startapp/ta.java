package com.startapp;

import android.os.Build;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sta */
public class ta implements Iterator<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f12621a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable[] f12622b;

    /* renamed from: c  reason: collision with root package name */
    public int f12623c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12624d;

    public ta(Throwable th) {
        this.f12621a = th;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f12622b = new Throwable[0];
        }
    }

    /* renamed from: a */
    public Throwable next() {
        int i10;
        Throwable th = this.f12621a;
        boolean z10 = false;
        this.f12624d = false;
        if (th != null) {
            this.f12621a = th.getCause();
        } else {
            Throwable[] thArr = this.f12622b;
            if (thArr != null && (i10 = this.f12623c) < thArr.length) {
                if (i10 == 0) {
                    z10 = true;
                }
                this.f12624d = z10;
                this.f12623c = i10 + 1;
                th = thArr[i10];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f12622b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r2 = this;
            java.lang.Throwable r0 = r2.f12621a
            if (r0 != 0) goto L_0x0010
            java.lang.Throwable[] r0 = r2.f12622b
            if (r0 == 0) goto L_0x000e
            int r1 = r2.f12623c
            int r0 = r0.length
            if (r1 >= r0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.ta.hasNext():boolean");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
