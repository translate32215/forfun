package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.d;
import db.e;
import j.f;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z7.b;

/* compiled from: ConfigFetchHandler */
public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final long f9782i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f9783j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final va.c f9784a;

    /* renamed from: b  reason: collision with root package name */
    public final ua.a<ja.a> f9785b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9786c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f9787d;

    /* renamed from: e  reason: collision with root package name */
    public final a f9788e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigFetchHttpClient f9789f;

    /* renamed from: g  reason: collision with root package name */
    public final d f9790g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f9791h;

    /* compiled from: ConfigFetchHandler */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9792a;

        /* renamed from: b  reason: collision with root package name */
        public final b f9793b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9794c;

        public a(Date date, int i10, b bVar, String str) {
            this.f9792a = i10;
            this.f9793b = bVar;
            this.f9794c = str;
        }
    }

    public c(va.c cVar, ua.a<ja.a> aVar, Executor executor, b bVar, Random random, a aVar2, ConfigFetchHttpClient configFetchHttpClient, d dVar, Map<String, String> map) {
        this.f9784a = cVar;
        this.f9785b = aVar;
        this.f9786c = executor;
        this.f9787d = random;
        this.f9788e = aVar2;
        this.f9789f = configFetchHttpClient;
        this.f9790g = dVar;
        this.f9791h = map;
    }

    public final a a(String str, String str2, Date date) throws db.c {
        String str3;
        boolean z10 = false;
        try {
            a fetch = this.f9789f.fetch(this.f9789f.b(), str, str2, b(), this.f9790g.f9797a.getString("last_fetch_etag", (String) null), this.f9791h, date);
            String str4 = fetch.f9794c;
            if (str4 != null) {
                d dVar = this.f9790g;
                synchronized (dVar.f9798b) {
                    dVar.f9797a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f9790g.b(0, d.f9796e);
            return fetch;
        } catch (e e10) {
            int i10 = e10.f13224a;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = this.f9790g.a().f9800a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f9783j;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i11, iArr.length) - 1]);
                this.f9790g.b(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f9787d.nextInt((int) millis))));
            }
            d.a a10 = this.f9790g.a();
            int i12 = e10.f13224a;
            if (a10.f9800a > 1 || i12 == 429) {
                z10 = true;
            }
            if (!z10) {
                if (i12 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i12 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i12 == 429) {
                    throw new db.b("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new e(e10.f13224a, f.a("Fetch failed: ", str3), e10);
            }
            throw new db.d(a10.f9801b.getTime());
        }
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        ja.a aVar = this.f9785b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }
}
