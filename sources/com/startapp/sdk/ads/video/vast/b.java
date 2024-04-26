package com.startapp.sdk.ads.video.vast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.b3;
import com.startapp.i4;
import com.startapp.sdk.ads.video.vast.c;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import com.startapp.y0;
import com.startapp.y3;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class b implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12069a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12070b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f12071c = new JSONArray();

    /* renamed from: d  reason: collision with root package name */
    public final String f12072d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12073e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12074f;

    public b(Context context, String str, String str2, String str3, boolean z10) {
        this.f12069a = context;
        this.f12070b = str;
        this.f12072d = str2;
        this.f12073e = str3;
        this.f12074f = z10;
    }

    public void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f12071c.length() != 0) {
            if (!this.f12074f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
                try {
                    String b10 = b(vASTErrorCodes);
                    if (!TextUtils.isEmpty(b10)) {
                        y3 k10 = ComponentLocator.a(this.f12069a).k();
                        String str = this.f12070b;
                        k10.getClass();
                        byte[] bytes = b10.getBytes();
                        Map<Activity, Integer> map = wb.f12765a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        k10.a(str, (y0) null, byteArrayOutputStream.toByteArray(), true, (b3<Throwable, Void>) null);
                    }
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f12071c);
        String str = this.f12072d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jSONObject.put("partnerResponse", str);
        String str3 = this.f12073e;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put("partnerName", str2);
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
