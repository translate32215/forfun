package com.bumptech.glide;

import com.bumptech.glide.j;

/* compiled from: TransitionOptions */
public abstract class j<CHILD extends j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public final CHILD a() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
