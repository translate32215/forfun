package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: SpannedToHtmlConverter */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f5436a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f5437a;

        public b(String str, Map map, a aVar) {
            this.f5437a = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$c  reason: collision with other inner class name */
    /* compiled from: SpannedToHtmlConverter */
    public static final class C0080c {

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator<C0080c> f5438e = i6.b.f19270c;

        /* renamed from: a  reason: collision with root package name */
        public final int f5439a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5440b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5441c;

        /* renamed from: d  reason: collision with root package name */
        public final String f5442d;

        public C0080c(int i10, int i11, String str, String str2, a aVar) {
            this.f5439a = i10;
            this.f5440b = i11;
            this.f5441c = str;
            this.f5442d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<C0080c> f5443a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<C0080c> f5444b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f5436a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
