package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;
import p322.C4268;
import p322.InterfaceC4269;

/* JADX INFO: renamed from: androidx.lifecycle.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0174 extends Enum {
    private static final /* synthetic */ InterfaceC4269 $ENTRIES = null;
    private static final /* synthetic */ EnumC0174[] $VALUES = null;
    public static final C0188 Companion = null;
    public static final EnumC0174 ON_ANY = null;
    public static final EnumC0174 ON_CREATE = null;
    public static final EnumC0174 ON_DESTROY = null;
    public static final EnumC0174 ON_PAUSE = null;
    public static final EnumC0174 ON_RESUME = null;
    public static final EnumC0174 ON_START = null;
    public static final EnumC0174 ON_STOP = null;

    static {
        EnumC0174 r0 = new EnumC0174("ON_CREATE", 0);
        ON_CREATE = r0;
        EnumC0174 r1 = new EnumC0174("ON_START", 1);
        ON_START = r1;
        EnumC0174 r3 = new EnumC0174("ON_RESUME", 2);
        ON_RESUME = r3;
        EnumC0174 r5 = new EnumC0174("ON_PAUSE", 3);
        ON_PAUSE = r5;
        EnumC0174 r7 = new EnumC0174("ON_STOP", 4);
        ON_STOP = r7;
        EnumC0174 r9 = new EnumC0174("ON_DESTROY", 5);
        ON_DESTROY = r9;
        EnumC0174 r11 = new EnumC0174("ON_ANY", 6);
        ON_ANY = r11;
        EnumC0174[] r13 = {r0, r1, r3, r5, r7, r9, r11};
        $VALUES = r13;
        $ENTRIES = new C4268(r13);
        Companion = new C0188();
    }

    public static EnumC0174 valueOf(String r1) {
        return (EnumC0174) Enum.valueOf(EnumC0174.class, r1);
    }

    public static EnumC0174[] values() {
        return (EnumC0174[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final EnumC0198 m702() {
        switch(AbstractC0208.f1122[ordinal()]) {
            case 1: goto L15;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        throw new IllegalArgumentException(this + " has no target state");
    L9:
        return EnumC0198.f1101;
    L11:
        return EnumC0198.f1105;
    L13:
        return EnumC0198.f1102;
    L15:
        return EnumC0198.f1100;
    }
}
