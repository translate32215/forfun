package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: BackendResponse */
public abstract class c {

    /* compiled from: BackendResponse */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static c a() {
        return new a(a.FATAL_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}
