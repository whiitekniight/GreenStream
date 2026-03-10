package p324;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᐧⁱ.ٴʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4348 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Pattern f15988 = null;

    static {
        f15988 = Pattern.compile("(&#13;)?&#10;");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m8776(CharSequence r1) {
        String r12 = Html.escapeHtml(r1);
        return f15988.matcher(r12).replaceAll("<br>");
    }
}
