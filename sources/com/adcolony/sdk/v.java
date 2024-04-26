package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class v {
    public static void a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception on insert to " + str + ", db version:");
            sb2.append(sQLiteDatabase.getVersion());
            sb2.append(". Values: " + contentValues.toString() + " caused: ");
            sb2.append(e10.toString());
            f.d().l().e(0, 1, sb2.toString(), true);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }
}
