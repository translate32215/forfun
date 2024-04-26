package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.a;
import ud.k;

/* compiled from: ActivityResultContracts.kt */
public final class c extends a<Intent, a> {
    public Intent a(Context context, Object obj) {
        Intent intent = (Intent) obj;
        k.f(context, "context");
        k.f(intent, "input");
        return intent;
    }

    public Object c(int i10, Intent intent) {
        return new a(i10, intent);
    }
}
