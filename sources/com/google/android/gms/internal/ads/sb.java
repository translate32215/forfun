package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.iw;
import d7.l;
import e8.f9;
import e8.t20;
import e8.vs;
import f7.d0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sb {

    /* renamed from: a  reason: collision with root package name */
    public nv f8112a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8113b;

    /* renamed from: c  reason: collision with root package name */
    public vs f8114c;

    /* renamed from: d  reason: collision with root package name */
    public f9 f8115d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8116e;

    /* renamed from: f  reason: collision with root package name */
    public final t20 f8117f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f8118g = l.B.f13190g.f();

    public sb(Context context, f9 f9Var, nv nvVar, vs vsVar, String str, t20 t20) {
        this.f8113b = context;
        this.f8115d = f9Var;
        this.f8112a = nvVar;
        this.f8114c = vsVar;
        this.f8116e = str;
        this.f8117f = t20;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, ArrayList<iw.a> arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            iw.a aVar = arrayList.get(i10);
            i10++;
            iw.a aVar2 = aVar;
            if (aVar2.M() == yw.ENUM_TRUE && aVar2.y() > j10) {
                j10 = aVar2.y();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }
}
