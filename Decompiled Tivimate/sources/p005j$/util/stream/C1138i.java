package p005j$.util.stream;

import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1138i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collector f3919a;

    public /* synthetic */ C1138i(Collector r1) {
        this.f3919a = r1;
    }

    public final /* synthetic */ boolean equals(Object r3) {
        Collector r0 = this.f3919a;
        if ((r3 instanceof C1138i) == false) goto L6;
        r3 = ((C1138i) r3).f3919a;
    L6:
        return r0.equals(r3);
    }

    public final /* synthetic */ int hashCode() {
        return this.f3919a.hashCode();
    }
}
