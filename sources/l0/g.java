package l0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.activity.result.d;
import f0.e;
import j.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FontProvider */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20972a = 0;

    /* compiled from: FontProvider */
    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [l0.o[], android.database.Cursor] */
    public static n a(Context context, h hVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        Uri uri;
        boolean z10;
        h hVar2 = hVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = hVar2.f20973a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(f.a("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(hVar2.f20974b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, f.f20971a);
            List<List<byte[]>> list = hVar2.f20976d;
            if (list == null) {
                list = e.b(resources, 0);
            }
            int i10 = 0;
            while (true) {
                cursor = 0;
                if (i10 >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i10));
                Collections.sort(arrayList2, f.f20971a);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            z10 = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    break;
                }
                i10++;
            }
            if (resolveContentProvider == null) {
                return new n(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{hVar2.f20975c}, (String) null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                        int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        arrayList3.add(new o(uri, i13, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i12));
                    }
                }
                return new n(0, (o[]) arrayList3.toArray(new o[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder a10 = d.a("Found content provider ", str, ", but package was not ");
            a10.append(hVar2.f20974b);
            throw new PackageManager.NameNotFoundException(a10.toString());
        }
    }
}
