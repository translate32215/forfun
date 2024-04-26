package u7;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import s.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class h0 extends Fragment implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f26106d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f26107a = Collections.synchronizedMap(new a());

    /* renamed from: b  reason: collision with root package name */
    public int f26108b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f26109c;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f26107a.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final Activity i() {
        return getActivity();
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback b10 : this.f26107a.values()) {
            b10.b(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26108b = 1;
        this.f26109c = bundle;
        for (Map.Entry entry : this.f26107a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f26108b = 5;
        for (LifecycleCallback lifecycleCallback : this.f26107a.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f26108b = 3;
        for (LifecycleCallback d10 : this.f26107a.values()) {
            d10.d();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f26107a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).e(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f26108b = 2;
        for (LifecycleCallback f10 : this.f26107a.values()) {
            f10.f();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f26108b = 4;
        for (LifecycleCallback g10 : this.f26107a.values()) {
            g10.g();
        }
    }
}
