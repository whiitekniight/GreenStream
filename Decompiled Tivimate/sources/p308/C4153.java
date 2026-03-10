package p308;

import java.util.Arrays;

/* JADX INFO: renamed from: ٴﾞ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C4153 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C4153 f15298 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15299;

    static {
        f15298 = new C4153(null);
    }

    public /* synthetic */ C4153(String r1) {
        this.f15299 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof C4153) == true) goto L10;
        return false;
    L10:
        return AbstractC4142.m8390(this.f15299, ((C4153) r2).f15299);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15299});
    }
}
