package e8;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.util.p;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e6 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f6 f14366c;

    public e6(f6 f6Var, String str, String str2) {
        this.f14366c = f6Var;
        this.f14364a = str;
        this.f14365b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        DownloadManager downloadManager = (DownloadManager) this.f14366c.f14537e.getSystemService("download");
        try {
            String str = this.f14364a;
            String str2 = this.f14365b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            p pVar = l.B.f13186c;
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f14366c.s("Could not store picture.");
        }
    }
}
