package t2;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.adcolony.sdk.g;
import com.adcolony.sdk.g0;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

public class s0 implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f25566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f25567b;

    public s0(g0 g0Var, JSONObject jSONObject, g gVar) {
        this.f25566a = jSONObject;
        this.f25567b = gVar;
    }

    public void onScanCompleted(String str, Uri uri) {
        j0.i("Screenshot saved to Gallery!", 0);
        r0.k(this.f25566a, "success", true);
        this.f25567b.a(this.f25566a).b();
    }
}
