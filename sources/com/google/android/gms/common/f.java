package com.google.android.gms.common;

import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f5816d = new f(true, 3, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5817a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f5818b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f5819c;

    public f(boolean z10, int i10, @Nullable String str, @Nullable Throwable th) {
        this.f5817a = z10;
        this.f5818b = str;
        this.f5819c = th;
    }

    public static f b(String str) {
        return new f(false, 1, str, (Throwable) null);
    }

    public static f c(String str, Throwable th) {
        return new f(false, 1, str, th);
    }

    @Nullable
    public String a() {
        return this.f5818b;
    }
}
