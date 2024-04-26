package e8;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import b8.c;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.d;
import com.google.android.gms.internal.ads.t7;
import com.startapp.startappsdk.R;
import d7.l;
import f7.y;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f6 extends gf0 {

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f14536d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f14537e;

    public f6(t7 t7Var, Map<String, String> map) {
        super(t7Var, "storePicture");
        this.f14536d = map;
        this.f14537e = t7Var.b();
    }

    public final void u() {
        Context context = this.f14537e;
        if (context == null) {
            s("Activity context is not available");
            return;
        }
        p pVar = l.B.f13186c;
        boolean z10 = false;
        if (!(((Boolean) y.a(context, new d())).booleanValue() && c.a(context).f3657a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            s("Feature is not supported by the device.");
            return;
        }
        String str = this.f14536d.get("iurl");
        if (TextUtils.isEmpty(str)) {
            s("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            s(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            p pVar2 = l.B.f13186c;
            if (!TextUtils.isEmpty(lastPathSegment)) {
                z10 = lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
            }
            if (!z10) {
                String valueOf2 = String.valueOf(lastPathSegment);
                s(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources a10 = l.B.f13190g.a();
            p pVar3 = l.B.f13186c;
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f14537e);
            builder.setTitle(a10 != null ? a10.getString(R.string.f28875s1) : "Save image");
            builder.setMessage(a10 != null ? a10.getString(R.string.f28876s2) : "Allow Ad to store image in Picture gallery?");
            builder.setPositiveButton(a10 != null ? a10.getString(R.string.f28877s3) : "Accept", new e6(this, str, lastPathSegment));
            builder.setNegativeButton(a10 != null ? a10.getString(R.string.f28878s4) : "Decline", new g6(this));
            builder.create().show();
        }
    }
}
