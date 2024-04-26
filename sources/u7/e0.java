package u7;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.k;
import s7.a;
import s7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f26098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f26099b;

    public e0(f0 f0Var, c0 c0Var) {
        this.f26099b = f0Var;
        this.f26098a = c0Var;
    }

    public final void run() {
        if (this.f26099b.f26100b) {
            a aVar = this.f26098a.f26095b;
            if (aVar.i()) {
                f0 f0Var = this.f26099b;
                d dVar = f0Var.f5748a;
                Activity a10 = f0Var.a();
                PendingIntent pendingIntent = aVar.f25001c;
                i.h(pendingIntent);
                int i10 = this.f26098a.f26094a;
                int i11 = GoogleApiActivity.f5736b;
                Intent intent = new Intent(a10, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                dVar.startActivityForResult(intent, 1);
                return;
            }
            f0 f0Var2 = this.f26099b;
            if (f0Var2.f26103e.b(f0Var2.a(), aVar.f25000b, (String) null) != null) {
                f0 f0Var3 = this.f26099b;
                d dVar2 = f0Var3.f26103e;
                Activity a11 = f0Var3.a();
                f0 f0Var4 = this.f26099b;
                dVar2.j(a11, f0Var4.f5748a, aVar.f25000b, f0Var4);
            } else if (aVar.f25000b == 18) {
                f0 f0Var5 = this.f26099b;
                d dVar3 = f0Var5.f26103e;
                Activity a12 = f0Var5.a();
                f0 f0Var6 = this.f26099b;
                dVar3.getClass();
                ProgressBar progressBar = new ProgressBar(a12, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(a12);
                builder.setView(progressBar);
                builder.setMessage(k.b(a12, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                dVar3.h(a12, create, "GooglePlayServicesUpdatingDialog", f0Var6);
                f0 f0Var7 = this.f26099b;
                d dVar4 = f0Var7.f26103e;
                Context applicationContext = f0Var7.a().getApplicationContext();
                d0 d0Var = new d0(this, create);
                dVar4.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                t tVar = new t(d0Var);
                applicationContext.registerReceiver(tVar, intentFilter);
                tVar.f26131a = applicationContext;
                if (!s7.i.c(applicationContext, "com.google.android.gms")) {
                    this.f26099b.i();
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    tVar.a();
                }
            } else {
                this.f26099b.h(aVar, this.f26098a.f26094a);
            }
        }
    }
}
