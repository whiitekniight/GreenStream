package p317;

import ar.tvplayer.core.domain.ʽﹳ;

/* JADX INFO: renamed from: ᐧˎ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4216 {

    /* JADX INFO: renamed from: ʽ */
    public boolean f15477;

    /* JADX INFO: renamed from: ˈ */
    public boolean f15478;

    /* JADX INFO: renamed from: ⁱˊ */
    public ʽﹳ f15479;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f15480;

    public C4216(Object r2) {
        this.f15480 = r2;
        this.f15479 = new ʽﹳ(4);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C4216.class != r3.getClass()) goto L13;
        Object r32 = ((C4216) r3).f15480;
        return this.f15480.equals(r32);
    L13:
        return false;
    }

    public final int hashCode() {
        return this.f15480.hashCode();
    }
}
