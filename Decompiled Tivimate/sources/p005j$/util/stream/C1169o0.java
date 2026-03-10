package p005j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1169o0 extends AbstractC1189s0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC1194t0 f3952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Predicate f3953d;

    public C1169o0(EnumC1194t0 r1, Predicate r2) {
        this.f3952c = r1;
        this.f3953d = r2;
        super(r1);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object r3) {
        if (this.f3980a == true) goto L8;
        boolean r32 = this.f3953d.test(r3);
        EnumC1194t0 r0 = this.f3952c;
        if (r32 != r0.f3987a) goto L9;
        this.f3980a = true;
        this.f3981b = r0.f3988b;
        return;
    L9:
        return;
    }
}
