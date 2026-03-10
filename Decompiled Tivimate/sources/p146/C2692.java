package p146;

import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: ˉʼ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2692 {

    /* JADX INFO: renamed from: ʼˎ */
    public final boolean f9609;

    /* JADX INFO: renamed from: ʽ */
    public final String f9610;

    /* JADX INFO: renamed from: ˆʾ */
    public final C2693 f9611;

    /* JADX INFO: renamed from: ˈ */
    public final int f9612;

    /* JADX INFO: renamed from: ˑﹳ */
    public final Class f9613;

    /* JADX INFO: renamed from: ٴﹶ */
    public final boolean f9614;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean f9615;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Class[] f9616;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC2689[] f9617;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Method f9618;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final EnumC2690 f9619;

    public C2692(HashMap r21) {
        int r2 = 10;
        Object[][] r3 = {new Object[]{"handler", Method.class}, new Object[]{"priority", Integer.class}, new Object[]{"invocation", Class.class}, new Object[]{"filter", InterfaceC2689[].class}, new Object[]{"condition", String.class}, new Object[]{"envelope", Boolean.class}, new Object[]{"messages", Class[].class}, new Object[]{"synchronized", Boolean.class}, new Object[]{"listener", C2693.class}, new Object[]{"subtypes", Boolean.class}};
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L11;
        Object[] r14 = r3[r4];
        if (r21.get(r14[0]) == null) goto L10;
        Object[][] r19 = r3;
        if (((Class) r14[1]).isAssignableFrom(r21.get(r14[0]).getClass()) == false) goto L10;
        r4 = r4 + 1;
        r3 = r19;
        r2 = 10;
    L10:
        throw new IllegalArgumentException("Property " + r14[0] + " was expected to be not null and of type " + r14[1] + " but was: " + r21.get(r14[0]));
    L11:
        this.f9618 = (Method) r21.get("handler");
        this.f9617 = (InterfaceC2689[]) r21.get("filter");
        this.f9610 = (String) r21.get("condition");
        this.f9612 = ((Integer) r21.get("priority")).intValue();
        this.f9613 = (Class) r21.get("invocation");
        this.f9619 = (EnumC2690) r21.get("invocationMode");
        this.f9615 = ((Boolean) r21.get("envelope")).booleanValue();
        this.f9609 = ((Boolean) r21.get("subtypes")).booleanValue();
        this.f9611 = (C2693) r21.get("listener");
        this.f9614 = ((Boolean) r21.get("synchronized")).booleanValue();
        this.f9616 = (Class[]) r21.get("messages");
    }
}
