package com.startapp.sdk.adsbase.adrules;

import com.startapp.d;
import com.startapp.nb;
import java.io.Serializable;
import java.util.List;

@nb(decider = "type", packageName = "com.startapp.sdk.adsbase.adrules")
/* compiled from: Sta */
public abstract class AdRule implements Serializable {
    private static final long serialVersionUID = 7934302502238649788L;

    /* renamed from: a  reason: collision with root package name */
    public transient boolean f12224a;

    public abstract boolean a(List<d> list);
}
