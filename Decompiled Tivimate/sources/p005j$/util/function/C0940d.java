package p005j$.util.function;

import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.function.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0940d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f3581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f3582c;

    public /* synthetic */ C0940d(Function r1, Function r2, int r3) {
        this.f3580a = r3;
        this.f3581b = r1;
        this.f3582c = r2;
    }

    public final /* synthetic */ Function andThen(Function r2) {
        switch(this.f3580a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Function$CC.$default$andThen(this, r2);
    L7:
        return Function$CC.$default$andThen(this, r2);
    }

    @Override // java.util.function.Function
    public final Object apply(Object r3) {
        switch(this.f3580a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        Object r32 = this.f3582c.apply(r3);
        return this.f3581b.apply(r32);
    L7:
        return this.f3582c.apply(this.f3581b.apply(r3));
    }

    public final /* synthetic */ Function compose(Function r2) {
        switch(this.f3580a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Function$CC.$default$compose(this, r2);
    L7:
        return Function$CC.$default$compose(this, r2);
    }
}
