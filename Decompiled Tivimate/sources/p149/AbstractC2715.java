package p149;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ˉˆ.ʻˋ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2715 {

    /* JADX INFO: renamed from: ʽ */
    public static final Field f9698 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final Field f9699 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final Field f9700 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Method f9701 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final boolean f9702 = false;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final Field f9703 = null;

    static {
        Class<?> r3 = Class.forName("android.graphics.Insets");     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
        Method r4 = Drawable.class.getMethod("getOpticalInsets", null);     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
    L37:
        Field r5 = r3.getField("left");     // Catch: NoSuchFieldException -> L14 ClassNotFoundException -> L16 NoSuchMethodException -> L18
        Field r6 = r3.getField("top");     // Catch: NoSuchFieldException -> L10 ClassNotFoundException -> L12 NoSuchMethodException -> L13
        Field r7 = r3.getField("right");     // Catch: Throwable -> L9
        Field r32 = r3.getField("bottom");     // Catch: Throwable -> L28
        boolean r8 = true;
    L24:
        if (r8 == false) goto L26;
        f9701 = r4;
        f9698 = r5;
        f9699 = r6;
        f9700 = r7;
        f9703 = r32;
        f9702 = true;
        return;
    L26:
        f9701 = null;
        f9698 = null;
        f9699 = null;
        f9700 = null;
        f9703 = null;
        f9702 = false;
        return;
    L23:
        r32 = null;
        r8 = false;
    L9:
        r7 = null;
        goto L23
    L12:
        r6 = null;
    L11:
        r7 = r6;
    L10:
        r6 = null;
    L13:
        r6 = null;
        goto L11
    L16:
        r5 = null;
    L17:
        r6 = r5;
    L14:
        r5 = null;
    L15:
        r6 = r5;
    L18:
        r5 = null;
    L19:
        r6 = r5;
    L21:
        r4 = null;
        r5 = null;
    L20:
        r4 = null;
        r5 = null;
    L22:
        r4 = null;
        r5 = null;
        goto L19
    }
}
