package com.google.android.gms.internal.ads;

import e8.ph0;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lv extends PushbackInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ph0 f7432a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lv(ph0 ph0, InputStream inputStream) {
        super(inputStream, 1);
        this.f7432a = ph0;
    }

    public final synchronized void close() throws IOException {
        kv.a(this.f7432a.f16006c);
        super.close();
    }
}
