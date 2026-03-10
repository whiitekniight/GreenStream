package p165;

import p138.InterfaceC2621;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ˊʽ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2945 implements InterfaceC2621 {

    /* JADX INFO: renamed from: ʾˋ */
    public final ThreadLocal f10368;

    public C2945(ThreadLocal r1) {
        this.f10368 = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2945) == true) goto L9;
        return false;
    L9:
        if (AbstractC2927.m6273(this.f10368, ((C2945) r4).f10368) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f10368.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f10368 + ')';
    }
}
