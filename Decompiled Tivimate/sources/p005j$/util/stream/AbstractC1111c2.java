package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1111c2 extends AbstractC1116d2 {
    static {
    }

    @Override // p005j$.util.stream.AbstractC1098a
    /* JADX INFO: renamed from: O0 */
    public final boolean mo3322O0() {
        return false;
    }

    @Override // p005j$.util.stream.InterfaceC1128g
    public final InterfaceC1128g unordered() {
        if (EnumC1092Y2.ORDERED.m3328q(this.f3864m) == true) goto L6;
        return this;
    L6:
        return new C1096Z1(this, EnumC1092Y2.f3846r);
    }
}
