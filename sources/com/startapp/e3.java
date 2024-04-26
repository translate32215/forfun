package com.startapp;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: Sta */
public class e3 implements xa {

    /* renamed from: a  reason: collision with root package name */
    public final va f10322a;

    public e3(va vaVar) {
        this.f10322a = vaVar;
    }

    public String a(String str) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                d4.a(gZIPOutputStream2);
                String a10 = this.f10322a.a(s0.b(byteArrayOutputStream.toByteArray()));
                d4.a(gZIPOutputStream2);
                return a10;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                d4.a(gZIPOutputStream);
                return "";
            } catch (Throwable th) {
                d4.a(gZIPOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            d4.a(gZIPOutputStream);
            return "";
        }
    }
}
