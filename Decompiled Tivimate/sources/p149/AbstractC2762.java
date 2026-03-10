package p149;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: ˉˆ.ˋᵔ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2762 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static TextClassifier m6033(TextView r1) {
        TextClassificationManager r12 = (TextClassificationManager) r1.getContext().getSystemService(TextClassificationManager.class);
        if (r12 == null) goto L7;
        return r12.getTextClassifier();
    L7:
        return TextClassifier.NO_OP;
    }
}
