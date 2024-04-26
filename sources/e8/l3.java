package e8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l3 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15352a;

    /* renamed from: b  reason: collision with root package name */
    public final tm f15353b;

    /* renamed from: c  reason: collision with root package name */
    public final View f15354c;

    public l3(Context context, tm tmVar, View view) {
        this.f15352a = context;
        this.f15353b = tmVar;
        this.f15354c = view;
    }

    public static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static Intent c(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public final ResolveInfo b(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f15352a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }
}
