package o8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.fragment.app.a;
import c6.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.ra;
import k8.y2;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class j extends r5 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f23277f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f23278g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f23279h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f23280i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f23281j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f23282k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f23283l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f23284m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final i f23285d;

    /* renamed from: e  reason: collision with root package name */
    public final d f23286e = new d(this.f8864a.f8850n);

    public j(u5 u5Var) {
        super(u5Var);
        this.f8864a.getClass();
        this.f23285d = new i(this, this.f8864a.f8837a);
    }

    public static final void w(ContentValues contentValues, String str, Object obj) {
        i.e("value");
        if (obj == null) {
            throw new NullPointerException("null reference");
        } else if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX INFO: finally extract failed */
    public final long A(String str, String str2) {
        String str3 = str;
        i.e(str);
        i.e("first_open_count");
        h();
        i();
        SQLiteDatabase C = C();
        C.beginTransaction();
        long j10 = 0;
        try {
            long z10 = z("select first_open_count from app2 where app_id=?", new String[]{str3}, -1);
            if (z10 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (C.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f8864a.d().f8797f.c("Failed to insert column (got -1). appId", h.t(str), "first_open_count");
                    C.endTransaction();
                    return -1;
                }
                z10 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + z10));
                if (((long) C.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f8864a.d().f8797f.c("Failed to update column (got 0). appId", h.t(str), "first_open_count");
                    C.endTransaction();
                    return -1;
                }
                C.setTransactionSuccessful();
                C.endTransaction();
                return z10;
            } catch (SQLiteException e10) {
                e = e10;
                j10 = z10;
                try {
                    this.f8864a.d().f8797f.d("Error inserting column. appId", h.t(str), "first_open_count", e);
                    C.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    C.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            this.f8864a.d().f8797f.d("Error inserting column. appId", h.t(str), "first_open_count", e);
            C.endTransaction();
            return j10;
        }
    }

    public final long B(String str) {
        i.e(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final SQLiteDatabase C() {
        h();
        try {
            return this.f23285d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f8864a.d().f8800i.b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle D(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.C()     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002e }
            if (r2 != 0) goto L_0x0031
            com.google.android.gms.measurement.internal.l r8 = r7.f8864a     // Catch:{ SQLiteException -> 0x002e }
            com.google.android.gms.measurement.internal.h r8 = r8.d()     // Catch:{ SQLiteException -> 0x002e }
            o8.a3 r8 = r8.f8805n     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x002e:
            r8 = move-exception
            goto L_0x00bf
        L_0x0031:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x002e }
            k8.x2 r3 = k8.y2.w()     // Catch:{ IOException -> 0x00a5 }
            k8.f5 r2 = com.google.android.gms.measurement.internal.q.C(r3, r2)     // Catch:{ IOException -> 0x00a5 }
            k8.x2 r2 = (k8.x2) r2     // Catch:{ IOException -> 0x00a5 }
            k8.k6 r2 = r2.f()     // Catch:{ IOException -> 0x00a5 }
            k8.y2 r2 = (k8.y2) r2     // Catch:{ IOException -> 0x00a5 }
            o8.u5 r8 = r7.f23413b     // Catch:{ SQLiteException -> 0x002e }
            com.google.android.gms.measurement.internal.q r8 = r8.f23476g     // Catch:{ SQLiteException -> 0x002e }
            o8.u5.I(r8)     // Catch:{ SQLiteException -> 0x002e }
            java.util.List r8 = r2.A()     // Catch:{ SQLiteException -> 0x002e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x002e }
            r2.<init>()     // Catch:{ SQLiteException -> 0x002e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x002e }
        L_0x0059:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x002e }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x002e }
            k8.c3 r3 = (k8.c3) r3     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = r3.y()     // Catch:{ SQLiteException -> 0x002e }
            boolean r5 = r3.L()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0077
            double r5 = r3.s()     // Catch:{ SQLiteException -> 0x002e }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0077:
            boolean r5 = r3.M()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0085
            float r3 = r3.t()     // Catch:{ SQLiteException -> 0x002e }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0085:
            boolean r5 = r3.P()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0093
            java.lang.String r3 = r3.z()     // Catch:{ SQLiteException -> 0x002e }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0093:
            boolean r5 = r3.N()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0059
            long r5 = r3.v()     // Catch:{ SQLiteException -> 0x002e }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x00a1:
            r1.close()
            return r2
        L_0x00a5:
            r2 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a     // Catch:{ SQLiteException -> 0x002e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x002e }
            o8.a3 r3 = r3.f8797f     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ SQLiteException -> 0x002e }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x00bb:
            r8 = move-exception
            goto L_0x00d4
        L_0x00bd:
            r8 = move-exception
            r1 = r0
        L_0x00bf:
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x00d2 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00d1
            r1.close()
        L_0x00d1:
            return r0
        L_0x00d2:
            r8 = move-exception
            r0 = r1
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r0.close()
        L_0x00d9:
            goto L_0x00db
        L_0x00da:
            throw r8
        L_0x00db:
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.D(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0167 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0169 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0186 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0188 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01a5 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01a7 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01c4 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01c6 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01e6 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ea A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0212 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0214 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0231 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0233 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x024e A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0268 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0284 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0287 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0296 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02b7 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02d1 A[Catch:{ SQLiteException -> 0x02e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0308  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.x3 E(java.lang.String r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            com.google.android.gms.common.internal.i.e(r25)
            r24.h()
            r24.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r24.C()     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 28
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "app_instance_id"
            r12 = 0
            r6[r12] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "gmp_app_id"
            r13 = 1
            r6[r13] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "resettable_device_id_hash"
            r14 = 2
            r6[r14] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "last_bundle_index"
            r15 = 3
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r11 = 4
            r6[r11] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r6[r10] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r6[r9] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "app_store"
            r8 = 7
            r6[r8] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r6[r7] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "dev_cert_hash"
            r5 = 9
            r6[r5] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "measurement_enabled"
            r15 = 10
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "day"
            r15 = 11
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "daily_public_events_count"
            r15 = 12
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "daily_events_count"
            r15 = 13
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "daily_conversions_count"
            r15 = 14
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "config_fetched_time"
            r15 = 15
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 16
            java.lang.String r16 = "failed_config_fetch_time"
            r6[r0] = r16     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 18
            java.lang.String r17 = "firebase_instance_id"
            r6[r0] = r17     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 19
            java.lang.String r17 = "daily_error_events_count"
            r6[r0] = r17     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 20
            java.lang.String r17 = "daily_realtime_events_count"
            r6[r0] = r17     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 21
            java.lang.String r17 = "health_monitor_sample"
            r6[r0] = r17     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "android_id"
            r15 = 22
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 24
            java.lang.String r18 = "admob_app_id"
            r6[r0] = r18     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "dynamite_version"
            r15 = 25
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r0 = "safelisted_events"
            r15 = 26
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0 = 27
            java.lang.String r19 = "ga_app_id"
            r6[r0] = r19     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            r0[r12] = r2     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            java.lang.String r19 = "apps"
            java.lang.String r20 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r15 = 9
            r5 = r19
            r15 = 8
            r7 = r20
            r15 = 7
            r8 = r0
            r0 = 6
            r9 = r21
            r15 = 5
            r10 = r22
            r0 = 4
            r11 = r23
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02eb, all -> 0x02e9 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r5 != 0) goto L_0x00e5
            r4.close()
            return r3
        L_0x00e5:
            o8.x3 r5 = new o8.x3     // Catch:{ SQLiteException -> 0x02e3 }
            o8.u5 r6 = r1.f23413b     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r6 = r6.f23481l     // Catch:{ SQLiteException -> 0x02e3 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.f(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r6 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.p(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r6 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.x(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.u(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.v(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            long r6 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.t(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 6
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.h(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 7
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.g(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 8
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.q(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 9
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.k(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 10
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x014c
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r0 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r0 = 0
            goto L_0x014d
        L_0x014c:
            r0 = 1
        L_0x014d:
            r5.w(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 11
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.f23597w     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0169
            r8 = 1
            goto L_0x016a
        L_0x0169:
            r8 = 0
        L_0x016a:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.f23597w = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 12
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.f23598x     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0188
            r8 = 1
            goto L_0x0189
        L_0x0188:
            r8 = 0
        L_0x0189:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.f23598x = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 13
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.f23599y     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01a7
            r8 = 1
            goto L_0x01a8
        L_0x01a7:
            r8 = 0
        L_0x01a8:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.f23599y = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 14
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.f23600z     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01c6
            r8 = 1
            goto L_0x01c7
        L_0x01c6:
            r8 = 0
        L_0x01c7:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.f23600z = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 15
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.j(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 16
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.m(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 17
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x01ea
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x01ef
        L_0x01ea:
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x01ef:
            r5.i(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 18
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.n(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 19
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.A     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0214
            r8 = 1
            goto L_0x0215
        L_0x0214:
            r8 = 0
        L_0x0215:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.A = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 20
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r5.D     // Catch:{ SQLiteException -> 0x02e3 }
            long r8 = r5.B     // Catch:{ SQLiteException -> 0x02e3 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0233
            r8 = 1
            goto L_0x0234
        L_0x0233:
            r8 = 0
        L_0x0234:
            r0 = r0 | r8
            r5.D = r0     // Catch:{ SQLiteException -> 0x02e3 }
            r5.B = r6     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 21
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.s(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x02e3 }
            o8.f r0 = r0.f8843g     // Catch:{ SQLiteException -> 0x02e3 }
            o8.u2<java.lang.Boolean> r6 = o8.v2.f23524m0     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r0.v(r3, r6)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r0 != 0) goto L_0x0260
            r0 = 22
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x0259
            r6 = 0
            goto L_0x025d
        L_0x0259:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x025d:
            r5.e(r6)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x0260:
            r0 = 23
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x0270
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r0 == 0) goto L_0x026f
            goto L_0x0270
        L_0x026f:
            r13 = 0
        L_0x0270:
            r5.d(r13)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.c(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x0287
            r6 = 0
            goto L_0x028b
        L_0x0287:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x028b:
            r5.l(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x02a8
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x02e3 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.y(r0)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x02a8:
            k8.ra.b()     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x02e3 }
            o8.f r0 = r0.f8843g     // Catch:{ SQLiteException -> 0x02e3 }
            o8.u2<java.lang.Boolean> r6 = o8.v2.f23506d0     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r0.v(r2, r6)     // Catch:{ SQLiteException -> 0x02e3 }
            if (r0 == 0) goto L_0x02c0
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02e3 }
            r5.o(r0)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x02c0:
            com.google.android.gms.measurement.internal.l r0 = r5.f23575a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.h()     // Catch:{ SQLiteException -> 0x02e3 }
            r5.D = r12     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r0 == 0) goto L_0x02e5
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x02e3 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x02e3 }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r25)     // Catch:{ SQLiteException -> 0x02e3 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x02e3 }
            goto L_0x02e5
        L_0x02e3:
            r0 = move-exception
            goto L_0x02ed
        L_0x02e5:
            r4.close()
            return r5
        L_0x02e9:
            r0 = move-exception
            goto L_0x0306
        L_0x02eb:
            r0 = move-exception
            r4 = r3
        L_0x02ed:
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ all -> 0x0304 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x0304 }
            o8.a3 r5 = r5.f8797f     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.h.t(r25)     // Catch:{ all -> 0x0304 }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x0304 }
            if (r4 == 0) goto L_0x0303
            r4.close()
        L_0x0303:
            return r3
        L_0x0304:
            r0 = move-exception
            r3 = r4
        L_0x0306:
            if (r3 == 0) goto L_0x030b
            r3.close()
        L_0x030b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.E(java.lang.String):o8.x3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.b F(java.lang.String r34, java.lang.String r35) {
        /*
            r33 = this;
            r1 = r33
            r8 = r35
            com.google.android.gms.common.internal.i.e(r34)
            com.google.android.gms.common.internal.i.e(r35)
            r33.h()
            r33.i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r33.C()     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            r0 = 11
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "origin"
            r2 = 0
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "value"
            r3 = 1
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "active"
            r4 = 2
            r12[r4] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "trigger_event_name"
            r5 = 3
            r12[r5] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "trigger_timeout"
            r6 = 4
            r12[r6] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "timed_out_event"
            r7 = 5
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r12[r15] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r12[r14] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "time_to_live"
            r11 = 9
            r12[r11] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r0 = "expired_event"
            r7 = 10
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            r0[r2] = r34     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            r0[r3] = r8     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            java.lang.String r16 = "conditional_properties"
            java.lang.String r17 = "app_id=? and name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = 9
            r11 = r16
            r7 = 8
            r13 = r17
            r7 = 7
            r14 = r0
            r0 = 6
            r15 = r18
            r16 = r19
            r17 = r20
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x012a, all -> 0x0128 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0126 }
            if (r11 != 0) goto L_0x0082
            r10.close()
            return r9
        L_0x0082:
            java.lang.String r20 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x0126 }
            java.lang.Object r11 = r1.K(r10, r3)     // Catch:{ SQLiteException -> 0x0126 }
            int r4 = r10.getInt(r4)     // Catch:{ SQLiteException -> 0x0126 }
            if (r4 == 0) goto L_0x0093
            r24 = 1
            goto L_0x0095
        L_0x0093:
            r24 = 0
        L_0x0095:
            java.lang.String r25 = r10.getString(r5)     // Catch:{ SQLiteException -> 0x0126 }
            long r27 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5 r2 = r1.f23413b     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.q r2 = r2.f23476g     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5.I(r2)     // Catch:{ SQLiteException -> 0x0126 }
            r3 = 5
            byte[] r3 = r10.getBlob(r3)     // Catch:{ SQLiteException -> 0x0126 }
            android.os.Parcelable$Creator<o8.r> r4 = o8.r.CREATOR     // Catch:{ SQLiteException -> 0x0126 }
            android.os.Parcelable r2 = r2.z(r3, r4)     // Catch:{ SQLiteException -> 0x0126 }
            r26 = r2
            o8.r r26 = (o8.r) r26     // Catch:{ SQLiteException -> 0x0126 }
            long r12 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5 r0 = r1.f23413b     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.q r0 = r0.f23476g     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5.I(r0)     // Catch:{ SQLiteException -> 0x0126 }
            byte[] r2 = r10.getBlob(r7)     // Catch:{ SQLiteException -> 0x0126 }
            android.os.Parcelable r0 = r0.z(r2, r4)     // Catch:{ SQLiteException -> 0x0126 }
            r29 = r0
            o8.r r29 = (o8.r) r29     // Catch:{ SQLiteException -> 0x0126 }
            r0 = 8
            long r5 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0126 }
            r0 = 9
            long r30 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5 r0 = r1.f23413b     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.q r0 = r0.f23476g     // Catch:{ SQLiteException -> 0x0126 }
            o8.u5.I(r0)     // Catch:{ SQLiteException -> 0x0126 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0126 }
            android.os.Parcelable r0 = r0.z(r2, r4)     // Catch:{ SQLiteException -> 0x0126 }
            r32 = r0
            o8.r r32 = (o8.r) r32     // Catch:{ SQLiteException -> 0x0126 }
            o8.w5 r21 = new o8.w5     // Catch:{ SQLiteException -> 0x0126 }
            r2 = r21
            r3 = r35
            r4 = r5
            r6 = r11
            r7 = r20
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0126 }
            o8.b r0 = new o8.b     // Catch:{ SQLiteException -> 0x0126 }
            r18 = r0
            r19 = r34
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r32)     // Catch:{ SQLiteException -> 0x0126 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0126 }
            if (r2 == 0) goto L_0x0122
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ SQLiteException -> 0x0126 }
            o8.a3 r2 = r2.f8797f     // Catch:{ SQLiteException -> 0x0126 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r34)     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ SQLiteException -> 0x0126 }
            o8.x2 r5 = r5.f8849m     // Catch:{ SQLiteException -> 0x0126 }
            java.lang.String r5 = r5.f(r8)     // Catch:{ SQLiteException -> 0x0126 }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0126 }
        L_0x0122:
            r10.close()
            return r0
        L_0x0126:
            r0 = move-exception
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            goto L_0x014d
        L_0x012a:
            r0 = move-exception
            r10 = r9
        L_0x012c:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x014b }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r34)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ all -> 0x014b }
            o8.x2 r5 = r5.f8849m     // Catch:{ all -> 0x014b }
            java.lang.String r5 = r5.f(r8)     // Catch:{ all -> 0x014b }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r10 == 0) goto L_0x014a
            r10.close()
        L_0x014a:
            return r9
        L_0x014b:
            r0 = move-exception
            r9 = r10
        L_0x014d:
            if (r9 == 0) goto L_0x0152
            r9.close()
        L_0x0152:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.F(java.lang.String, java.lang.String):o8.b");
    }

    public final h G(long j10, String str, boolean z10, boolean z11) {
        return H(j10, str, 1, false, false, z10, false, z11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.h H(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r2 = "daily_error_events_count"
            java.lang.String r3 = "daily_conversions_count"
            java.lang.String r4 = "daily_public_events_count"
            java.lang.String r5 = "daily_events_count"
            java.lang.String r6 = "day"
            com.google.android.gms.common.internal.i.e(r25)
            r22.h()
            r22.i()
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
            r8[r9] = r25
            o8.h r10 = new o8.h
            r10.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r22.C()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r12 = 6
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r14[r9] = r6     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r14[r7] = r5     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r13 = 2
            r14[r13] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r12 = 3
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r11 = 4
            r14[r11] = r2     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r11 = 5
            r14[r11] = r0     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            r11[r9] = r25     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            java.lang.String r16 = "apps"
            java.lang.String r17 = "app_id=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r12 = r15
            r13 = r16
            r21 = r15
            r15 = r17
            r16 = r11
            r17 = r18
            r18 = r19
            r19 = r20
            android.database.Cursor r11 = r12.query(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0113 }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r12 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x0078 }
            o8.a3 r0 = r0.f8800i     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r25)     // Catch:{ SQLiteException -> 0x0078 }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
            r11.close()
            return r10
        L_0x0075:
            r0 = move-exception
            goto L_0x012f
        L_0x0078:
            r0 = move-exception
            goto L_0x0118
        L_0x007b:
            long r12 = r11.getLong(r9)     // Catch:{ SQLiteException -> 0x0078 }
            int r9 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x00a5
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r10.f23231b = r12     // Catch:{ SQLiteException -> 0x0078 }
            r7 = 2
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r10.f23230a = r12     // Catch:{ SQLiteException -> 0x0078 }
            r7 = 3
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r10.f23232c = r12     // Catch:{ SQLiteException -> 0x0078 }
            r7 = 4
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r10.f23233d = r12     // Catch:{ SQLiteException -> 0x0078 }
            r7 = 5
            long r12 = r11.getLong(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r10.f23234e = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00a5:
            if (r28 == 0) goto L_0x00ad
            long r12 = r10.f23231b     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r12 + r26
            r10.f23231b = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00ad:
            if (r29 == 0) goto L_0x00b5
            long r12 = r10.f23230a     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r12 + r26
            r10.f23230a = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00b5:
            if (r30 == 0) goto L_0x00bd
            long r12 = r10.f23232c     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r12 + r26
            r10.f23232c = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00bd:
            if (r31 == 0) goto L_0x00c5
            long r12 = r10.f23233d     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r12 + r26
            r10.f23233d = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00c5:
            if (r32 == 0) goto L_0x00cd
            long r12 = r10.f23234e     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r12 + r26
            r10.f23234e = r12     // Catch:{ SQLiteException -> 0x0078 }
        L_0x00cd:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0078 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r9 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r6, r9)     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r10.f23230a     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r4, r6)     // Catch:{ SQLiteException -> 0x0078 }
            long r12 = r10.f23231b     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r5, r4)     // Catch:{ SQLiteException -> 0x0078 }
            long r4 = r10.f23232c     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r3, r4)     // Catch:{ SQLiteException -> 0x0078 }
            long r3 = r10.f23233d     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
            long r2 = r10.f23234e     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r7.put(r0, r2)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r0 = "apps"
            java.lang.String r2 = "app_id=?"
            r3 = r21
            r3.update(r0, r7, r2, r8)     // Catch:{ SQLiteException -> 0x0078 }
            r11.close()
            return r10
        L_0x0113:
            r0 = move-exception
            r11 = 0
            goto L_0x012f
        L_0x0116:
            r0 = move-exception
            r11 = 0
        L_0x0118:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x0075 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0075 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r25)     // Catch:{ all -> 0x0075 }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x0075 }
            if (r11 == 0) goto L_0x012e
            r11.close()
        L_0x012e:
            return r10
        L_0x012f:
            if (r11 == 0) goto L_0x0134
            r11.close()
        L_0x0134:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.H(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):o8.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.n I(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r1 = r29
            r15 = r31
            com.google.android.gms.common.internal.i.e(r30)
            com.google.android.gms.common.internal.i.e(r31)
            r29.h()
            r29.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 9
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "lifetime_count"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "current_bundle_count"
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "last_fire_timestamp"
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "last_bundled_timestamp"
            r7 = 3
            r2[r7] = r3
            java.lang.String r3 = "last_bundled_day"
            r8 = 4
            r2[r8] = r3
            java.lang.String r3 = "last_sampled_complex_event_id"
            r9 = 5
            r2[r9] = r3
            java.lang.String r3 = "last_sampling_rate"
            r10 = 6
            r2[r10] = r3
            java.lang.String r3 = "last_exempt_from_sampling"
            r11 = 7
            r2[r11] = r3
            java.lang.String r3 = "current_session_count"
            r12 = 8
            r2[r12] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r20 = r29.C()     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            r22 = r0
            java.lang.String[] r22 = (java.lang.String[]) r22     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            r0[r4] = r30     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            r0[r5] = r15     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            java.lang.String r21 = "events"
            java.lang.String r23 = "app_id=? and name=?"
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r0
            android.database.Cursor r13 = r20.query(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x013f, all -> 0x013d }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r0 != 0) goto L_0x007b
            r13.close()
            return r19
        L_0x007b:
            long r16 = r13.getLong(r4)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            long r20 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            long r22 = r13.getLong(r6)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            boolean r0 = r13.isNull(r7)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r2 = 0
            if (r0 == 0) goto L_0x0092
            r24 = r2
            goto L_0x0098
        L_0x0092:
            long r6 = r13.getLong(r7)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r24 = r6
        L_0x0098:
            boolean r0 = r13.isNull(r8)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r0 == 0) goto L_0x00a1
            r0 = r19
            goto L_0x00a9
        L_0x00a1:
            long r6 = r13.getLong(r8)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
        L_0x00a9:
            boolean r6 = r13.isNull(r9)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r6 == 0) goto L_0x00b2
            r18 = r19
            goto L_0x00bc
        L_0x00b2:
            long r6 = r13.getLong(r9)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r18 = r6
        L_0x00bc:
            boolean r6 = r13.isNull(r10)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r6 == 0) goto L_0x00c5
            r26 = r19
            goto L_0x00cf
        L_0x00c5:
            long r6 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r26 = r6
        L_0x00cf:
            boolean r6 = r13.isNull(r11)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r6 != 0) goto L_0x00e7
            long r6 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r8 = 1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00e0
            r4 = 1
        L_0x00e0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r27 = r4
            goto L_0x00e9
        L_0x00e7:
            r27 = r19
        L_0x00e9:
            boolean r4 = r13.isNull(r12)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            if (r4 == 0) goto L_0x00f1
        L_0x00ef:
            r9 = r2
            goto L_0x00f6
        L_0x00f1:
            long r2 = r13.getLong(r12)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            goto L_0x00ef
        L_0x00f6:
            o8.n r28 = new o8.n     // Catch:{ SQLiteException -> 0x0137, all -> 0x0131 }
            r2 = r28
            r3 = r30
            r4 = r31
            r5 = r16
            r7 = r20
            r11 = r22
            r20 = r13
            r13 = r24
            r15 = r0
            r16 = r18
            r17 = r26
            r18 = r27
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            boolean r0 = r20.moveToNext()     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r30)     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x012f, all -> 0x012d }
        L_0x0129:
            r20.close()
            return r28
        L_0x012d:
            r0 = move-exception
            goto L_0x0134
        L_0x012f:
            r0 = move-exception
            goto L_0x013a
        L_0x0131:
            r0 = move-exception
            r20 = r13
        L_0x0134:
            r19 = r20
            goto L_0x0166
        L_0x0137:
            r0 = move-exception
            r20 = r13
        L_0x013a:
            r13 = r20
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            goto L_0x0166
        L_0x013f:
            r0 = move-exception
            r13 = r19
        L_0x0142:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x0163 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0163 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r30)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ all -> 0x0163 }
            o8.x2 r5 = r5.f8849m     // Catch:{ all -> 0x0163 }
            r6 = r31
            java.lang.String r5 = r5.d(r6)     // Catch:{ all -> 0x0163 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0163 }
            if (r13 == 0) goto L_0x0162
            r13.close()
        L_0x0162:
            return r19
        L_0x0163:
            r0 = move-exception
            r19 = r13
        L_0x0166:
            if (r19 == 0) goto L_0x016b
            r19.close()
        L_0x016b:
            goto L_0x016d
        L_0x016c:
            throw r0
        L_0x016d:
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.I(java.lang.String, java.lang.String):o8.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.y5 J(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.i.e(r20)
            com.google.android.gms.common.internal.i.e(r21)
            r19.h()
            r19.i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.C()     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = "set_timestamp"
            r2 = 0
            r13[r2] = r0     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = "value"
            r3 = 1
            r13[r3] = r0     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = "origin"
            r4 = 2
            r13[r4] = r0     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0081, all -> 0x007f }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r0 != 0) goto L_0x0045
            r11.close()
            return r10
        L_0x0045:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.K(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x0053
            r11.close()
            return r10
        L_0x0053:
            java.lang.String r4 = r11.getString(r4)     // Catch:{ SQLiteException -> 0x0079 }
            o8.y5 r0 = new o8.y5     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x007b
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ SQLiteException -> 0x0079 }
            o8.a3 r2 = r2.f8797f     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
            goto L_0x007b
        L_0x0079:
            r0 = move-exception
            goto L_0x0083
        L_0x007b:
            r11.close()
            return r0
        L_0x007f:
            r0 = move-exception
            goto L_0x00a4
        L_0x0081:
            r0 = move-exception
            r11 = r10
        L_0x0083:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x00a2 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ all -> 0x00a2 }
            o8.x2 r5 = r5.f8849m     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.f(r9)     // Catch:{ all -> 0x00a2 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.J(java.lang.String, java.lang.String):o8.y5");
    }

    public final Object K(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f8864a.d().f8797f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                this.f8864a.d().f8797f.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f8864a.d().f8797f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String L() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.C()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.l r3 = r6.f8864a     // Catch:{ all -> 0x0038 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0038 }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.L():java.lang.String");
    }

    public final List<b> M(String str, String str2, String str3) {
        i.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return N(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o8.b> N(java.lang.String r42, java.lang.String[] r43) {
        /*
            r41 = this;
            r1 = r41
            r41.h()
            r41.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            android.database.sqlite.SQLiteDatabase r2 = r41.C()     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "app_id"
            r12 = 0
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "origin"
            r13 = 1
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "name"
            r14 = 2
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "value"
            r15 = 3
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "active"
            r9 = 4
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "trigger_event_name"
            r8 = 5
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "trigger_timeout"
            r7 = 6
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "timed_out_event"
            r6 = 7
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "creation_timestamp"
            r11 = 8
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "triggered_event"
            r11 = 9
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "triggered_timestamp"
            r11 = 10
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "time_to_live"
            r11 = 11
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r5 = "expired_event"
            r11 = 12
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            java.lang.String r21 = "rowid"
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            r5.getClass()     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            r22 = 0
            r23 = 0
            r5 = r42
            r11 = 7
            r6 = r43
            r11 = 6
            r7 = r22
            r11 = 5
            r8 = r23
            r11 = 4
            r9 = r21
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x016f, all -> 0x016c }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            if (r3 == 0) goto L_0x0162
        L_0x0082:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00a7
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.a3 r3 = r3.f8797f     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            java.lang.String r5 = "Read more than the max allowed conditional properties, ignoring extra"
            com.google.android.gms.measurement.internal.l r6 = r1.f8864a     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r6.getClass()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r3.b(r5, r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            goto L_0x015b
        L_0x00a7:
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            java.lang.String r10 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            java.lang.String r5 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            java.lang.Object r8 = r1.K(r2, r15)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            int r4 = r2.getInt(r11)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            if (r4 == 0) goto L_0x00c1
            r9 = 5
            r23 = 1
            goto L_0x00c4
        L_0x00c1:
            r9 = 5
            r23 = 0
        L_0x00c4:
            java.lang.String r25 = r2.getString(r9)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r6 = 6
            long r26 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5 r4 = r1.f23413b     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5.I(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r7 = 7
            byte[] r6 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            android.os.Parcelable$Creator<o8.r> r7 = o8.r.CREATOR     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            android.os.Parcelable r4 = r4.z(r6, r7)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r28 = r4
            o8.r r28 = (o8.r) r28     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r6 = 8
            long r29 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5 r4 = r1.f23413b     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5.I(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            android.os.Parcelable r4 = r4.z(r6, r7)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r31 = r4
            o8.r r31 = (o8.r) r31     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r6 = 10
            long r18 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r4 = 11
            long r32 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5 r4 = r1.f23413b     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.u5.I(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            android.os.Parcelable r4 = r4.z(r6, r7)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r34 = r4
            o8.r r34 = (o8.r) r34     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.w5 r21 = new o8.w5     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r35 = 11
            r4 = r21
            r36 = 10
            r37 = 8
            r38 = 7
            r39 = 6
            r6 = r18
            r40 = 5
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            o8.b r4 = new o8.b     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r16 = r4
            r17 = r3
            r18 = r10
            r19 = r21
            r20 = r29
            r22 = r23
            r23 = r25
            r24 = r28
            r25 = r26
            r27 = r31
            r28 = r32
            r30 = r34
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0169, all -> 0x0166 }
            if (r3 != 0) goto L_0x015f
        L_0x015b:
            r2.close()
            return r0
        L_0x015f:
            r11 = 4
            goto L_0x0082
        L_0x0162:
            r2.close()
            return r0
        L_0x0166:
            r0 = move-exception
            r11 = r2
            goto L_0x0189
        L_0x0169:
            r0 = move-exception
            r11 = r2
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            r11 = 0
            goto L_0x0189
        L_0x016f:
            r0 = move-exception
            r11 = 0
        L_0x0171:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0188 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.b(r3, r0)     // Catch:{ all -> 0x0188 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0188 }
            if (r11 == 0) goto L_0x0187
            r11.close()
        L_0x0187:
            return r0
        L_0x0188:
            r0 = move-exception
        L_0x0189:
            if (r11 == 0) goto L_0x018e
            r11.close()
        L_0x018e:
            goto L_0x0190
        L_0x018f:
            throw r0
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.N(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<y5> O(String str) {
        i.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f8864a.getClass();
            Cursor query = C().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = query.getLong(2);
                    Object K = K(query, 3);
                    if (K == null) {
                        this.f8864a.d().f8797f.b("Read invalid user property value, ignoring it. appId", h.t(str));
                    } else {
                        arrayList.add(new y5(str, str2, string, j10, K));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Error querying user properties. appId", h.t(str), e10);
            List<y5> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010e, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0113, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012d, code lost:
        r11.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o8.y5> P(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.gms.common.internal.i.e(r20)
            r19.h()
            r19.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0110, all -> 0x010d }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010d }
            r13 = r20
            r2.add(r13)     // Catch:{ SQLiteException -> 0x010b, all -> 0x010d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x010b, all -> 0x010d }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x010b, all -> 0x010d }
            boolean r4 = android.text.TextUtils.isEmpty(r21)     // Catch:{ SQLiteException -> 0x010b, all -> 0x010d }
            if (r4 != 0) goto L_0x0035
            r14 = r21
            r2.add(r14)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            goto L_0x0037
        L_0x0035:
            r14 = r21
        L_0x0037:
            boolean r4 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            if (r4 != 0) goto L_0x004f
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
        L_0x004f:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            android.database.sqlite.SQLiteDatabase r2 = r19.C()     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r4 = "user_attributes"
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r7 = "name"
            r15 = 0
            r5[r15] = r7     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r7 = "set_timestamp"
            r9 = 1
            r5[r9] = r7     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r7 = "value"
            r8 = 2
            r5[r8] = r7     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r7 = "origin"
            r5[r12] = r7     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            java.lang.String r16 = "rowid"
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            r3.getClass()     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            r17 = 0
            r18 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r17
            r11 = 2
            r8 = r18
            r12 = 1
            r9 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0109, all -> 0x010d }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            if (r3 != 0) goto L_0x00a0
            r2.close()
            return r0
        L_0x00a0:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c4
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            o8.a3 r3 = r3.f8797f     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.l r6 = r1.f8864a     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r6.getClass()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r3.b(r5, r4)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            goto L_0x00ff
        L_0x00c4:
            java.lang.String r6 = r2.getString(r15)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            long r7 = r2.getLong(r12)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            java.lang.Object r9 = r1.K(r2, r11)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r10 = 3
            java.lang.String r14 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            if (r9 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            o8.a3 r3 = r3.f8797f     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r20)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r6 = r22
            r3.d(r4, r5, r14, r6)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            goto L_0x00f8
        L_0x00eb:
            o8.y5 r5 = new o8.y5     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r3 = r5
            r4 = r20
            r10 = r5
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            r0.add(r10)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
        L_0x00f8:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            if (r3 == 0) goto L_0x00ff
            goto L_0x00a0
        L_0x00ff:
            r2.close()
            return r0
        L_0x0103:
            r0 = move-exception
            r11 = r2
            goto L_0x0132
        L_0x0106:
            r0 = move-exception
            r11 = r2
            goto L_0x0116
        L_0x0109:
            r0 = move-exception
            goto L_0x0115
        L_0x010b:
            r0 = move-exception
            goto L_0x0113
        L_0x010d:
            r0 = move-exception
            r11 = 0
            goto L_0x0132
        L_0x0110:
            r0 = move-exception
            r13 = r20
        L_0x0113:
            r14 = r21
        L_0x0115:
            r11 = 0
        L_0x0116:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x0131 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0131 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0131 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r20)     // Catch:{ all -> 0x0131 }
            r2.d(r3, r4, r14, r0)     // Catch:{ all -> 0x0131 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0131 }
            if (r11 == 0) goto L_0x0130
            r11.close()
        L_0x0130:
            return r0
        L_0x0131:
            r0 = move-exception
        L_0x0132:
            if (r11 == 0) goto L_0x0137
            r11.close()
        L_0x0137:
            goto L_0x0139
        L_0x0138:
            throw r0
        L_0x0139:
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.P(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void Q() {
        i();
        C().beginTransaction();
    }

    public final void R(List<Long> list) {
        if (list != null) {
            h();
            i();
            StringBuilder sb2 = new StringBuilder("rowid in (");
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                sb2.append(list.get(i10).longValue());
            }
            sb2.append(")");
            int delete = C().delete("raw_events", sb2.toString(), (String[]) null);
            if (delete != list.size()) {
                this.f8864a.d().f8797f.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                return;
            }
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void S() {
        i();
        C().endTransaction();
    }

    public final void T(List<Long> list) {
        h();
        i();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (r()) {
            String join = TextUtils.join(",", list);
            String a10 = a.a(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (y(a.a(new StringBuilder(String.valueOf(a10).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", a10, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                this.f8864a.d().f8800i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase C = C();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(a10);
                sb2.append(" AND (retry_count IS NULL OR retry_count < ");
                sb2.append(Integer.MAX_VALUE);
                sb2.append(")");
                C.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                this.f8864a.d().f8797f.b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final boolean k() {
        return false;
    }

    public final void l() {
        h();
        i();
        if (r()) {
            long a10 = this.f23413b.f23478i.f23246g.a();
            long a11 = this.f8864a.f8850n.a();
            long abs = Math.abs(a11 - a10);
            this.f8864a.getClass();
            if (abs > v2.f23546y.a(null).longValue()) {
                this.f23413b.f23478i.f23246g.b(a11);
                h();
                i();
                if (r()) {
                    SQLiteDatabase C = C();
                    this.f8864a.getClass();
                    int delete = C.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f8864a.f8850n.b()), String.valueOf(f.i())});
                    if (delete > 0) {
                        this.f8864a.d().f8805n.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void m(String str, String str2) {
        i.e(str);
        i.e(str2);
        h();
        i();
        try {
            C().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.d("Error deleting user property. appId", h.t(str), this.f8864a.f8849m.f(str2), e10);
        }
    }

    public final void n() {
        i();
        C().setTransactionSuccessful();
    }

    public final void o(x3 x3Var) {
        h();
        i();
        String M = x3Var.M();
        i.h(M);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", M);
        contentValues.put("app_instance_id", x3Var.N());
        contentValues.put("gmp_app_id", x3Var.S());
        x3Var.f23575a.b().h();
        contentValues.put("resettable_device_id_hash", x3Var.f23579e);
        contentValues.put("last_bundle_index", Long.valueOf(x3Var.I()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(x3Var.J()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(x3Var.H()));
        contentValues.put("app_version", x3Var.P());
        contentValues.put("app_store", x3Var.O());
        contentValues.put("gmp_version", Long.valueOf(x3Var.G()));
        contentValues.put("dev_cert_hash", Long.valueOf(x3Var.D()));
        contentValues.put("measurement_enabled", Boolean.valueOf(x3Var.A()));
        x3Var.f23575a.b().h();
        contentValues.put("day", Long.valueOf(x3Var.f23597w));
        x3Var.f23575a.b().h();
        contentValues.put("daily_public_events_count", Long.valueOf(x3Var.f23598x));
        x3Var.f23575a.b().h();
        contentValues.put("daily_events_count", Long.valueOf(x3Var.f23599y));
        x3Var.f23575a.b().h();
        contentValues.put("daily_conversions_count", Long.valueOf(x3Var.f23600z));
        x3Var.f23575a.b().h();
        contentValues.put("config_fetched_time", Long.valueOf(x3Var.E));
        x3Var.f23575a.b().h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(x3Var.F));
        contentValues.put("app_version_int", Long.valueOf(x3Var.B()));
        contentValues.put("firebase_instance_id", x3Var.Q());
        x3Var.f23575a.b().h();
        contentValues.put("daily_error_events_count", Long.valueOf(x3Var.A));
        x3Var.f23575a.b().h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(x3Var.B));
        x3Var.f23575a.b().h();
        contentValues.put("health_monitor_sample", x3Var.C);
        contentValues.put("android_id", Long.valueOf(x3Var.r()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(x3Var.z()));
        contentValues.put("admob_app_id", x3Var.K());
        contentValues.put("dynamite_version", Long.valueOf(x3Var.E()));
        List<String> a10 = x3Var.a();
        if (a10 != null) {
            if (a10.size() == 0) {
                this.f8864a.d().f8800i.b("Safelisted events should not be an empty list. appId", M);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", a10));
            }
        }
        ra.b();
        if (this.f8864a.f8843g.v(M, v2.f23506d0)) {
            contentValues.put("ga_app_id", x3Var.R());
        }
        try {
            SQLiteDatabase C = C();
            if (((long) C.update("apps", contentValues, "app_id = ?", new String[]{M})) == 0 && C.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f8864a.d().f8797f.b("Failed to insert/update app (got -1). appId", h.t(M));
            }
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Error storing app. appId", h.t(M), e10);
        }
    }

    public final void p(n nVar) {
        if (nVar != null) {
            h();
            i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", nVar.f23352a);
            contentValues.put("name", nVar.f23353b);
            contentValues.put("lifetime_count", Long.valueOf(nVar.f23354c));
            contentValues.put("current_bundle_count", Long.valueOf(nVar.f23355d));
            contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f23357f));
            contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f23358g));
            contentValues.put("last_bundled_day", nVar.f23359h);
            contentValues.put("last_sampled_complex_event_id", nVar.f23360i);
            contentValues.put("last_sampling_rate", nVar.f23361j);
            contentValues.put("current_session_count", Long.valueOf(nVar.f23356e));
            Boolean bool = nVar.f23362k;
            contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
            try {
                if (C().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                    this.f8864a.d().f8797f.b("Failed to insert/update event aggregates (got -1). appId", h.t(nVar.f23352a));
                }
            } catch (SQLiteException e10) {
                this.f8864a.d().f8797f.c("Error storing event aggregates. appId", h.t(nVar.f23352a), e10);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void q(String str, byte[] bArr, String str2) {
        i.e(str);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) C().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                this.f8864a.d().f8797f.b("Failed to update remote config (got 0). appId", h.t(str));
            }
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Error storing remote config. appId", h.t(str), e10);
        }
    }

    public final boolean r() {
        l lVar = this.f8864a;
        Context context = lVar.f8837a;
        lVar.getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean s(String str, Long l10, long j10, y2 y2Var) {
        h();
        i();
        if (y2Var != null) {
            i.e(str);
            byte[] i10 = y2Var.i();
            this.f8864a.d().f8805n.c("Saving complex main event, appId, data size", this.f8864a.f8849m.d(str), Integer.valueOf(i10.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l10);
            contentValues.put("children_to_process", Long.valueOf(j10));
            contentValues.put("main_event", i10);
            try {
                if (C().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                this.f8864a.d().f8797f.b("Failed to insert complex main event (got -1). appId", h.t(str));
                return false;
            } catch (SQLiteException e10) {
                this.f8864a.d().f8797f.c("Error storing complex main event. appId", h.t(str), e10);
                return false;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final boolean t(b bVar) {
        h();
        i();
        String str = bVar.f23109a;
        i.h(str);
        if (J(str, bVar.f23111c.f23562b) == null) {
            long y10 = y("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f8864a.getClass();
            if (y10 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.f23110b);
        contentValues.put("name", bVar.f23111c.f23562b);
        Object i10 = bVar.f23111c.i();
        i.h(i10);
        w(contentValues, "value", i10);
        contentValues.put("active", Boolean.valueOf(bVar.f23113e));
        contentValues.put("trigger_event_name", bVar.f23114f);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f23116h));
        contentValues.put("timed_out_event", this.f8864a.A().a0(bVar.f23115g));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f23112d));
        contentValues.put("triggered_event", this.f8864a.A().a0(bVar.f23117i));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f23111c.f23563c));
        contentValues.put("time_to_live", Long.valueOf(bVar.f23118r));
        contentValues.put("expired_event", this.f8864a.A().a0(bVar.f23119s));
        try {
            if (C().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f8864a.d().f8797f.b("Failed to insert/update conditional user property (got -1)", h.t(str));
            }
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Error storing conditional user property", h.t(str), e10);
        }
        return true;
    }

    public final boolean u(y5 y5Var) {
        h();
        i();
        if (J(y5Var.f23622a, y5Var.f23624c) == null) {
            if (r.V(y5Var.f23624c)) {
                if (y("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{y5Var.f23622a}) >= ((long) this.f8864a.f8843g.p(y5Var.f23622a, v2.G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(y5Var.f23624c)) {
                long y10 = y("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{y5Var.f23622a, y5Var.f23623b});
                this.f8864a.getClass();
                if (y10 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", y5Var.f23622a);
        contentValues.put("origin", y5Var.f23623b);
        contentValues.put("name", y5Var.f23624c);
        contentValues.put("set_timestamp", Long.valueOf(y5Var.f23625d));
        w(contentValues, "value", y5Var.f23626e);
        try {
            if (C().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f8864a.d().f8797f.b("Failed to insert/update user property (got -1). appId", h.t(y5Var.f23622a));
            }
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Error storing user property. appId", h.t(y5Var.f23622a), e10);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ff, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0207, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0208, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021c, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ff A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String), (r3v33 java.lang.String) binds: [B:1:0x000b, B:30:0x008c, B:24:0x0077, B:13:0x003d, B:7:0x0020, B:40:0x00c2, B:46:0x00fc, B:85:0x01ea, B:86:?, B:50:0x0110, B:79:0x01d2, B:80:?, B:73:0x01b7, B:63:0x0189] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021c  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x008c=Splitter:B:30:0x008c, B:13:0x003d=Splitter:B:13:0x003d} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(java.lang.String r21, long r22, long r24, e8.pu r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            r20.h()
            r20.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.C()     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x0073
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r15] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            goto L_0x0037
        L_0x002f:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r15] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
        L_0x0037:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x003d
            java.lang.String r5 = "rowid <= ? and "
        L_0x003d:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            int r6 = r6 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r6)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0205 }
            if (r5 != 0) goto L_0x0067
            r4.close()
            return
        L_0x0067:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x0205 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0205 }
            r4.close()     // Catch:{ SQLiteException -> 0x0205 }
            goto L_0x00bd
        L_0x0073:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0082
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            goto L_0x0086
        L_0x0082:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r4[r15] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
        L_0x0086:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x008c
            java.lang.String r5 = " and rowid <= ?"
        L_0x008c:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            int r6 = r6 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r6 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r6)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r5 = " order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x01ff }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0205 }
            if (r5 != 0) goto L_0x00b6
            r4.close()
            return
        L_0x00b6:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x0205 }
            r4.close()     // Catch:{ SQLiteException -> 0x0205 }
        L_0x00bd:
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "metadata"
            r6[r15] = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r4 != 0) goto L_0x00fc
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r16)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r3.close()
            return
        L_0x00fc:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.h3 r5 = k8.i3.z1()     // Catch:{ IOException -> 0x01e9 }
            k8.f5 r4 = com.google.android.gms.measurement.internal.q.C(r5, r4)     // Catch:{ IOException -> 0x01e9 }
            k8.h3 r4 = (k8.h3) r4     // Catch:{ IOException -> 0x01e9 }
            k8.k6 r4 = r4.f()     // Catch:{ IOException -> 0x01e9 }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ IOException -> 0x01e9 }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.l r5 = r1.f8864a     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            o8.a3 r5 = r5.f8800i     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r16)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
        L_0x0127:
            r3.close()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r2.f16024b = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r12 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0142
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r14 = 2
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            goto L_0x014c
        L_0x0142:
            r13 = 1
            r14 = 2
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
        L_0x014c:
            r7 = r4
            r8 = r5
            r4 = 4
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "rowid"
            r6[r15] = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "name"
            r6[r13] = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "timestamp"
            r6[r14] = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "data"
            r6[r12] = r4     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r14 = 3
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r0 == 0) goto L_0x01d2
        L_0x0177:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            byte[] r0 = r3.getBlob(r14)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.x2 r6 = k8.y2.w()     // Catch:{ IOException -> 0x01b5 }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r6, r0)     // Catch:{ IOException -> 0x01b5 }
            k8.x2 r0 = (k8.x2) r0     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r0.r(r6)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            boolean r9 = r0.f20243c     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r9 == 0) goto L_0x019e
            r0.h()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r0.f20243c = r15     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
        L_0x019e:
            MessageType r9 = r0.f20242b     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.y2.H(r9, r7)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.k6 r0 = r0.f()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            k8.y2 r0 = (k8.y2) r0     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            boolean r0 = r2.b(r4, r0)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r0 != 0) goto L_0x01c8
            r3.close()
            return
        L_0x01b5:
            r0 = move-exception
            r6 = 2
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            o8.a3 r4 = r4.f8797f     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r16)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r4.c(r5, r7, r0)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
        L_0x01c8:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            if (r0 != 0) goto L_0x0177
            r3.close()
            return
        L_0x01d2:
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            o8.a3 r0 = r0.f8800i     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r16)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r3.close()
            return
        L_0x01e7:
            r0 = move-exception
            goto L_0x0201
        L_0x01e9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            o8.a3 r2 = r2.f8797f     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r16)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r2.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01e7, all -> 0x01ff }
            r3.close()
            return
        L_0x01ff:
            r0 = move-exception
            goto L_0x0222
        L_0x0201:
            r4 = r3
            r3 = r16
            goto L_0x0209
        L_0x0205:
            r0 = move-exception
            goto L_0x0209
        L_0x0207:
            r0 = move-exception
            r4 = r3
        L_0x0209:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x0220 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0220 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0220 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ all -> 0x0220 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0220 }
            if (r4 == 0) goto L_0x021f
            r4.close()
        L_0x021f:
            return
        L_0x0220:
            r0 = move-exception
            r3 = r4
        L_0x0222:
            if (r3 == 0) goto L_0x0227
            r3.close()
        L_0x0227:
            goto L_0x0229
        L_0x0228:
            throw r0
        L_0x0229:
            goto L_0x0228
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.j.v(java.lang.String, long, long, e8.pu):void");
    }

    public final int x(String str, String str2) {
        i.e(str);
        i.e(str2);
        h();
        i();
        try {
            return C().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.d("Error deleting conditional property", h.t(str), this.f8864a.f8849m.f(str2), e10);
            return 0;
        }
    }

    public final long y(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = C().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = C().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
