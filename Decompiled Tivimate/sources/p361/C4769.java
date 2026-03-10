package p361;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p005j$.util.Objects;
import p155.C2871;
import p155.C2878;
import p372.C4852;
import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ᵎⁱ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public class C4769 extends ٴﹶ {
    /* JADX INFO: renamed from: ʻᵎ */
    public static int m9380(FontStyle r2, FontStyle r3) {
        int r0 = Math.abs(r2.getWeight() - r3.getWeight()) / 100;
        if (r2.getSlant() != r3.getSlant()) goto L5;
        int r22 = 0;
    L7:
        return r0 + r22;
    L5:
        r22 = 2;
        goto L7
    }

    /* JADX INFO: renamed from: ᐧᴵ */
    public static Font m9381(FontFamily r5, int r6) {
        if ((r6 & 1) == 0) goto L5;
        int r1 = 700;
    L6:
        int r3 = 1;
        if ((r6 & 2) == 0) goto L9;
        int r62 = 1;
    L10:
        FontStyle r0 = new FontStyle(r1, r62);
        Font r63 = r5.getFont(0);
        int r12 = m9380(r0, r63.getStyle());
    L12:
        if (r3 >= r5.getSize()) goto L17;
        Font r2 = r5.getFont(r3);
        int r4 = m9380(r0, r2.getStyle());
        if (r4 >= r12) goto L16;
        r63 = r2;
        r12 = r4;
    L16:
        r3 = r3 + 1;
        goto L12
    L17:
        return r63;
    L9:
        r62 = 0;
        goto L10
    L5:
        r1 = 400;
        goto L6
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final Typeface m9382(Context r7, C2871 r8, Resources r9, int r10) {
        C2878[] r82 = r8.f10158;     // Catch: Exception -> L9
        int r0 = r82.length;     // Catch: Exception -> L9
        int r1 = 0;
        FontFamily.Builder r2 = null;
    L4:
        if (r1 >= r0) goto L13;
        C2878 r3 = r82[r1];     // Catch: Exception -> L9
        Font r32 = new Font.Builder(r9, r3.f10198).setWeight(r3.f10196).setSlant(r3.f10193 ? 1 : 0).setTtcIndex(r3.f10195).setFontVariationSettings(r3.f10194).build();     // Catch: Exception -> L9 IOException -> L19
        if (r2 != null) goto L11;
        r2 = new FontFamily.Builder(r32);     // Catch: Exception -> L9 IOException -> L19
        goto L12
    L11:
        r2.addFont(r32);     // Catch: Exception -> L9 IOException -> L19
    L12:
        r1 = r1 + 1;
        goto L4
    L13:
        if (r2 != null) goto L15;
        return null;
    L15:
        FontFamily r83 = r2.build();     // Catch: Exception -> L9
        return new Typeface.CustomFallbackBuilder(r83).setStyle(m9381(r83, r10).getStyle()).build();
    L18:
        return null;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final Typeface m9383(Context r1, InputStream r2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: ˏᵢ */
    public final FontFamily m9384(C4852[] r10, ContentResolver r11) {
        int r0 = r10.length;
        int r2 = 0;
        FontFamily.Builder r3 = null;
    L3:
        if (r2 >= r0) goto L34;
        C4852 r4 = r10[r2];
        if (Objects.equals(r4.f17167.getScheme(), "systemfont") == false) goto L40;
        Font r42 = mo9387(r4);
    L28:
        if (r42 == null) goto L33;
        if (r3 != null) goto L32;
        r3 = new FontFamily.Builder(r42);
        goto L33
    L32:
        r3.addFont(r42);
    L33:
        r2 = r2 + 1;
        goto L3
    L40:
        Uri r5 = r4.f17167;     // Catch: IOException -> L12
        String r6 = r4.f17165;     // Catch: IOException -> L12
        ParcelFileDescriptor r52 = r11.openFileDescriptor(r5, "r", null);     // Catch: IOException -> L12
        if (r52 != null) goto L38;
        if (r52 == null) goto L11;
        r52.close();     // Catch: IOException -> L12
        goto L11
    L38:
        Font.Builder r43 = new Font.Builder(r52).setWeight(r4.f17163).setSlant(r4.f17164 ? 1 : 0).setTtcIndex(r4.f17166);     // Catch: Throwable -> L17
        if (TextUtils.isEmpty(r6) == true) goto L19;
        r43.setFontVariationSettings(r6);     // Catch: Throwable -> L17
    L19:
        r42 = r43.build();     // Catch: Throwable -> L17
        r52.close();     // Catch: IOException -> L12
        goto L28
    L17:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L24
    L26:
        throw th;     // Catch: IOException -> L12
    L24:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L12
    L11:
        r42 = null;
        goto L28
    L34:
        if (r3 != null) goto L37;
        return null;
    L37:
        return r3.build();
    }

    /* JADX INFO: renamed from: יـ */
    public final C4852 m9385(C4852[] r1, int r2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final Typeface m9386(Context r2, C4852[] r3, int r4) {
        FontFamily r22 = m9384(r3, r2.getContentResolver());     // Catch: Exception -> L8
        if (r22 != null) goto L6;
        return null;
    L6:
        return new Typeface.CustomFallbackBuilder(r22).setStyle(m9381(r22, r4).getStyle()).build();
    L10:
        return null;
    }

    /* JADX INFO: renamed from: ᴵʼ */
    public Font mo9387(C4852 r2) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final Typeface m9388(Context r1, Resources r2, int r3, String r4, int r5) {
        Font r12 = new Font.Builder(r2, r3).build();     // Catch: Exception -> L4
        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(r12).build()).setStyle(r12.getStyle()).build();
    L6:
        return null;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final Typeface m9389(Context r6, List r7, int r8) {
        ContentResolver r62 = r6.getContentResolver();
        FontFamily r0 = m9384((C4852[]) r7.get(0), r62);     // Catch: Exception -> L12
        if (r0 != null) goto L6;
        return null;
    L6:
        Typeface.CustomFallbackBuilder r2 = new Typeface.CustomFallbackBuilder(r0);     // Catch: Exception -> L12
        int r3 = 1;
    L8:
        if (r3 >= r7.size()) goto L15;
        FontFamily r4 = m9384((C4852[]) r7.get(r3), r62);     // Catch: Exception -> L12
        if (r4 == null) goto L14;
        r2.addCustomFallback(r4);     // Catch: Exception -> L12
    L14:
        r3 = r3 + 1;     // Catch: Exception -> L12
        goto L8
    L15:
        return r2.setStyle(m9381(r0, r8).getStyle()).build();
    L18:
        return null;
    }
}
