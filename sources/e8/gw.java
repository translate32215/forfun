package e8;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14827a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14828b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14829c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Parcelable> f14830d;

    public gw(Context context, li0 li0, List list) {
        this.f14827a = 0;
        this.f14828b = context;
        this.f14829c = li0;
        this.f14830d = list;
    }

    public final void a(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        switch (this.f14827a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) y0.f17543a.b()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    p pVar = l.B.f13186c;
                    String str = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f14828b).getSystemService("activity");
                        if (activityManager != null) {
                            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                            if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                                str = componentName.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", str);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("width", ((li0) this.f14829c).f15398e);
                    bundle3.putInt("height", ((li0) this.f14829c).f15395b);
                    bundle2.putBundle("size", bundle3);
                    if (this.f14830d.size() > 0) {
                        List list = this.f14830d;
                        bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            default:
                Bundle bundle4 = (Bundle) obj;
                bundle4.putString("consent_string", (String) this.f14828b);
                bundle4.putString("fc_consent", (String) this.f14829c);
                bundle4.putBundle("iab_consent_info", (Bundle) this.f14830d);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.Bundle, java.util.List<android.os.Parcelable>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gw(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, o.a r4) {
        /*
            r0 = this;
            r4 = 1
            r0.f14827a = r4
            r0.f14827a = r4
            r0.<init>()
            r0.f14828b = r1
            r0.f14829c = r2
            r0.f14830d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gw.<init>(java.lang.String, java.lang.String, android.os.Bundle, o.a):void");
    }
}
