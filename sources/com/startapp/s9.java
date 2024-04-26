package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: Sta */
public class s9 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11704a = "s9";

    public static String a(String str) {
        String str2;
        try {
            str2 = InetAddress.getByName(str).getCanonicalHostName();
        } catch (UnknownHostException e10) {
            x2.b(e10);
            str2 = null;
        }
        if (str2 != null && !str2.equals(str) && str2.contains("cloudfront")) {
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                return b(split[1]);
            }
        }
        return "";
    }

    public static String b(String str) {
        return (str == null || str.length() <= 2) ? "" : str.substring(0, 3);
    }
}
