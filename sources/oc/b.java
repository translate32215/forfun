package oc;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import sc.f;
import td.l;
import ud.k;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f23677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f23678b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f23679c;

    public /* synthetic */ b(Activity activity, f fVar, l lVar) {
        this.f23677a = activity;
        this.f23678b = fVar;
        this.f23679c = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        Activity activity = this.f23677a;
        f fVar = this.f23678b;
        l lVar = this.f23679c;
        k.f(activity, "$activity");
        k.f(fVar, "$config");
        k.f(lVar, "$proceed");
        String a10 = fVar.b().a();
        k.f(activity, "context");
        k.f(a10, "url");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        lVar.c(Boolean.FALSE);
    }
}
