package r4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o4.a;
import o4.e;
import o4.f;
import r1.c;
import s8.i;
import s8.l;
import t4.s;
import u4.b;

public final /* synthetic */ class a implements b.a, s.b, s8.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24529a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f24531c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f24532d;

    public /* synthetic */ a(com.google.firebase.remoteconfig.a aVar, i iVar, i iVar2) {
        this.f24530b = aVar;
        this.f24531c = iVar;
        this.f24532d = iVar2;
    }

    public /* synthetic */ a(b bVar, o4.i iVar, f fVar) {
        this.f24530b = bVar;
        this.f24531c = iVar;
        this.f24532d = fVar;
    }

    public /* synthetic */ a(s sVar, List list, o4.i iVar) {
        this.f24530b = sVar;
        this.f24532d = list;
        this.f24531c = iVar;
    }

    public /* synthetic */ a(s sVar, o4.i iVar, f fVar) {
        this.f24530b = sVar;
        this.f24531c = iVar;
        this.f24532d = fVar;
    }

    public Object a() {
        b bVar = (b) this.f24530b;
        o4.i iVar = (o4.i) this.f24531c;
        bVar.f24537d.z(iVar, (f) this.f24532d);
        bVar.f24534a.a(iVar, 1);
        return null;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        String str;
        s sVar;
        l4.b bVar;
        l4.b bVar2;
        long j10;
        int i10 = 0;
        Object obj2 = null;
        int i11 = 1;
        String str2 = "bytes";
        switch (this.f24529a) {
            case 1:
                s sVar2 = (s) this.f24530b;
                o4.i iVar = (o4.i) this.f24531c;
                f fVar = (f) this.f24532d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                l4.b bVar3 = s.f25725e;
                if (sVar2.d().compileStatement("PRAGMA page_size").simpleQueryForLong() * sVar2.d().compileStatement("PRAGMA page_count").simpleQueryForLong() >= sVar2.f25729d.e()) {
                    return -1L;
                }
                Long i12 = sVar2.i(sQLiteDatabase, iVar);
                if (i12 != null) {
                    j10 = i12.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.b());
                    contentValues.put("priority", Integer.valueOf(w4.a.a(iVar.d())));
                    contentValues.put("next_request_ms", 0);
                    if (iVar.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(iVar.c(), 0));
                    }
                    j10 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                int d10 = sVar2.f25729d.d();
                byte[] bArr = fVar.d().f22948b;
                boolean z10 = bArr.length <= d10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j10));
                contentValues2.put("transport_name", fVar.g());
                contentValues2.put("timestamp_ms", Long.valueOf(fVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(fVar.h()));
                contentValues2.put("payload_encoding", fVar.d().f22947a.f21035a);
                contentValues2.put("code", fVar.c());
                contentValues2.put("num_attempts", 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr : new byte[0]);
                long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
                if (!z10) {
                    double length = (double) bArr.length;
                    double d11 = (double) d10;
                    Double.isNaN(length);
                    Double.isNaN(d11);
                    Double.isNaN(length);
                    Double.isNaN(d11);
                    Double.isNaN(length);
                    Double.isNaN(d11);
                    Double.isNaN(length);
                    Double.isNaN(d11);
                    Double.isNaN(length);
                    Double.isNaN(d11);
                    int ceil = (int) Math.ceil(length / d11);
                    while (i11 <= ceil) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i11 - 1) * d10, Math.min(i11 * d10, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put(str2, copyOfRange);
                        sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                        i11++;
                    }
                }
                for (Map.Entry next : Collections.unmodifiableMap(fVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) next.getKey());
                    contentValues4.put("value", (String) next.getValue());
                    sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
                }
                return Long.valueOf(insert);
            default:
                s sVar3 = (s) this.f24530b;
                List list = (List) this.f24532d;
                o4.i iVar2 = (o4.i) this.f24531c;
                Cursor cursor = (Cursor) obj;
                l4.b bVar4 = s.f25725e;
                sVar3.getClass();
                while (cursor.moveToNext()) {
                    long j11 = cursor.getLong(i10);
                    boolean z11 = cursor.getInt(7) != 0;
                    a.b bVar5 = new a.b();
                    bVar5.f22935f = new HashMap();
                    bVar5.f(cursor.getString(i11));
                    bVar5.e(cursor.getLong(2));
                    bVar5.g(cursor.getLong(3));
                    if (z11) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            bVar2 = s.f25725e;
                        } else {
                            bVar2 = new l4.b(string);
                        }
                        bVar5.f22932c = new e(bVar2, cursor.getBlob(5));
                        sVar = sVar3;
                        str = str2;
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            bVar = s.f25725e;
                        } else {
                            bVar = new l4.b(string2);
                        }
                        SQLiteDatabase d12 = sVar3.d();
                        String[] strArr = new String[i11];
                        strArr[i10] = str2;
                        String[] strArr2 = new String[i11];
                        strArr2[i10] = String.valueOf(j11);
                        Cursor query = d12.query("event_payloads", strArr, "event_id = ?", strArr2, (String) null, (String) null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int i13 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(i10);
                                arrayList.add(blob);
                                i13 += blob.length;
                            }
                            byte[] bArr2 = new byte[i13];
                            sVar = sVar3;
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                byte[] bArr3 = (byte[]) arrayList.get(i14);
                                String str3 = str2;
                                System.arraycopy(bArr3, 0, bArr2, i10, bArr3.length);
                                i10 += bArr3.length;
                                i14++;
                                str2 = str3;
                            }
                            str = str2;
                            query.close();
                            bVar5.f22932c = new e(bVar, bArr2);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        bVar5.f22931b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new t4.b(j11, iVar2, bVar5.b()));
                    sVar3 = sVar;
                    str2 = str;
                    i10 = 0;
                    obj2 = null;
                    i11 = 1;
                }
                return obj2;
        }
    }

    public Object e(i iVar) {
        com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.f24530b;
        i iVar2 = (i) this.f24531c;
        i iVar3 = (i) this.f24532d;
        aVar.getClass();
        if (!iVar2.l() || iVar2.h() == null) {
            return l.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) iVar2.h();
        if (iVar3.l()) {
            com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) iVar3.h();
            if (!(bVar2 == null || !bVar.f9779c.equals(bVar2.f9779c))) {
                return l.e(Boolean.FALSE);
            }
        }
        return aVar.f9756e.c(bVar).e(aVar.f9754c, new c(aVar));
    }
}
