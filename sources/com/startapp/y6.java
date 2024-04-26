package com.startapp;

import com.startapp.networkTest.enums.MultiSimVariants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Sta */
public class y6 implements Cloneable {
    public int ActiveSimCount = -1;
    public int ActiveSimCountMax = -1;
    public int DefaultDataSimId = -1;
    public int DefaultSimId = -1;
    public int DefaultSmsSimId = -1;
    public int DefaultVoiceSimId = -1;
    public MultiSimVariants MultiSimVariant = MultiSimVariants.Unknown;
    @ob(type = ArrayList.class, value = x9.class)
    public ArrayList<x9> SimInfos = new ArrayList<>();

    public x9 getDefaultDataSimInfo() {
        Iterator<x9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            x9 next = it.next();
            if (next.SubscriptionId == this.DefaultDataSimId) {
                return next;
            }
        }
        return new x9();
    }

    public x9 getDefaultSmsSimInfo() {
        Iterator<x9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            x9 next = it.next();
            if (next.SubscriptionId == this.DefaultSmsSimId) {
                return next;
            }
        }
        return new x9();
    }

    public x9 getDefaultVoiceSimInfo() {
        Iterator<x9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            x9 next = it.next();
            if (next.SubscriptionId == this.DefaultVoiceSimId) {
                return next;
            }
        }
        return new x9();
    }

    public x9 getSimInfoSubId(int i10) {
        Iterator<x9> it = this.SimInfos.iterator();
        while (it.hasNext()) {
            x9 next = it.next();
            if (next.SubscriptionId == i10) {
                return next;
            }
        }
        return new x9();
    }
}
