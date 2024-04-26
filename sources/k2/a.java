package k2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import g2.e;

/* compiled from: SystemJobInfoConverter */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f19879b = e.e("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f19880a;

    public a(Context context) {
        this.f19880a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
