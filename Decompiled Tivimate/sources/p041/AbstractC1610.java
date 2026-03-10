package p041;

import com.bumptech.glide.ʽ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p442.C5580;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ʼᴵ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1610 extends ʽ {
    /* JADX INFO: renamed from: ٴʼ */
    public static List m4263(InterfaceC1613 r2) {
        Iterator r22 = r2.iterator();
        if (r22.hasNext() == false) goto L5;
        Object r0 = r22.next();
        if (r22.hasNext() == false) goto L9;
        ArrayList r1 = new ArrayList();
        r1.add(r0);
    L12:
        if (r22.hasNext() == false) goto L14;
        r1.add(r22.next());
        goto L12
    L14:
        return r1;
    L9:
        return Collections.singletonList(r0);
    L5:
        return C5580.f20144;
    }

    /* JADX INFO: renamed from: ᵎⁱ */
    public static String m4264(InterfaceC1613 r5, String r6) {
        StringBuilder r0 = new StringBuilder();
        r0.append("");
        Iterator r52 = r5.iterator();
        int r2 = 0;
    L4:
        if (r52.hasNext() == false) goto L9;
        Object r3 = r52.next();
        r2 = r2 + 1;
        if (r2 <= 1) goto L8;
        r0.append(r6);
    L8:
        ˊʻ.ⁱˊ(r0, r3, null);
        goto L4
    L9:
        r0.append("");
        return r0.toString();
    }
}
