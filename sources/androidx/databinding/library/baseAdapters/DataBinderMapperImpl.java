package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.c;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1464a = new SparseIntArray(0);

    public List<b> a() {
        return new ArrayList(0);
    }

    public ViewDataBinding b(c cVar, View view, int i10) {
        if (f1464a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f1464a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
