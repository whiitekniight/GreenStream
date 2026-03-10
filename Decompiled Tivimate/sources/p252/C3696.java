package p252;

import p164.AbstractC2927;
import p334.EnumC4444;

/* JADX INFO: renamed from: ˑᵎ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C3696 {

    /* JADX INFO: renamed from: ⁱˊ */
    public EnumC4444 f13209;

    /* JADX INFO: renamed from: ﹳٴ */
    public String f13210;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3696) == true) goto L8;
        return false;
    L8:
        C3696 r52 = (C3696) r5;
        if (AbstractC2927.m6273(this.f13210, r52.f13210) == true) goto L12;
        return false;
    L12:
        if (this.f13209 == r52.f13209) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f13210.hashCode() * 31;
        return this.f13209.hashCode() + r0;
    }

    public final String toString() {
        return "IdAndState(id=" + this.f13210 + ", state=" + this.f13209 + ')';
    }
}
