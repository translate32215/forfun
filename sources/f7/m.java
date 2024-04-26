package f7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f18302a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18303b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f18304c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f18305d;

    public m(Context context, String str, boolean z10, boolean z11) {
        this.f18302a = context;
        this.f18303b = str;
        this.f18304c = z10;
        this.f18305d = z11;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f18302a);
        builder.setMessage(this.f18303b);
        if (this.f18304c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f18305d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new l(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
