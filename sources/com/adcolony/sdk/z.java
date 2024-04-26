package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import org.json.JSONObject;
import p.f;
import t2.f0;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public g f4827a;

    /* renamed from: b  reason: collision with root package name */
    public AlertDialog f4828b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4829c;

    public class a implements f0 {
        public a() {
        }

        public void a(g gVar) {
            if (!f.e() || !(f.f4478a instanceof Activity)) {
                f.a(0, 0, t2.b.a("Missing Activity reference, can't build AlertDialog."), true);
            } else if (gVar.f4485b.optBoolean("on_resume")) {
                z.this.f4827a = gVar;
            } else {
                z.this.a(gVar);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4831a;

        public b(g gVar) {
            this.f4831a = gVar;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            z.this.f4828b = null;
            dialogInterface.dismiss();
            JSONObject jSONObject = new JSONObject();
            r0.k(jSONObject, "positive", true);
            z.this.f4829c = false;
            this.f4831a.a(jSONObject).b();
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4833a;

        public c(g gVar) {
            this.f4833a = gVar;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            z.this.f4828b = null;
            dialogInterface.dismiss();
            JSONObject jSONObject = new JSONObject();
            r0.k(jSONObject, "positive", false);
            z.this.f4829c = false;
            this.f4833a.a(jSONObject).b();
        }
    }

    public class d implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4835a;

        public d(g gVar) {
            this.f4835a = gVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            z zVar = z.this;
            zVar.f4828b = null;
            zVar.f4829c = false;
            JSONObject jSONObject = new JSONObject();
            r0.k(jSONObject, "positive", false);
            this.f4835a.a(jSONObject).b();
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlertDialog.Builder f4837a;

        public e(AlertDialog.Builder builder) {
            this.f4837a = builder;
        }

        public void run() {
            z zVar = z.this;
            zVar.f4829c = true;
            zVar.f4828b = this.f4837a.show();
        }
    }

    public z() {
        f.c("Alert.show", new a());
    }

    @SuppressLint({"InlinedApi"})
    public final void a(g gVar) {
        Context context = f.f4478a;
        if (context != null) {
            AlertDialog.Builder builder = Build.VERSION.SDK_INT >= 21 ? new AlertDialog.Builder(context, 16974374) : new AlertDialog.Builder(context, 16974126);
            JSONObject jSONObject = gVar.f4485b;
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("positive");
            String optString4 = jSONObject.optString("negative");
            builder.setMessage(optString);
            builder.setTitle(optString2);
            builder.setPositiveButton(optString3, new b(gVar));
            if (!optString4.equals("")) {
                builder.setNegativeButton(optString4, new c(gVar));
            }
            builder.setOnCancelListener(new d(gVar));
            j0.h(new e(builder));
        }
    }
}
