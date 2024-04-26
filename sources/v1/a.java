package v1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import t1.e;
import x1.d;
import y1.b;

/* compiled from: DBUtil */
public class a {
    public static Cursor a(e eVar, d dVar, boolean z10) {
        eVar.a();
        eVar.b();
        Cursor i10 = ((y1.a) ((b) eVar.f25375c).a()).i(dVar);
        if (z10 && (i10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) i10;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i11 = 0; i11 < abstractWindowedCursor.getColumnCount(); i11++) {
                            int type = abstractWindowedCursor.getType(i11);
                            if (type == 0) {
                                objArr[i11] = null;
                            } else if (type == 1) {
                                objArr[i11] = Long.valueOf(abstractWindowedCursor.getLong(i11));
                            } else if (type == 2) {
                                objArr[i11] = Double.valueOf(abstractWindowedCursor.getDouble(i11));
                            } else if (type == 3) {
                                objArr[i11] = abstractWindowedCursor.getString(i11);
                            } else if (type == 4) {
                                objArr[i11] = abstractWindowedCursor.getBlob(i11);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return i10;
    }
}
