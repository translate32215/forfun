package com.google.android.gms.internal.ads;

import e8.bc0;
import e8.ec0;
import e8.oe0;
import e8.rb0;
import e8.zf0;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public interface ws extends ts {
    void c(int i10);

    void e();

    boolean f();

    int g();

    int getState();

    boolean h();

    void i(long j10) throws rb0;

    boolean isReady();

    void j();

    ss k();

    void l(long j10, long j11) throws rb0;

    zf0 n();

    boolean o();

    void p(ec0 ec0, bc0[] bc0Arr, oe0 oe0, long j10, boolean z10, long j11) throws rb0;

    oe0 q();

    void r() throws IOException;

    void s(bc0[] bc0Arr, oe0 oe0, long j10) throws rb0;

    void start() throws rb0;

    void stop() throws rb0;
}
