package androidx.leanback.transition;

import android.content.Context;
import android.os.Build;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: TransitionHelper */
public final class b {

    /* compiled from: TransitionHelper */
    public static class a implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2106a;

        public a(c cVar) {
            this.f2106a = cVar;
        }

        public void onTransitionCancel(Transition transition) {
            this.f2106a.getClass();
        }

        public void onTransitionEnd(Transition transition) {
            this.f2106a.a(transition);
        }

        public void onTransitionPause(Transition transition) {
            this.f2106a.getClass();
        }

        public void onTransitionResume(Transition transition) {
            this.f2106a.getClass();
        }

        public void onTransitionStart(Transition transition) {
            this.f2106a.b(transition);
        }
    }

    /* renamed from: androidx.leanback.transition.b$b  reason: collision with other inner class name */
    /* compiled from: TransitionHelper */
    public static class C0027b {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<c> f2107a;
    }

    public static void a(Object obj, c cVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            a aVar = new a(cVar);
            cVar.f2108a = aVar;
            ((Transition) obj).addListener(aVar);
            return;
        }
        C0027b bVar = (C0027b) obj;
        if (bVar.f2107a == null) {
            bVar.f2107a = new ArrayList<>();
        }
        bVar.f2107a.add(cVar);
    }

    public static Object b(ViewGroup viewGroup, Runnable runnable) {
        if (Build.VERSION.SDK_INT < 19) {
            return runnable;
        }
        Scene scene = new Scene(viewGroup);
        scene.setEnterAction(runnable);
        return scene;
    }

    public static Object c(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return TransitionInflater.from(context).inflateTransition(i10);
        }
        return new C0027b();
    }

    public static void d(Object obj, Object obj2) {
        ArrayList<c> arrayList;
        ArrayList<c> arrayList2;
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionManager.go((Scene) obj, (Transition) obj2);
            return;
        }
        C0027b bVar = (C0027b) obj2;
        if (!(bVar == null || (arrayList2 = bVar.f2107a) == null)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                bVar.f2107a.get(i10).b(obj2);
            }
        }
        Runnable runnable = (Runnable) obj;
        if (runnable != null) {
            runnable.run();
        }
        if (bVar != null && (arrayList = bVar.f2107a) != null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                bVar.f2107a.get(i11).a(obj2);
            }
        }
    }
}
