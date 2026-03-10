package p459;

import ʽⁱ.ᵎﹶ;

/* JADX INFO: renamed from: ﹶﾞ.ˎᐧ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5759 extends ᵎﹶ {

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f20850;

    public AbstractC5759(C5805 r2) {
        super(r2);
        ((C5805) ((ᵎﹶ) this).ʾˋ).f21149++;
    }

    /* JADX INFO: renamed from: ʽˑ */
    public final void m11178() {
        if (this.f20850 == false) goto L6;
        return;
    L6:
        throw new IllegalStateException("Not initialized");
    }

    /* JADX INFO: renamed from: ˋˊ */
    public final void m11179() {
        if (this.f20850 == true) goto L9;
        if (mo10920() == true) goto L10;
        ((C5805) ((ᵎﹶ) this).ʾˋ).f21143.incrementAndGet();
        this.f20850 = true;
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: renamed from: ﹶˎ */
    public abstract boolean mo10920();
}
