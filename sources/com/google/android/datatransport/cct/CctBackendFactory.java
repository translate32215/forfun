package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;
import m4.b;
import p4.c;
import p4.h;

@Keep
public class CctBackendFactory implements c {
    public h create(d dVar) {
        return new b(dVar.a(), dVar.d(), dVar.c());
    }
}
