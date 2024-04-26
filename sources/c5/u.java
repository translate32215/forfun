package c5;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import c5.q;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.a;
import v6.e0;
import v6.p;
import x4.f;

/* compiled from: FrameworkMediaDrm */
public final class u implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4348d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f4349a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDrm f4350b;

    /* renamed from: c  reason: collision with root package name */
    public int f4351c;

    public u(UUID uuid) throws UnsupportedSchemeException {
        UUID uuid2;
        uuid.getClass();
        a.b(!f.f27567b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f4349a = uuid;
        MediaDrm mediaDrm = new MediaDrm((e0.f26436a >= 27 || !f.f27568c.equals(uuid)) ? uuid : uuid2);
        this.f4350b = mediaDrm;
        this.f4351c = 1;
        if (f.f27569d.equals(uuid) && "ASUS_Z00AD".equals(e0.f26439d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static u m(UUID uuid) throws z {
        try {
            return new u(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new z(1, e10);
        } catch (Exception e11) {
            throw new z(2, e11);
        }
    }

    public synchronized void a() {
        int i10 = this.f4351c - 1;
        this.f4351c = i10;
        if (i10 == 0) {
            this.f4350b.release();
        }
    }

    public Class<r> b() {
        return r.class;
    }

    public void c(byte[] bArr, byte[] bArr2) {
        this.f4350b.restoreKeys(bArr, bArr2);
    }

    public Map<String, String> d(byte[] bArr) {
        return this.f4350b.queryKeyStatus(bArr);
    }

    public void e(byte[] bArr) {
        this.f4350b.closeSession(bArr);
    }

    public byte[] f(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (f.f27568c.equals(this.f4349a) && e0.f26436a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(e0.o(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = e0.D(sb2.toString());
            } catch (JSONException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Failed to adjust response data: ");
                a10.append(e0.o(bArr2));
                p.b("ClearKeyUtil", a10.toString(), e10);
            }
        }
        return this.f4350b.provideKeyResponse(bArr, bArr2);
    }

    public p g(byte[] bArr) throws MediaCryptoException {
        int i10 = e0.f26436a;
        boolean z10 = i10 < 21 && f.f27569d.equals(this.f4349a) && "L3".equals(this.f4350b.getPropertyString("securityLevel"));
        UUID uuid = this.f4349a;
        if (i10 < 27 && f.f27568c.equals(uuid)) {
            uuid = f.f27567b;
        }
        return new r(uuid, bArr, z10);
    }

    public q.d h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f4350b.getProvisionRequest();
        return new q.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public void i(byte[] bArr) throws DeniedByServerException {
        this.f4350b.provideProvisionResponse(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d9, code lost:
        if ("AFTT".equals(r4) == false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01df, code lost:
        if (r1 != null) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c5.q.a j(byte[] r17, java.util.List<c5.f.b> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 23
            r3 = 0
            if (r1 == 0) goto L_0x020a
            java.util.UUID r3 = r0.f4349a
            java.util.UUID r4 = x4.f.f27569d
            boolean r3 = r4.equals(r3)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L_0x001f
            java.lang.Object r1 = r1.get(r6)
            c5.f$b r1 = (c5.f.b) r1
        L_0x001c:
            r3 = r1
            goto L_0x00ca
        L_0x001f:
            int r3 = v6.e0.f26436a
            r7 = 28
            if (r3 < r7) goto L_0x0096
            int r3 = r18.size()
            if (r3 <= r5) goto L_0x0096
            java.lang.Object r3 = r1.get(r6)
            c5.f$b r3 = (c5.f.b) r3
            r7 = 0
            r8 = 0
        L_0x0033:
            int r9 = r18.size()
            if (r7 >= r9) goto L_0x006a
            java.lang.Object r9 = r1.get(r7)
            c5.f$b r9 = (c5.f.b) r9
            byte[] r10 = r9.f4323e
            r10.getClass()
            java.lang.String r11 = r9.f4322d
            java.lang.String r12 = r3.f4322d
            boolean r11 = v6.e0.a(r11, r12)
            if (r11 == 0) goto L_0x0068
            java.lang.String r9 = r9.f4321c
            java.lang.String r11 = r3.f4321c
            boolean r9 = v6.e0.a(r9, r11)
            if (r9 == 0) goto L_0x0068
            k5.j$a r9 = k5.j.c(r10)
            if (r9 == 0) goto L_0x0060
            r9 = 1
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            if (r9 == 0) goto L_0x0068
            int r9 = r10.length
            int r8 = r8 + r9
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0068:
            r7 = 0
            goto L_0x006b
        L_0x006a:
            r7 = 1
        L_0x006b:
            if (r7 == 0) goto L_0x0096
            byte[] r7 = new byte[r8]
            r8 = 0
            r9 = 0
        L_0x0071:
            int r10 = r18.size()
            if (r8 >= r10) goto L_0x008a
            java.lang.Object r10 = r1.get(r8)
            c5.f$b r10 = (c5.f.b) r10
            byte[] r10 = r10.f4323e
            r10.getClass()
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r6, r7, r9, r11)
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x0071
        L_0x008a:
            c5.f$b r1 = new c5.f$b
            java.util.UUID r8 = r3.f4320b
            java.lang.String r9 = r3.f4321c
            java.lang.String r3 = r3.f4322d
            r1.<init>(r8, r9, r3, r7)
            goto L_0x001c
        L_0x0096:
            r3 = 0
        L_0x0097:
            int r7 = r18.size()
            if (r3 >= r7) goto L_0x00c2
            java.lang.Object r7 = r1.get(r3)
            c5.f$b r7 = (c5.f.b) r7
            byte[] r8 = r7.f4323e
            r8.getClass()
            k5.j$a r8 = k5.j.c(r8)
            if (r8 != 0) goto L_0x00b0
            r8 = -1
            goto L_0x00b2
        L_0x00b0:
            int r8 = r8.f19985b
        L_0x00b2:
            int r9 = v6.e0.f26436a
            if (r9 >= r2) goto L_0x00ba
            if (r8 != 0) goto L_0x00ba
        L_0x00b8:
            r3 = r7
            goto L_0x00ca
        L_0x00ba:
            if (r9 < r2) goto L_0x00bf
            if (r8 != r5) goto L_0x00bf
            goto L_0x00b8
        L_0x00bf:
            int r3 = r3 + 1
            goto L_0x0097
        L_0x00c2:
            java.lang.Object r1 = r1.get(r6)
            c5.f$b r1 = (c5.f.b) r1
            goto L_0x001c
        L_0x00ca:
            java.util.UUID r1 = r0.f4349a
            byte[] r7 = r3.f4323e
            r7.getClass()
            java.util.UUID r8 = x4.f.f27570e
            boolean r9 = r8.equals(r1)
            if (r9 == 0) goto L_0x019b
            byte[] r9 = k5.j.d(r7, r1)
            if (r9 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r7 = r9
        L_0x00e1:
            byte r9 = r7[r6]
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r10 = r7[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 8
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = 3
            r12 = 2
            byte r13 = r7[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r9 = r9 | r13
            r13 = 4
            byte r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r9 = r9 | r10
            r10 = 5
            byte r13 = r7[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 6
            byte r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r11
            r10 = r10 | r13
            short r10 = (short) r10
            r13 = 7
            byte r14 = r7[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            byte r13 = r7[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r11
            r13 = r13 | r14
            short r13 = (short) r13
            java.lang.String r14 = "FrameworkMediaDrm"
            if (r10 != r5) goto L_0x0192
            if (r13 == r5) goto L_0x011e
            goto L_0x0192
        L_0x011e:
            r5 = 9
            byte r15 = r7[r11]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r2 = 10
            byte r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r11
            r5 = r5 | r15
            short r5 = (short) r5
            java.nio.charset.Charset r11 = aa.c.f179d
            java.lang.String r15 = new java.lang.String
            r15.<init>(r7, r2, r5, r11)
            java.lang.String r2 = "<LA_URL>"
            boolean r2 = r15.contains(r2)
            if (r2 == 0) goto L_0x013d
            goto L_0x0197
        L_0x013d:
            java.lang.String r2 = "</DATA>"
            int r2 = r15.indexOf(r2)
            if (r2 != r4) goto L_0x014a
            java.lang.String r4 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            android.util.Log.w(r14, r4)
        L_0x014a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r15.substring(r6, r2)
            r4.append(r5)
            java.lang.String r5 = "<LA_URL>https://x</LA_URL>"
            r4.append(r5)
            java.lang.String r2 = r15.substring(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            int r9 = r9 + 52
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r5)
            r4.putInt(r9)
            short r5 = (short) r10
            r4.putShort(r5)
            short r5 = (short) r13
            r4.putShort(r5)
            int r5 = r2.length()
            int r5 = r5 * 2
            short r5 = (short) r5
            r4.putShort(r5)
            byte[] r2 = r2.getBytes(r11)
            r4.put(r2)
            byte[] r7 = r4.array()
            goto L_0x0197
        L_0x0192:
            java.lang.String r2 = "Unexpected record count or type. Skipping LA_URL workaround."
            android.util.Log.i(r14, r2)
        L_0x0197:
            byte[] r7 = k5.j.a(r8, r7)
        L_0x019b:
            int r2 = v6.e0.f26436a
            r4 = 23
            if (r2 >= r4) goto L_0x01a9
            java.util.UUID r4 = x4.f.f27569d
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01db
        L_0x01a9:
            boolean r4 = r8.equals(r1)
            if (r4 == 0) goto L_0x01e2
            java.lang.String r4 = v6.e0.f26438c
            java.lang.String r5 = "Amazon"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e2
            java.lang.String r4 = v6.e0.f26439d
            java.lang.String r5 = "AFTB"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x01db
            java.lang.String r5 = "AFTS"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x01db
            java.lang.String r5 = "AFTM"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x01db
            java.lang.String r5 = "AFTT"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e2
        L_0x01db:
            byte[] r1 = k5.j.d(r7, r1)
            if (r1 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r1 = r7
        L_0x01e3:
            java.util.UUID r4 = r0.f4349a
            java.lang.String r5 = r3.f4322d
            r6 = 26
            if (r2 >= r6) goto L_0x0206
            java.util.UUID r2 = x4.f.f27568c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0206
            java.lang.String r2 = "video/mp4"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0203
            java.lang.String r2 = "audio/mp4"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0206
        L_0x0203:
            java.lang.String r2 = "cenc"
            goto L_0x0207
        L_0x0206:
            r2 = r5
        L_0x0207:
            r6 = r1
            r7 = r2
            goto L_0x020c
        L_0x020a:
            r6 = r3
            r7 = r6
        L_0x020c:
            android.media.MediaDrm r4 = r0.f4350b
            r5 = r17
            r8 = r19
            r9 = r20
            android.media.MediaDrm$KeyRequest r1 = r4.getKeyRequest(r5, r6, r7, r8, r9)
            java.util.UUID r2 = r0.f4349a
            byte[] r4 = r1.getData()
            java.util.UUID r5 = x4.f.f27568c
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0245
            int r2 = v6.e0.f26436a
            r5 = 27
            if (r2 < r5) goto L_0x022d
            goto L_0x0245
        L_0x022d:
            java.lang.String r2 = v6.e0.o(r4)
            r4 = 43
            r5 = 45
            java.lang.String r2 = r2.replace(r4, r5)
            r4 = 47
            r5 = 95
            java.lang.String r2 = r2.replace(r4, r5)
            byte[] r4 = v6.e0.D(r2)
        L_0x0245:
            java.lang.String r2 = r1.getDefaultUrl()
            java.lang.String r5 = "https://x"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0253
            java.lang.String r2 = ""
        L_0x0253:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x0265
            if (r3 == 0) goto L_0x0265
            java.lang.String r5 = r3.f4321c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0265
            java.lang.String r2 = r3.f4321c
        L_0x0265:
            int r3 = v6.e0.f26436a
            r5 = 23
            if (r3 < r5) goto L_0x0270
            int r1 = r1.getRequestType()
            goto L_0x0272
        L_0x0270:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0272:
            c5.q$a r3 = new c5.q$a
            r3.<init>(r4, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.u.j(byte[], java.util.List, int, java.util.HashMap):c5.q$a");
    }

    public void k(q.b bVar) {
        this.f4350b.setOnEventListener(new s(this, bVar));
    }

    public byte[] l() throws MediaDrmException {
        return this.f4350b.openSession();
    }
}
