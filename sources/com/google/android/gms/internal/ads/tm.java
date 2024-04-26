package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import e8.c40;
import e8.o60;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tm {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f8205c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a  reason: collision with root package name */
    public String[] f8206a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b  reason: collision with root package name */
    public c40 f8207b;

    public tm(c40 c40) {
        this.f8207b = c40;
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws o60 {
        try {
            return b(uri, this.f8207b.g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new o60("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, String str) throws o60 {
        boolean z10;
        try {
            uri.getClass();
            try {
                z10 = uri.getHost().equals("ad.doubleclick.net");
            } catch (NullPointerException unused) {
                z10 = false;
            }
            if (z10) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new o60("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new o60("Query parameter already exists: ms");
            }
            if (z10) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i10 = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i10) + "dc_ms" + "=" + str + ";" + uri2.substring(i10));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i11 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i11) + "ms" + "=" + str + "&" + uri3.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new o60("Provided Uri is not in a valid state");
        }
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String endsWith : this.f8206a) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
