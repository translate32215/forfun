package e8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xc extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public Activity f17463a;

    /* renamed from: b  reason: collision with root package name */
    public Context f17464b;

    /* renamed from: c  reason: collision with root package name */
    public Context f17465c;

    public xc(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.f17465c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17464b = applicationContext;
        this.f17463a = context instanceof Activity ? (Activity) context : null;
        this.f17465c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f17463a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f17464b.startActivity(intent);
    }
}
