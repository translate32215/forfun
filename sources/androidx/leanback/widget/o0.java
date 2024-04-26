package androidx.leanback.widget;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Parallax */
public abstract class o0<PropertyT extends Property> {

    /* renamed from: a  reason: collision with root package name */
    public final List<PropertyT> f2449a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PropertyT> f2450b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f2451c = new int[4];

    /* renamed from: d  reason: collision with root package name */
    public float[] f2452d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    public final List<p0> f2453e = new ArrayList(4);

    public o0() {
        ArrayList arrayList = new ArrayList();
        this.f2449a = arrayList;
        this.f2450b = Collections.unmodifiableList(arrayList);
    }
}
