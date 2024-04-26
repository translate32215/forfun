package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy */
public enum c implements d {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    };

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public static class b extends c {
        public b(String str, int i10) {
            super(str, i10, (a) null);
        }

        public String a(Field field) {
            return c.c(field.getName());
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.gson.c$c  reason: collision with other inner class name */
    /* compiled from: FieldNamingPolicy */
    public static class C0109c extends c {
        public C0109c(String str, int i10) {
            super(str, i10, (a) null);
        }

        public String a(Field field) {
            return c.c(c.b(field.getName(), " "));
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public static class d extends c {
        public d(String str, int i10) {
            super(str, i10, (a) null);
        }

        public String a(Field field) {
            return c.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public static class e extends c {
        public e(String str, int i10) {
            super(str, i10, (a) null);
        }

        public String a(Field field) {
            return c.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public static class f extends c {
        public f(String str, int i10) {
            super(str, i10, (a) null);
        }

        public String a(Field field) {
            return c.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    }

    /* access modifiers changed from: public */
    c(a aVar) {
    }

    public static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb2.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i11 = i10 + 1;
        if (i11 < str.length()) {
            StringBuilder a10 = q.c.a(upperCase);
            a10.append(str.substring(i11));
            str2 = a10.toString();
        } else {
            str2 = String.valueOf(upperCase);
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
