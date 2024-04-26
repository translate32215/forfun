package com.startapp;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import com.startapp.sdk.common.SDKException;

/* compiled from: Sta */
public class n7 {

    /* renamed from: a  reason: collision with root package name */
    public final g7 f10906a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10907b = wb.a();

    public n7(g7 g7Var) {
        this.f10906a = g7Var;
    }

    public void a(String str, String str2, SDKException sDKException) {
        int i10;
        String str3;
        long a10 = wb.a();
        g7 g7Var = this.f10906a;
        long j10 = a10 - this.f10907b;
        NetworkDiagnosticConfig a11 = g7Var.a();
        if (a11 != null) {
            if (sDKException == null) {
                str3 = "Success";
                i10 = 4;
            } else if (sDKException.getCause() != null) {
                StringBuilder a12 = b1.a("Failure: ");
                a12.append(sDKException.getCause().getClass().getName());
                str3 = a12.toString();
                i10 = 2;
            } else {
                StringBuilder a13 = b1.a("Error: ");
                a13.append(sDKException.a());
                str3 = a13.toString();
                i10 = 1;
            }
            if ((a11.d() & i10) != 0) {
                Uri b10 = sDKException != null ? sDKException.b() : null;
                if (b10 == null) {
                    b10 = Uri.parse(str2).buildUpon().query((String) null).build();
                }
                g7Var.f10454c.execute(new h7(g7Var, str + ' ' + b10, str3, j10));
            }
            if (i10 == 4) {
                g7Var.f10454c.execute(g7Var.f10456e);
            }
        }
    }
}
