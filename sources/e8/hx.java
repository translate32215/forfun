package e8;

import android.os.Bundle;
import android.os.Debug;
import d7.l;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class hx implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f14950a = new hx();

    public final Object call() {
        Bundle bundle = new Bundle();
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16692z)).booleanValue()) {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", l.B.f13190g.f8588i.get());
        return new nw(bundle, 2);
    }
}
