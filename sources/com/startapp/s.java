package com.startapp;

import android.content.Context;
import java.lang.Thread;

/* compiled from: Sta */
public class s implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f11685a;

    public s(Context context) {
    }

    public final void a(Thread thread, Throwable th) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11685a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (wb.a(th) != null) {
                if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th.getMessage())) {
                    a(thread, th);
                    return;
                }
                i4.a(th, j4.f10591h);
            }
        } catch (Throwable unused) {
        }
        a(thread, th);
    }
}
