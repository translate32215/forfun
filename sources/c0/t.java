package c0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.c;
import d0.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class t implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Intent> f4012a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4013b;

    public t(Context context) {
        this.f4013b = context;
    }

    public t c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f4013b.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        this.f4012a.add(intent);
        return this;
    }

    public t f(ComponentName componentName) {
        int size = this.f4012a.size();
        try {
            Intent b10 = c.b(this.f4013b, componentName);
            while (b10 != null) {
                this.f4012a.add(size, b10);
                b10 = c.b(this.f4013b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void h() {
        if (!this.f4012a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f4012a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f4013b;
            Object obj = a.f12940a;
            a.C0126a.a(context, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4012a.iterator();
    }
}
