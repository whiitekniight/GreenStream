package p447;

import p093.C2199;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ﹶˑ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C5627 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2199 f20360;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f20361;

    public C5627(String r1, C2199 r2) {
        this.f20361 = r1;
        this.f20360 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C5627) == true) goto L8;
        return false;
    L8:
        C5627 r52 = (C5627) r5;
        if (AbstractC2927.m6273(this.f20361, r52.f20361) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f20360, r52.f20360) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f20361.hashCode() * 31;
        return this.f20360.hashCode() + r0;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f20361 + ", range=" + this.f20360 + ')';
    }
}
