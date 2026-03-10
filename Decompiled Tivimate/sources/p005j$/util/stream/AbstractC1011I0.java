package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.I0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1011I0 implements InterfaceC1001G0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1001G0 f3701a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1001G0 f3702b;

    /* JADX INFO: renamed from: c */
    public final long f3703c;

    public AbstractC1011I0(InterfaceC1001G0 r3, InterfaceC1001G0 r4) {
        this.f3701a = r3;
        this.f3702b = r4;
        long r0 = r3.count();
        this.f3703c = r4.count() + r0;
    }

    @Override // p005j$.util.stream.InterfaceC1001G0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC0996F0 mo3271a(int r1) {
        return (InterfaceC0996F0) mo3271a(r1);
    }

    @Override // p005j$.util.stream.InterfaceC1001G0
    /* JADX INFO: renamed from: a */
    public final InterfaceC1001G0 mo3271a(int r2) {
        if (r2 != 0) goto L6;
        return this.f3701a;
    L6:
        if (r2 != 1) goto L10;
        return this.f3702b;
    L10:
        throw new IndexOutOfBoundsException();
    }

    @Override // p005j$.util.stream.InterfaceC1001G0
    public final long count() {
        return this.f3703c;
    }

    @Override // p005j$.util.stream.InterfaceC1001G0
    /* JADX INFO: renamed from: o */
    public final int mo3278o() {
        return 2;
    }
}
