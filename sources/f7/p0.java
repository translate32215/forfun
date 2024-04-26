package f7;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import e8.t;
import e8.ti0;

@TargetApi(18)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class p0 extends n0 {
    public boolean b(View view) {
        return super.b(view) || view.getWindowId() != null;
    }

    public final int n() {
        return 14;
    }

    public final long r() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.E1)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
