package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.appcompat.widget.x0;
import d0.a;
import j.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f1404b = {"_display_name", "_size"};

    /* renamed from: c  reason: collision with root package name */
    public static final File f1405c = new File("/");

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, b> f1406d = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public b f1407a;

    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    public interface b {
        File a(Uri uri);
    }

    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, File> f1408a = new HashMap<>();

        public c(String str) {
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1408a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException(x0.a("Unable to find configured root for ", uri));
            }
        }
    }

    public static b a(Context context, String str, int i10) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.metaData == null && i10 != 0) {
                Bundle bundle = new Bundle(1);
                resolveContentProvider.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i10);
            }
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return cVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                        if ("root-path".equals(name)) {
                            file = f1405c;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            Object obj = d0.a.f12940a;
                            File[] b10 = Build.VERSION.SDK_INT >= 19 ? a.b.b(context, (String) null) : new File[]{context.getExternalFilesDir((String) null)};
                            if (b10.length > 0) {
                                file = b10[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            Object obj2 = d0.a.f12940a;
                            File[] a10 = Build.VERSION.SDK_INT >= 19 ? a.b.a(context) : new File[]{context.getExternalCacheDir()};
                            if (a10.length > 0) {
                                file = a10[0];
                            }
                        } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                            File[] a11 = a.a(context);
                            if (a11.length > 0) {
                                file = a11[0];
                            }
                        }
                        if (file != null) {
                            String[] strArr = {attributeValue2};
                            for (int i11 = 0; i11 < 1; i11++) {
                                String str2 = strArr[i11];
                                if (str2 != null) {
                                    file = new File(file, str2);
                                }
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    cVar.f1408a.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e10) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException(f.a("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        b bVar;
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap<String, b> hashMap = f1406d;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            synchronized (hashMap) {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    try {
                        bVar = a(context, str, 0);
                        hashMap.put(str, bVar);
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            }
            this.f1407a = bVar;
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1407a.a(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$b r0 = r2.f1407a
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i10;
        File a10 = this.f1407a.a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i10 = 738197504;
        } else if ("wa".equals(str)) {
            i10 = 704643072;
        } else if ("rw".equals(str)) {
            i10 = 939524096;
        } else if ("rwt".equals(str)) {
            i10 = 1006632960;
        } else {
            throw new IllegalArgumentException(f.a("Invalid mode: ", str));
        }
        return ParcelFileDescriptor.open(a10, i10);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File a10 = this.f1407a.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1404b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? a10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
