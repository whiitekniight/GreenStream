package p459;

import java.util.function.Function;
import p005j$.util.function.Function$CC;

/* JADX INFO: renamed from: ﹶﾞ.יˉ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5774 implements Function {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ C5774 f20904 = null;

    static {
        f20904 = new C5774();
    }

    public /* synthetic */ Function andThen(Function r1) {
        return Function$CC.$default$andThen(this, r1);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object r3) {
        return Long.valueOf(((C5755) r3).f20847);
    }

    public /* synthetic */ Function compose(Function r1) {
        return Function$CC.$default$compose(this, r1);
    }
}
