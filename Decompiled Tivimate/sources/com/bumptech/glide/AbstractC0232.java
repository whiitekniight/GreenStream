package com.bumptech.glide;

import p099.AbstractC2229;
import p129.C2475;
import p129.InterfaceC2474;

/* JADX INFO: renamed from: com.bumptech.glide.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232 implements Cloneable {

    /* JADX INFO: renamed from: ʾˋ */
    public InterfaceC2474 f1664;

    public AbstractC0232() {
        this.f1664 = C2475.f8793;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m1200();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof AbstractC0232) == true) goto L5;
        return false;
    L5:
        return AbstractC2229.m5414(this.f1664, ((AbstractC0232) r2).f1664);
    }

    public int hashCode() {
        InterfaceC2474 r0 = this.f1664;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC0232 m1200() {
        return (AbstractC0232) super.clone();
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
