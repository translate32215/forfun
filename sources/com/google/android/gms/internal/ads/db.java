package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class db implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f6198a = new db();

    public final boolean a(int i10) {
        ma.b bVar;
        switch (i10) {
            case 0:
                bVar = ma.b.DEBUGGER_STATE_UNSPECIFIED;
                break;
            case 1:
                bVar = ma.b.DEBUGGER_STATE_NOT_INSTALLED;
                break;
            case 2:
                bVar = ma.b.DEBUGGER_STATE_INSTALLED;
                break;
            case 3:
                bVar = ma.b.DEBUGGER_STATE_ACTIVE;
                break;
            case 4:
                bVar = ma.b.DEBUGGER_STATE_ENVVAR;
                break;
            case 5:
                bVar = ma.b.DEBUGGER_STATE_MACHPORT;
                break;
            case 6:
                bVar = ma.b.DEBUGGER_STATE_ENVVAR_MACHPORT;
                break;
            default:
                bVar = null;
                break;
        }
        return bVar != null;
    }
}
