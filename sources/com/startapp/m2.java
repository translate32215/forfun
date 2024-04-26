package com.startapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: Sta */
public abstract class m2 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public volatile SQLiteDatabase f10864a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10865b = new Object();

    public m2(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
    }

    public SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase = this.f10864a;
        if (sQLiteDatabase == null) {
            synchronized (this.f10865b) {
                sQLiteDatabase = this.f10864a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f10864a = sQLiteDatabase;
                }
            }
        }
        return sQLiteDatabase;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
