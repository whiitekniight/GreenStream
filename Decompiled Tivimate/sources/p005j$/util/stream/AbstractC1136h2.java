package p005j$.util.stream;

import java.util.function.Consumer;
import p005j$.util.Objects;
import p005j$.util.function.AbstractC0937a;

/* JADX INFO: renamed from: j$.util.stream.h2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1136h2 implements InterfaceC1156l2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1156l2 f3914a;

    public AbstractC1136h2(InterfaceC1156l2 r1) {
        this.f3914a = (InterfaceC1156l2) Objects.requireNonNull(r1);
    }

    @Override // p005j$.util.stream.InterfaceC1156l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double r1) {
        AbstractC1205v1.m3400D();
        throw null;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public final /* synthetic */ void accept(int r1) {
        AbstractC1205v1.m3407K();
        throw null;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public final /* synthetic */ void accept(long r1) {
        AbstractC1205v1.m3408L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer r1) {
        return AbstractC0937a.m3231c(this, r1);
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: c */
    public void mo3251c(long r2) {
        this.f3914a.mo3251c(r2);
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: e */
    public boolean mo3257e() {
        return this.f3914a.mo3257e();
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public void end() {
        this.f3914a.end();
    }
}
