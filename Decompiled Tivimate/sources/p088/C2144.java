package p088;

import p005j$.util.Objects;
import p047.AbstractC1703;
import p317.AbstractC4195;

/* JADX INFO: renamed from: ʾﾞ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2144 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C2144 f7699 = null;

    /* JADX INFO: renamed from: ʽ */
    public final int f7700;

    /* JADX INFO: renamed from: ˈ */
    public final int f7701;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f7702;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f7703;

    static {
        f7699 = new C2144(-1, -1, -1);
    }

    public C2144(int r1, int r2, int r3) {
        this.f7703 = r1;
        this.f7702 = r2;
        this.f7700 = r3;
        if (AbstractC4195.m8481(r3) == false) goto L5;
        int r12 = AbstractC4195.m8491(r3) * r2;
    L6:
        this.f7701 = r12;
        return;
    L5:
        r12 = -1;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2144) == true) goto L8;
        return false;
    L8:
        C2144 r52 = (C2144) r5;
        if (this.f7703 == r52.f7703) goto L11;
    L15:
        return false;
    L11:
        if (this.f7702 != r52.f7702) goto L15;
        if (this.f7700 != r52.f7700) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f7703), Integer.valueOf(this.f7702), Integer.valueOf(this.f7700)});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AudioFormat[sampleRate=");
        r0.append(this.f7703);
        r0.append(", channelCount=");
        r0.append(this.f7702);
        r0.append(", encoding=");
        return AbstractC1703.m4495(r0, this.f7700, ']');
    }
}
