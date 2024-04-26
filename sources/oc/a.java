package oc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import f.i;
import sc.k;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23674a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23675b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f23676c;

    public /* synthetic */ a(Context context, k kVar) {
        this.f23675b = context;
        this.f23676c = kVar;
    }

    public /* synthetic */ a(i iVar, String str) {
        this.f23675b = iVar;
        this.f23676c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f23674a) {
            case 0:
                Context context = (Context) this.f23675b;
                k kVar = (k) this.f23676c;
                ud.k.f(context, "$context");
                ud.k.f(kVar, "$plr");
                String b10 = kVar.b();
                ud.k.f(b10, "url");
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(b10)));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                i iVar = (i) this.f23675b;
                String str = (String) this.f23676c;
                ud.k.f(iVar, "$activity");
                ud.k.f(str, "$packageName");
                try {
                    iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("market://details?id=", str))));
                    return;
                } catch (ActivityNotFoundException unused) {
                    iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("https://play.google.com/store/apps/details?id=", str))));
                    return;
                }
        }
    }
}
