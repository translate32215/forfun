package u7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.p;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import s.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i0 extends p implements d {

    /* renamed from: q0  reason: collision with root package name */
    public static final WeakHashMap f26110q0 = new WeakHashMap();

    /* renamed from: n0  reason: collision with root package name */
    public final Map f26111n0 = Collections.synchronizedMap(new a());

    /* renamed from: o0  reason: collision with root package name */
    public int f26112o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public Bundle f26113p0;

    public final void M(int i10, int i11, Intent intent) {
        super.M(i10, i11, intent);
        for (LifecycleCallback b10 : this.f26111n0.values()) {
            b10.b(i10, i11, intent);
        }
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        this.f26112o0 = 1;
        this.f26113p0 = bundle;
        for (Map.Entry entry : this.f26111n0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void Q() {
        this.O = true;
        this.f26112o0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f26111n0.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void Z() {
        this.O = true;
        this.f26112o0 = 3;
        for (LifecycleCallback d10 : this.f26111n0.values()) {
            d10.d();
        }
    }

    public final void a0(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.f26111n0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).e(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void b0() {
        this.O = true;
        this.f26112o0 = 2;
        for (LifecycleCallback f10 : this.f26111n0.values()) {
            f10.f();
        }
    }

    public final void c0() {
        this.O = true;
        this.f26112o0 = 4;
        for (LifecycleCallback g10 : this.f26111n0.values()) {
            g10.g();
        }
    }

    public final /* synthetic */ Activity i() {
        return o();
    }

    public final void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.m(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f26111n0.values()) {
            lifecycleCallback.getClass();
        }
    }
}
