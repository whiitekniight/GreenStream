package p427;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p198.C3309;
import p198.InterfaceC3323;

/* JADX INFO: renamed from: ﹳـ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C5403 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static C3309 m10437(View r9, C3309 r10) {
        if (Log.isLoggable("ReceiveContent", 3) == false) goto L5;
        String r0 = "onReceive: " + r10;
    L5:
        InterfaceC3323 r02 = r10.f11553;
        if (r02.mo3604() != 2) goto L8;
        return r10;
    L8:
        ClipData r102 = r02.mo3607();
        int r03 = r02.mo3606();
        TextView r92 = (TextView) r9;
        Editable r1 = (Editable) r92.getText();
        Context r93 = r92.getContext();
        int r3 = 0;
        boolean r4 = false;
    L10:
        if (r3 >= r102.getItemCount()) goto L22;
        ClipData.Item r5 = r102.getItemAt(r3);
        if ((r03 & 1) == 0) goto L16;
        CharSequence r52 = r5.coerceToText(r93);
        if ((r52 instanceof Spanned) == false) goto L17;
        r52 = r52.toString();
    L17:
        if (r52 == null) goto L21;
        if (r4 == true) goto L20;
        int r42 = Selection.getSelectionStart(r1);
        int r7 = Selection.getSelectionEnd(r1);
        int r8 = Math.max(0, Math.min(r42, r7));
        int r43 = Math.max(0, Math.max(r42, r7));
        Selection.setSelection(r1, r43);
        r1.replace(r8, r43, r52);
        r4 = true;
        goto L21
    L20:
        r1.insert(Selection.getSelectionEnd(r1), "\n");
        r1.insert(Selection.getSelectionEnd(r1), r52);
    L21:
        r3 = r3 + 1;
        goto L10
    L16:
        r52 = r5.coerceToStyledText(r93);
        goto L17
    L22:
        return null;
    }
}
