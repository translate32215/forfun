package com.google.android.gms.internal.ads;

import e8.lc0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public interface ys {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f8641a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    void b();

    int c();

    boolean d(int i10, int i11, int i12) throws lc0;

    int e();

    boolean f();

    void flush();

    void g();

    void h(ByteBuffer byteBuffer);

    ByteBuffer i();
}
