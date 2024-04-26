package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import e8.b9;
import e8.k8;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b7 {

    /* renamed from: b  reason: collision with root package name */
    public static Object f5991b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5992c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5993d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<String> f5994e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5995a;

    public b7() {
        this((String) null);
    }

    public static boolean a() {
        boolean z10;
        synchronized (f5991b) {
            z10 = f5992c && f5993d;
        }
        return z10;
    }

    public static void b(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!((HashSet) f5994e).contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            e.I("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    public final void c(String str, c7 c7Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f5995a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            c7Var.b(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            e.C("unable to log", e10);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (b7.class) {
            e.J("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < stringWriter2.length()) {
                int i11 = i10 + 4000;
                String valueOf = String.valueOf(stringWriter2.substring(i10, Math.min(i11, stringWriter2.length())));
                e.J(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i10 = i11;
            }
            e.J("GMA Debug FINISH");
        }
    }

    public final void d(HttpURLConnection httpURLConnection, int i10) {
        if (a()) {
            String str = null;
            c("onNetworkResponse", new se(i10, (Map) httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i10 < 200 || i10 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    e.K(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                c("onNetworkRequestError", new k8(str, 1));
            }
        }
    }

    public final void e(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (a()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            c("onNetworkRequest", new g(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), (Map) hashMap, bArr));
        }
    }

    public final void f(String str) {
        if (a() && str != null) {
            c("onNetworkResponseBody", new b9(str.getBytes(), 0, (q.e) null));
        }
    }

    public b7(String str) {
        List<String> list;
        if (!a()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f5995a = list;
    }
}
