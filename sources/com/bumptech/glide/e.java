package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f4918a;

    /* compiled from: GlideExperiments */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, Object> f4919a = new HashMap();
    }

    public e(a aVar) {
        this.f4918a = Collections.unmodifiableMap(new HashMap(aVar.f4919a));
    }
}
