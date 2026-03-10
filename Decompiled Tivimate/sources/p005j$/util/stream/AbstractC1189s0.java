package p005j$.util.stream;

import java.util.function.Consumer;
import p005j$.util.function.AbstractC0937a;

/* JADX INFO: renamed from: j$.util.stream.s0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1189s0 implements InterfaceC1156l2 {

    /* JADX INFO: renamed from: a */
    public boolean f3980a;

    /* JADX INFO: renamed from: b */
    public boolean f3981b;

    public AbstractC1189s0(EnumC1194t0 r1) {
        this.f3981b = !r1.f3988b;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double r1) {
        AbstractC1205v1.m3400D();
        throw null;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public /* synthetic */ void accept(int r1) {
        AbstractC1205v1.m3407K();
        throw null;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public /* synthetic */ void accept(long r1) {
        AbstractC1205v1.m3408L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer r1) {
        return AbstractC0937a.m3231c(this, r1);
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo3251c(long r1) {
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: e */
    public final boolean mo3257e() {
        return this.f3980a;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public final /* synthetic */ void end() {
    }
}
