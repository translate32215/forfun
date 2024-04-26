package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ch implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f6122a;

    public ch(Pattern pattern) {
        pattern.getClass();
        this.f6122a = pattern;
    }

    public final boolean accept(@NullableDecl File file, String str) {
        return this.f6122a.matcher(str).matches();
    }
}
