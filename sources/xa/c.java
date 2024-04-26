package xa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f27907a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.firebase.a f27908b;

    /* compiled from: PersistedInstallation */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(com.google.firebase.a aVar) {
        aVar.a();
        File filesDir = aVar.f9662a.getFilesDir();
        StringBuilder a10 = android.support.v4.media.a.a("PersistedInstallation.");
        a10.append(aVar.c());
        a10.append(".json");
        this.f27907a = new File(filesDir, a10.toString());
        this.f27908b = aVar;
    }

    public d a(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.c());
            jSONObject.put("Status", dVar.f().ordinal());
            jSONObject.put("AuthToken", dVar.a());
            jSONObject.put("RefreshToken", dVar.e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.b());
            jSONObject.put("FisError", dVar.d());
            com.google.firebase.a aVar = this.f27908b;
            aVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", aVar.f9662a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f27907a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xa.d b() {
        /*
            r14 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r5 = r14.f27907a     // Catch:{ IOException | JSONException -> 0x002d }
            r4.<init>(r5)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0011:
            int r5 = r4.read(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ IOException | JSONException -> 0x002d }
            goto L_0x0032
        L_0x0024:
            r0.write(r2, r3, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0011
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0032:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            xa.c$a r4 = xa.c.a.ATTEMPT_MIGRATION
            java.lang.String r5 = "Status"
            int r3 = r1.optInt(r5, r3)
            java.lang.String r5 = "AuthToken"
            java.lang.String r5 = r1.optString(r5, r0)
            java.lang.String r6 = "RefreshToken"
            java.lang.String r6 = r1.optString(r6, r0)
            r7 = 0
            java.lang.String r9 = "TokenCreationEpochInSecs"
            long r9 = r1.optLong(r9, r7)
            java.lang.String r11 = "ExpiresInSecs"
            long r11 = r1.optLong(r11, r7)
            java.lang.String r13 = "FisError"
            java.lang.String r0 = r1.optString(r13, r0)
            int r1 = xa.d.f27915a
            xa.a$b r1 = new xa.a$b
            r1.<init>()
            r1.d(r7)
            r1.f27898b = r4
            r1.b(r7)
            r1.f27897a = r2
            xa.c$a[] r2 = xa.c.a.values()
            r2 = r2[r3]
            r1.c(r2)
            r1.f27899c = r5
            r1.f27900d = r6
            r1.d(r9)
            r1.b(r11)
            r1.f27903g = r0
            xa.d r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.c.b():xa.d");
    }
}
