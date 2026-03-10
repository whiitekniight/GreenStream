package p384;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᵢˋ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5007 implements InterfaceC5001 {

    /* JADX INFO: renamed from: ʽʽ */
    public long f17883;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f17884;

    /* JADX INFO: renamed from: ᴵˊ */
    public final long f17885;

    public AbstractC5007(long r1, long r3) {
        this.f17884 = r1;
        this.f17885 = r3;
        this.f17883 = r1 - 1;
    }

    @Override // p384.InterfaceC5001
    public final boolean next() {
        long r0 = this.f17883 + 1;
        this.f17883 = r0;
        if (r0 <= this.f17885) goto L5;
        boolean r02 = true;
    L7:
        return !r02;
    L5:
        r02 = false;
        goto L7
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m9814() {
        long r0 = this.f17883;
        if (r0 < this.f17884) goto L8;
        if (r0 > this.f17885) goto L8;
        return;
    L8:
        throw new NoSuchElementException();
    }
}
