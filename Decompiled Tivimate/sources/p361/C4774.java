package p361;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p005j$.util.DesugarCollections;
import p155.C2871;
import p155.C2878;
import p372.C4852;
import ﹳˋ.ʽʽ;

/* JADX INFO: renamed from: ᵎⁱ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public class C4774 extends C4777 {

    /* JADX INFO: renamed from: ʼˈ */
    public final Method f16822;

    /* JADX INFO: renamed from: ˈⁱ */
    public final Method f16823;

    /* JADX INFO: renamed from: ˊˋ */
    public final Method f16824;

    /* JADX INFO: renamed from: ˋᵔ */
    public final Constructor f16825;

    /* JADX INFO: renamed from: ˑٴ */
    public final Class f16826;

    /* JADX INFO: renamed from: ـˏ */
    public final Method f16827;

    /* JADX INFO: renamed from: ﹳـ */
    public final Method f16828;

    public C4774() {
        Class<?> r0 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r3 = m9400(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Class<?> r6 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r4 = r1.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r6, FontVariationAxis[].class, r6, r6});     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r5 = r1.getMethod("freeze", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r62 = r1.getMethod("abortCreation", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r12 = mo9379(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        r0 = r1;
    L9:
        this.f16826 = r0;
        this.f16825 = r2;
        this.f16824 = r3;
        this.f16822 = r4;
        this.f16827 = r5;
        this.f16828 = r62;
        this.f16823 = r12;
        return;
    L7:
        e = move-exception;
        "Unable to collect necessary methods for class ".concat(e.getClass().getName());
        r12 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r62 = null;
        goto L9
    }

    /* JADX INFO: renamed from: ـﹶ */
    public static Method m9400(Class r4) {
        Class<?> r2 = Integer.TYPE;
        return r4.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r2, Boolean.TYPE, r2, r2, r2, FontVariationAxis[].class});
    }

    /* JADX INFO: renamed from: ʻᵎ */
    public Typeface mo9378(Object r7) {
        Object r2 = Array.newInstance(this.f16826, 1);     // Catch: Throwable -> L5
        Array.set(r2, 0, r7);     // Catch: Throwable -> L5
        return (Typeface) this.f16823.invoke(null, new Object[]{r2, -1, -1});
    L5:
        return null;
    }

    @Override // p361.C4777
    /* JADX INFO: renamed from: ˆʾ */
    public final Typeface mo9401(Context r10, C2871 r11, Resources r12, int r13) {
        Method r0 = this.f16824;
        if (r0 == null) goto L5;
    L5:
        if (r0 == null) goto L25;
        Object r2 = this.f16825.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r2 == null) goto L21;
        C2878[] r112 = r11.f10158;
        int r132 = r112.length;
        int r8 = 0;
    L13:
        if (r8 >= r132) goto L20;
        C2878 r02 = r112[r8];
        String r3 = r02.f10197;
        int r4 = r02.f10195;
        int r5 = r02.f10196;
        boolean r6 = r02.f10193;
        Context r1 = r10;
        if (m9404(r1, r2, r3, r4, r5, r6 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r02.f10194)) == false) goto L29;
        r8 = r8 + 1;
        r10 = r1;
        goto L13
    L29:
        this.f16828.invoke(r2, null);     // Catch: Throwable -> L26
        goto L21
    L20:
        if (m9402(r2) == false) goto L21;
        return mo9378(r2);
    L21:
        return null;
    L9:
        r2 = null;
        goto L10
    L25:
        return super.mo9401(r10, r11, r12, r13);
    }

    /* JADX INFO: renamed from: ˈˏ */
    public Method mo9379(Class r4) {
        Class r42 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r4, 1).getClass(), r42, r42});
        r43.setAccessible(true);
        return r43;
    }

    /* JADX INFO: renamed from: ˊᵔ */
    public final boolean m9402(Object r3) {
        return ((Boolean) this.f16827.invoke(r3, null)).booleanValue();
    L4:
        return false;
    }

    @Override // p361.C4777
    /* JADX INFO: renamed from: ٴﹶ */
    public final Typeface mo9403(Context r18, C4852[] r19, int r20) {
        char r5 = 1;
        if (r19.length < 1) goto L68;
        Method r3 = this.f16824;
        if (r3 == null) goto L81;
    L81:
        if (r3 == null) goto L53;
        HashMap r32 = new HashMap();
        int r6 = r19.length;
        int r8 = 0;
    L10:
        if (r8 >= r6) goto L19;
        C4852 r9 = r19[r8];
        if (r9.f17168 != 0) goto L18;
        Uri r92 = r9.f17167;
        if (r32.containsKey(r92) == true) goto L18;
        r32.put(r92, ʽʽ.יـ(r18, r92));
    L18:
        r8 = r8 + 1;
        goto L10
    L19:
        Map r33 = DesugarCollections.unmodifiableMap(r32);
        Object r62 = this.f16825.newInstance(null);     // Catch: Throwable -> L22
    L23:
        if (r62 == null) goto L68;
        int r82 = r19.length;
        int r93 = 0;
        char r10 = 0;
    L26:
        Method r11 = this.f16828;
        if (r93 >= r82) goto L42;
        C4852 r12 = r19[r93];
        ByteBuffer r13 = (ByteBuffer) r33.get(r12.f17167);
        if (r13 != null) goto L31;
        char r16 = r5;
    L41:
        r93 = r93 + 1;     // Catch: Throwable -> L70
        r5 = r16;
        goto L26
    L31:
        int r102 = r12.f17166;
        int r14 = r12.f17163;
        boolean r122 = r12.f17164;
        Method r15 = this.f16822;     // Catch: Throwable -> L36
        Integer r103 = Integer.valueOf(r102);     // Catch: Throwable -> L36
        Integer r142 = Integer.valueOf(r14);     // Catch: Throwable -> L36
        Integer r123 = Integer.valueOf(r122 ? 1 : 0);     // Catch: Throwable -> L36
        r16 = r5;
        Object[] r52 = new Object[5];     // Catch: Throwable -> L69
        r52[0] = r13;     // Catch: Throwable -> L69
        r52[r16] = r103;     // Catch: Throwable -> L69
        r52[2] = null;     // Catch: Throwable -> L69
        r52[3] = r142;     // Catch: Throwable -> L69
        r52[4] = r123;     // Catch: Throwable -> L69
        boolean r53 = ((Boolean) r15.invoke(r62, r52)).booleanValue();     // Catch: Throwable -> L69
    L38:
        if (r53 == false) goto L39;
        r10 = r16;
        goto L41
    L39:
        r11.invoke(r62, null);     // Catch: Throwable -> L70
    L37:
        r53 = false;
    L36:
        r16 = r5;
        goto L37
    L42:
        if (r10 != 0) goto L46;
        r11.invoke(r62, null);     // Catch: Throwable -> L70
        goto L68
    L46:
        if (m9402(r62) == false) goto L68;
        Typeface r0 = mo9378(r62);
        if (r0 == null) goto L68;
        return Typeface.create(r0, r20);
    L22:
        r62 = null;
        goto L23
    L53:
        C4852 r02 = יـ(r19, r20);
        ParcelFileDescriptor r2 = r18.getContentResolver().openFileDescriptor(r02.f17167, "r", null);
        if (r2 != null) goto L73;
        if (r2 == null) goto L68;
        r2.close();
        return null;
    L73:
        Typeface r03 = new Typeface.Builder(r2.getFileDescriptor()).setWeight(r02.f17163).setItalic(r02.f17164).build();     // Catch: Throwable -> L61
        r2.close();     // Catch: Throwable -> L70
        return r03;
    L61:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L65
        goto L68
    L89:
        throw th;     // Catch: Throwable -> L70
    L65:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L70
        throw th;     // Catch: Throwable -> L70
    L68:
        return null;
    }

    /* JADX INFO: renamed from: ᴵʼ */
    public final boolean m9404(Context r5, Object r6, String r7, int r8, int r9, int r10, FontVariationAxis[] r11) {
        return ((Boolean) this.f16824.invoke(r6, new Object[]{r5.getAssets(), r7, 0, Boolean.FALSE, Integer.valueOf(r8), Integer.valueOf(r9), Integer.valueOf(r10), r11})).booleanValue();
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final Typeface m9405(Context r10, Resources r11, int r12, String r13, int r14) {
        Method r0 = this.f16824;
        if (r0 == null) goto L5;
    L5:
        if (r0 == null) goto L22;
        Object r2 = this.f16825.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r2 != null) goto L13;
    L18:
        return null;
    L13:
        if (m9404(r10, r2, r13, 0, -1, -1, null) == true) goto L17;
        this.f16828.invoke(r2, null);     // Catch: Throwable -> L23
        goto L18
    L17:
        if (m9402(r2) == false) goto L18;
        return mo9378(r2);
    L9:
        r2 = null;
        goto L10
    L22:
        return super.ᵔʾ(r10, r11, r12, r13, r14);
    }
}
