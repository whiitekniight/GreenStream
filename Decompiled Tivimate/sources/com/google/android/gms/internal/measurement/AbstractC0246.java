package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʻˆ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246 {

    /* JADX INFO: renamed from: ʽ */
    public static final Pattern f1742 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Pattern f1743 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Uri f1744 = null;

    static {
        f1744 = Uri.parse("content://com.google.android.gsf.gservices");
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f1743 = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f1742 = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
