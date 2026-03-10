package p005j$.util.stream;

import java.util.function.Consumer;
import p005j$.util.function.AbstractC0937a;

/* JADX INFO: renamed from: j$.util.stream.W1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1081W1 extends AbstractC1056R1 implements InterfaceC1052Q1 {

    /* JADX INFO: renamed from: b */
    public long f3818b;

    public /* synthetic */ void accept(double r1) {
        AbstractC1205v1.m3400D();
        throw null;
    }

    public /* synthetic */ void accept(int r1) {
        AbstractC1205v1.m3407K();
        throw null;
    }

    public /* synthetic */ void accept(long r1) {
        AbstractC1205v1.m3408L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer r1) {
        return AbstractC0937a.m3231c(this, r1);
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: c */
    public final void mo3251c(long r1) {
        this.f3818b = 0;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean mo3257e() {
        return false;
    }

    @Override // p005j$.util.stream.InterfaceC1156l2
    public final /* synthetic */ void end() {
    }
}
