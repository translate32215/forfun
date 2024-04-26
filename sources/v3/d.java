package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.widget.x0;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.util.List;
import k3.e;
import m3.w;

/* compiled from: ResourceDrawableDecoder */
public class d implements f<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26374a;

    public d(Context context) {
        this.f26374a = context.getApplicationContext();
    }

    public /* bridge */ /* synthetic */ w a(Object obj, int i10, int i11, e eVar) throws IOException {
        return c((Uri) obj);
    }

    public boolean b(Object obj, e eVar) throws IOException {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public w c(Uri uri) {
        Context context;
        int i10;
        String authority = uri.getAuthority();
        if (authority.equals(this.f26374a.getPackageName())) {
            context = this.f26374a;
        } else {
            try {
                context = this.f26374a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (authority.contains(this.f26374a.getPackageName())) {
                    context = this.f26374a;
                } else {
                    throw new IllegalArgumentException(x0.a("Failed to obtain context or unrecognized Uri format for: ", uri), e10);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i10 = context.getResources().getIdentifier(str2, str, authority2);
            if (i10 == 0) {
                i10 = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i10 == 0) {
                throw new IllegalArgumentException(x0.a("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() == 1) {
            try {
                i10 = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(x0.a("Unrecognized Uri format: ", uri), e11);
            }
        } else {
            throw new IllegalArgumentException(x0.a("Unrecognized Uri format: ", uri));
        }
        Drawable a10 = a.a(this.f26374a, context, i10, (Resources.Theme) null);
        if (a10 != null) {
            return new c(a10);
        }
        return null;
    }
}
