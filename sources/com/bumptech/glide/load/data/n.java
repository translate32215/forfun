package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher */
public class n extends l<InputStream> {

    /* renamed from: d  reason: collision with root package name */
    public static final UriMatcher f4992d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f4992d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(android.net.Uri r4, android.content.ContentResolver r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = f4992d
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0019
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L_0x0032
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L_0x0023:
            if (r5 == 0) goto L_0x0026
            return r5
        L_0x0026:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r4 = androidx.appcompat.widget.x0.a(r0, r4)
            r5.<init>(r4)
            throw r5
        L_0x0032:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.n.d(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }
}
