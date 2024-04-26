package dev.pankaj.yacinetv;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.c;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f13343a = new SparseIntArray(0);

    public List<b> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new dev.pankaj.ytvclib.DataBinderMapperImpl());
        return arrayList;
    }

    public ViewDataBinding b(c cVar, View view, int i10) {
        if (f13343a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f13343a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
