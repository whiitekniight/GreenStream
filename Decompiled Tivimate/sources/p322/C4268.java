package p322;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import p442.AbstractC5579;
import p442.AbstractC5583;

/* JADX INFO: renamed from: ᐧᵔ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4268 extends AbstractC5583 implements InterfaceC4269, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Enum[] f15640;

    public C4268(Enum[] r1) {
        this.f15640 = r1;
    }

    @Override // p442.AbstractC5595, java.util.Collection, java.util.List
    public final boolean contains(Object r4) {
        if ((r4 instanceof Enum) == true) goto L5;
        return false;
    L5:
        Enum r42 = (Enum) r4;
        Enum[] r0 = this.f15640;
        if (((Enum) AbstractC5579.m10726(r42.ordinal(), r0)) != r42) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        Enum[] r0 = this.f15640;
        int r1 = r0.length;
        if (r5 < 0) goto L8;
        if (r5 >= r1) goto L8;
        return r0[r5];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0002.m14(r5, r1, "index: ", ", size: "));
    }

    @Override // p442.AbstractC5583, java.util.List
    public final int indexOf(Object r4) {
        if ((r4 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r42 = (Enum) r4;
        int r0 = r42.ordinal();
        if (((Enum) AbstractC5579.m10726(r0, this.f15640)) != r42) goto L8;
        return r0;
    L8:
        return -1;
    }

    @Override // p442.AbstractC5583, java.util.List
    public final int lastIndexOf(Object r4) {
        if ((r4 instanceof Enum) == true) goto L5;
        return -1;
    L5:
        Enum r42 = (Enum) r4;
        int r0 = r42.ordinal();
        if (((Enum) AbstractC5579.m10726(r0, this.f15640)) != r42) goto L8;
        return r0;
    L8:
        return -1;
    }

    @Override // p442.AbstractC5595
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo6497() {
        return this.f15640.length;
    }
}
