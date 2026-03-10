package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.V1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1076V1 extends AbstractC1081W1 {
    @Override // java.util.function.Consumer
    public final void accept(Object r5) {
        this.f3818b++;
    }

    @Override // p005j$.util.stream.AbstractC1056R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f3818b);
    }

    @Override // p005j$.util.stream.InterfaceC1052Q1
    /* JADX INFO: renamed from: i */
    public final void mo3258i(InterfaceC1052Q1 r5) {
        this.f3818b += ((AbstractC1081W1) r5).f3818b;
    }
}
